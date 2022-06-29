package com.example.kotlinpractice


data class Ticket(val companyName : String, val name : String, var date : String, val seatNumber : Int) //간편하게 데이터 클래스를 만들수 있음. 한페이지에 여러개 쌉가능.

// toString().hashCode(),equals(),copy()

class TicketNormal(val companyName : String, val name : String, var date : String, val seatNumber : Int)

fun main(){
    val ticketA = Ticket("koreanAir", "YS KEUM","2022-02-35",14)
    val ticketB = TicketNormal("koreanAir", "YS KEUM","2022-02-35",14)

    println(ticketA)
    println(ticketB)
}