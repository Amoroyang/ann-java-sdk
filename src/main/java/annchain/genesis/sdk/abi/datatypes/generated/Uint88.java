package annchain.genesis.sdk.abi.datatypes.generated;

import annchain.genesis.sdk.abi.datatypes.Uint;

import java.math.BigInteger;

/**
 * Auto generated code.
 * <p><strong>Do not modifiy!</strong>
 * <p>Please use org.anChain.codegen.AbiTypesGenerator in the
 * <a href="https://github.com/anChain/anChain/tree/master/codegen">codegen module</a> to update.
 */
public class Uint88 extends Uint {
    public static final Uint88 DEFAULT = new Uint88(BigInteger.ZERO);

    public Uint88(BigInteger value) {
        super(88, value);
    }

    public Uint88(long value) {
        this(BigInteger.valueOf(value));
    }
}
