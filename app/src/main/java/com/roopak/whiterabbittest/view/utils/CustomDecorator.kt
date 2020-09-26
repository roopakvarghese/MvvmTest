package com.roopak.whiterabbittest.view.utils

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class CustomDecorator(private val verticalSpacing : Int
                      ,private val horizontalSpacing : Int)
    : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        outRect.right = horizontalSpacing
        outRect.left  = horizontalSpacing

        if(parent.getChildLayoutPosition(view) == 0){
            outRect.top = verticalSpacing
        }
        outRect.bottom = verticalSpacing

    }
}