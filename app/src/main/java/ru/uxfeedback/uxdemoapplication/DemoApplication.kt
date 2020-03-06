package ru.uxfeedback.uxdemoapplication

import android.app.Application
import ru.uxfeedback.sdk.UxFeedbackSdk

class DemoApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        UxFeedbackSdk.init(this, "ck78uf73w0000315rlomponmb")
    }

}