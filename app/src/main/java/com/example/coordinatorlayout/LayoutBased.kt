package com.example.coordinatorlayout

import android.os.Bundle
import android.view.View
import android.view.ViewTreeObserver.OnScrollChangedListener
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.coordinatorlayout.databinding.ActivityLayoutBasedBinding


class LayoutBased : AppCompatActivity() {
    val scrollVisible = true
    val scrollDistance = 0
    lateinit var mBinding:ActivityLayoutBasedBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding= ActivityLayoutBasedBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        val scrollView = mBinding.scrollView
        mBinding.scrollView.viewTreeObserver.addOnScrollChangedListener{
            if (scrollView.getChildAt(0).bottom
                <= (scrollView.height + scrollView.scrollY)) {
                mBinding.ChipGroup.visibility = View.VISIBLE
            } else {
                mBinding.ChipGroup.visibility = View.GONE
            }
        }
//            val scrollY: Int = rootScrollView.getScrollY() // For ScrollView
//            val scrollX: Int = rootScrollView.getScrollX() // For HorizontalScrollView
//            // DO SOMETHING WITH THE SCROLL COORDINATES

    }
}