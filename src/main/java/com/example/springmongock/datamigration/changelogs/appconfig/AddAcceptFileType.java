package com.example.springmongock.datamigration.changelogs.appconfig;

import com.example.springmongock.app.model.AppConfiguration;
import com.example.springmongock.datamigration.repository.AppConfigSyncRepository;
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
    public void addAcceptFileType(AppConfigSyncRepository appConfigSyncRepository) {
        AppConfiguration acceptFileType = new AppConfiguration();
        acceptFileType.setKey("ACCEPT_FILE_TYPE");
        acceptFileType.setValue(List.of("jpg", "jpeg", "png"));
        appConfigSyncRepository.insert(acceptFileType);
    }
}
