package com.example.shoe_store_app.screens.authentication

import androidx.lifecycle.ViewModel
import com.example.shoe_store_app.CredentialsData

class LoginViewModel : ViewModel() {

    var credentials = CredentialsData(
        "",
        ""
    )

}