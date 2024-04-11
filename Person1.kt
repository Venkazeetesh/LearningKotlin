package com.example.myapplication

class Person1(var fname:String ,var no:Int) {
    val Pname:String
    val page:Int
    init{
        Pname=fname
        page=no
        println("The name of the Person $fname")
        println("The age of the Person $page")
    }

    override fun toString(): String {
        return "Person1(fname='$fname', no=$no, Pname='$Pname', page=$page)"
    }


}
fun main(args:Array<String>)
{
    val a=Person("Treat",23)

}
