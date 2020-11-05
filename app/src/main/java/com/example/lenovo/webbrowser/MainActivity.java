package com.example.lenovo.webbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    WebView mWebView;
    Button load_btn;
    EditText url_Et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        load_btn=findViewById(R.id.load_btn);
        url_Et=findViewById(R.id.url_et);
        mWebView=findViewById(R.id.my_web_view);

        mWebView.loadUrl("https://www.google.com");


        mWebView.setWebViewClient(new WebViewClient());
        WebSettings mysettings=mWebView.getSettings();
        mysettings.setJavaScriptEnabled(true);

        load_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlString=url_Et.getText().toString().trim();
                if(urlString.equals(""))
                {
                    Toast.makeText(MainActivity.this,"give ur url",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    mWebView.loadUrl("https://www."+ urlString);
                }
            }
        });


    }
}
