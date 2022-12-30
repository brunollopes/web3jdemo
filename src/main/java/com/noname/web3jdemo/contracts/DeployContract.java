package com.noname.web3jdemo.contracts;

import org.web3j.model.HelloWorld;
import org.web3j.protocol.core.RemoteCall;

import static com.noname.web3jdemo.Application.*;
import static java.lang.System.out;

public class DeployContract {


    public static String deployHelloWorldContract() throws Exception {
        //deploy
        RemoteCall<HelloWorld> helloWorldRemoteCall =
                HelloWorld.deploy(
                        web3,
                        credentials,
                        gasProvider,
                        "Hello World v1!");

        out.println("Deploying contract Hello World...");
        HelloWorld helloWorld = helloWorldRemoteCall.send();

        String contractAddress = helloWorld.getContractAddress();
        out.println("Contract deployed to address: " + contractAddress);

        return contractAddress;

    }
}
