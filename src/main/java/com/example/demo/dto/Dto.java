package com.example.demo.dto;

public class Dto {
    private static String modelName;
    private static String carName;
    private static String description;

    public static void setModelName(String modelName) {
        Dto.modelName = modelName;
    }

    public static String getModelName() {
        return modelName;
    }

    public static void setCarName(String carName) {
        Dto.carName = carName;
    }

    public static String getCarName() {
        return carName;
    }

    public static void setDescription(String description) {
        Dto.description = description;
    }

    public static String getDescription() {
        return description;
    }
}
