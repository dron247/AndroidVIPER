package com.dgse.androidviper.entity;

/**
 * This is example POJO entity
 */

public class ExampleEntity {
    String name;
    String description;


    public ExampleEntity(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
