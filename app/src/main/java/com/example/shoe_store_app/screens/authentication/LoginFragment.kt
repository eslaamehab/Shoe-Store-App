package com.example.shoe_store_app.screens.authentication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.shoe_store_app.R
import com.example.shoe_store_app.databinding.LoginFragmentBinding

class LoginFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        val binding: LoginFragmentBinding = DataBindingUtil.inflate(
            inflater, R.layout.login_fragment, container, false)

//        binding.signIn.setOnClickListener {
//            findNavController().navigate(LoginFragmentDirections.actionTitleToGame())
//        }
        return binding.root
    }


//
//    import com.example.shoe_store_app.databinding.ActivityMainBinding
//    class MainActivity : AppCompatActivity() {
//
//        private lateinit var binding: ActivityMainBinding
//
//
//        override fun onCreate(savedInstanceState: Bundle?) {
//            super.onCreate(savedInstanceState)
//
//            binding = ActivityMainBinding.inflate(layoutInflater)
////        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
//
//            val view = binding.root
//            setContentView(view)
//
//            binding.name.text = viewModel.name
//            binding.button.setOnClickListener { viewModel.userClicked() }
//
//
//        }
//    }

}