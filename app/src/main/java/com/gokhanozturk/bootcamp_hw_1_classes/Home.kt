package com.gokhanozturk.bootcamp_hw_1_classes

class Home: BaseScreen("Home"){

    private val restaurants = ArrayList<Restaurant>()

    fun loadScreen(){

        // Generate a menu for the Republique restaurant
        val menuRepublique = Menu()
        val bucatini = Dish("Pasta", "Bucatini", 10.45, "Bucatini description")
        val mafaldine = Dish("Pasta", "Mafaldine", 6.55, "Mafaldine description")
        val sharkTail = Dish("Fish", "Shark Tail", 12.45, "Shark Tail description")
        val solmon = Dish("Fish", "Solmon", 8.45, "Solmon description")
        val shrimpCracker = Dish("Fish", "Shrimp Crackers", 5.50, "Shrimp Crackers description")

        menuRepublique.addDish(bucatini)
        menuRepublique.addDish(mafaldine)
        menuRepublique.addDish(sharkTail)
        menuRepublique.addDish(solmon)
        menuRepublique.addDish(shrimpCracker)

//        menuRepublique.addDish("Pasta", "Bucatini")
//        menuRepublique.addDish("Pasta", "Mafaldine")
//        menuRepublique.addDish("Fish", "Shark Tail")
//        menuRepublique.addDish("Fish", "Solmon")
//        menuRepublique.addDish("Pasta", "Shrimp Crackers")

        // init Republique restaurant with the menu
        val republique = Restaurant("RP-thumbnail.png",
            "RP.png", "Republique", "624 South La Brea Ave, LA, CA", "818-760-3177", menuRepublique)


        // Generate a menu for the Ocean Seafood restaurant
//        val menuOceanSeafood = Menu()
//        menuOceanSeafood.addDish("Appetizers", "Crispy Egg Roll")
//        menuOceanSeafood.addDish("Fish", "Crispy Shrimp")
//        menuOceanSeafood.addDish("Fish", "Shark Tail")
//        menuOceanSeafood.addDish("Fish", "Solmon")
//        menuOceanSeafood.addDish("Soup", "New England")
//        menuOceanSeafood.addDish("Soup", "Cioppino")

        // init Ocean Seafood restaurant with the menu
        //val oceanSeafood = Restaurant("OS-thumbnail.png",
            //"OS.png", "Ocean Seafood", "750 N Hill St, LA, CA", "213-687-3088", menuOceanSeafood)



        restaurants.add(republique)
        //restaurants.add(oceanSeafood)

        println("\n*** Restaurants ***")
        for (restaurant in restaurants){
            println("- ${restaurant.name}")
        }
        println("*******************\n")
        print("Enter restaurant you want to select (Case Sensitive): ")
        val selectedRestaurantName = readLine()!!

        var selectedRestaurant = Restaurant()

        for (restaurant in restaurants){
            if(restaurant.name == selectedRestaurantName){
                selectedRestaurant = restaurant
            }
        }

        selectedRestaurant.openMenu()

        print("Enter menu you want to select (Case Sensitive): ")
        val selectedMenu = readLine()!!
        selectedRestaurant.listDishes(selectedMenu)
    }

}