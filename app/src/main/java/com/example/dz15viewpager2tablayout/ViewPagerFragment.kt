package com.example.dz15viewpager2tablayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_view_pager, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val webView = view.findViewById<WebView>(R.id.webViewWV)

        //val viewPagerItem = arguments?.getSerializable("page") as Page
        // Принимаем данные

        val position = arguments?.getInt("position")
        val address = arguments?.getString("address")
        //Заряжаем Веб Клиента
        webView.webViewClient = WebViewClient()
        val url = address
        webView.loadUrl(url.toString())





    }

}