package none.sbaixas.lab9;

import android.content.Intent;
import android.net.Uri;
import android.view.KeyEvent;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Sebastian on 05-06-18.
 */

public class MyWebViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if(Uri.parse(url).getHost().equals("https://www.google.com")){
            return false;
        }
        return true;
    }
}
