package com.company.service;

import com.company.Entiry.Device;
import com.company.Entiry.Driver;
import com.company.Entiry.Fleet;
import com.company.Entiry.Truck;

/**
 * The interface Admin service.
 */
public interface IAdminService {
    /**
     * Add fleet boolean.
     *
     * @param fleet the fleet
     * @return the boolean
     */
    public boolean addFleet(Fleet fleet);

    /**
     * Add truck boolean.
     *
     * @param fleetId the fleet id
     * @param truck   the truck
     * @return the boolean
     */
    public boolean addTruck(String fleetId, Truck truck);

    /**
     * Add driver boolean.
     *
     * @param driver the driver
     * @return the boolean
     */
    public boolean addDriver(Driver driver);

    /**
     * Add device to truck boolean.
     *
     * @param device the device
     * @param truck  the truck
     * @return the boolean
     */
    public boolean addDeviceToTruck(Device device, Truck truck);
}
