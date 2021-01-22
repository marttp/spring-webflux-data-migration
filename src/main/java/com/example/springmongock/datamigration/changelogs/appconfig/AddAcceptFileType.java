package com.example.springmongock.datamigration.changelogs.appconfig;

import com.example.springmongock.app.model.AppConfiguration;
import com.github.cloudyrock.mongock.driver.mongodb.springdata.v3.decorator.impl.MongockTemplate;
import io.changock.migration.api.annotations.ChangeLog;
import io.changock.migration.api.annotations.ChangeSet;

import java.util.List;

@ChangeLog(order = "5")
public class AddAcceptFileType {

    @ChangeSet(
            order = "001",
            systemVersion = "2.7",
            id = "20210206-add-accept-file-type",
            author = "Thanaphoom Babparn"
    )
    public void addAcceptFileType(MongockTemplate mongockTemplate) {
        AppConfiguration acceptFileType = AppConfiguration.builder()
                .key("ACCEPT_FILE_TYPE")
                .value(List.of("jpg", "jpeg", "png"))
                .build();
        mongockTemplate.insert(acceptFileType);
    }
}
