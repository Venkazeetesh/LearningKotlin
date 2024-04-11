package com.example.myapplication

class Personage {
    var age:Int =0
        get()=field
        set(value){
            field =18
        }
    var actualage:Int=0
}
fun main(args:Array<String>){
    val a=Personage()
    a.age=13
    a.actualage=3
    println("The age of a is ${a.age}")
    println("The actual age of a is ${a.actualage}")
}