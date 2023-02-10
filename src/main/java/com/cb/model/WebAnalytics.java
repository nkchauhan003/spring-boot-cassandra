package com.cb.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Date;

@Table("web_analytics")
@AllArgsConstructor
@Getter @Setter
public class WebAnalytics {

    @PrimaryKey
    private WebAnalyticsPrimaryKey webAnalyticsPrimaryKey;

    @Column("page_views")
    private long pageViews;
}
