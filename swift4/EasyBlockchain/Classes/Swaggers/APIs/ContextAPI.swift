//
// ContextAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire



open class ContextAPI {
    /**
     Create context
     
     - parameter context: (body) context 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func createContext(context: Context, completion: @escaping ((_ data: Context?,_ error: Error?) -> Void)) {
        createContextWithRequestBuilder(context: context).execute { (response, error) -> Void in
            completion(response?.body, error);
        }
    }


    /**
     Create context
     - POST /contexts
     - Create a new context
     - OAuth:
       - type: oauth2
       - name: oauth2schema
     - examples: [{contentType=application/json;charset=UTF-8, example={
  "access" : {
    "modes" : [ "NONE" ],
    "blackList" : [ "aeiou" ],
    "whiteList" : [ "aeiou" ]
  },
  "backendIds" : [ "aeiou" ],
  "name" : "aeiou",
  "id" : "aeiou"
}}]
     
     - parameter context: (body) context 

     - returns: RequestBuilder<Context> 
     */
    open class func createContextWithRequestBuilder(context: Context) -> RequestBuilder<Context> {
        let path = "/contexts"
        let URLString = EasyBlockchainAPI.basePath + path
        let parameters = JSONEncodingHelper.encodingParameters(forEncodableObject: context)

        let url = NSURLComponents(string: URLString)


        let requestBuilder: RequestBuilder<Context>.Type = EasyBlockchainAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

    /**
     Delete context
     
     - parameter context: (path) context 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func deleteContext(context: String, completion: @escaping ((_ data: Context?,_ error: Error?) -> Void)) {
        deleteContextWithRequestBuilder(context: context).execute { (response, error) -> Void in
            completion(response?.body, error);
        }
    }


    /**
     Delete context
     - DELETE /contexts/{context}
     - Delete an existing context
     - OAuth:
       - type: oauth2
       - name: oauth2schema
     - examples: [{contentType=application/json;charset=UTF-8, example={
  "access" : {
    "modes" : [ "NONE" ],
    "blackList" : [ "aeiou" ],
    "whiteList" : [ "aeiou" ]
  },
  "backendIds" : [ "aeiou" ],
  "name" : "aeiou",
  "id" : "aeiou"
}}]
     
     - parameter context: (path) context 

     - returns: RequestBuilder<Context> 
     */
    open class func deleteContextWithRequestBuilder(context: String) -> RequestBuilder<Context> {
        var path = "/contexts/{context}"
        path = path.replacingOccurrences(of: "{context}", with: "\(context)", options: .literal, range: nil)
        let URLString = EasyBlockchainAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = NSURLComponents(string: URLString)


        let requestBuilder: RequestBuilder<Context>.Type = EasyBlockchainAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "DELETE", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get context
     
     - parameter context: (path) context 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getContext(context: String, completion: @escaping ((_ data: Context?,_ error: Error?) -> Void)) {
        getContextWithRequestBuilder(context: context).execute { (response, error) -> Void in
            completion(response?.body, error);
        }
    }


    /**
     Get context
     - GET /contexts/{context}
     - Get an existing context
     - OAuth:
       - type: oauth2
       - name: oauth2schema
     - examples: [{contentType=application/json;charset=UTF-8, example={
  "access" : {
    "modes" : [ "NONE" ],
    "blackList" : [ "aeiou" ],
    "whiteList" : [ "aeiou" ]
  },
  "backendIds" : [ "aeiou" ],
  "name" : "aeiou",
  "id" : "aeiou"
}}]
     
     - parameter context: (path) context 

     - returns: RequestBuilder<Context> 
     */
    open class func getContextWithRequestBuilder(context: String) -> RequestBuilder<Context> {
        var path = "/contexts/{context}"
        path = path.replacingOccurrences(of: "{context}", with: "\(context)", options: .literal, range: nil)
        let URLString = EasyBlockchainAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = NSURLComponents(string: URLString)


        let requestBuilder: RequestBuilder<Context>.Type = EasyBlockchainAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

}
