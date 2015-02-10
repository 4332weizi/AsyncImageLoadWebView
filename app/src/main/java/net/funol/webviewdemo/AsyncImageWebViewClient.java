package net.funol.webviewdemo;

import android.content.Context;
import android.os.Handler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by DZY-ZWW on 01-28.
 */
public class AsyncImageWebViewClient extends WebViewClient {

    private Context context;
    private Handler mWebViewImageLoadCompleteHandler;

    public AsyncImageWebViewClient(Context context){
        this.context = context;
    }

    /**
     * override this function to load image yourself
     *
     * @param view
     * @param url
     * @return
     */
    @Override
    public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        return super.shouldInterceptRequest(view, url);
    }

    public void setWebViewImageLoadCompleteHandler(Handler handler) {
        this.mWebViewImageLoadCompleteHandler = handler;
    }
}
