package com.example.zukkey.handwriting_line.ui.activity.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.zukkey.handwriting_line.R
import com.example.zukkey.handwriting_line.ui.activity.ui.fragment.BaseFragment

/**
 * Created by YUTARO SUZUKI on 2017/05/03.
 * This is Home Fragment for account, chat, settings
 */
class HomeFragment: BaseFragment() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
  }

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
    return inflater.inflate(R.layout.fragment_home, container, false)
  }

  override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
  }

  override fun onDestroyView() {
    super.onDestroyView()
  }

  override fun onResume() {
    super.onResume()
  }
}