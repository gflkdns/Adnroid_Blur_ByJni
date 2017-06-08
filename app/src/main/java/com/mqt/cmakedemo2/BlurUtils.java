package com.mqt.cmakedemo2;

import android.graphics.Bitmap;

/**
 * Created by Administrator on 2017/6/7.
 */

public class BlurUtils {
    /**
     * Load genius jni file
     */
    static {
        System.loadLibrary("mqt-blur");
    }

    /**
     * Blur Image By Pixels
     *
     * @param img Img pixel array
     * @param w   Img width
     * @param h   Img height
     * @param r   Blur radius
     */
    protected static native void blurPixels(int[] img, int w, int h, int r);

    /**
     * Blur Image By Bitmap
     *
     * @param bitmap Img Bitmap
     * @param r      Blur radius
     */
    protected static native void blurBitmap(Bitmap bitmap, int r);
}
