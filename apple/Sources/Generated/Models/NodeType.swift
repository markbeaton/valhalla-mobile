//
// NodeType.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
    import AnyCodable
#endif

public enum NodeType: String, Codable, CaseIterable {
    case streetIntersection = "street_intersection"
    case gate
    case bollard
    case tollBooth = "toll_booth"
    case multiUseTransitStop = "multi_use_transit_stop"
    case bikeShare = "bike_share"
    case parking
    case motorWayJunction = "motor_way_junction"
    case borderControl = "border_control"
}