package com.example.springmongock.app.model;

import com.example.springmongock.app.constant.CollectionName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = CollectionName.APP_CONFIGURATION)
public class AppConfiguration {

    @Id
    private ObjectId id;
    private String key;
    private Object value;

}
