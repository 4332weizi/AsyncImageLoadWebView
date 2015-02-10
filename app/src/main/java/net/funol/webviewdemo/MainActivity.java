package net.funol.webviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.webkit.WebView;


public class MainActivity extends Activity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebView = (WebView) findViewById(R.id.main_webview);

        AsyncImageWebViewClient mAsyncImageWebViewClient = new AsyncImageWebViewClient(this);
        mAsyncImageWebViewClient.setWebViewImageLoadCompleteHandler(mWebViewImageLoadCompleteHandler);
        mWebView.setWebViewClient(mAsyncImageWebViewClient);
    }

    private Handler mWebViewImageLoadCompleteHandler = new Handler() {

        /**
         * handle image load complete event here
         * @param msg
         */
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case ImageLoadResult.IMAGE_LOAD_CUCCESS:
                    break;
                case ImageLoadResult.IMAGE_LOAD_FAILED:
                    break;
            }
        }

    };

}
