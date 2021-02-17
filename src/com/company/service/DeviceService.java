package com.company.service;

import com.company.Entiry.DataPacket;
import com.company.Entiry.LoginData;
import com.company.Exception.DecoderException;
import com.company.dao.ILoginDao;
import com.company.encoders.Decoder;

import java.util.Map;


/**
 * The type Device service.
 */
/*
main requirement:
//currentPosition
    //receiveData
 */
//@Service
public class DeviceService implements IDeviceService {
    /**
     * The Login dao.
     */
    ILoginDao iLoginDao;
    /**
     * The Last recieved data.
     */
    Map<String, DataPacket> lastRecievedData;
    /**
     * The Map of decoder.
     */
    Map<String, Decoder> mapOfDecoder; //based on imei


    public boolean insertPacketData(String imei, String input) {
        Decoder decoder = mapOfDecoder.get(imei);
        DataPacket dataPacket = null;
        try {
            dataPacket = decoder.dataDecode(input);
        } catch (DecoderException e) {
            e.printStackTrace();
        }
        lastRecievedData.put(imei, dataPacket);
        return true;
    }

    @Override
    public boolean login(String headerId, String inputData) {
        Decoder decoder = mapOfDecoder.get(headerId);
        LoginData loginData = null;
        try {
            loginData = decoder.loginDecode(inputData);
        } catch (DecoderException e) {
            e.printStackTrace();
        }
        return iLoginDao.authenticate(loginData);
    }

    @Override
    public DataPacket getCurrentPostion(String imei) {
        // it can be null means no data present for that id
        return lastRecievedData.get(imei);
    }
}
