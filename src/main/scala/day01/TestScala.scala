package com.briup.bigdata.scala.day01

object TestScala {
  def main(args: Array[String]): Unit = {
    var s1: Short = 12
    var s2: Short = 11
    var s3 = s1 + s2
    var c1: Char = 22
    var c2 = c1
    //var s4: Short = c1
    var i1 = c1 + s1
    var b1: Byte = 12

    var b2: Byte = 12
    var b3  = b1+b2
    var b4 = s1 + b1
    b4
    var w1 = s1 + b1

    var s = "aas"*3
    var name: String = "bob"
    var age: Int = 20
    var weight: Float = 60.22f
    var height: Double = 177.222
    //格式化输出
    printf("名字=%s 年龄=%d 体重=%5.1f 身高=%5.2f", name, age, weight, height)
    println()
    println(s"名字=$name\n年龄=$age\n体重=${weight * 10}\n身高=$height")

    var +-*/ = "dad"
//    var ++/a = "adas"
//    println(++/a)

    var num = 10
    var book = {
      if(num==10){"hello"}
      else {11}
    }
    println(book)
    println(book.isInstanceOf[Int])
    println(book.isInstanceOf[Int])

  }
}
