package com.example.springmongock.datamigration.changelogs.appconfig;

import com.example.springmongock.app.model.AppConfiguration;
import com.example.springmongock.datamigration.repository.AppConfigSyncRepository;
import io.changock.migration.api.annotations.ChangeLog;
import io.changock.migration.api.annotations.ChangeSet;
import io.changock.migration.api.annotations.NonLockGuarded;

import java.util.List;

@ChangeLog(order = "1")
public class Initialize {

    @ChangeSet(
            order = "001",
            systemVersion = "1",
            id = "20210122-initial-app-config-collection-with-sample-config",
            author = "Thanaphoom Babparn"
    )
    public void createInitializeAppConfiguration(AppConfigSyncRepository appConfigSyncRepository) {
        AppConfiguration appConfiguration = new AppConfiguration();
        appConfiguration.setKey("APP_VERSION");
        appConfiguration.setValue(1);
        appConfigSyncRepository.insert(appConfiguration);
    }

    @ChangeSet(
            order = "001",
            systemVersion = "1",
            id = "20210122-add-app-name",
            author = "Thanaphoom Babparn"
    )
    public void addApplicationName(AppConfigSyncRepository appConfigSyncRepository) {
        AppConfiguration backendAppName = new AppConfiguration();
        backendAppName.setKey("BACKEND_APP_NAME");
        backendAppName.setValue("ShoppingDiscount-BE");

        AppConfiguration mobileAppName = new AppConfiguration();
        mobileAppName.setKey("MOBILE_APP_NAME");
        mobileAppName.setValue("MOBILE-ShoppingDiscount");

        appConfigSyncRepository.insert(List.of(backendAppName, mobileAppName));
    }

}
