package com.zhongan.sdk.abi.datatypes.generated;

import com.zhongan.sdk.abi.datatypes.Uint;

import java.math.BigInteger;

/**
 * Auto generated code.
 * <p><strong>Do not modifiy!</strong>
 * <p>Please use org.anChain.codegen.AbiTypesGenerator in the
 * <a href="https://github.com/anChain/anChain/tree/master/codegen">codegen module</a> to update.
 */
public class Uint8 extends Uint {
    public static final Uint8 DEFAULT = new Uint8(BigInteger.ZERO);

    public Uint8(BigInteger value) {
        super(8, value);
    }

    public Uint8(long value) {
        this(BigInteger.valueOf(value));
    }
}
