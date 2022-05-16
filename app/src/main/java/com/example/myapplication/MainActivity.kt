package com.example.myapplication
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.synaps.Color
import com.synaps.OnFinishListener
import com.synaps.OnReadyListener
import com.synaps.SynapsIndividualVerify

class MainActivity : AppCompatActivity() {
    private var mButton: Button? = null
    private var mWebView: SynapsIndividualVerify? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mButton = findViewById<Button>(R.id.buttonPanel);
        mWebView = findViewById<SynapsIndividualVerify>(R.id.webview);
        mButton!!.setOnClickListener(View.OnClickListener {
            mWebView!!.launch(this,"91eec035-13beb208-083d64e2-86ec7693")
        })
        mWebView!!.setOnReadyListener(OnReadyListener {
            Log.d("OmarSy", "ready")
        })
        mWebView!!.setOnFinishListener(OnFinishListener {
            Log.d("OmarSy", "finish")
        })
    }
}