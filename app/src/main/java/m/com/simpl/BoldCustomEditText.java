package m.com.simpl;

import android.content.Context;
import android.util.AttributeSet;

public class BoldCustomEditText extends android.support.v7.widget.AppCompatEditText {
    public BoldCustomEditText(Context context) {
        super(context);
    }

    public BoldCustomEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (!isInEditMode()) {
            init();
        }
    }

    public BoldCustomEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        init();
    }

    private void init() {
        setTypeface(FontCache.getBoldFont(getContext()));
    }
}
