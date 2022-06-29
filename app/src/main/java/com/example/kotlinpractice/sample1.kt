package com.example.kotlinpractice

fun main(){

//    checkNum(11)
//    forAndWhile()
//    nullcheck()
//    ignoreNulls("hollymolly")



    //3. String Template

//    val name = "YS"
//    val lastName = "KEUM"
//    println("my name is ${name} ") //변수 출력
//    println("my name is ${name+lastName} ")
//
//    println("this is 2\$a")










//    helloWorld();
//    println(add(4,5));
}

//1.함수

fun helloWorld() {                       //  helloWorld()뒤에 : Unit 을 쓰면 -> Java에서 void와 같은 효과. return값 없는 함수 만들기 가능 -> 생략도 가능.!

    println("Hello World!")

}

fun add(a:Int,b:Int):Int{
    return a+b
}

//2. val vs var

// val = value

fun hi(){
    val a : Int = 10;

    var b : Int = 9;

//    a = 100;  value값은 변경 불가.

    b = 100;      //var 값 변경 가능.

    var c = 100; // ==  var c : Int = 100;
    val d = 100; // ==  val d : Int = 100;

    var name = "Keum"; // == var name : String = "Keum";
}


//4. 조건식

fun maxBy(a: Int, b: Int):Int{
    if(a>b){
        return a
    }else{
        return b
    }


}

fun maxBy2(a:Int, b:Int) = if(a>b) a else b;

fun checkNum(score : Int) {
    when(score){
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3  -> println("this is 2 or 3")
//        else -> println("I dont know")
    }

    var b = when(score){
        1->1                   //이렇게 사용될 때는 else 가 필수!
        2->2
        else ->3
    }

    println("b: ${b}")

    when(score){
        in 90..100 -> println("You are genius")
        in 10 .. 80 -> println("not bad")
        else -> println("okay")
    }

}

//Expression vs Statement
//모든 코틀린 함수는 Expression ,
//
//        값을 반환하면 Expression, 명령을 실행시키면 Statement


//5.Array and List

// Array    (수정 가능)
// List           1. List(수정이 불가능)    2. MutabList (수정이 가능)

fun array(){
    val array = arrayOf(1,2,3) // val array : Array<Int> = arrayOf(1,2,3)
    val list = listOf(1,2,3)  // val list: List<Int> = listOf(1,2,3)

    val array2 = arrayOf(1,"d",3.4f)
    val list2 = listOf(1,"d",11L)


    array[0] = 3
    var result = list.get(0); //->set은 할수 없다. MutableList 에는 set, add ,remove 등 수정 가능한 함수가 포함이 되어있음.

    var arrayList = arrayListOf<Int>() //arrayList -> MutableList, val로도 가능(주소값은 바뀌지 않기에)
    arrayList.add(10)
    arrayList.add(20)

}


//6.For /While

fun forAndWhile(){

    val students = arrayListOf("joyce","james","keum")

    for( name in students){
        println("${name}")

    }

    for((index,name) in students.withIndex()){  //인덱스도 같이 출력하기.
        println("${index+1}번째 학생 : ${name}")
    }




    var sum = 0;
    for ( i in 1..10 step 2){ //2단위로
        sum +=i
    }
    println(sum)

     sum = 0;
    for ( i in 10 downTo 1){ //10부터 1까지
        sum +=i
    }
    println(sum)
     sum = 0;
    for ( i in 1 until 100){ // 100은 포함하지않음.
        sum +=i
    }


    var index = 0
    while(index < 10){
        println("current index : ${index}")
        index++;
    }

}

//7. Nullable / NunNull -> 자바와 코틀린의 가장 큰 차이점이라 볼수 있다.

fun nullcheck(){
    //NPE : NULL pointer Exception

    var name : String   = "YS"

//    var nullName : String = null  error뜸.
    var nullName : String? = null // ?넣으면 nullable이 된다.

//    null 타입을 만들고 싶으면 타입을 생략해선 안된다.

    var nameInUpperCase = name.toUpperCase()


//    var nullNameInUpperCase  = nullName.toUpperCase() ->null값이 올수 있기에 오류가 남.
    var nullNameInUpperCase  = nullName?.toUpperCase() //-> null 값이 올경우 null 값을 반환 함.


    // ?:

    val lastName : String? = null

    val fullName =  name + (lastName?: " No lastName")


    println(fullName)


    //!!



}

fun ignoreNulls(str : String?) {
//        val mNotNull : String = str ->오류가 난다. Null값이 올수 있기에.

    val mNotNull : String =str!! //절대 Null 값이 올리가 없다고 지정해주는 것.
    val upper: String = mNotNull.toUpperCase()


    var email : String? = "rmadbstn@naver.com"
    email?.let{ //이메일이 null 이 아니면 실행하는 것.
        println("my email is ${email}")
    }

}

