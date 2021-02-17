package com.company.service;

import com.company.Entiry.Device;
import com.company.Entiry.Driver;
import com.company.Entiry.Fleet;
import com.company.Entiry.Truck;
import com.company.dao.IAdminDao;

/**
 * The type Admin service.
 */
public class AdminService implements IAdminService {

    /**
     * The Admin dao.
     */
    IAdminDao iAdminDao;

    @Override
    public boolean addFleet(Fleet fleet) {
        return false;
    }

    @Override
    public boolean addTruck(String fleetId, Truck truck) {
        return false;
    }

    @Override
    public boolean addDriver(Driver driver) {
        return false;
    }

    @Override
    public boolean addDeviceToTruck(Device device, Truck truck) {
        return false;
    }
}
