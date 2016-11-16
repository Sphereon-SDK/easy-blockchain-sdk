/**
 * Easy Blockchain API
 * <b>The Easy Blockchain API is an easy to use API to store entries within chains. Currently it stores entries using the bitcoin blockchain by means of Factom. In the future other solutions will be made available</b>    The flow is generally as follows:  1. Make sure a chain has been created using the /chain POST endpoint. Normally you only need one or a handful of chains. This is an expensive operation.  2. Store entries on the chain from step 1. The entries will contain the content and metadata you want to store forever on the specified chain.  3. Retrieve an existing entry from the chain to verify or retrieve data      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
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

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['SphereonSDKBlockchainEasy/ApiClient', 'SphereonSDKBlockchainEasy/model/CommittedChainResponse', 'SphereonSDKBlockchainEasy/model/Chain', 'SphereonSDKBlockchainEasy/model/VndErrors'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/CommittedChainResponse'), require('../model/Chain'), require('../model/VndErrors'));
  } else {
    // Browser globals (root is window)
    if (!root.EasyBlockchainApi) {
      root.EasyBlockchainApi = {};
    }
    root.EasyBlockchainApi.ChainApi = factory(root.EasyBlockchainApi.ApiClient, root.EasyBlockchainApi.CommittedChainResponse, root.EasyBlockchainApi.Chain, root.EasyBlockchainApi.VndErrors);
  }
}(this, function(ApiClient, CommittedChainResponse, Chain, VndErrors) {
  'use strict';

  /**
   * Chain service.
   * @module SphereonSDKBlockchainEasy/api/ChainApi
   * @version 0.1.0
   */

  /**
   * Constructs a new ChainApi. 
   * @alias module:SphereonSDKBlockchainEasy/api/ChainApi
   * @class
   * @param {module:SphereonSDKBlockchainEasy/ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:SphereonSDKBlockchainEasy/ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the createChain operation.
     * @callback module:SphereonSDKBlockchainEasy/api/ChainApi~createChainCallback
     * @param {String} error Error message, if any.
     * @param {module:SphereonSDKBlockchainEasy/model/CommittedChainResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create a new chain
     * @param {module:SphereonSDKBlockchainEasy/model/Chain} chain Create a chain using the first entry supplied. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!
     * @param {module:SphereonSDKBlockchainEasy/api/ChainApi~createChainCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:SphereonSDKBlockchainEasy/model/CommittedChainResponse}
     */
    this.createChain = function(chain, callback) {
      var postBody = chain;

      // verify the required parameter 'chain' is set
      if (chain == undefined || chain == null) {
        throw "Missing the required parameter 'chain' when calling createChain";
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2schema'];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = CommittedChainResponse;

      return this.apiClient.callApi(
        '/blockchain/easy/0.1.0/chains', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
