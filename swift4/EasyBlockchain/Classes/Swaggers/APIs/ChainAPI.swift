//
// ChainAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire



open class ChainAPI {
    /**
     Create a new chain
     
     - parameter context: (path) context 
     - parameter chain: (body) Create a chain using the first entry supplied. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network! 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func createChain(context: String, chain: Chain, completion: @escaping ((_ data: CommittedChainResponse?,_ error: Error?) -> Void)) {
        createChainWithRequestBuilder(context: context, chain: chain).execute { (response, error) -> Void in
            completion(response?.body, error);
        }
    }


    /**
     Create a new chain
     - POST /{context}/chains
     - Create a new chain. Create a new chain. You can regard a chain as a blockchain within a blockchain, All entries in a chain are linked and relies on data from previous entries in the chain.
     - OAuth:
       - type: oauth2
       - name: oauth2schema
     - examples: [{contentType=application/json;charset=UTF-8, example={
  "chain" : {
    "chain" : {
      "firstEntry" : {
        "entryData" : {
          "externalIds" : [ {
            "value" : "aeiou"
          } ],
          "content" : "aeiou"
        }
      }
    },
    "id" : "aeiou"
  },
  "commitTime" : "2000-01-23T04:56:07.000+00:00",
  "creationRequestTime" : "2000-01-23T04:56:07.000+00:00"
}}]
     
     - parameter context: (path) context 
     - parameter chain: (body) Create a chain using the first entry supplied. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network! 

     - returns: RequestBuilder<CommittedChainResponse> 
     */
    open class func createChainWithRequestBuilder(context: String, chain: Chain) -> RequestBuilder<CommittedChainResponse> {
        var path = "/{context}/chains"
        path = path.replacingOccurrences(of: "{context}", with: "\(context)", options: .literal, range: nil)
        let URLString = EasyBlockchainAPI.basePath + path
        let parameters = JSONEncodingHelper.encodingParameters(forEncodableObject: chain)

        let url = NSURLComponents(string: URLString)


        let requestBuilder: RequestBuilder<CommittedChainResponse>.Type = EasyBlockchainAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

}