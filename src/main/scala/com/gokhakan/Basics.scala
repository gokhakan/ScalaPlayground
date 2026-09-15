package com.gokhakan

object Basics {
  def main(args: Array[String]): Unit = {
    //maths
    var number =1
    println(5+4)
    println(5%4) //modules gives the remainder of division
    number+=10
    println(number)

    //conditionals
    val age =18
    println(if(age<=18) "Yes" else "No")
    //looping - while
    var i=0
    while(i<=5){
      println("i= " +i)
      i+=1
    }

    //looping do while
    var j=0
    do{
      println("j= " + j)
      j+=1
    }while (j<=5)

    //for loops [1]
    for(i<-1 to 7)
      println("Looping: " + i)

    //for each [2]
    val aList = List("hakan", "gok", "cool")
    for (i<- aList)
      println("List item is: " + i)
  }
}
