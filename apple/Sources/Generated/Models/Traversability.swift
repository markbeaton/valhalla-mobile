//
// Traversability.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
    import AnyCodable
#endif

/** The directions in which the edge is traversable. */
public enum Traversability: String, Codable, CaseIterable {
    case forward
    case backward
    case both
}
