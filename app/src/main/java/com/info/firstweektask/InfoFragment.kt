package com.info.firstweektask

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class InfoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?, ): View? {
        // Inflate the layout for this fragment
        var design = inflater.inflate(R.layout.fragment_info, container, false)


        getCountryData()

        return design
    }

    private fun getCountryData(){

        //TODO 5. gelen cavabi gotur ekrana ver

    }



}