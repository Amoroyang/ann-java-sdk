package com.zhongan.sdk.core.protocol.core.methods.response;

import com.zhongan.sdk.core.protocol.core.Response;

/**
 * db_putHex.
 */
public class DbPutHex extends Response<Boolean> {

    public boolean valueStored() {
        return getResult();
    }
}
