/**
 * Easy Blockchain API
 * <b>The Easy Blockchain API is an easy to use API to store entries within chains. Currently it stores entries using the bitcoin blockchain by means of Factom. In the future other solutions will be made available</b>    The flow is generally as follows:  1. Make sure a chain has been created using the /chain POST endpoint. Normaly you only need one or a handfull of chains. This is an expensive operation.  2. Store entries on the chain from step 1. The entries will contain the content and metadata you want to store forever on the specified chain.  3. Retrieve an existing entry from the chain to verify or retrieve data      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
 *
 * OpenAPI spec version: 0.1.0
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.sphereon.sdk.blockchain.easy.api;

import com.sphereon.sdk.blockchain.easy.handler.ApiException;
import com.sphereon.sdk.blockchain.easy.model.CommittedEntryResponse;
import com.sphereon.sdk.blockchain.easy.model.Entry;
import com.sphereon.sdk.blockchain.easy.model.VndErrors;
import com.sphereon.sdk.blockchain.easy.model.IdResponse;
import com.sphereon.sdk.blockchain.easy.model.AnchoredEntryResponse;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EntryDataApi
 */
public class EntryDataApiTest {

    private final EntryDataApi api = new EntryDataApi();

    
    /**
     * Create a new entry in the provided chain
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createEntryUsingPOSTTest() throws ApiException {
        String chainId = null;
        Entry entry = null;
        // CommittedEntryResponse response = api.createEntryUsingPOST(chainId, entry);

        // TODO: test validations
    }
    
    /**
     * Pre determine the Id of an entry request without anchoring the entry
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void determineEntryIdTest() throws ApiException {
        String chainId = null;
        Entry entry = null;
        // IdResponse response = api.determineEntryId(chainId, entry);

        // TODO: test validations
    }
    
    /**
     * Get an existing entry in the provided chain
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entryByIdTest() throws ApiException {
        String chainId = null;
        String entryId = null;
        // AnchoredEntryResponse response = api.entryById(chainId, entryId);

        // TODO: test validations
    }
    
    /**
     * Get an existing entry in the provided chain
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entryByRequestTest() throws ApiException {
        String chainId = null;
        Entry entry = null;
        // AnchoredEntryResponse response = api.entryByRequest(chainId, entry);

        // TODO: test validations
    }
    
}
