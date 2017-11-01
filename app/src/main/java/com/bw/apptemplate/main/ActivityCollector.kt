package com.bw.apptemplate.main

import android.app.Activity
import java.util.*
/**
 * Created by {wq} on 2017/10/28.
 */
object ActivityCollector {

    var activities: MutableList<Activity> = ArrayList()

    fun addActivity(activity: Activity) {
        activities.add(activity)
    }

    fun removeActivity(activity: Activity) {
        activities.remove(activity)
    }

    fun finishAll() {
        for (activity in activities) {
            if (!activity.isFinishing) {
                activity.finish()
            }
        }
    }

}
