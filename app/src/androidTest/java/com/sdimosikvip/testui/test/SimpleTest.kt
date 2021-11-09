package com.sdimosikvip.testui.test

import androidx.test.rule.ActivityTestRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import com.sdimosikvip.testui.MainActivity
import com.sdimosikvip.testui.R
import com.sdimosikvip.testui.screen.MainScreen
import org.junit.Rule
import org.junit.Test


class SimpleTest : TestCase() {

    @get:Rule
    val activityTestRule = ActivityTestRule(MainActivity::class.java, true, false)

    @Test
    fun simpleTest() = run {

        step("Open Main Activity") {
            activityTestRule.launchActivity(null)
        }

        step("Click on Purple Button and check background TextView") {
            MainScreen {
                purpleButton.click()
                textView.hasBackgroundColor(R.color.purple_200)
            }
        }

        step("Click on White Button and check background TextView") {
            MainScreen {
                whiteButton.click()
                textView.hasBackgroundColor(R.color.white)
            }
        }
    }

    @Test
    fun simpleLoadImgTest() =

        before {
            device.network.disable()
        }.after {
            device.network.enable()
        }.run {

            step("Open Main Activity") {
                activityTestRule.launchActivity(null)
            }

            step("Click on Img and Check Failed") {
                MainScreen {
                    imgView.click()
                    imgView.hasTag("Failed")
                }
            }

            step("Turn on network") {
                device.network.enable()
            }

            step("Click on Img and Check Exist") {
                MainScreen {
                    imgView.click()
                    imgView.hasTag("Exist")
                }
            }
        }
}
