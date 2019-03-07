package annchain.genesis.sdk.core.protocol.core.methods.response;

import annchain.genesis.sdk.abi.FunctionReturnDecoder;
import annchain.genesis.sdk.abi.datatypes.Type;
import com.fasterxml.jackson.annotation.JsonProperty;
import annchain.genesis.sdk.abi.TypeReference;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;
import java.util.List;

public class ContractReceipt{
    private String nonce;
    private String optype;
    private String from;
    private String hash;
    @JsonProperty("tx_receipt_status")
    private boolean txReceiptStatus;
    private String msg;
    private String result;
    private Long height;
    @JsonProperty("contract_address")
    private String contractAddress;
    private String function;
    private String params;
    @JsonProperty("gas_price")
    private String gasPrice;
    @JsonProperty("gas_limit")
    private String gasLimit;
    @JsonProperty("gas_used")
    private String gasUsed;
    @JsonProperty("created_at")
    private String createdAt;
    private List<EventLog> logs;

    public String getOptype() {
        return optype;
    }

    public void setOptype(String optype) {
        this.optype = optype;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }


    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<Type> getResult(List<TypeReference<Type>> outputParams) {
        List<Type> types = null;
        if(StringUtils.isNotEmpty(result)){
            types = FunctionReturnDecoder.decode(result, outputParams);
        }
        return types;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public boolean isTxReceiptStatus() {
        return txReceiptStatus;
    }

    public void setTxReceiptStatus(boolean txReceiptStatus) {
        this.txReceiptStatus = txReceiptStatus;
    }

    public String getContractAddress() {
        return contractAddress;
    }

    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }

    public String getGasPrice() {
        return gasPrice;
    }

    public void setGasPrice(String gasPrice) {
        this.gasPrice = gasPrice;
    }

    public String getGasLimit() {
        return gasLimit;
    }

    public void setGasLimit(String gasLimit) {
        this.gasLimit = gasLimit;
    }

    public String getGasUsed() {
        return gasUsed;
    }

    public void setGasUsed(String gasUsed) {
        this.gasUsed = gasUsed;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public List<EventLog> getLogs() {
        return logs;
    }

    public void setLogs(List<EventLog> logs) {
        this.logs = logs;
    }

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }
}
