package com.selvaganesh.wekancodeinterviewtask.response.fuelstations

import com.google.gson.annotations.SerializedName

data class FuelStationsItem(

	@field:SerializedName("country")
	val country: String? = null,

	@field:SerializedName("cng_vehicle_class")
	val cngVehicleClass: Any? = null,

	@field:SerializedName("e85_other_ethanol_blends")
	val e85OtherEthanolBlends: Any? = null,

	@field:SerializedName("access_code")
	val accessCode: String? = null,

	@field:SerializedName("plus4")
	val plus4: Any? = null,

	@field:SerializedName("lng_renewable_source")
	val lngRenewableSource: Any? = null,

	@field:SerializedName("fuel_type_code")
	val fuelTypeCode: String? = null,

	@field:SerializedName("ng_fill_type_code")
	val ngFillTypeCode: Any? = null,

	@field:SerializedName("cng_dispenser_num")
	val cngDispenserNum: Any? = null,

	@field:SerializedName("date_last_confirmed")
	val dateLastConfirmed: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("state")
	val state: String? = null,

	@field:SerializedName("geocode_status")
	val geocodeStatus: String? = null,

	@field:SerializedName("ev_network_web")
	val evNetworkWeb: Any? = null,

	@field:SerializedName("longitude")
	val longitude: Double? = null,

	@field:SerializedName("open_date")
	val openDate: String? = null,

	@field:SerializedName("station_name")
	val stationName: String? = null,

	@field:SerializedName("zip")
	val zip: String? = null,

	@field:SerializedName("bd_blends_fr")
	val bdBlendsFr: Any? = null,

	@field:SerializedName("ev_level1_evse_num")
	val evLevel1EvseNum: Int? = null,

	@field:SerializedName("bd_blends")
	val bdBlends: Any? = null,

	@field:SerializedName("hy_status_link")
	val hyStatusLink: Any? = null,

	@field:SerializedName("groups_with_access_code")
	val groupsWithAccessCode: String? = null,

	@field:SerializedName("cng_total_storage")
	val cngTotalStorage: Any? = null,

	@field:SerializedName("expected_date")
	val expectedDate: Any? = null,

	@field:SerializedName("station_phone")
	val stationPhone: String? = null,

	@field:SerializedName("street_address")
	val streetAddress: String? = null,

	@field:SerializedName("status_code")
	val statusCode: String? = null,

	@field:SerializedName("hy_standards")
	val hyStandards: Any? = null,

	@field:SerializedName("city")
	val city: String? = null,

	@field:SerializedName("latitude")
	val latitude: Double? = null,

	@field:SerializedName("ng_vehicle_class")
	val ngVehicleClass: Any? = null,

	@field:SerializedName("ng_psi")
	val ngPsi: Any? = null,

	@field:SerializedName("cards_accepted")
	val cardsAccepted: Any? = null,

	@field:SerializedName("ev_renewable_source")
	val evRenewableSource: Any? = null,

	@field:SerializedName("updated_at")
	val updatedAt: String? = null,

	@field:SerializedName("cng_total_compression")
	val cngTotalCompression: Any? = null,

	@field:SerializedName("lpg_primary")
	val lpgPrimary: Any? = null,

	@field:SerializedName("ev_network")
	val evNetwork: String? = null,

	@field:SerializedName("access_days_time_fr")
	val accessDaysTimeFr: Any? = null,

	@field:SerializedName("facility_type")
	val facilityType: String? = null,

	@field:SerializedName("lpg_nozzle_types")
	val lpgNozzleTypes: Any? = null,

	@field:SerializedName("ev_level2_evse_num")
	val evLevel2EvseNum: Any? = null,

	@field:SerializedName("intersection_directions")
	val intersectionDirections: String? = null,

	@field:SerializedName("ev_connector_types")
	val evConnectorTypes: List<String?>? = null,

	@field:SerializedName("intersection_directions_fr")
	val intersectionDirectionsFr: Any? = null,

	@field:SerializedName("access_detail_code")
	val accessDetailCode: Any? = null,

	@field:SerializedName("ev_dc_fast_num")
	val evDcFastNum: Any? = null,

	@field:SerializedName("owner_type_code")
	val ownerTypeCode: String? = null,

	@field:SerializedName("cng_fill_type_code")
	val cngFillTypeCode: Any? = null,

	@field:SerializedName("groups_with_access_code_fr")
	val groupsWithAccessCodeFr: String? = null,

	@field:SerializedName("cng_renewable_source")
	val cngRenewableSource: Any? = null,

	@field:SerializedName("ev_other_evse")
	val evOtherEvse: String? = null,

	@field:SerializedName("ev_pricing_fr")
	val evPricingFr: Any? = null,

	@field:SerializedName("e85_blender_pump")
	val e85BlenderPump: Any? = null,

	@field:SerializedName("hy_is_retail")
	val hyIsRetail: Any? = null,

	@field:SerializedName("cng_psi")
	val cngPsi: Any? = null,

	@field:SerializedName("ev_pricing")
	val evPricing: Any? = null,

	@field:SerializedName("lng_vehicle_class")
	val lngVehicleClass: Any? = null,

	@field:SerializedName("access_days_time")
	val accessDaysTime: String? = null,

	@field:SerializedName("hy_pressures")
	val hyPressures: Any? = null,

	@field:SerializedName("ev_network_ids")
	val evNetworkIds: EvNetworkIds? = null
)