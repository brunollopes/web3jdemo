# Web3j demo with Java
How to:
- Deploy a very simple smart-contract to the ethereum test network (Goerli)
- Interact with the services available for the deployed smartcontract.

==============================================

## Step #1 - Environment
Prepare your environment, locally and in the cloud.

You will need:
- MetaMask Account
- Etherscan Account
- Goerli testnet with with some ethers to enable you to execute transations
- Alchemy Account

### Tech stack
- Java 17
- Maven 3.8.6
- Web3j 4.9.4

Change the values of the [web3jdemo.properties](src/main/resources/web3jdemo.properties):
- API_URL and PRIVATE_KEY, check how to on the file

## Step #2 - Execution
Run the following maven command:
#### mvn exec:exec

Example of the expected result:
##### The Block Number is: 8223706 
##### Deploying contract Hello World...
##### Contract deployed to address: 0x63f56ff6cca76925de71815099f1eba0c1a01c38
##### Message: Hello World v1!
##### Updating message...
##### The new message: I am back.


# Some References

- Goerli @ https://goerli.net/
- Etherscan @ https://en.wikipedia.org/wiki/Schnorr_group
- Goerli Etherscan @ https://goerli.etherscan.io/
- To send Ethers to your MetaMask account @ https://goerlifaucet.com/
- Alchemy @ https://dashboard.alchemy.com
- MetaMask @ https://metamask.io/
- Web3j @ https://docs.web3j.io/4.8.7/
