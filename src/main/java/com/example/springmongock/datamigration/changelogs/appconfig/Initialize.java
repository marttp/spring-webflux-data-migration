package com.example.springmongock.datamigration.changelogs.appconfig;

import com.example.springmongock.app.model.AppConfiguration;
import com.github.cloudyrock.mongock.driver.mongodb.springdata.v3.decorator.impl.MongockTemplate;
import io.changock.migration.api.annotations.ChangeLog;
import io.changock.migration.api.annotations.ChangeSet;

import java.util.List;

@ChangeLog(order = "1")
public class Initialize {

    @ChangeSet(
            order = "001",
            systemVersion = "1",
            id = "20210122-initial-app-config-collection-with-sample-config",
            author = "Thanaphoom Babparn"
    )
    public void createInitializeAppConfiguration(MongockTemplate mongockTemplate) {
        AppConfiguration appConfiguration = AppConfiguration.builder()
                .key("APP_VERSION")
                .value(1)
                .build();
        mongockTemplate.insert(appConfiguration);
    }

    @ChangeSet(
            order = "001",
            systemVersion = "1",
            id = "20210122-add-app-name",
            author = "Thanaphoom Babparn"
    )
    public void addApplicationName(MongockTemplate mongockTemplate) {
        AppConfiguration backendAppName = AppConfiguration.builder()
                .key("BACKEND_APP_NAME")
                .value("ShoppingDiscount-BE")
                .build();
        AppConfiguration mobileAppName = AppConfiguration.builder()
                .key("MOBILE_APP_NAME")
                .value("MOBILE-ShoppingDiscount")
                .build();
        mongockTemplate.insertAll(List.of(backendAppName, mobileAppName));
    }

}
