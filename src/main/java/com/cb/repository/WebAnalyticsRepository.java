package com.cb.repository;

import com.cb.model.WebAnalytics;
import com.cb.model.WebAnalyticsPrimaryKey;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;

import java.util.List;

public interface WebAnalyticsRepository extends CassandraRepository<WebAnalytics, WebAnalyticsPrimaryKey> {

    @Query("SELECT * FROM web_analytics WHERE date IN ('2023-02-10 00:00:00.000000+0000') and site_id=10")
    List<WebAnalytics> getByDateRangeAndSiteId();

}
