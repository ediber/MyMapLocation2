package com.e.mymaplocation2

import android.app.Service
import android.content.Intent
import android.os.IBinder

class MyNavigationService : Service() {

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }


}