package com.sdimosikvip.testui.screen

import com.kaspersky.kaspresso.screens.KScreen
import com.sdimosikvip.testui.MainActivity
import com.sdimosikvip.testui.R
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView

object MainScreen : KScreen<MainScreen>() {

    override val layoutId: Int = R.layout.activity_main
    override val viewClass: Class<*> = MainActivity::class.java

    val purpleButton = KButton { withId(R.id.activity_main__purple_btn) }
    val whiteButton = KButton { withId(R.id.activity_main__white_btn) }
    val textView = KTextView { withId(R.id.activity_main__text) }
    val imgView = KImageView { withId(R.id.activity_main__img) }
}
