package com.cb.repository;

import com.cb.model.WebAnalytics;
import com.cb.model.WebAnalyticsPrimaryKey;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface WebAnalyticsRepository extends CassandraRepository<WebAnalytics, WebAnalyticsPrimaryKey> {
}
