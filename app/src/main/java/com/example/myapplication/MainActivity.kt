package com.example.myapplication
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.Button
import com.synaps.Color
import com.synaps.SynapsVerify

class MainActivity : AppCompatActivity() {
    private var mButton: Button? = null
    private var mWebView: SynapsVerify? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mButton = findViewById<Button>(R.id.buttonPanel);
        mWebView = findViewById<SynapsVerify>(R.id.webview);
        mButton!!.setOnClickListener(View.OnClickListener {
            mWebView!!.launch("", "", "", Color("", ""))
        })
    }
}