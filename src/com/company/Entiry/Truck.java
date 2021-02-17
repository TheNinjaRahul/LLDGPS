package com.company.Entiry;

/**
 * The type Truck.
 */
public class Truck {
    private Integer id;
    private String numberPlate;
    private Device device;
    private Driver driver;

    /**
     * Gets id.
     *
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets number plate.
     *
     * @return the number plate
     */
    public String getNumberPlate() {
        return numberPlate;
    }

    /**
     * Sets number plate.
     *
     * @param numberPlate the number plate
     */
    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    /**
     * Gets device.
     *
     * @return the device
     */
    public Device getDevice() {
        return device;
    }

    /**
     * Sets device.
     *
     * @param device the device
     */
    public void setDevice(Device device) {
        this.device = device;
    }

    /**
     * Gets driver.
     *
     * @return the driver
     */
    public Driver getDriver() {
        return driver;
    }

    /**
     * Sets driver.
     *
     * @param driver the driver
     */
    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
