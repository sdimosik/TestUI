package com.sdimosikvip.testui.test

import androidx.test.rule.ActivityTestRule
import com.sdimosikvip.testui.MainActivity
import junit.framework.TestCase
import org.junit.Rule
import org.junit.Test


class SimpleTest : TestCase() {

    @get:Rule
    val activityTestRule = ActivityTestRule(MainActivity::class.java, true, false)

    @Test
    fun test() {
        print("sdsd")
    }

}