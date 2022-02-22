package com.briup.bigdata.scala.day02

import scala.io.StdIn

object Console {
  def main(args: Array[String]): Unit = {
    println("输入年龄")
    val age = StdIn.readInt();
    val res = if (age > 20) {
      println("成年人")
    } else {
      println("未成年人")
    }
    println("res=" + res)
  }
}
