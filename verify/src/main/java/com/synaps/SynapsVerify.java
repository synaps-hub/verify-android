package com.synaps;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import java.lang.String;


public class SynapsVerify extends WebView {
    public OnReadyListener onReadyListener;
    public OnFinishListener onFinishListener;
    public SynapsVerify(Context context) {
        super(context);
        this.getSettings().setJavaScriptEnabled(true);
        this.addJavascriptInterface(new SynapsWebInterface(context, this), "SynapsAndroid");
    }
    public SynapsVerify(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.getSettings().setJavaScriptEnabled(true);
        this.addJavascriptInterface(new SynapsWebInterface(context, this), "SynapsAndroid");
    }
    public void setOnReadyListener(OnReadyListener onReadyListener) {
        this.onReadyListener = onReadyListener;
    }
    public void setOnFinishListener(OnFinishListener onFinishListener) {
        this.onFinishListener = onFinishListener;
    }
    public void launch(String type, String sessionID, String stepID, Color color) {
        //this.setWebChromeClient(new MyWebViewClient());
        this.loadUrl("http://192.168.43.32:3001/?session_id=4cdef949-fb269501-d9245e4e-8ddb1b44&service=individual&type=embed&lang=en");
    }
}
