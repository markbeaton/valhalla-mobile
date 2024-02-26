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

import Models.IsochroneProperties

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param properties 
 * @param geometry 
 * @param type 
 */


data class IsochroneFeature (

    @Json(name = "properties")
    val properties: IsochroneProperties? = null,

    @Json(name = "geometry")
    val geometry: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @Json(name = "type")
    val type: IsochroneFeature.Type? = null

) {

    /**
     * 
     *
     * Values: feature
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "Feature") feature("Feature");
    }
}
