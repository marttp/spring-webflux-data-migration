package com.example.springmongock.datamigration.changelogs.appconfig;

import com.example.springmongock.app.model.AppConfiguration;
import com.github.cloudyrock.mongock.driver.mongodb.springdata.v3.decorator.impl.MongockTemplate;
import io.changock.migration.api.annotations.ChangeLog;
import io.changock.migration.api.annotations.ChangeSet;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

@ChangeLog(order = "3")
public class UpdateMobileAppName {

    @ChangeSet(
            order = "001",
            systemVersion = "2.3",
            id = "update-mobile-app-name",
            author = "Thanaphoom Babparn"
    )
    public void updateMobileApplicationName(MongockTemplate mongockTemplate) {
        Query query = new Query();
        query.addCriteria(Criteria.where("key").is("MOBILE_APP_NAME"));
        Update update = new Update();
        update.set("value", "MOBILE-FunnyDiscount");
        mongockTemplate.updateFirst(query, update, AppConfiguration.class);
    }

}
