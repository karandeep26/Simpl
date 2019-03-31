package m.com.simpl;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Helper class which loads and returns typeface
 **/
class FontCache {
    private static Typeface montserrat_regular, worksans_regular;

    static Typeface getBoldFont(Context context) {
        if (montserrat_regular == null) {
            montserrat_regular = Typeface.createFromAsset(context.getResources()
                    .getAssets(), "fonts/bold-font.otf");
        }

        return montserrat_regular;
    }

    static Typeface getRegularFont(Context context) {
        if (worksans_regular == null) {
            worksans_regular = Typeface.createFromAsset(context.getResources()
                    .getAssets(), "fonts/regular-font.otf");
        }
        return worksans_regular;
    }
}