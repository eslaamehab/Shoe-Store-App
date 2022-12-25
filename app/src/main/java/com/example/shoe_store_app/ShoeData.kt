package com.example.shoe_store_app

data class ShoeData(
    var name: String,
    var size: Int,
    var company: String,
    var description: String,
    var modelShoe: Int,
    val modelsAvailable: MutableList<String> = mutableListOf(
        "model_0",
        "model_1",
        "model_2"
    )
)

