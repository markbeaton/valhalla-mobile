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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param golfCart 
 * @param truck 
 * @param pedestrian 
 * @param wheelchair 
 * @param taxi 
 * @param HOV 
 * @param emergency 
 * @param motorcycle 
 * @param car 
 * @param moped 
 * @param bus 
 * @param bicycle 
 */


data class Restrictions (

    @Json(name = "golf_cart")
    val golfCart: kotlin.Boolean? = null,

    @Json(name = "truck")
    val truck: kotlin.Boolean? = null,

    @Json(name = "pedestrian")
    val pedestrian: kotlin.Boolean? = null,

    @Json(name = "wheelchair")
    val wheelchair: kotlin.Boolean? = null,

    @Json(name = "taxi")
    val taxi: kotlin.Boolean? = null,

    @Json(name = "HOV")
    val HOV: kotlin.Boolean? = null,

    @Json(name = "emergency")
    val emergency: kotlin.Boolean? = null,

    @Json(name = "motorcycle")
    val motorcycle: kotlin.Boolean? = null,

    @Json(name = "car")
    val car: kotlin.Boolean? = null,

    @Json(name = "moped")
    val moped: kotlin.Boolean? = null,

    @Json(name = "bus")
    val bus: kotlin.Boolean? = null,

    @Json(name = "bicycle")
    val bicycle: kotlin.Boolean? = null

)

