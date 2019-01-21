package com.gokhanozturk.bootcamp_hw_1_classes

class Dish(category: String): BaseScreen(){

    var name: String? = null
    var category: String? = null
    var price: Double? = null
    var description: String? = null

    constructor(category: String, name: String, price: Double, description: String): this(category){
        this.name = name
        this.category = category
        this.price = price
        this.description = description
    }

    private var dishes = ArrayList<Dish>()

    fun addDish(dish: Dish){
        dishes.add(dish)
    }

    fun listDishes(): String{
        var dishList = "No dishes!"

        if (dishes.size > 0) dishList = ""

        for (dish in dishes){
            dishList += ("- ${dish.name}\n")
        }
        return dishList
    }
}