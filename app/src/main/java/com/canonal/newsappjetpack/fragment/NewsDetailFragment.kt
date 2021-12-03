package com.canonal.newsappjetpack.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.canonal.newsappjetpack.databinding.FragmentNewsDetailBinding
import com.canonal.newsappjetpack.model.News


class NewsDetailFragment : Fragment() {

    private lateinit var binding: FragmentNewsDetailBinding
    private val args: NewsDetailFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNewsDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val widgetNews = arguments?.getParcelable<News>("myKey")

        if (widgetNews == null) {
            //user comes from newsFragment
            binding.news = args.news
        } else {
            //user comes from widget
            binding.news = widgetNews
        }
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            NewsDetailFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}