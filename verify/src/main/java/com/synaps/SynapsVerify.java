package com.synaps;

import android.content.Context;
import android.webkit.WebView;


public class SynapsVerify extends WebView {
    public SynapsVerify(Context context) {
        super(context);
        this.loadUrl("https://www.example.com");
    }
}
