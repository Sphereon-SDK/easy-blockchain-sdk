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

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['SphereonSDKBlockchainEasy/ApiClient', 'SphereonSDKBlockchainEasy/model/Entry'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./Entry'));
  } else {
    // Browser globals (root is window)
    if (!root.EasyBlockchainApi) {
      root.EasyBlockchainApi = {};
    }
    root.EasyBlockchainApi.CommittedEntry = factory(root.EasyBlockchainApi.ApiClient, root.EasyBlockchainApi.Entry);
  }
}(this, function(ApiClient, Entry) {
  'use strict';




  /**
   * The CommittedEntry model module.
   * @module SphereonSDKBlockchainEasy/model/CommittedEntry
   * @version 0.1.0
   */

  /**
   * Constructs a new <code>CommittedEntry</code>.
   * Commited Entry
   * @alias module:SphereonSDKBlockchainEasy/model/CommittedEntry
   * @class
   * @param dataStructure {module:SphereonSDKBlockchainEasy/model/CommittedEntry.DataStructureEnum} 
   * @param blockchainImplementation {module:SphereonSDKBlockchainEasy/model/CommittedEntry.BlockchainImplementationEnum} 
   */
  var exports = function(dataStructure, blockchainImplementation) {
    var _this = this;



    _this['dataStructure'] = dataStructure;
    _this['blockchainImplementation'] = blockchainImplementation;

  };

  /**
   * Constructs a <code>CommittedEntry</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:SphereonSDKBlockchainEasy/model/CommittedEntry} obj Optional instance to populate.
   * @return {module:SphereonSDKBlockchainEasy/model/CommittedEntry} The populated <code>CommittedEntry</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('entry')) {
        obj['entry'] = Entry.constructFromObject(data['entry']);
      }
      if (data.hasOwnProperty('chainId')) {
        obj['chainId'] = ApiClient.convertToType(data['chainId'], 'String');
      }
      if (data.hasOwnProperty('dataStructure')) {
        obj['dataStructure'] = ApiClient.convertToType(data['dataStructure'], 'String');
      }
      if (data.hasOwnProperty('blockchainImplementation')) {
        obj['blockchainImplementation'] = ApiClient.convertToType(data['blockchainImplementation'], 'String');
      }
      if (data.hasOwnProperty('entryId')) {
        obj['entryId'] = ApiClient.convertToType(data['entryId'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {module:SphereonSDKBlockchainEasy/model/Entry} entry
   */
  exports.prototype['entry'] = undefined;
  /**
   * Chain ID
   * @member {String} chainId
   */
  exports.prototype['chainId'] = undefined;
  /**
   * @member {module:SphereonSDKBlockchainEasy/model/CommittedEntry.DataStructureEnum} dataStructure
   */
  exports.prototype['dataStructure'] = undefined;
  /**
   * @member {module:SphereonSDKBlockchainEasy/model/CommittedEntry.BlockchainImplementationEnum} blockchainImplementation
   */
  exports.prototype['blockchainImplementation'] = undefined;
  /**
   * Entry ID
   * @member {String} entryId
   */
  exports.prototype['entryId'] = undefined;


  /**
   * Allowed values for the <code>dataStructure</code> property.
   * @enum {String}
   * @readonly
   */
  exports.DataStructureEnum = {
    /**
     * value: "Factom"
     * @const
     */
    "Factom": "Factom"  };

  /**
   * Allowed values for the <code>blockchainImplementation</code> property.
   * @enum {String}
   * @readonly
   */
  exports.BlockchainImplementationEnum = {
    /**
     * value: "Bitcoin"
     * @const
     */
    "Bitcoin": "Bitcoin"  };


  return exports;
}));


