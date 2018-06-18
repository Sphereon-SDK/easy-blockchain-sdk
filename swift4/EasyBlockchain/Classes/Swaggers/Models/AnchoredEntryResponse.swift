//
// AnchoredEntryResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Anchored Entry response */
open class AnchoredEntryResponse: Codable {

    public enum AnchorState: String, Codable { 
        case requested = "REQUESTED"
        case committed = "COMMITTED"
        case notFound = "NOT_FOUND"
        case anchored = "ANCHORED"
    }
    public var anchoredEntry: CommittedEntry?
    /** All the times at which the Entry with the same Id was anchored in the blockchain in ISO 8601 format. The first, current and last Anchor Times will also be in this list */
    public var anchorTimes: [Date]?
    /** The current anchor time (this is not necessarely the last anchor time!) of the entry (if any) in the blockchain in ISO 8601 format */
    public var currentAnchorTime: Date?
    public var anchorState: AnchorState?
    /** The last anchor time of the entry (if any) in the blockchain in ISO 8601 format */
    public var lastAnchorTime: Date?
    /** The first anchor time of the entry (if any) in the blockchain in ISO 8601 format */
    public var firstAnchorTime: Date?

    public init() {}

}