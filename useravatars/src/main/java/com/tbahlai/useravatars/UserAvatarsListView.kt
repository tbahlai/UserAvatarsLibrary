package com.tbahlai.useravatars

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import by.kirich1409.viewbindingdelegate.viewBinding
import com.tbahlai.useravatars.databinding.ViewUserAvatarsListBinding

class UserAvatarsListView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : FrameLayout(context, attrs, defStyleAttr) {

    private val binding by viewBinding(ViewUserAvatarsListBinding::bind)

    init {
        View.inflate(context, R.layout.view_user_avatars_list, this)
        setupViews()
    }

    private fun setupViews() {

    }
}