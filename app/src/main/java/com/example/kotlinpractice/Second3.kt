package com.example.kotlinpractice



// 오브젝트 클래스 -> Singleton Pattern -> 실행이 될 때 클래스 파일의 객체를 딱 한번 생성하고 그후에 생성하지 않음, 불필요한 메모리 낭비가 없다.
object CarFactory{
    var cars = mutableListOf<Car>()
    fun makeCar(horsePower: Int) : Car{
        val car = Car(horsePower)
        cars.add(car)
        return car
    }
}

data class Car(var horsePower : Int)

fun main(){
    val car = CarFactory.makeCar(10)
    val car2 = CarFactory.makeCar(20)

    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())
}