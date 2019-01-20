package com.gokhanozturk.bootcamp_hw_1_classes

class Home: BaseScreen("Home"){

    private val restaurants = ArrayList<Restaurant>()

    fun loadScreen(){

        // Generate a menu for the Republique restaurant
        val menuRepublique = Menu()
        menuRepublique.addDish("Pasta", "Bucatini")
        menuRepublique.addDish("Pasta", "Mafaldine")
        menuRepublique.addDish("Fish", "Shark Tail")
        menuRepublique.addDish("Fish", "Solmon")
        menuRepublique.addDish("Pasta", "Shrimp Crackers")

        // init Republique restaurant with the menu
        val republique = Restaurant("RP-thumbnail.png",
            "RP.png", "Republique", "624 South La Brea Ave, LA, CA", "818-760-3177", menuRepublique)


        // Generate a menu for the Ocean Seafood restaurant
        val menuOceanSeafood = Menu()
        menuOceanSeafood.addDish("Appetizers", "Crispy Egg Roll")
        menuOceanSeafood.addDish("Fish", "Crispy Shrimp")
        menuOceanSeafood.addDish("Fish", "Shark Tail")
        menuOceanSeafood.addDish("Fish", "Solmon")
        menuOceanSeafood.addDish("Soup", "New England")
        menuOceanSeafood.addDish("Soup", "Cioppino")

        // init Ocean Seafood restaurant with the menu
        val oceanSeafood = Restaurant("OS-thumbnail.png",
            "OS.png", "Ocean Seafood", "750 N Hill St, LA, CA", "213-687-3088", menuOceanSeafood)



        restaurants.add(republique)
        restaurants.add(oceanSeafood)

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