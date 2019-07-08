package com.purevision.purevision;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.BaseAdapter;

import com.longdo.mjpegviewer.MjpegView;
import com.marcoscg.ipcamview.IPCamView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    Context context;
    ArrayList<String> cam_url;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, ArrayList<String> cam_url) {

        this.context = applicationContext;
        this.cam_url = cam_url;
        inflter = (LayoutInflater.from(applicationContext));
    }


    @Override
    public int getCount() {
        return cam_url.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.activity_gridview, null); // inflate the layout

        IPCamView ipCamView = view.findViewById(R.id.ip_cam_view); // get the reference of IPCamView
        ipCamView.setUrl(cam_url.get(i));
        ipCamView.setInterval(33); // In milliseconds, default 1000
        ipCamView.start();

//        MjpegView viewer = view.findViewById(R.id.mjpegview);
//        viewer.setMode(MjpegView.MODE_FIT_WIDTH);
//        viewer.setAdjustHeight(true);
//
//        viewer.setUrl(cam_url.get(i));
//        viewer.startStream();

//        WebView webview = view.findViewById(R.id.webView);
//        webview.loadUrl(cam_url.get(i));

        return view;
    }
}
