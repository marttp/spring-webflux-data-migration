package com.example.springmongock.app.controller;

import com.example.springmongock.app.constant.Endpoint;
import com.example.springmongock.app.model.AppConfiguration;
import com.example.springmongock.app.service.AppConfigService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping(Endpoint.APP_CONFIG_ENDPOINT)
public class AppConfigController {

    final AppConfigService appConfigService;

    @Autowired
    public AppConfigController(AppConfigService appConfigService) {
        this.appConfigService = appConfigService;
    }

    @GetMapping
    public Flux<AppConfiguration> getAppConfigs() {
        return appConfigService.getAllAppConfig();
    }

    @GetMapping("/{key}")
    public Mono<AppConfiguration> getAppConfigByKey(@PathVariable String key) {
        return appConfigService.getAppConfigByKey(key);
    }
}
