<h1 align="center">
  <br>
  <a href="https://www.sphereon.com"><img src="https://sphereon.com/content/themes/sphereon/assets/img/logo.svg" alt="Sphereon" width="400"></a>
  <br> Easy Blockchain SDK
  <br> Java 8 and up
  <br> using OkHttp and GSON
  <br>
</h1>

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library, simply follow the below steps

### Maven users

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

Add this dependency to your project's POM.xml:

```xml
<repositories>
  <!-- The Easy Blockchain SDK is found in this repository -->
  <repository>
    <id>sphereon-sdk-releases</id>
    <name>Sphereon SDK Releases</name>
    <url>https://nexus.qa.sphereon.com/repository/sphereon-sdk-releases/</url>
  </repository>

  <!-- Include if you need to use our authentication library of the easyblockchain helper library -->
  <repository>
    <id>sphereon-opensource-releases</id>
    <name>Sphereon Opensource Releases</name>
    <url>https://nexus.qa.sphereon.com/repository/sphereon-opensource-releases/</url>
  </repository>
</repositories>

<dependencies>
    <!-- The SDK itself -->
    <dependency>
        <groupId>com.sphereon.sdk</groupId>
        <artifactId>easy-blockchain-sdk-java8-okhttp-gson</artifactId>
        <version>0.10.3</version>
        <scope>compile</scope>
    </dependency>
    
    <!-- Below deps are optional -->

    <!-- Blockchain Proof for easy chain creation based on content/files -->
    <dependency>
      <groupId>com.sphereon.sdk</groupId>
      <artifactId>blockchain-proof-sdk-java8-okhttp-gson</artifactId>
      <version>0.10.5</version>
      <scope>compile</scope>
    </dependency>

    <!-- For easy authentication and token handling is this library -->
    <dependency>
      <groupId>com.sphereon.public</groupId>
      <artifactId>easy-blockchain-lib-main</artifactId>
      <version>0.1.4</version>
      <scope>compile</scope>
    </dependency>
    
    <!-- For easy authentication and token handling is this library -->
    <dependency>
      <groupId>com.sphereon.public</groupId>
      <artifactId>authentication-lib-main</artifactId>
      <version>0.1.7</version>
      <scope>compile</scope>
    </dependency>
</dependencies>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.sphereon.sdk:easy-blockchain-sdk-java8-okhttp-gson:0.9"
```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

Examples:

 * [Easy Blockchain Test example](https://github.com/Sphereon-SDK/easy-blockchain-sdk/blob/develop/java8-okhttp-gson/src/test/java/com/sphereon/sdk/blockchain/easy/api/AllApiTest.java)
 * [Easy Blockchain with Blockchain Proof and authentication example](https://github.com/Sphereon-SDK/easy-blockchain-sdk/blob/develop/java8-okhttp-gson/src/test/java/com/sphereon/sdk/blockchain/easy/api/EasyBlockchainAndProofExample.java)


## Documentation for API Endpoints

All URIs are relative to *https://gw.api.cloud.sphereon.com/blockchain/easy/0.9*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AllApi* | [**chainIdExists**](docs/AllApi.md#chainIdExists) | **GET** /{context}/chains/id/{chainId} | Determine whether the Id of a chain exists in the blockchain
*AllApi* | [**createBackend**](docs/AllApi.md#createBackend) | **POST** /backends | Create a new backend
*AllApi* | [**createChain**](docs/AllApi.md#createChain) | **POST** /{context}/chains | Create a new chain
*AllApi* | [**createContext**](docs/AllApi.md#createContext) | **POST** / | Create a new context
*AllApi* | [**createEntry**](docs/AllApi.md#createEntry) | **POST** /{context}/chains/{chainId}/entries | Create a new entry in the provided chain
*AllApi* | [**deleteBackend**](docs/AllApi.md#deleteBackend) | **DELETE** /backends/{backendId} | Delete backend by id (not by ledgername)
*AllApi* | [**determineChainId**](docs/AllApi.md#determineChainId) | **POST** /{context}/chains/id | Pre determine the Id of a chain request without anchoring it in the blockchain
*AllApi* | [**determineEntryId**](docs/AllApi.md#determineEntryId) | **POST** /{context}/chains/id/{chainId}/entries | Pre determine the Id of an entry request without anchoring the entry
*AllApi* | [**entryById**](docs/AllApi.md#entryById) | **GET** /{context}/chains/{chainId}/entries/{entryId} | Get an existing entry in the provided chain
*AllApi* | [**entryByRequest**](docs/AllApi.md#entryByRequest) | **POST** /{context}/chains/{chainId}/entries/entry | Get an existing entry in the provided chain
*AllApi* | [**entryIdExists**](docs/AllApi.md#entryIdExists) | **GET** /{context}/chains/id/{chainId}/entries/{entryId} | Determine whether the Id of an entry exists in the blockchain
*AllApi* | [**findBackends**](docs/AllApi.md#findBackends) | **GET** /backends/{backendId}/find | Find existing backend(s) by id (single result) and/or ledgername (multiple results). Optionally including public backends of others
*AllApi* | [**firstEntry**](docs/AllApi.md#firstEntry) | **GET** /{context}/chains/{chainId}/entries/first | Get the first entry in the provided chain. This is the oldest entry also called the chain tail.  Please note that the achorTimes will only contain the first anchor time. Call getEntry to retrieve all times
*AllApi* | [**getBackend**](docs/AllApi.md#getBackend) | **GET** /backends/{backendId} | Get existing backend by id (not by ledgername). Optionally including public backend of others
*AllApi* | [**getContext**](docs/AllApi.md#getContext) | **GET** /{context} | Get an existing context
*AllApi* | [**lastEntry**](docs/AllApi.md#lastEntry) | **GET** /{context}/chains/{chainId}/entries/last | Get the last entry in the provided chain. This is the most recent entry also called the chain head. Please note that the achorTimes will only contain the latest anchor time. Call getEntry to retrieve all times
*AllApi* | [**listBackends**](docs/AllApi.md#listBackends) | **GET** /backends | List existing backends.
*AllApi* | [**nextEntryById**](docs/AllApi.md#nextEntryById) | **GET** /{context}/chains/{chainId}/entries/{entryId}/next | Get the entry after the supplied entry Id (the next) in the provided chain
*AllApi* | [**nextEntryByRequest**](docs/AllApi.md#nextEntryByRequest) | **POST** /{context}/chains/{chainId}/entries/entry/next | Get the entry after the supplied entry Id (the next) in the provided chain
*AllApi* | [**previousEntryById**](docs/AllApi.md#previousEntryById) | **GET** /{context}/chains/{chainId}/entries/{entryId}/previous | Get the entry before the supplied entry Id (the previous) in the provided chain
*AllApi* | [**previousEntryByRequest**](docs/AllApi.md#previousEntryByRequest) | **POST** /{context}/chains/{chainId}/entries/entry/previous | Get the entry before the supplied entry Id (the previous) in the provided chain
*ChainApi* | [**createChain**](docs/ChainApi.md#createChain) | **POST** /{context}/chains | Create a new chain
*ContextApi* | [**createBackend**](docs/ContextApi.md#createBackend) | **POST** /backends | Create a new backend
*ContextApi* | [**createContext**](docs/ContextApi.md#createContext) | **POST** / | Create a new context
*ContextApi* | [**deleteBackend**](docs/ContextApi.md#deleteBackend) | **DELETE** /backends/{backendId} | Delete backend by id (not by ledgername)
*ContextApi* | [**findBackends**](docs/ContextApi.md#findBackends) | **GET** /backends/{backendId}/find | Find existing backend(s) by id (single result) and/or ledgername (multiple results). Optionally including public backends of others
*ContextApi* | [**getBackend**](docs/ContextApi.md#getBackend) | **GET** /backends/{backendId} | Get existing backend by id (not by ledgername). Optionally including public backend of others
*ContextApi* | [**getContext**](docs/ContextApi.md#getContext) | **GET** /{context} | Get an existing context
*ContextApi* | [**listBackends**](docs/ContextApi.md#listBackends) | **GET** /backends | List existing backends.
*EntryApi* | [**createEntry**](docs/EntryApi.md#createEntry) | **POST** /{context}/chains/{chainId}/entries | Create a new entry in the provided chain
*EntryApi* | [**entryById**](docs/EntryApi.md#entryById) | **GET** /{context}/chains/{chainId}/entries/{entryId} | Get an existing entry in the provided chain
*EntryApi* | [**entryByRequest**](docs/EntryApi.md#entryByRequest) | **POST** /{context}/chains/{chainId}/entries/entry | Get an existing entry in the provided chain
*EntryApi* | [**firstEntry**](docs/EntryApi.md#firstEntry) | **GET** /{context}/chains/{chainId}/entries/first | Get the first entry in the provided chain. This is the oldest entry also called the chain tail.  Please note that the achorTimes will only contain the first anchor time. Call getEntry to retrieve all times
*EntryApi* | [**lastEntry**](docs/EntryApi.md#lastEntry) | **GET** /{context}/chains/{chainId}/entries/last | Get the last entry in the provided chain. This is the most recent entry also called the chain head. Please note that the achorTimes will only contain the latest anchor time. Call getEntry to retrieve all times
*EntryApi* | [**nextEntryById**](docs/EntryApi.md#nextEntryById) | **GET** /{context}/chains/{chainId}/entries/{entryId}/next | Get the entry after the supplied entry Id (the next) in the provided chain
*EntryApi* | [**nextEntryByRequest**](docs/EntryApi.md#nextEntryByRequest) | **POST** /{context}/chains/{chainId}/entries/entry/next | Get the entry after the supplied entry Id (the next) in the provided chain
*EntryApi* | [**previousEntryById**](docs/EntryApi.md#previousEntryById) | **GET** /{context}/chains/{chainId}/entries/{entryId}/previous | Get the entry before the supplied entry Id (the previous) in the provided chain
*EntryApi* | [**previousEntryByRequest**](docs/EntryApi.md#previousEntryByRequest) | **POST** /{context}/chains/{chainId}/entries/entry/previous | Get the entry before the supplied entry Id (the previous) in the provided chain
*IdApi* | [**chainIdExists**](docs/IdApi.md#chainIdExists) | **GET** /{context}/chains/id/{chainId} | Determine whether the Id of a chain exists in the blockchain
*IdApi* | [**determineChainId**](docs/IdApi.md#determineChainId) | **POST** /{context}/chains/id | Pre determine the Id of a chain request without anchoring it in the blockchain
*IdApi* | [**determineEntryId**](docs/IdApi.md#determineEntryId) | **POST** /{context}/chains/id/{chainId}/entries | Pre determine the Id of an entry request without anchoring the entry
*IdApi* | [**entryIdExists**](docs/IdApi.md#entryIdExists) | **GET** /{context}/chains/id/{chainId}/entries/{entryId} | Determine whether the Id of an entry exists in the blockchain


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
- **Authorization URL**: 
- **Scopes**: 
  - global: accessEverything


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

dev@sphereon.com

