//
// Backend.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** A backend is a blockchain implementation along with it&#39;s nodes (rpdProviders). You only need a backend when you wish to connect one of the supported blockchain implementations in a private blockchain. Otherwise use one of the public backends for your context */
open class Backend: Codable {

    public enum DataStructure: String, Codable { 
        case factom = "FACTOM"
        case multichain = "MULTICHAIN"
        case ethereum = "ETHEREUM"
    }
    /** One or more nodes that comprise the blockchain backend */
    public var rpcProviders: [RpcProvider]?
    public var apiVersion: Int32?
    /** The name of the backend. */
    public var name: String?
    public var start: Date?
    public var end: Date?
    public var dataStructure: DataStructure?
    public var id: String?
    public var externalAccess: Access?

    public init() {}

}
