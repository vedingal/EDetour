package com.venndingal.edetour._Home;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.venndingal.edetour.R;

public class Frag3_Maps extends Fragment {
    Context c;
    String TAG = "Frag3_Maps";

    public Frag3_Maps() {
    }

    public Frag3_Maps newInstance(Context c) {
        Frag3_Maps fragment = new Frag3_Maps();
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        c = getActivity().getApplicationContext();
        View rootView = inflater.inflate(R.layout.frag3_maps, container, false);

        WebView webView = (WebView) rootView.findViewById(R.id.webView);

        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        webView.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);

        final AlertDialog alertDialog = new AlertDialog.Builder(c).create();
        webView.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                Log.i(TAG, "Processing webview url click...");
                view.loadUrl(url);
                return true;
            }

            public void onPageFinished(WebView view, String url) {
                Log.i(TAG, "Finished loading URL: " +url);
            }

            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Log.e(TAG, "Error: " + description);
                Toast.makeText(c, "Oh no! " + description, Toast.LENGTH_SHORT).show();
                alertDialog.setTitle("Error");
                alertDialog.setMessage(description);
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        return;
                    }
                });
                alertDialog.show();
            }
        });
        webView.loadUrl("https://www.google.com.ph/maps/place/Technological+Institute+of+the+Philippines/@14.595315,120.9857883,17z/data=!3m1!4b1!4m5!3m4!1s0x3397c9f618e826d3:0xeb7fcfb4bf255def!8m2!3d14.595315!4d120.987977");

        Toast.makeText(c, "Loading... Kindly wait.", Toast.LENGTH_LONG).show();
        return rootView;
    }
}