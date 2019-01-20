package com.gokhanozturk.bootcamp_hw_1_classes

class Dish(var category: String): BaseScreen(){
    private var dishes = ArrayList<String>()

    fun addDish(dish: String){
        dishes.add(dish)
    }

    fun listDishes(): String{
        var dishList: String = "No dishes!"

        if (dishes.size > 0) dishList = ""

        for (dish in dishes){
            dishList += ("- $dish\n")
        }
        return dishList
    }
}