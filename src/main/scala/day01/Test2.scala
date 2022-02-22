package com.briup.bigdata.scala.day01

object Test2 {
  def main(args: Array[String]): Unit = {
    var num = 11
    var book = {
      if (num == 10) {
        "hello"
      }
      else {
        11
      }
    }
    println(book)
    println(book.isInstanceOf[String])
    println(book.isInstanceOf[Int])
    var num1 = 11
    var num2 = 12
    num1 = num1 ^ num2
    num2 = num1 ^ num2
    num1 = num1 ^ num2
    println(num1 + " " + num2)
  }
}
