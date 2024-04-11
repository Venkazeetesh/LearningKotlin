package com.example.myapplication

open class primary(name:String,age:Int)
{
    open var name=""
    open var age=0
}
class primary1(name:String,age:Int):primary(name,age){
   override var name="John"
    override var age=20
    override fun toString(): String {
        return "primary1(name='$name', age=$age)"
    }

}
fun main(args:Array<String>) {
   var  a:primary=primary1("",30)
    println(a.age)
}