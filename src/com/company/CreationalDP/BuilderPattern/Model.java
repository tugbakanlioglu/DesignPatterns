package com.company.CreationalDP.BuilderPattern;

public class Model {
    private String model;

    public Model(String model) {
        setModel(model);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return model;
    }
}
