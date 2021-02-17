package com.company.service;

import com.company.Entiry.DataPacket;

/**
 * The interface Device service.
 */
public interface IDeviceService {
    /**
     * Login boolean.
     *
     * @param headerId  the header id
     * @param inputData the input data
     * @return the boolean
     */
    public boolean login(String headerId, String inputData);

    /**
     * Gets current postion.
     *
     * @param imei the imei
     * @return the current postion
     */
    public DataPacket getCurrentPostion(String imei);

    /**
     * Insert packet data boolean.
     *
     * @param imei  the imei
     * @param input the input
     * @return the boolean
     */
    public boolean insertPacketData(String imei, String input);
}