package com.gokhanozturk.bootcamp_hw_1_classes

class Menu: BaseScreen(){

    private val dishList = HashMap<String, Dish>()

    private fun addCategory(category: String){
        dishList[category] = Dish(category)
    }

    fun addDish(dish: Dish){
        if (!dishList.contains(dish.category)){
            addCategory(dish.category!!)
        }

        dishList[dish.category]?.addDish(dish)
    }

    fun listMenuCategories(){
        println("\n*** Menu ***")
        println("----------------------------------")

        for (category in dishList.keys){
            println(category)
        }

        println("----------------------------------")
    }

    fun listDishes(category: String){
        println("*** Dishes at $category ***")
        println("----------------------------------")

        println(dishList[category]?.listDishes())

        println("----------------------------------")
    }


}