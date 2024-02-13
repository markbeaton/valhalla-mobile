//
// EdgeUse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
    import AnyCodable
#endif

/** The use for the edge. */
public enum EdgeUse: String, Codable, CaseIterable {
    case road
    case ramp
    case turnChannel = "turn_channel"
    case track
    case driveway
    case alley
    case parkingAisle = "parking_aisle"
    case emergencyAccess = "emergency_access"
    case driveThrough = "drive_through"
    case culdesac
    case livingStreet = "living_street"
    case serviceRoad = "service_road"
    case cycleway
    case mountainBike = "mountain_bike"
    case sidewalk
    case footway
    case steps
    case path
    case pedestrian
    case pedestrianCrossing = "pedestrian_crossing"
    case bridleway
    case restArea = "rest_area"
    case serviceArea = "service_area"
    case other
    case ferry
    case railFerry = "rail-ferry"
    case rail
    case bus
    case egressConnection = "egress_connection"
    case platformConnection = "platform_connection"
    case transitConnection = "transit_connection"
}
