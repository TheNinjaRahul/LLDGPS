package com.company.controller;


import com.company.Entiry.Device;
import com.company.Entiry.Driver;
import com.company.Entiry.Fleet;
import com.company.Entiry.Truck;
import com.company.service.IAdminService;

/**
 * The type Admin controller.
 */
/*

This class will handle all request related to admin related stuff

 */
//@RestController("/v1/admin")
public class AdminController {

    /**
     * The Admin service.
     */
    IAdminService iAdminService;

    /**
     * Add fleet boolean.
     *
     * @param fleet the fleet
     * @return the boolean
     */
//@RequestMapping(value = "/addFleet",method = RequestMethod.POST)
    public boolean addFleet(Fleet fleet) {
        return iAdminService.addFleet(fleet);
    }

    /**
     * Add truck boolean.
     *
     * @param fleetId the fleet id
     * @param truck   the truck
     * @return the boolean
     */
// like wise other
    public boolean addTruck(String fleetId, Truck truck) {
        return iAdminService.addTruck(fleetId, truck);
    }

    /**
     * Add driver boolean.
     *
     * @param driver the driver
     * @return the boolean
     */
    public boolean addDriver(Driver driver) {
        return iAdminService.addDriver(driver);
    }

    /**
     * Add device to truck boolean.
     *
     * @param device the device
     * @param truck  the truck
     * @return the boolean
     */
    public boolean addDeviceToTruck(Device device, Truck truck) {
        return iAdminService.addDeviceToTruck(device, truck);
    }

}
