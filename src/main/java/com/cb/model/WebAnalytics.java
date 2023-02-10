package com.cb.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("web_analytics")
@AllArgsConstructor
@Getter @Setter
public class WebAnalytics {

    @PrimaryKey
    private WebAnalyticsPrimaryKey webAnalyticsPrimaryKey;

    @Column("page_views")
    private long pageViews;
}
