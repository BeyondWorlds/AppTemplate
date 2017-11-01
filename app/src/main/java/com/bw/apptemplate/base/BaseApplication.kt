package com.bw.apptemplate.base

import android.app.Activity
import android.app.Application
import android.content.Context
import android.os.Bundle
import android.util.Log

/**
 * Created by {wq} on 2017/10/28.
 */
open class BaseApplication : Application() {

    private val mCallbacks = object : Application.ActivityLifecycleCallbacks {

        override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle) {
            Log.d(TAG, "onActivityCreated() called with: activity = [$activity], savedInstanceState = [$savedInstanceState]")
        }

        override fun onActivityStarted(activity: Activity) {
            Log.d(TAG, "onActivityStarted() called with: activity = [$activity]")
        }

        override fun onActivityResumed(activity: Activity) {
            Log.d(TAG, "onActivityResumed() called with: activity = [$activity]")
        }

        override fun onActivityPaused(activity: Activity) {
            Log.d(TAG, "onActivityPaused() called with: activity = [$activity]")
        }

        override fun onActivityStopped(activity: Activity) {
            Log.d(TAG, "onActivityStopped() called with: activity = [$activity]")
        }

        override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
            Log.d(TAG, "onActivitySaveInstanceState() called with: activity = [$activity], outState = [$outState]")
        }

        override fun onActivityDestroyed(activity: Activity) {
            Log.d(TAG, "onActivityDestroyed() called with: activity = [$activity]")
        }
    }

    override fun onCreate() {
        super.onCreate()
        sInstance = this
        registerActivityLifecycleCallbacks(mCallbacks)
    }

    companion object {

        private val TAG = "BaseApplication"

        private var sInstance: BaseApplication? = null

        val instance: Context?
            get() = sInstance
    }
}
