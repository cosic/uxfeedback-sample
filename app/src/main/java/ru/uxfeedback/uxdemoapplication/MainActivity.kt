package ru.uxfeedback.uxdemoapplication


import android.content.Intent
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
        uxFeedbackSdk?.applySettings(UxSdkSettings(false))
        uxFeedbackSdk?.applyStyle(R.style.UxFeedbackLightTheme)
        button.setOnClickListener {
            uxFeedbackSdk?.startCampaign("event5")
        }
        button_go_next.setOnClickListener {
            startActivity(Intent(this, StubActivity::class.java))
        }
    }
}
