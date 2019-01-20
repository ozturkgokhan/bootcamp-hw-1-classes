package com.gokhanozturk.bootcamp_hw_1_classes

fun main(args: Array<String>) {

    // 1 -  Landing Screen load..

    val landingScreen = LandingScreen()
    landingScreen.facebookBtn = "Continue With Facebook"
    landingScreen.loginLaterBtn = "Login Later"
    landingScreen.backgroundImg = "landingPageBG.png"

    // 2 - Login with Facebook
    landingScreen.loginWithFacebook()

    // 3 - Load Home Screen
    val home = Home()
    home.loadScreen()





}