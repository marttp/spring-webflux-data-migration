package com.example.springmongock.datamigration.changelogs.appconfig;

import com.example.springmongock.app.model.AppConfiguration;
import com.example.springmongock.datamigration.repository.AppConfigSyncRepository;
import io.changock.migration.api.annotations.ChangeLog;
import io.changock.migration.api.annotations.ChangeSet;

@ChangeLog(order = "3")
public class UpdateMobileAppName {

    @ChangeSet(
            order = "001",
            systemVersion = "2.3",
            id = "update-mobile-app-name",
            author = "Thanaphoom Babparn"
    )
    public void updateMobileApplicationName(AppConfigSyncRepository appConfigSyncRepository) {
        AppConfiguration mobileAppConfig = appConfigSyncRepository.findByKey("MOBILE_APP_NAME");
        mobileAppConfig.setValue("MOBILE-FunnyDiscount");
        appConfigSyncRepository.save(mobileAppConfig);
    }

}
