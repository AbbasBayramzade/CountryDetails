package com.info.firstweektask

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?, ): View? {
        // Inflate the layout for this fragment
        var design = inflater.inflate(R.layout.fragment_main,container,false)

        getAllCountries()

        return design
    }

    private fun getAllCountries(){

        //TODO Apidan olke siyahisini cek

        //TODO 2 Api NETICESINI DATABASE YAZMAQ

        //TODO 3.Birinci Database yoxlamaq,database yoxdursa Api-a getmek

        //TODO 4. List elemenine clikc edib novbeti fragmente datani oturmek(parsezialbe)



    }

}