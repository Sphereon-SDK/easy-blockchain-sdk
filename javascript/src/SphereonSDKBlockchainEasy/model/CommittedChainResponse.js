/**
 * Easy Blockchain API
 * <b>The Easy Blockchain API is an easy to use API to store entries within chains. Currently it stores entries using the bitcoin blockchain by means of Factom or Multichain. The latter also allows for a private blockchain. In the future other solutions will be made available</b>    The flow is generally as follows:  1. Make sure a context is available using the / POST endpoint. Normally you only need one context. This is the place where backend providers and blockchain implementations are being specified.  2. Make sure a chain has been created using the /chain POST endpoint. Normally you only need one or a handful of chains. This is a relative expensive operation.  3. Store entries on the chain from step 2. The entries will contain the content and metadata you want to store forever on the specified chain.  4. Retrieve an existing entry from the chain to verify or retrieve data      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
 *
 * OpenAPI spec version: 0.9
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
    define(['SphereonSDKBlockchainEasy/ApiClient', 'SphereonSDKBlockchainEasy/model/CommittedChain'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./CommittedChain'));
  } else {
    // Browser globals (root is window)
    if (!root.EasyBlockchainApi) {
      root.EasyBlockchainApi = {};
    }
    root.EasyBlockchainApi.CommittedChainResponse = factory(root.EasyBlockchainApi.ApiClient, root.EasyBlockchainApi.CommittedChain);
  }
}(this, function(ApiClient, CommittedChain) {
  'use strict';




  /**
   * The CommittedChainResponse model module.
   * @module SphereonSDKBlockchainEasy/model/CommittedChainResponse
   * @version 0.9
   */

  /**
   * Constructs a new <code>CommittedChainResponse</code>.
   * Committed Chain response
   * @alias module:SphereonSDKBlockchainEasy/model/CommittedChainResponse
   * @class
   * @param chain {module:SphereonSDKBlockchainEasy/model/CommittedChain} 
   */
  var exports = function(chain) {
    var _this = this;

    _this['chain'] = chain;


  };

  /**
   * Constructs a <code>CommittedChainResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:SphereonSDKBlockchainEasy/model/CommittedChainResponse} obj Optional instance to populate.
   * @return {module:SphereonSDKBlockchainEasy/model/CommittedChainResponse} The populated <code>CommittedChainResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('chain')) {
        obj['chain'] = CommittedChain.constructFromObject(data['chain']);
      }
      if (data.hasOwnProperty('commitTime')) {
        obj['commitTime'] = ApiClient.convertToType(data['commitTime'], 'Date');
      }
      if (data.hasOwnProperty('creationRequestTime')) {
        obj['creationRequestTime'] = ApiClient.convertToType(data['creationRequestTime'], 'Date');
      }
    }
    return obj;
  }

  /**
   * @member {module:SphereonSDKBlockchainEasy/model/CommittedChain} chain
   */
  exports.prototype['chain'] = undefined;
  /**
   * The time at which the chain was first committed in ISO 8601 format
   * @member {Date} commitTime
   */
  exports.prototype['commitTime'] = undefined;
  /**
   * The time at which the chain creation was first requested in ISO 8601 format
   * @member {Date} creationRequestTime
   */
  exports.prototype['creationRequestTime'] = undefined;



  return exports;
}));


