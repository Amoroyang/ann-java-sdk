package com.zhongan.sdk.core.protocol.core.methods.response;

import com.zhongan.sdk.core.protocol.core.Response;
import com.zhongan.sdk.utils.utils.Numeric;

import java.math.BigInteger;

/**
 * eth_getBlockTransactionCountByHash.
 */
public class GenGetBlockTransactionCountByHash extends Response<String> {
    public BigInteger getTransactionCount() {
        return Numeric.decodeQuantity(getResult());
    }
}
