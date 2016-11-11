# blockchain-easy-sdk-java8

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.sphereon.sdk</groupId>
    <artifactId>blockchain-easy-sdk-java8</artifactId>
    <version>0.1.0-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.sphereon.sdk:blockchain-easy-sdk-java8:0.1.0-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/blockchain-easy-sdk-java8-0.1.0-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.sphereon.sdk.blockchain.easy.handler.*;
import com.sphereon.sdk.blockchain.easy.handler.auth.*;
import com.sphereon.sdk.blockchain.easy.handler.model.*;
import com.sphereon.sdk.blockchain.easy.api.AllApi;

import java.io.File;
import java.util.*;

public class AllApiExample {

    public static void main(String[] args) {
        
        AllApi apiInstance = new AllApi();
        Chain chain = new Chain(); // Chain | Create a chain using the first entry supplied. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!
        try {
            CommittedChainResponse result = apiInstance.createChainUsingPOST(chain);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AllApi#createChainUsingPOST");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AllApi* | [**createChainUsingPOST**](docs/AllApi.md#createChainUsingPOST) | **POST** /blockchain/easy/0.1.0/chains | Create a new chain
*AllApi* | [**createEntryUsingPOST**](docs/AllApi.md#createEntryUsingPOST) | **POST** /blockchain/easy/0.1.0/chains/{chainId}/entries | Create a new entry in the provided chain
*AllApi* | [**determineChainId**](docs/AllApi.md#determineChainId) | **POST** /blockchain/easy/0.1.0/chains/id | Pre determine the Id of a chain request without anchoring it in the blockchain
*AllApi* | [**determineEntryId**](docs/AllApi.md#determineEntryId) | **POST** /blockchain/easy/0.1.0/chains/{chainId}/entries/id | Pre determine the Id of an entry request without anchoring the entry
*AllApi* | [**entryById**](docs/AllApi.md#entryById) | **GET** /blockchain/easy/0.1.0/chains/{chainId}/entries/{entryId} | Get an existing entry in the provided chain
*AllApi* | [**entryByRequest**](docs/AllApi.md#entryByRequest) | **POST** /blockchain/easy/0.1.0/chains/{chainId}/entries/entry | Get an existing entry in the provided chain
*ChainApi* | [**createChainUsingPOST**](docs/ChainApi.md#createChainUsingPOST) | **POST** /blockchain/easy/0.1.0/chains | Create a new chain
*ChainApi* | [**determineChainId**](docs/ChainApi.md#determineChainId) | **POST** /blockchain/easy/0.1.0/chains/id | Pre determine the Id of a chain request without anchoring it in the blockchain
*EntryDataApi* | [**createEntryUsingPOST**](docs/EntryDataApi.md#createEntryUsingPOST) | **POST** /blockchain/easy/0.1.0/chains/{chainId}/entries | Create a new entry in the provided chain
*EntryDataApi* | [**determineEntryId**](docs/EntryDataApi.md#determineEntryId) | **POST** /blockchain/easy/0.1.0/chains/{chainId}/entries/id | Pre determine the Id of an entry request without anchoring the entry
*EntryDataApi* | [**entryById**](docs/EntryDataApi.md#entryById) | **GET** /blockchain/easy/0.1.0/chains/{chainId}/entries/{entryId} | Get an existing entry in the provided chain
*EntryDataApi* | [**entryByRequest**](docs/EntryDataApi.md#entryByRequest) | **POST** /blockchain/easy/0.1.0/chains/{chainId}/entries/entry | Get an existing entry in the provided chain
*IdApi* | [**determineChainId**](docs/IdApi.md#determineChainId) | **POST** /blockchain/easy/0.1.0/chains/id | Pre determine the Id of a chain request without anchoring it in the blockchain
*IdApi* | [**determineEntryId**](docs/IdApi.md#determineEntryId) | **POST** /blockchain/easy/0.1.0/chains/{chainId}/entries/id | Pre determine the Id of an entry request without anchoring the entry


## Documentation for Models

 - [AnchoredEntryResponse](docs/AnchoredEntryResponse.md)
 - [Chain](docs/Chain.md)
 - [CommittedChain](docs/CommittedChain.md)
 - [CommittedChainResponse](docs/CommittedChainResponse.md)
 - [CommittedEntry](docs/CommittedEntry.md)
 - [CommittedEntryResponse](docs/CommittedEntryResponse.md)
 - [Entry](docs/Entry.md)
 - [EntryData](docs/EntryData.md)
 - [ExternalId](docs/ExternalId.md)
 - [IdResponse](docs/IdResponse.md)
 - [Link](docs/Link.md)
 - [VndError](docs/VndError.md)
 - [VndErrors](docs/VndErrors.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### oauth2schema

- **Type**: OAuth
- **Flow**: application
- **Authorizatoin URL**: 
- **Scopes**: 
  - global: accessEverything


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author

dev@sphereon.com

