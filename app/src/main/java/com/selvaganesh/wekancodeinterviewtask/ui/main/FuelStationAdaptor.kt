package com.selvaganesh.wekancodeinterviewtask.ui.main

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.selvaganesh.wekancodeinterviewtask.R
import com.selvaganesh.wekancodeinterviewtask.response.fuelstations.FuelStationsItem
import com.selvaganesh.wekancodeinterviewtask.utils.TextUtils
import kotlinx.android.synthetic.main.list_station_layout.view.*
import java.util.*

class FuelStationAdaptor() :
    RecyclerView.Adapter<FuelStationAdaptor.FuelStationViewHolder>() {

    var context: Context? = null
    val fuelStationList: ArrayList<FuelStationsItem> = ArrayList<FuelStationsItem>()

    fun updateStationNames(stationList: ArrayList<FuelStationsItem>) {
        fuelStationList.clear()
        fuelStationList.addAll(stationList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FuelStationViewHolder {
        val v =
            LayoutInflater.from(parent.context).inflate(R.layout.list_station_layout, parent, false)
        context = parent.context
        return FuelStationViewHolder(v)
    }

    override fun getItemCount(): Int {
        return fuelStationList.size
    }

    override fun onBindViewHolder(holder: FuelStationViewHolder, position: Int) {
        holder.bind(fuelStationList[position])
    }

    class FuelStationViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val txt_station_name = view.txt_station_name
        private val txt_station_directions = view.txt_station_directions

        fun bind(fuelStationsItem: FuelStationsItem) {
            txt_station_name.setText("Station Name : " + TextUtils.getString(fuelStationsItem.stationName))
            txt_station_directions.setText("Direction : " + TextUtils.getString(fuelStationsItem.intersectionDirections))
        }

    }

}
