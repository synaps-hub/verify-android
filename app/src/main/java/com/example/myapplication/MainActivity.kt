package com.example.myapplication
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.synaps.Color
import com.synaps.OnFinishListener
import com.synaps.OnReadyListener
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
        mWebView!!.setOnReadyListener(OnReadyListener {
            Log.d("OmarSy", "ready")
        })
        mWebView!!.setOnFinishListener(OnFinishListener {
            Log.d("OmarSy", "finish")
        })
    }
}