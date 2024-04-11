package com.example.myapplication

class Person(var name:String,var age:Int){
    fun canvote(){
        if(age<18){
            println("Cannot vote")
        }else{
            println("Can Vote")
        }
    }
}
fun main(args:Array<String>){
    val a=Person("Hj", 23)
    a.canvote()
}