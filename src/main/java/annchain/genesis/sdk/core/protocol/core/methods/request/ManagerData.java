package annchain.genesis.sdk.core.protocol.core.methods.request;

import org.json.JSONObject;

import java.util.Map;


public class ManagerData extends BaseRequest{

    private Map<String,Value> keyPairList;

    public Map<String, Value> getKeyPairList() {
        return keyPairList;
    }

    public void setKeyPairList(Map<String, Value> keyPairList) {
        this.keyPairList = keyPairList;
    }

    @Override
    public String toString() {
        return JSONObject.valueToString(keyPairList);
    }
}
