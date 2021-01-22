package com.example.springmongock.datamigration.repository;

import com.example.springmongock.app.model.AppConfiguration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppConfigSyncRepository extends MongoRepository<AppConfiguration, String> {
    AppConfiguration findByKey(String key);
}