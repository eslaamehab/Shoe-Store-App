package com.example.shoe_store_app.screens.game

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.shoe_store_app.R
import com.example.shoe_store_app.databinding.ShoeDetailFragmentBinding
import com.example.shoe_store_app.databinding.ShoeListFragmentBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ShoeDetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ShoeDetailFragment : Fragment() {
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



    private lateinit var binding: ShoeDetailFragmentBinding
    private lateinit var viewModel: ShoeDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment and obtain an instance of the binding class
        val binding: ShoeDetailFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.shoe_detail_fragment, container, false)

        viewModel = ViewModelProvider(requireActivity())[ShoeDetailViewModel::class.java]

        binding.shoeDetailViewModel = viewModel
        binding.shoe = viewModel.shoe


        binding.cancelButton.setOnClickListener{
            cancelShoeDetail()
        }
        binding.saveButton.setOnClickListener{
            saveShoeDetail()
        }



        return binding.root
    }


    private fun saveShoeDetail() {
        //save shoe detail
        findNavController().popBackStack()
    }

    private fun cancelShoeDetail() {
//        findNavController().navigate(ShoeDetailFragmentDirections.actionShoeDetailFragmentToShoeListFragment())
        findNavController().popBackStack()
    }



//    companion object {
//        /**
//         * Use this factory method to create a new instance of
//         * this fragment using the provided parameters.
//         *
//         * @param param1 Parameter 1.
//         * @param param2 Parameter 2.
//         * @return A new instance of fragment ShoeDetailFragment.
//         */
//        // TODO: Rename and change types and number of parameters
//        @JvmStatic
//        fun newInstance(param1: String, param2: String) =
//            ShoeDetailFragment().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
//            }
//    }
}