package com.example.shoe_store_app.screens.authentication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.shoe_store_app.R
import com.example.shoe_store_app.databinding.LoginFragmentBinding
import com.example.shoe_store_app.screens.game.ShoeListViewModel
import kotlin.math.sign

class LoginFragment : Fragment() {

    private lateinit var viewModel: LoginViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment and obtain an instance of the binding class
        val binding: LoginFragmentBinding = DataBindingUtil.inflate(
            inflater, R.layout.login_fragment, container, false)

        //initialzie view model
        viewModel = ViewModelProvider(this)[LoginViewModel::class.java]
        binding.loginViewModel = viewModel


        binding.signIn.setOnClickListener {
            signIn()
        }
        binding.signup.setOnClickListener {
            signIn()
        }
        return binding.root
    }

    private fun signIn(){
        findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToWelcomeFragment3())
    }

}
