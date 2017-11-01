package com.bw.apptemplate.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bw.apptemplate.main.ActivityCollector

class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityCollector.addActivity(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        ActivityCollector.removeActivity(this)
    }
}
