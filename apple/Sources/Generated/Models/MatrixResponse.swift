//
// MatrixResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
    import AnyCodable
#endif

public struct MatrixResponse: Codable, JSONEncodable, Hashable {
    /** An identifier to disambiguate requests (echoed by the server). */
    public var id: String?
    /** The list of starting locations */
    public var sources: [[Coordinate]]
    /** The list of ending locations */
    public var targets: [[Coordinate]]
    /** The matrix of starting and ending locations, along with the computed distance and travel time. The array is row-ordered. This means that the time and distance from the first location to all others forms the first row of the array, followed by the time and distance from the second source location to all target locations, etc. */
    public var sourcesToTargets: [[MatrixDistance]]
    public var warnings: [Warning]?
    public var units: ValhallaLongUnits

    public init(id: String? = nil, sources: [[Coordinate]], targets: [[Coordinate]], sourcesToTargets: [[MatrixDistance]], warnings: [Warning]? = nil, units: ValhallaLongUnits) {
        self.id = id
        self.sources = sources
        self.targets = targets
        self.sourcesToTargets = sourcesToTargets
        self.warnings = warnings
        self.units = units
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case id
        case sources
        case targets
        case sourcesToTargets = "sources_to_targets"
        case warnings
        case units
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(id, forKey: .id)
        try container.encode(sources, forKey: .sources)
        try container.encode(targets, forKey: .targets)
        try container.encode(sourcesToTargets, forKey: .sourcesToTargets)
        try container.encodeIfPresent(warnings, forKey: .warnings)
        try container.encode(units, forKey: .units)
    }
}
