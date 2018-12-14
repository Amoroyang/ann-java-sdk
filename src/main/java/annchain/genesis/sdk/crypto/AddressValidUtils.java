package annchain.genesis.sdk.crypto;

import annchain.genesis.sdk.utils.utils.Numeric;

/**
 * address valid utils
 */
public class AddressValidUtils {

    public static boolean isValidAddress(String input) {
        String cleanInput = Numeric.cleanHexPrefix(input);

        try {
            Numeric.toBigIntNoPrefix(cleanInput);
        } catch (NumberFormatException e) {
            return false;
        }

        return cleanInput.length() == Keys.ADDRESS_LENGTH_IN_HEX;
    }
}
