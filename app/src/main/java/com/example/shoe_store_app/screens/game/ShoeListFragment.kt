package com.example.shoe_store_app.screens.game

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.shoe_store_app.R
import com.example.shoe_store_app.ShoeData
import com.example.shoe_store_app.databinding.ShoeItemBinding
import com.example.shoe_store_app.databinding.ShoeListFragmentBinding
import com.example.shoe_store_app.databinding.WelcomeFragmentBinding
import com.example.shoe_store_app.screens.authentication.LoginFragmentDirections

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ShoeListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ShoeListFragment : Fragment() {
    // TODO: Rename and change types of parameters

//    private var param1: String? = null
//    private var param2: String? = null

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        arguments?.let {
//            param1 = it.getString(ARG_PARAM1)
//            param2 = it.getString(ARG_PARAM2)
//        }
//    }

    private lateinit var binding: ShoeListFragmentBinding
    private lateinit var viewModel: ShoeListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment and obtain an instance of the binding class
        val binding: ShoeListFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.shoe_list_fragment, container, false)


        //initialzie view model
        viewModel = ViewModelProvider(this)[ShoeListViewModel::class.java]
        binding.shoeListViewModel = viewModel

        binding.floatingActionButton.setOnClickListener {
            findNavController().navigate(ShoeListFragmentDirections.actionShoeListFragmentToShoeDetailFragment())
        }

        binding.logOut.setOnClickListener{
            findNavController().navigate(ShoeListFragmentDirections.actionShoeListFragmentToLoginFragment())
        }



        return binding.root
    }


    private fun initShoeList(listShoes: MutableList<ShoeData>) {
        val parentLayout = binding.shoeItemList

        var index = 0
        while (index < listShoes.size) {
            val shoeBinding: ShoeItemBinding = DataBindingUtil.inflate(
                layoutInflater,
                R.layout.shoe_item,
                parentLayout,
                false
            )

            val shoe = listShoes[index]
            shoeBinding.shoeName.text = shoe.name
            shoeBinding.brandName.text = shoe.company
            shoeBinding.shoeSize.text = shoe.size.toString()
            when (shoe.modelsAvailable[shoe.modelShoe]) {
                "model_0" -> shoeBinding.shoeImage.setImageResource(R.drawable.a)
                "model_1" -> shoeBinding.shoeImage.setImageResource(R.drawable.n)
                "model_2" -> shoeBinding.shoeImage.setImageResource(R.drawable.p)
            }
            parentLayout.addView(shoeBinding.root)

            index++
        }
    }

//    companion object {
//        /**
//         * Use this factory method to create a new instance of
//         * this fragment using the provided parameters.
//         *
//         * @param param1 Parameter 1.
//         * @param param2 Parameter 2.
//         * @return A new instance of fragment ShoeListFragment.
//         */
//        // TODO: Rename and change types and number of parameters
//        @JvmStatic
//        fun newInstance(param1: String, param2: String) =
//            ShoeListFragment().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
//            }
//    }
}