package com.genesis.api.bean.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.math.BigInteger;

@Slf4j
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ReceiptObject {

    private String PostState;
    private BigInteger CumulativeGasUsed;
    private String Bloom;
    private ReceiptLogs Logs;
    private String TxHash;
    private String ContractAddress;
    private BigInteger GasUsed;
    private BigInteger Height;

}
