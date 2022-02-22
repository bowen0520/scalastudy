package com.briup.bigdata.scala.day05

object Test2 {
  def main(args: Array[String]): Unit = {
    def Ok{
      println("OK")
    }

    val cat = new Cat("lis");
    Ok
  }
  def Ok{
    println("OK1")

    Ok
    def Ok{
      println("OK2")
    }
  }

  private def getName() {

  }
}
