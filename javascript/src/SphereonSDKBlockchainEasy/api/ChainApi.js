/**
 * Easy Blockchain API
 * <b>The Easy Blockchain API is an easy to use API to store entries within chains. Currently it stores entries using the bitcoin blockchain by means of Factom or Multichain. The latter also allows for a private blockchain. In the future other solutions will be made available</b>    The flow is generally as follows:  1. Make sure a context is available using the / POST endpoint. Normally you only need one context. This is the place where backend providers and blockchain implementations are being specified.  2. Make sure a chain has been created using the /chain POST endpoint. Normally you only need one or a handful of chains. This is a relative expensive operation.  3. Store entries on the chain from step 2. The entries will contain the content and metadata you want to store forever on the specified chain.  4. Retrieve an existing entry from the chain to verify or retrieve data      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
 *
 * OpenAPI spec version: 0.10
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.2.3
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['SphereonSDKBlockchainEasy/ApiClient', 'SphereonSDKBlockchainEasy/model/Chain', 'SphereonSDKBlockchainEasy/model/CommittedChainResponse', 'SphereonSDKBlockchainEasy/model/ErrorResponse'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/Chain'), require('../model/CommittedChainResponse'), require('../model/ErrorResponse'));
  } else {
    // Browser globals (root is window)
    if (!root.EasyBlockchainApi) {
      root.EasyBlockchainApi = {};
    }
    root.EasyBlockchainApi.ChainApi = factory(root.EasyBlockchainApi.ApiClient, root.EasyBlockchainApi.Chain, root.EasyBlockchainApi.CommittedChainResponse, root.EasyBlockchainApi.ErrorResponse);
  }
}(this, function(ApiClient, Chain, CommittedChainResponse, ErrorResponse) {
  'use strict';

  /**
   * Chain service.
   * @module SphereonSDKBlockchainEasy/api/ChainApi
   * @version 0.10
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
     * @param {String} context context
     * @param {module:SphereonSDKBlockchainEasy/model/Chain} chain Create a chain using the first entry supplied. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!
     * @param {module:SphereonSDKBlockchainEasy/api/ChainApi~createChainCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:SphereonSDKBlockchainEasy/model/CommittedChainResponse}
     */
    this.createChain = function(context, chain, callback) {
      var postBody = chain;

      // verify the required parameter 'context' is set
      if (context === undefined || context === null) {
        throw new Error("Missing the required parameter 'context' when calling createChain");
      }

      // verify the required parameter 'chain' is set
      if (chain === undefined || chain === null) {
        throw new Error("Missing the required parameter 'chain' when calling createChain");
      }


      var pathParams = {
        'context': context
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2schema'];
      var contentTypes = ['application/json;charset=UTF-8'];
      var accepts = ['application/json;charset=UTF-8'];
      var returnType = CommittedChainResponse;

      return this.apiClient.callApi(
        '/{context}/chains', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
