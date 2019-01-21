package com.gokhanozturk.bootcamp_hw_1_classes

class LandingScreen {
    var facebookBtn: String? = null
    var loginLaterBtn: String? = null
    var backgroundImg: String? = null
    //var openScreen: String? = null

    fun loginWithFacebook() {
        println("Tapped \"$facebookBtn\"")
        println("Entered correct FB credentials and logged in")

        val home = Home()

    }

    fun loginLater(){
        println("Tapped \"$loginLaterBtn\"")
    }


}