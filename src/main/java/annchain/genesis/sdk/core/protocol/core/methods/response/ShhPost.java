package annchain.genesis.sdk.core.protocol.core.methods.response;

import annchain.genesis.sdk.core.protocol.core.Response;

/**
 * shh_post.
 */
public class ShhPost extends Response<Boolean> {

    public boolean messageSent() {
        return getResult();
    }
}
