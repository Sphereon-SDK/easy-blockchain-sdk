# blockchain-easy-sdk-java8-jersey2

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
    <artifactId>blockchain-easy-sdk-java8-jersey2</artifactId>
    <version>0.1.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.sphereon.sdk:blockchain-easy-sdk-java8-jersey2:0.1.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/blockchain-easy-sdk-java8-jersey2-0.1.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.sphereon.sdk.blockchain.easy.handler.*;
import com.sphereon.sdk.blockchain.easy.handler.auth.*;
import com.sphereon.sdk.blockchain.easy.model.*;
import com.sphereon.sdk.blockchain.easy.api.AllApi;

import java.io.File;
import java.util.*;

public class AllApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure OAuth2 access token for authorization: oauth2schema
        OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
        oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

        AllApi apiInstance = new AllApi();
        String context = "context_example"; // String | context
        String chainId = "chainId_example"; // String | chainId
        try {
            IdResponse result = apiInstance.chainIdExists(context, chainId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AllApi#chainIdExists");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AllApi* | [**chainIdExists**](docs/AllApi.md#chainIdExists) | **GET** /blockchain/easy/0.9.1/{context}/chains/id/{chainId} | Determine whether the Id of a chain exists in the blockchain
*AllApi* | [**createBackend**](docs/AllApi.md#createBackend) | **POST** /blockchain/easy/0.9.1/backends | Create a new backend
*AllApi* | [**createChain**](docs/AllApi.md#createChain) | **POST** /blockchain/easy/0.9.1/{context}/chains | Create a new chain
*AllApi* | [**createContext**](docs/AllApi.md#createContext) | **POST** /blockchain/easy/0.9.1/ | Create a new context
*AllApi* | [**createEntry**](docs/AllApi.md#createEntry) | **POST** /blockchain/easy/0.9.1/{context}/chains/{chainId}/entries | Create a new entry in the provided chain
*AllApi* | [**deleteBackend**](docs/AllApi.md#deleteBackend) | **DELETE** /blockchain/easy/0.9.1/backends/{backendId} | Delete backend by id (not by ledgername)
*AllApi* | [**determineChainId**](docs/AllApi.md#determineChainId) | **POST** /blockchain/easy/0.9.1/{context}/chains/id | Pre determine the Id of a chain request without anchoring it in the blockchain
*AllApi* | [**determineEntryId**](docs/AllApi.md#determineEntryId) | **POST** /blockchain/easy/0.9.1/{context}/chains/id/{chainId}/entries | Pre determine the Id of an entry request without anchoring the entry
*AllApi* | [**entryById**](docs/AllApi.md#entryById) | **GET** /blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/{entryId} | Get an existing entry in the provided chain
*AllApi* | [**entryByRequest**](docs/AllApi.md#entryByRequest) | **POST** /blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/entry | Get an existing entry in the provided chain
*AllApi* | [**entryIdExists**](docs/AllApi.md#entryIdExists) | **GET** /blockchain/easy/0.9.1/{context}/chains/id/{chainId}/entries/{entryId} | Determine whether the Id of an entry exists in the blockchain
*AllApi* | [**findBackends**](docs/AllApi.md#findBackends) | **GET** /blockchain/easy/0.9.1/backends/{backendId}/find | Find existing backend(s) by id (single result) and/or ledgername (multiple results). Optionally including public backends of others
*AllApi* | [**firstEntry**](docs/AllApi.md#firstEntry) | **GET** /blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/first | Get the first entry in the provided chain. This is the oldest entry also called the chain tail.  Please note that the achorTimes will only contain the first anchor time. Call getEntry to retrieve all times
*AllApi* | [**getBackend**](docs/AllApi.md#getBackend) | **GET** /blockchain/easy/0.9.1/backends/{backendId} | Get existing backend by id (not by ledgername). Optionally including public backend of others
*AllApi* | [**getContext**](docs/AllApi.md#getContext) | **GET** /blockchain/easy/0.9.1/{context} | Get an existing context
*AllApi* | [**lastEntry**](docs/AllApi.md#lastEntry) | **GET** /blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/last | Get the last entry in the provided chain. This is the most recent entry also called the chain head. Please note that the achorTimes will only contain the latest anchor time. Call getEntry to retrieve all times
*AllApi* | [**listBackends**](docs/AllApi.md#listBackends) | **GET** /blockchain/easy/0.9.1/backends | List existing backends.
*AllApi* | [**nextEntryById**](docs/AllApi.md#nextEntryById) | **GET** /blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/{entryId}/next | Get the entry after the supplied entry Id (the next) in the provided chain
*AllApi* | [**nextEntryByRequest**](docs/AllApi.md#nextEntryByRequest) | **POST** /blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/entry/next | Get the entry after the supplied entry Id (the next) in the provided chain
*AllApi* | [**previousEntryById**](docs/AllApi.md#previousEntryById) | **GET** /blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/{entryId}/previous | Get the entry before the supplied entry Id (the previous) in the provided chain
*AllApi* | [**previousEntryByRequest**](docs/AllApi.md#previousEntryByRequest) | **POST** /blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/entry/previous | Get the entry before the supplied entry Id (the previous) in the provided chain
*ChainApi* | [**createChain**](docs/ChainApi.md#createChain) | **POST** /blockchain/easy/0.9.1/{context}/chains | Create a new chain
*ContextApi* | [**createBackend**](docs/ContextApi.md#createBackend) | **POST** /blockchain/easy/0.9.1/backends | Create a new backend
*ContextApi* | [**createContext**](docs/ContextApi.md#createContext) | **POST** /blockchain/easy/0.9.1/ | Create a new context
*ContextApi* | [**deleteBackend**](docs/ContextApi.md#deleteBackend) | **DELETE** /blockchain/easy/0.9.1/backends/{backendId} | Delete backend by id (not by ledgername)
*ContextApi* | [**findBackends**](docs/ContextApi.md#findBackends) | **GET** /blockchain/easy/0.9.1/backends/{backendId}/find | Find existing backend(s) by id (single result) and/or ledgername (multiple results). Optionally including public backends of others
*ContextApi* | [**getBackend**](docs/ContextApi.md#getBackend) | **GET** /blockchain/easy/0.9.1/backends/{backendId} | Get existing backend by id (not by ledgername). Optionally including public backend of others
*ContextApi* | [**getContext**](docs/ContextApi.md#getContext) | **GET** /blockchain/easy/0.9.1/{context} | Get an existing context
*ContextApi* | [**listBackends**](docs/ContextApi.md#listBackends) | **GET** /blockchain/easy/0.9.1/backends | List existing backends.
*EntryApi* | [**createEntry**](docs/EntryApi.md#createEntry) | **POST** /blockchain/easy/0.9.1/{context}/chains/{chainId}/entries | Create a new entry in the provided chain
*EntryApi* | [**entryById**](docs/EntryApi.md#entryById) | **GET** /blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/{entryId} | Get an existing entry in the provided chain
*EntryApi* | [**entryByRequest**](docs/EntryApi.md#entryByRequest) | **POST** /blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/entry | Get an existing entry in the provided chain
*EntryApi* | [**firstEntry**](docs/EntryApi.md#firstEntry) | **GET** /blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/first | Get the first entry in the provided chain. This is the oldest entry also called the chain tail.  Please note that the achorTimes will only contain the first anchor time. Call getEntry to retrieve all times
*EntryApi* | [**lastEntry**](docs/EntryApi.md#lastEntry) | **GET** /blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/last | Get the last entry in the provided chain. This is the most recent entry also called the chain head. Please note that the achorTimes will only contain the latest anchor time. Call getEntry to retrieve all times
*EntryApi* | [**nextEntryById**](docs/EntryApi.md#nextEntryById) | **GET** /blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/{entryId}/next | Get the entry after the supplied entry Id (the next) in the provided chain
*EntryApi* | [**nextEntryByRequest**](docs/EntryApi.md#nextEntryByRequest) | **POST** /blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/entry/next | Get the entry after the supplied entry Id (the next) in the provided chain
*EntryApi* | [**previousEntryById**](docs/EntryApi.md#previousEntryById) | **GET** /blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/{entryId}/previous | Get the entry before the supplied entry Id (the previous) in the provided chain
*EntryApi* | [**previousEntryByRequest**](docs/EntryApi.md#previousEntryByRequest) | **POST** /blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/entry/previous | Get the entry before the supplied entry Id (the previous) in the provided chain
*IdApi* | [**chainIdExists**](docs/IdApi.md#chainIdExists) | **GET** /blockchain/easy/0.9.1/{context}/chains/id/{chainId} | Determine whether the Id of a chain exists in the blockchain
*IdApi* | [**determineChainId**](docs/IdApi.md#determineChainId) | **POST** /blockchain/easy/0.9.1/{context}/chains/id | Pre determine the Id of a chain request without anchoring it in the blockchain
*IdApi* | [**determineEntryId**](docs/IdApi.md#determineEntryId) | **POST** /blockchain/easy/0.9.1/{context}/chains/id/{chainId}/entries | Pre determine the Id of an entry request without anchoring the entry
*IdApi* | [**entryIdExists**](docs/IdApi.md#entryIdExists) | **GET** /blockchain/easy/0.9.1/{context}/chains/id/{chainId}/entries/{entryId} | Determine whether the Id of an entry exists in the blockchain


## Documentation for Models

 - [Access](docs/Access.md)
 - [AnchoredEntryResponse](docs/AnchoredEntryResponse.md)
 - [Backend](docs/Backend.md)
 - [Chain](docs/Chain.md)
 - [CommittedChain](docs/CommittedChain.md)
 - [CommittedChainResponse](docs/CommittedChainResponse.md)
 - [CommittedEntry](docs/CommittedEntry.md)
 - [CommittedEntryResponse](docs/CommittedEntryResponse.md)
 - [Context](docs/Context.md)
 - [Entry](docs/Entry.md)
 - [EntryData](docs/EntryData.md)
 - [Error](docs/Error.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [ExternalId](docs/ExternalId.md)
 - [IdResponse](docs/IdResponse.md)
 - [RawBackendStructure](docs/RawBackendStructure.md)
 - [RpcProvider](docs/RpcProvider.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### oauth2schema

- **Type**: OAuth
- **Flow**: application
- **Authorizatoin URL**: 
- **Scopes**: 
  - global: accessEverything


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

dev@sphereon.com

