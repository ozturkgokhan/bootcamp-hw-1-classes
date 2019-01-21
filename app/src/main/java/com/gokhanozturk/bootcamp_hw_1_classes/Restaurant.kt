package com.gokhanozturk.bootcamp_hw_1_classes

class Restaurant(): BaseScreen(){

    var thumbnail: String? = null
    var image: String? = null
    var name: String? = null
    var address: String? = null
    var phone: String? = null
    var menu: Menu? = null
    //var location: HashMap<String,Double>? = null

    constructor(thumbnail: String,
                image: String,
                name: String,
                address: String,
                phone: String,
                menu: Menu): this() {
        //location: HashMap<String,Double>)

        this.thumbnail = thumbnail
        this.image = image
        this.name = name
        this.address = address
        this.phone = phone
        this.menu = menu
    }


    fun openMenu(){
        menu?.listMenuCategories()
    }

    fun listDishes(category: String){
        menu?.listDishes(category)
    }

    fun detectTable(){

    }

    fun makeReservation(){

    }

    fun callWaiter(){

    }

    fun callRestaurant(){

    }

    fun displayLocation(location: HashMap<String,Double>){
        println("Displaying location for longitude : ${location.get("longitude")} and latitude : ${location.get("latitude")}")
    }

//    val thumbnail: String? = "default-restaurant-thumbnail.png"
//    val image: String? = "default-restaurant-image.png"
//    val name: String? = null
//    val address: String? = null


/*

A restaurant has a Menu class which has dynamic collections of menu types and items in that menu types

A customer can:
    - detect a table
    - make a reservation
    - call the restaurant
    - call a waiter
    - find the location through integrated google maps (every restaurant has a location of latitude and longitude which is initialized with this())

 */
}