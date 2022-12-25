package com.example.shoe_store_app.screens.game

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.shoe_store_app.ShoeData

class ShoeDetailViewModel : ViewModel() {

    var shoe = ShoeData(
        "",
        0,
        "",
        "",
        0
    )

}