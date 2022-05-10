package com.synaps;

import android.content.Context;
import android.webkit.JavascriptInterface;

public class SynapsWebInterface {
    Context mContext;

    /** Instantiate the interface and set the context */
    SynapsWebInterface(Context c) {
        mContext = c;
    }

    /** Show a toast from the web page */
    @JavascriptInterface
    public void onReady() {

    }
    /** Show a toast from the web page */
    @JavascriptInterface
    public void onFinish() {

    }
}
