package com.company.Entiry;

import java.util.List;

/**
 * The type Fleet.
 */
public class Fleet {
    private String name;
    private String otherDetails;
    private List<Truck> truckList;

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets other details.
     *
     * @return the other details
     */
    public String getOtherDetails() {
        return otherDetails;
    }

    /**
     * Sets other details.
     *
     * @param otherDetails the other details
     */
    public void setOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails;
    }

    /**
     * Gets truck list.
     *
     * @return the truck list
     */
    public List<Truck> getTruckList() {
        return truckList;
    }

    /**
     * Sets truck list.
     *
     * @param truckList the truck list
     */
    public void setTruckList(List<Truck> truckList) {
        this.truckList = truckList;
    }
}
