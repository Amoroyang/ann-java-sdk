package com.zhongan.sdk.core.protocol.core.methods.response;

import com.zhongan.sdk.core.protocol.core.Response;
import com.zhongan.sdk.utils.utils.Numeric;

import java.math.BigInteger;

/**
 * eth_newFilter.
 */
public class GenFilter extends Response<String> {
    public BigInteger getFilterId() {
        return Numeric.decodeQuantity(getResult());
    }
}
