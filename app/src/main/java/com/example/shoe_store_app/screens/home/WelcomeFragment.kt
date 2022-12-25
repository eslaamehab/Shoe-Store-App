package com.example.shoe_store_app.screens.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.shoe_store_app.R
import com.example.shoe_store_app.databinding.LoginFragmentBinding
import com.example.shoe_store_app.databinding.WelcomeFragmentBinding

/**
 * Fragment where the game is played
 */
class WelcomeFragment : Fragment() {
//
//    // The current word
//    private var word = ""
//
//    // The current score
//    private var score = 0
//
//    // The list of words - the front of the list is the next word to guess
//    private lateinit var wordList: MutableList<String>
//
//    private lateinit var binding: GameFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment and obtain an instance of the binding class
        val binding: WelcomeFragmentBinding = DataBindingUtil.inflate(
            inflater, R.layout.welcome_fragment, container, false)

        binding.instructions.setOnClickListener{
            findNavController().navigate(WelcomeFragmentDirections.actionWelcomeFragmentToInstructionsFragment())
        }

        return binding.root

//        resetList()
//        nextWord()
//
//        binding.correctButton.setOnClickListener { onCorrect() }
//        binding.skipButton.setOnClickListener { onSkip() }
//        updateScoreText()
//        updateWordText()
//        return binding.root
//
//    }
//
//    /**
//     * Resets the list of words and randomizes the order
//     */
//    private fun resetList() {
//        wordList = mutableListOf(
//            "queen",
//            "hospital",
//            "basketball",
//            "cat",
//            "change",
//            "snail",
//            "soup",
//            "calendar",
//            "sad",
//            "desk",
//            "guitar",
//            "home",
//            "railway",
//            "zebra",
//            "jelly",
//            "car",
//            "crow",
//            "trade",
//            "bag",
//            "roll",
//            "bubble"
//        )
//        wordList.shuffle()
//    }
//
//    /**
//     * Called when the game is finished
//     */
//    private fun gameFinished() {
//        val action = GameFragmentDirections.actionGameToScore(score)
//        findNavController(this).navigate(action)
//    }
//
//    /**
//     * Moves to the next word in the list
//     */
//    private fun nextWord() {
//        //Select and remove a word from the list
//        if (wordList.isEmpty()) {
//            gameFinished()
//        } else {
//            word = wordList.removeAt(0)
//        }
//        updateWordText()
//        updateScoreText()
//    }
//
//    /** Methods for buttons presses **/
//
//    private fun onSkip() {
//        score--
//        nextWord()
//    }
//
//    private fun onCorrect() {
//        score++
//        nextWord()
//    }
//
//    /** Methods for updating the UI **/
//
//    private fun updateWordText() {
//        binding.wordText.text = word
//
//    }
//
//    private fun updateScoreText() {
//        binding.scoreText.text = score.toString()
//    }
    }
}