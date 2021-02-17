package com.company.Entiry;

/**
 * The type Data packet.
 */
public class DataPacket {
    private String IMEI_NO;
    private String lat;
    private String lon;
    private String timeStamp;

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
     * Gets lat.
     *
     * @return the lat
     */
    public String getLat() {
        return lat;
    }

    /**
     * Sets lat.
     *
     * @param lat the lat
     */
    public void setLat(String lat) {
        this.lat = lat;
    }

    /**
     * Gets lon.
     *
     * @return the lon
     */
    public String getLon() {
        return lon;
    }

    /**
     * Sets lon.
     *
     * @param lon the lon
     */
    public void setLon(String lon) {
        this.lon = lon;
    }

    /**
     * Gets time stamp.
     *
     * @return the time stamp
     */
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets time stamp.
     *
     * @param timeStamp the time stamp
     */
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
}
