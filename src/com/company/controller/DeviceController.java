package com.company.controller;

import com.company.Entiry.DataPacket;
import com.company.service.IDeviceService;

/**
 * The type Device controller.
 */
//@RestController("/v1/device")
public class DeviceController {
    /**
     * The Device service.
     */
    IDeviceService iDeviceService;

    /**
     * Login boolean.
     *
     * @param headerId  the header id
     * @param inputData the input data
     * @return the boolean
     */
//@RequestMapping(value = "/login",method = RequestMethod.POST)
    public boolean login(String headerId, String inputData) {
        return iDeviceService.login(headerId, inputData);
    }

    /**
     * Gets current position.
     *
     * @param imei the imei
     * @return the current position
     */
//@RequestMapping(value = "/getCurrentPosition",method = RequestMethod.get)
    public DataPacket getCurrentPosition(String imei) {
        return iDeviceService.getCurrentPostion(imei);
    }

}
