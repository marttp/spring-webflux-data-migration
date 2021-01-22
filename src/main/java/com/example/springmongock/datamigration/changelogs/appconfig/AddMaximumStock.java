package com.example.springmongock.datamigration.changelogs.appconfig;

import com.example.springmongock.app.model.AppConfiguration;
import com.github.cloudyrock.mongock.driver.mongodb.springdata.v3.decorator.impl.MongockTemplate;
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
    public void addMaximumStockPerItemConfig(MongockTemplate mongockTemplate) {
        AppConfiguration maximumStock = AppConfiguration.builder()
                .key("MAXIMUM_STOCK_PER_ITEM")
                .value(100)
                .build();
        mongockTemplate.insert(maximumStock);
    }

}