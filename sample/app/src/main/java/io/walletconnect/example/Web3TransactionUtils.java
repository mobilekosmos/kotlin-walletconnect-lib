package io.walletconnect.example;

import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.generated.Uint256;

import java.math.BigInteger;
import java.util.Arrays;

public class Web3TransactionUtils {
    public static String encodeTransferData(final String toAddress, final BigInteger sum) {
        Function function = new Function(
                "transfer",  // function we're calling
                Arrays.asList(new Address(toAddress), new Uint256(sum)),  // Parameters to pass as Solidity Types
                Arrays.asList(new org.web3j.abi.TypeReference<Bool>() {})
        );
        return FunctionEncoder.encode(function);
    }
}
