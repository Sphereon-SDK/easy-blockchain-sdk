/*
 * Easy Blockchain API
 * The Easy Blockchain API is an easy to use API to store related entries within chains. Currently it stores entries using a Factom, Ethereum or Multichain blockchain.   For full API documentation please visit: https://docs.sphereon.com/api/easy-blockchain/0.10/html   Interactive testing: A web based test console is available in the Sphereon API store at: https://store.sphereon.com
 *
 * OpenAPI spec version: 0.10
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sphereon.sdk.blockchain.easy.api;

import com.sphereon.sdk.blockchain.easy.handler.ApiException;
import com.sphereon.sdk.blockchain.easy.model.Chain;
import com.sphereon.sdk.blockchain.easy.model.CommittedChainResponse;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for ChainApi
 */
@Ignore
public class ChainApiTest {

    private final ChainApi api = new ChainApi();

    
    /**
     * Create a new chain
     *
     * Create a new chain. Create a new chain. You can regard a chain as a blockchain within a blockchain, All entries in a chain are linked and relies on data from previous entries in the chain.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createChainTest() throws ApiException {
        String context = null;
        Chain chain = null;
        CommittedChainResponse response = api.createChain(context, chain);

        // TODO: test validations
    }
    
}
