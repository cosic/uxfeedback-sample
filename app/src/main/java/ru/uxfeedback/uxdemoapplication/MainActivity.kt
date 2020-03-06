package ru.uxfeedback.uxdemoapplication


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import ru.uxfeedback.sdk.UxFeedbackSdk
import ru.uxfeedback.sdk.utils.UxSdkSettings


class MainActivity : AppCompatActivity() {

    val uxFeedbackSdk = UxFeedbackSdk.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        uxFeedbackSdk?.applySettings(UxSdkSettings(true))
        uxFeedbackSdk?.applyStyle(R.style.UxFeedbackLightTheme)
        button.setOnClickListener {
            uxFeedbackSdk?.startCampaign("event5")
        }
    }

}
