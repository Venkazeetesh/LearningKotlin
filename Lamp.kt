package com.example.myapplication

class Lamp {
        private var on:Boolean=false
        fun on(){
            on=true
        }
        fun off(){
            on=false
        }
        fun displaystatus(lamp:String){
            if(on==true){
                println("$lamp is  turn on ")
            }else{
                print("$lamp the light is turn off")
            }
        }
    }
    fun main(args:Array<String>){
        val a=Lamp()
        val b=Lamp()
        a.on()
        b.off()
        a.displaystatus("a")
        b.displaystatus("b")
    }
