package com.purevision.purevision;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

import com.longdo.mjpegviewer.MjpegView;
import com.marcoscg.ipcamview.IPCamView;

public class SecondActivity extends AppCompatActivity {
    IPCamView selectedIpCamView;
    MjpegView viewer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent myIntent = getIntent();
        if (myIntent.hasExtra("url")){
            String str = myIntent.getStringExtra("url");
            Log.i("Debug","2: URL Typed "+str);

            selectedIpCamView = findViewById(R.id.ip_cam_view); // init a IPCamView
            selectedIpCamView.setUrl(str);
            selectedIpCamView.setInterval(33); // In milliseconds, default 1000
            selectedIpCamView.start();

//            viewer = findViewById(R.id.mjpegview);
//            viewer.setMode(MjpegView.MODE_FIT_WIDTH);
//            viewer.setAdjustHeight(true);
//            viewer.setUrl(str);
//            viewer.startStream();

//            WebView webview = findViewById(R.id.webView);
//            webview.loadUrl(str);
        }

//        viewer.setMode(MjpegView.MODE_FIT_WIDTH);
//        viewer.setAdjustHeight(true);
//        viewer.setUrl("http://10.135.122.14:8080/?action=stream");
//        viewer.startStream();

//        WebView webview = findViewById(R.id.webView);
//        webview.loadUrl("http://10.135.122.14:8080/?action=stream");

//        WebView simpleWebView = findViewById(R.id.webView);
//// specify the url of the web page in loadUrl function
//        simpleWebView.loadUrl("http://10.135.122.14:8080/?action=stream");

    }
}
