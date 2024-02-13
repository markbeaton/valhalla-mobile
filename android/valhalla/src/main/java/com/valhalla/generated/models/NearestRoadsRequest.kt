/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package Models

import Models.Coordinate
import Models.CostingModel
import Models.CostingOptions
import Models.DirectionsOptions

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param locations 
 * @param costing 
 * @param costingOptions 
 * @param verbose 
 * @param directionsOptions 
 */


data class NearestRoadsRequest (

    @Json(name = "locations")
    val locations: kotlin.collections.List<Coordinate>,

    @Json(name = "costing")
    val costing: CostingModel? = null,

    @Json(name = "costing_options")
    val costingOptions: CostingOptions? = null,

    @Json(name = "verbose")
    val verbose: kotlin.Boolean? = false,

    @Json(name = "directions_options")
    val directionsOptions: DirectionsOptions? = null

)

