package com.example.mapapp.ui

import android.content.Context
import org.osmdroid.views.overlay.ItemizedIconOverlay
import org.osmdroid.views.overlay.ItemizedOverlayWithFocus
import org.osmdroid.views.overlay.OverlayItem

class OverlayIconBus(context: Context, items: ArrayList<OverlayItem>) :
    ItemizedOverlayWithFocus<OverlayItem>(context, items,
    object :
        ItemizedIconOverlay.OnItemGestureListener<OverlayItem> {
        override fun onItemSingleTapUp(
            index: Int,
            item: OverlayItem
        ): Boolean {
            return true
        }
        override fun onItemLongPress(
            index: Int,
            item: OverlayItem
        ): Boolean {
            return false
        }
    })
