package com.example.springmongock.datamigration.changelogs.appconfig;

import com.example.springmongock.app.model.AppConfiguration;
import com.github.cloudyrock.mongock.driver.mongodb.springdata.v3.decorator.impl.MongockTemplate;
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
    public void addUserSessionTime(MongockTemplate mongockTemplate) {
        AppConfiguration userSessionConfig = AppConfiguration.builder()
                .key("USER_SESSION_TIME")
                .value(5)
                .build();
        mongockTemplate.insert(userSessionConfig);
    }

}
