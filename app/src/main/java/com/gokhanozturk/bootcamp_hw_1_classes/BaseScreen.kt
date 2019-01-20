package com.gokhanozturk.bootcamp_hw_1_classes

open class BaseScreen() {
    var reservations: String = "Reservations"
    val activeReservationsMenuImage: String = "reservations-active.png"

    var home: String = "Home"
    val activeHomeMenuImage: String = "home-active.png"

    var orders: String = "Orders"
    val activeOrdersMenuImage: String = "orders-active.png"


    constructor(selectedMenu: String): this() {
        when (selectedMenu){
            reservations -> navigateToPage(reservations, activeReservationsMenuImage)
            home -> navigateToPage(home, activeHomeMenuImage)
            orders -> navigateToPage(orders, activeOrdersMenuImage)
        }
    }

    private fun navigateToPage(selectedMenu: String, activeMenuImage: String){
        println("Tapped \"$selectedMenu\" menu. \nNavigating to \"$selectedMenu\" screen")
        println("Opened $selectedMenu ...")
        println("$activeMenuImage is set")
    }
}