package com.cb.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

import java.io.Serializable;
import java.time.LocalDate;


@PrimaryKeyClass
@AllArgsConstructor
@Getter @Setter
public class WebAnalyticsPrimaryKey implements Serializable {

    @PrimaryKeyColumn(
            name = "date",
            ordinal = 0,
            type = PrimaryKeyType.PARTITIONED,
            ordering = Ordering.DESCENDING)
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate date;

    @PrimaryKeyColumn(
            name = "site_id",
            ordinal = 1,
            type = PrimaryKeyType.PARTITIONED,
            ordering = Ordering.DESCENDING)
    private long siteId;

    @PrimaryKeyColumn(
            name = "country_id",
            ordinal = 0,
            type = PrimaryKeyType.CLUSTERED,
            ordering = Ordering.DESCENDING)
    private long countryId;

    @PrimaryKeyColumn(
            name = "city_id",
            ordinal = 1,
            type = PrimaryKeyType.CLUSTERED,
            ordering = Ordering.DESCENDING)
    private long cityId;
}
