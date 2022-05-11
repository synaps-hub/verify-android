package com.synaps;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;

class MyWebViewClient extends WebChromeClient {
    @Override
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        android.util.Log.d("WebView", consoleMessage.message());
        return true;
    }
}