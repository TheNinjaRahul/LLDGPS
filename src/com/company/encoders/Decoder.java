package com.company.encoders;

import com.company.Entiry.DataPacket;
import com.company.Entiry.LoginData;
import com.company.Exception.DecoderException;

/**
 * The interface Decoder.
 */
public interface Decoder {
    /**
     * Login decode login data.
     *
     * @param input the input
     * @return the login data
     * @throws DecoderException the decoder exception
     */
    public LoginData loginDecode(String input) throws DecoderException;

    /**
     * Data decode data packet.
     *
     * @param input the input
     * @return the data packet
     * @throws DecoderException the decoder exception
     */
    public DataPacket dataDecode(String input) throws DecoderException;
}
