package com.example.hra_tanks.drawers

import android.view.View
import android.widget.FrameLayout

class GridDrawer(private val container: FrameLayout) {

    private val allLines = mutableListOf<View>()

    fun removeGrid() {
        allLines.forEach {
            container.removeView(it)
        }
    }

    fun drawGrid() {
        drawHorizontalLines()
        drawVerticalLines()
    }

    private fun drawHorizontalLines() {
        var topMargin = 0
        while (topMargin <= container.layoutParams.height) {
            val horizontalLine = View(container.context)
            val layoutParams = FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, 1)
            topMargin += 50
            layoutParams.topMargin = topMargin
            horizontalLine.layoutParams = layoutParams
            horizontalLine.setBackgroundColor(container.context.resources.getColor(android.R.color.white))
            allLines.add(horizontalLine)
            container.addView(horizontalLine)
        }
    }

    private fun drawVerticalLines() {
        var leftMargin = 0
        while (leftMargin <= container.layoutParams.width) {
            val verticalLine = View(container.context)
            val layoutParams = FrameLayout.LayoutParams(1, FrameLayout.LayoutParams.MATCH_PARENT)
            leftMargin += 50
            layoutParams.leftMargin = leftMargin
            verticalLine.layoutParams = layoutParams
            verticalLine.setBackgroundColor(container.context.resources.getColor(android.R.color.white))
            allLines.add(verticalLine)
            container.addView(verticalLine)
        }
    }

}
