package com.zhongan.sdk.core.protocol.core.methods.response;

import com.zhongan.sdk.core.protocol.core.Response;

/**
 * db_getString.
 */
public class DbGetString extends Response<String> {

    public String getStoredValue() {
        return getResult();
    }
}
