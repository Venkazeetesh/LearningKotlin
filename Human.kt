package com.example.myapplication

open class Human( age:Int,name:String)
{
    init {
        println("My name is $name")
    }
        var age=0
    fun talk(){
        println("Talk")
    }

    fun walk(){
        println("walk")
    }
    fun listen(){
        println("Listen")
    }
}
class Mathteacher(age: Int,name:String): Human(age,name) {
    fun teach(){
        println("Teaches math")
    }

    override fun toString(): String {
        return "Mathteacher(age=$age)"
    }

}
class Footballer(age: Int,name:String): Human(age,name) {
    fun play(){
         println("Football")
     }

    override fun toString(): String {
        return "Footballer(age=$age)"
    }

}
fun main(array: Array<String>){
    val b=Mathteacher(45,"Cristano")
    b.teach()
    val c=Footballer(44,"jack")
    c.play()

}