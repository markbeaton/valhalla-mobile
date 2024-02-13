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

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id An identifier to disambiguate requests (echoed by the server).
 * @param shape REQUIRED if `encoded_polyline` is not present.
 * @param encodedPolyline REQUIRED if `shape` is not present. An encoded polyline (https://developers.google.com/maps/documentation/utilities/polylinealgorithm).
 * @param shapeFormat Specifies whether the polyline is encoded with 6 digit precision (polyline6) or 5 digit precision (polyline5).
 * @param range Controls whether or not the returned array is one-dimensional (height only) or two-dimensional (with a range and height). The range dimension can be used to generate a graph or steepness gradient along a route.
 * @param heightPrecision The decimal precision (number of digits after the point) of the output. When 0, integer values are returned. Valid values are 0, 1, and 2.
 */


data class HeightRequest (

    /* An identifier to disambiguate requests (echoed by the server). */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* REQUIRED if `encoded_polyline` is not present. */
    @Json(name = "shape")
    val shape: kotlin.collections.List<Coordinate>? = null,

    /* REQUIRED if `shape` is not present. An encoded polyline (https://developers.google.com/maps/documentation/utilities/polylinealgorithm). */
    @Json(name = "encoded_polyline")
    val encodedPolyline: kotlin.String? = null,

    /* Specifies whether the polyline is encoded with 6 digit precision (polyline6) or 5 digit precision (polyline5). */
    @Json(name = "shape_format")
    val shapeFormat: HeightRequest.ShapeFormat? = ShapeFormat.polyline6,

    /* Controls whether or not the returned array is one-dimensional (height only) or two-dimensional (with a range and height). The range dimension can be used to generate a graph or steepness gradient along a route. */
    @Json(name = "range")
    val range: kotlin.Boolean? = false,

    /* The decimal precision (number of digits after the point) of the output. When 0, integer values are returned. Valid values are 0, 1, and 2. */
    @Json(name = "height_precision")
    val heightPrecision: kotlin.Int? = 0

) {

    /**
     * Specifies whether the polyline is encoded with 6 digit precision (polyline6) or 5 digit precision (polyline5).
     *
     * Values: polyline6,polyline5
     */
    @JsonClass(generateAdapter = false)
    enum class ShapeFormat(val value: kotlin.String) {
        @Json(name = "polyline6") polyline6("polyline6"),
        @Json(name = "polyline5") polyline5("polyline5");
    }
}

