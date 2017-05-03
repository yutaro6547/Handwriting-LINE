package com.example.zukkey.handwriting_line.ui.activity.ui.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by YUTARO SUZUKI on 2017/05/03.
 * Base Activity for all activities
 */
abstract class BaseActivity: AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
    super.onCreate(savedInstanceState, persistentState)
  }

  override fun onSupportNavigateUp(): Boolean {
    return super.onSupportNavigateUp()
  }

  override fun finish() {
    super.finish()
  }
}