package com.company.Entiry;

/**
 * The type Device.
 */
public class Device {
    private String IMEI_NO;
    private String vendorName;

    /**
     * Gets imei no.
     *
     * @return the imei no
     */
    public String getIMEI_NO() {
        return IMEI_NO;
    }

    /**
     * Sets imei no.
     *
     * @param IMEI_NO the imei no
     */
    public void setIMEI_NO(String IMEI_NO) {
        this.IMEI_NO = IMEI_NO;
    }

    /**
     * Gets vendor name.
     *
     * @return the vendor name
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Sets vendor name.
     *
     * @param vendorName the vendor name
     */
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
}
