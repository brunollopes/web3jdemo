package com.noname.web3jdemo.contracts;

import org.web3j.model.HelloWorld;

import static com.noname.web3jdemo.Application.*;
import static java.lang.System.out;

public class InteractContract {

    public static void updateContractMessage(String contractAddress) throws Exception {

       HelloWorld helloWorld = HelloWorld.load(contractAddress,
                web3,
                credentials,
                gasProvider);

        out.println("Message: "+helloWorld.message().send());

        out.println("Updating message...");
        helloWorld.update("I am back.").send();

        out.println("The new message: "+helloWorld.message().send());

    }
}
