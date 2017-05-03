package com.example.zukkey.handwriting_line.ui.activity

import android.app.Fragment
import android.os.Bundle

/**
 * Created by YUTARO SUZUKI on 2017/05/03.
 * Base Fragment for all fragments
 */

abstract class BaseFragment: Fragment() {

  val baseActivity: BaseActivity get() { return activity as BaseActivity }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
  }
}