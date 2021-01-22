package com.example.springmongock.app.service;

import com.example.springmongock.app.model.AppConfiguration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface AppConfigService {

    Flux<AppConfiguration> getAllAppConfig();

    Mono<AppConfiguration> getAppConfigByKey(String key);

    AppConfiguration selectedAppConfigByKey(String key, List<AppConfiguration> list);
}
