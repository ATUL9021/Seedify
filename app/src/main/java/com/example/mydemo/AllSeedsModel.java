package com.example.mydemo;

public class AllSeedsModel {
    private int seedImage;
    private String seedName,seedTemperature,seedGerminationTime,seedStates;
    public AllSeedsModel(int seedImage,String seedName,String seedTemperature,String seedGerminationTime,String seedStates){
        this.seedImage=seedImage;
        this.seedName=seedName;
        this.seedTemperature=seedTemperature;
        this.seedGerminationTime=seedGerminationTime;
        this.seedStates=seedStates;
    }

    public int getSeedImage() {
        return seedImage;
    }

    public void setSeedImage(int seedImage) {
        this.seedImage = seedImage;
    }

    public String getSeedName() {
        return seedName;
    }

    public void setSeedName(String seedName) {
        this.seedName = seedName;
    }

    public String getSeedTemperature() {
        return seedTemperature;
    }

    public void setSeedTemperature(String seedTemperature) {
        this.seedTemperature = seedTemperature;
    }

    public String getSeedGerminationTime() {
        return seedGerminationTime;
    }

    public void setSeedGerminationTime(String seedGerminationTime) {
        this.seedGerminationTime = seedGerminationTime;
    }

    public String getSeedStates() {
        return seedStates;
    }

    public void setSeedStates(String seedStates) {
        this.seedStates = seedStates;
    }
}
