package com.example.kotlinpractice


//1. Lamda
//람다식은 우리가 마치 value 처럼 다룰 수 있는 익명함수이다.
// 1) 메소드의 파라미터로 넘겨줄수가 있다. fun maxBy(a:Int)
// 2) return 값으로 사용할 수가 있다.

// 람다의 기본정의
// val lamdaName : Type = {argumentList -> codeBody}


val square : (Int) -> (Int) = {number -> number*number}

val nameAge = {name:String, age:Int ->
    "my name is ${name} I'm ${age}"
}
fun main(){
    println(square(12))
    println(nameAge("YS",25))

    val a = "YS said"
    val b = "BJ Said"
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat()) //확장함수로 스트링 클래스에 내가 원하는거 추가하기.
    println(extendString("Ariana",22))

    println(calculateGrade(97))
    println(calculateGrade(971))


    val lamda = {number: Double ->
        number == 4.3213
    }

    println(invokeLamda(lamda))
    println(invokeLamda({ it>3.22 }))

    println(invokeLamda{ it>3.22})//마지막 파라미터가 람다식일때 이렇게 표현 가능.















}

// 확장함수

val pizzaIsGreat : String.() -> String = {

    this + "Pizza is the best!"

}

fun extendString(name: String, age:Int):String{

    val introduceMyself: String.(Int) -> String = {"I am ${this} and ${it} years old"}//parameter가 Int 하나기에 it으로 가능. this는 확장함수가 불러줄 오브젝트.
    return name.introduceMyself(age)
}

//람다의 Return

val calculateGrade: (Int) -> String = {
    when(it){
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error" //예외값을 항상 지정해줘야함.
    }
}

//람다를 표현하는 여러가지 방법

fun invokeLamda(lamda : (Double) -> Boolean ) : Boolean {
    return lamda(5.2343)
}


