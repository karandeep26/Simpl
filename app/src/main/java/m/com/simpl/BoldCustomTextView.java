package m.com.simpl;

import android.content.Context;
import android.util.AttributeSet;

public class BoldCustomTextView extends android.support.v7.widget.AppCompatTextView {

    public BoldCustomTextView(Context context) {
        super(context);
    }

    public BoldCustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (!isInEditMode()) {
            init();
        }
    }

    public BoldCustomTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        init();
    }

    private void init() {
        setTypeface(FontCache.getBoldFont(getContext()));
    }
}
