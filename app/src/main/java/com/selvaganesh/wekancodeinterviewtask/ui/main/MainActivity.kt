package com.selvaganesh.wekancodeinterviewtask.ui.main

import android.os.Bundle
import android.widget.EditText
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnTextChanged
import com.selvaganesh.wekancodeinterviewtask.R
import com.selvaganesh.wekancodeinterviewtask.base.BaseActivity
import com.selvaganesh.wekancodeinterviewtask.response.fuelstations.FuelStationsItem
import com.selvaganesh.wekancodeinterviewtask.utils.TextUtils
import java.util.ArrayList

class MainActivity : BaseActivity() {

    @BindView(R.id.edt_fuel_station)
    lateinit var edtFuelStation: EditText
    @BindView(R.id.ryc_fuel_station)
    lateinit var rycFuelStation: RecyclerView

    private var TAG: String = this::class.java.simpleName
    private var viewModel: MainActivityViewModel? = null
    private var fuelStationAdp: FuelStationAdaptor? = null
    val fuelStationList: ArrayList<FuelStationsItem> = ArrayList<FuelStationsItem>()
    val filteredfuelStationList: ArrayList<FuelStationsItem> = ArrayList<FuelStationsItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)
        setUi()
    }

    private fun setUi() {
        setInstance()
        receiveAction()
        setAction()
    }

    private fun setInstance() {
        viewModel = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)
        viewModel?.setContext(this)

        fuelStationAdp = FuelStationAdaptor()
        rycFuelStation.setHasFixedSize(true);
        rycFuelStation.setLayoutManager(LinearLayoutManager(this))
        rycFuelStation.setAdapter(fuelStationAdp);
    }

    private fun setAction() {
        viewModel?.fetchApi("DEMO_KEY", "E85,ELEC", "CA", "100")
    }

    private fun receiveAction() {
        viewModel?.getFuelStationMLD?.observe(this, Observer { respose ->
            if (respose != null && respose.fuelStations != null && respose.fuelStations.size > 0) {
                fuelStationList.clear()
                fuelStationList.addAll(respose.fuelStations)
                fuelStationAdp?.updateStationNames(fuelStationList)
            } else {

            }
        })
    }

    @OnTextChanged(
        value = [R.id.edt_fuel_station],
        callback = OnTextChanged.Callback.AFTER_TEXT_CHANGED
    )
    fun nameChanged(edtTextValue: CharSequence?) {
        if (!TextUtils.isEmpty(edtTextValue.toString())) {
            filteredfuelStationList.clear()
            for (fuelStation: FuelStationsItem in fuelStationList) {
                if (TextUtils.getString(fuelStation.stationName!!.toLowerCase())!!.contains(edtTextValue.toString().toLowerCase())) {
                    filteredfuelStationList.add(fuelStation)
                    fuelStationAdp?.updateStationNames(filteredfuelStationList)
                }
            }
        }else{
            fuelStationAdp?.updateStationNames(fuelStationList)
        }
    }
}
