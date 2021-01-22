package com.example.springmongock.datamigration.changelogs.appconfig;

import com.example.springmongock.app.model.AppConfiguration;
import com.example.springmongock.datamigration.repository.AppConfigSyncRepository;
import io.changock.migration.api.annotations.ChangeLog;
import io.changock.migration.api.annotations.ChangeSet;

@ChangeLog(order = "4")
public class AddMaximumStock {

    @ChangeSet(
            order = "001",
            systemVersion = "2.6",
            id = "20210202-add-maximum-stock-per-item",
            author = "Thanaphoom Babparn"
    )
    public void addMaximumStockPerItemConfig(AppConfigSyncRepository appConfigSyncRepository) {
        AppConfiguration maximumStock = new AppConfiguration();
        maximumStock.setKey("MAXIMUM_STOCK_PER_ITEM");
        maximumStock.setValue(100);
        appConfigSyncRepository.save(maximumStock);
    }

}