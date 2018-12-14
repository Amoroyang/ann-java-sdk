package annchain.genesis.sdk.core.protocol.core.methods.response;

import annchain.genesis.sdk.core.protocol.core.Response;
import annchain.genesis.sdk.utils.utils.Numeric;

import java.math.BigInteger;

/**
 * eth_gasPrice.
 */
public class GenGasPrice extends Response<String> {
    public BigInteger getGasPrice() {
        return Numeric.decodeQuantity(getResult());
    }
}
