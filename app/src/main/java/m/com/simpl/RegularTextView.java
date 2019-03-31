package m.com.simpl;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;

public class RegularTextView extends android.support.v7.widget.AppCompatTextView {

    protected int mTextCase = 0;
    Resources mResources;
    private Context mContext;

    public RegularTextView(Context context) {
        super(context);
    }

    public RegularTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (!isInEditMode()) {
            init();
        }
    }

    public RegularTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        init();
    }

    private void init() {
        setTypeface(FontCache.getRegularFont(getContext()));
    }
}
