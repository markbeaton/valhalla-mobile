//
// BikeNetwork.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
    import AnyCodable
#endif

public struct BikeNetwork: Codable, JSONEncodable, Hashable {
    public var mountain: Bool?
    public var local: Bool?
    public var regional: Bool?
    public var national: Bool?

    public init(mountain: Bool? = nil, local: Bool? = nil, regional: Bool? = nil, national: Bool? = nil) {
        self.mountain = mountain
        self.local = local
        self.regional = regional
        self.national = national
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case mountain
        case local
        case regional
        case national
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(mountain, forKey: .mountain)
        try container.encodeIfPresent(local, forKey: .local)
        try container.encodeIfPresent(regional, forKey: .regional)
        try container.encodeIfPresent(national, forKey: .national)
    }
}
