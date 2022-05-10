package com.synaps;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import java.lang.String;

public class SynapsVerify extends WebView {
    public SynapsVerify(Context context) {
        super(context);
        this.getSettings().setJavaScriptEnabled(true);
        this.addJavascriptInterface(new SynapsWebInterface(context), "Android");
    }
    public SynapsVerify(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.getSettings().setJavaScriptEnabled(true);
        this.addJavascriptInterface(new SynapsWebInterface(context), "Android");
    }
    public void launch(String type, String sessionID, String stepID, Color color) {
        this.loadUrl("https://verify.synaps.io/?session_id=ddeb8f1d-fd15858a-0aabddcb-ed9763de&service=individual&type=embed&lang=en");
    }
}
