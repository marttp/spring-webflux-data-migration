package com.example.springmongock.app.service.impl;

import com.example.springmongock.app.model.AppConfiguration;
import com.example.springmongock.app.repository.AppConfigRepository;
import com.example.springmongock.app.service.AppConfigService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Slf4j
@Service
public class AppConfigServiceImpl implements AppConfigService {

    final AppConfigRepository appConfigRepository;

    @Autowired
    public AppConfigServiceImpl(AppConfigRepository appConfigRepository) {
        this.appConfigRepository = appConfigRepository;
    }

    @Override
    public Flux<AppConfiguration> getAllAppConfig() {
        return appConfigRepository.findAll();
    }

    @Override
    public Mono<AppConfiguration> getAppConfigByKey(String key) {
        return appConfigRepository.findByKey(key);
    }

    @Override
    public AppConfiguration selectedAppConfigByKey(String key, List<AppConfiguration> list) {
        return list.stream().filter(elem -> elem.getKey().equals(key)).findFirst().orElse(null);
    }
}
