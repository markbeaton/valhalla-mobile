//
// MatrixCostingModel.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
    import AnyCodable
#endif

public enum MatrixCostingModel: String, Codable, CaseIterable {
    case auto
    case bus
    case hov
    case taxi
    case truck
    case bicycle
    case bikeshare
    case motorScooter = "motor_scooter"
    case motorcycle
    case pedestrian
}