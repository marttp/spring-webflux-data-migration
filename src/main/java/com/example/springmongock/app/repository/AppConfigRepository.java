package com.example.springmongock.app.repository;

import com.example.springmongock.app.model.AppConfiguration;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface AppConfigRepository extends ReactiveMongoRepository<AppConfiguration, String> {
    Mono<AppConfiguration> findByKey(String key);
}
