package com.pluralsight;

public class Asset {
    //field members
    private String description;
    private String dateAquired;
    private double originalCost;

    //constructor
    public Asset(String description, String dateAquired, double originalCost) {
        this.description = description;
        this.dateAquired = dateAquired;
        this.originalCost = originalCost;
    }

    //getters and setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAquired() {
        return dateAquired;
    }

    public void setDateAquired(String dateAquired) {
        this.dateAquired = dateAquired;
    }

    public double getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }

    //derived getter
    public double getValue() {
        return originalCost;
    }
}
