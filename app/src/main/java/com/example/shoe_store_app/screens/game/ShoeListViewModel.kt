package com.example.shoe_store_app.screens.game

import android.util.Log
import android.view.Menu
import androidx.lifecycle.ViewModel
import com.example.shoe_store_app.R
import com.example.shoe_store_app.ShoeData

class ShoeListViewModel : ViewModel() {

    var shoe = ShoeData(
        "",
        0,
        "",
        "",
        0
    )

    init {
        Log.i("ShoeListViewModel", "Shoe List Vieww Model Created Successfully")
    }


    override fun onCleared() {
        super.onCleared()
        Log.i("ShoeListViewModel", "Shoe List Vieww Model DESTROYED")
    }
}