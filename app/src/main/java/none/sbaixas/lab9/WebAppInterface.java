package none.sbaixas.lab9;

import android.app.Activity;
import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * Created by Sebastian on 05-06-18.
 */

public class WebAppInterface {
    Context mContext;

    WebAppInterface(Context c){
        mContext = c;
    }

    @JavascriptInterface
    public void showToast(String toast){
        Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show();
    }

    public void finishActivity(){
        ((Activity)mContext).finish();
    }
}
