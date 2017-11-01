package com.bw.apptemplate

import com.bw.apptemplate.base.BaseApplication
import com.squareup.leakcanary.LeakCanary

/**
 * Created by {wq} on 2017/10/28.
 */
class MyApplication : BaseApplication() {
    override fun onCreate() {
        super.onCreate()
        //内存泄露检测工具
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return
        }
        LeakCanary.install(this)
    }

}