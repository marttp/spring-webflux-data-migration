package com.example.springmongock.datamigration.changelogs.appconfig;

import com.example.springmongock.app.model.AppConfiguration;
import com.example.springmongock.datamigration.repository.AppConfigSyncRepository;
import io.changock.migration.api.annotations.ChangeLog;
import io.changock.migration.api.annotations.ChangeSet;

@ChangeLog(order = "2")
public class AddUserSessionTime {

    @ChangeSet(
            order = "001",
            systemVersion = "2",
            id = "20210126-add-user-session-time",
            author = "Thanaphoom Babparn"
    )
    public void addUserSessionTime(AppConfigSyncRepository appConfigSyncRepository) {
        AppConfiguration userSessionConfig = new AppConfiguration();
        userSessionConfig.setKey("USER_SESSION_TIME");
        userSessionConfig.setValue(5);
        appConfigSyncRepository.insert(userSessionConfig);
    }

}
