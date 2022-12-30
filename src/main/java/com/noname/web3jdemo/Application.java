package com.noname.web3jdemo;

import com.noname.web3jdemo.contracts.DeployContract;
import com.noname.web3jdemo.contracts.InteractContract;
import com.noname.web3jdemo.util.Properties;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.EthBlockNumber;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.gas.StaticGasProvider;

import java.math.BigInteger;

public class Application {

    final public static Web3j web3 = Web3j.build(new HttpService(Properties.getPropertyValue("API_URL")));
    final public static Credentials credentials = Credentials.create(Properties.getPropertyValue("PRIVATE_KEY"));

    final public static BigInteger gasPrice = BigInteger.valueOf(2205000);
    final public static BigInteger gasLimit = BigInteger.valueOf(14300000);
    final public static StaticGasProvider gasProvider = new StaticGasProvider(gasPrice,gasLimit);

    public static void main(String[] args) throws Exception {

        EthBlockNumber result = web3.ethBlockNumber().sendAsync().get();
        System.out.println("The Block Number is: " + result.getBlockNumber().toString());

        String contractAddress = DeployContract.deployHelloWorldContract();

        InteractContract.updateContractMessage(contractAddress);

        web3.shutdown();
    }
}
