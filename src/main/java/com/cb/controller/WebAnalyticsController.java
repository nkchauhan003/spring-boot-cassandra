package com.cb.controller;

import com.cb.exception.EntityNotFoundException;
import com.cb.model.WebAnalytics;
import com.cb.model.WebAnalyticsPrimaryKey;
import com.cb.repository.WebAnalyticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("web-analytics")
public class WebAnalyticsController {

    @Autowired
    private WebAnalyticsRepository webAnalyticsRepository;

    @PostMapping("/")
    public WebAnalytics save(@RequestBody WebAnalytics webAnalytics) {
        return webAnalyticsRepository.save(webAnalytics);
    }

    @PostMapping("/query")
    public WebAnalytics get(@RequestBody WebAnalyticsPrimaryKey webAnalyticsPrimaryKey) {
        return webAnalyticsRepository.findById(webAnalyticsPrimaryKey).orElseThrow(() -> new EntityNotFoundException());
    }
}
