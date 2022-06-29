package com.example.kotlinpractice

open class Human constructor(val name:String = "Anonymous"){ //기본적으로 클래스는 final이다.

    constructor(name : String, age :Int):this(name){  //부생성자는 항상 주 생성자의 위임을 받아야함.
       println("my name is ${name}, ${age}years old")
    }

    //java

    /*
    class Person{
        public Person(String name){

       }

        public Person(String name, int age){
            this(name);

        }


     }
     */




    init{
        println("New human has been born!!")
    }




    fun eatingCake() {
        println("This is so YuMMMYYY~~~")

    }

    open fun singASong(){
        println("lalala")
    }
}

class Korean : Human(){ //상속

    override fun singASong(){ //오버라이딩 하려면 안에 있는 메소드 또한 open을 해주어야한다.
        super.singASong() //-> 부모꺼 쓰기.
        println("뢀랄뢀뢀")
        println("my name is: ${name}")
    }

}

fun main(){

    val korean = Korean()
    korean.singASong()



//    val human = Human("YS")  //자바처럼 new 하지 않아도 괜찮음.
//
//    val stranger = Human()
//
//
//    human.eatingCake()


//    val mom = Human("Kuri",52)



//    println("this human's name is ${human.name}")
//    println("this human's name is ${stranger.name}")


}