package com.canonal.newsappjetpack.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.canonal.newsappjetpack.adapter.NewsAdapter
import com.canonal.newsappjetpack.databinding.FragmentNewsBinding
import com.canonal.newsappjetpack.model.News
import com.canonal.newsappjetpack.util.AnimationUtil
import com.canonal.newsappjetpack.util.DummyData


class NewsFragment : Fragment() {

    private lateinit var binding: FragmentNewsBinding
    private lateinit var newsList: List<News>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNewsBinding.inflate(inflater, container, false)
        newsList = DummyData.getNewsData(requireContext())
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val navOptions = AnimationUtil.getFragmentSlideNavOptions()
        setupNewsRecyclerView(navOptions)
    }

    private fun setupNewsRecyclerView(navOptions: NavOptions) {
        val newsAdapter = NewsAdapter(newsList) { news ->
            val action = NewsFragmentDirections.actionNewsFragmentToNewsDetailFragment(news)
            findNavController().navigate(
                action,
                navOptions
            )
        }
        binding.rvNews.adapter = newsAdapter
        binding.rvNews.layoutManager = LinearLayoutManager(requireContext())
        binding.rvNews.setHasFixedSize(true)
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            NewsFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}