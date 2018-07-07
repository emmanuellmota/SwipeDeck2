package com.daprlabs.aaron.swipedeck.Utility;

import android.view.View;

/**
 * Created by aaron on 10/08/2016.
 */
public interface SwipeCallback {
    void cardSwipedUp(View card);
    void cardSwipedRight(View card);
    void cardSwipedDown(View card);
    void cardSwipedLeft(View card);
    void cardOffScreen(View card);
    void cardActionUp();
    void cardActionDown();

    /**
     * Check whether we can start dragging current view.
     * @return true if we can start dragging view, false otherwise
     */
    boolean isDragEnabled();
}
