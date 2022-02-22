package com.briup.bigdata.scala.day02

object Test1 {
  def main(args: Array[String]): Unit = {
    val a = 3
    val b = 100
    val c = 6
    val d = b * b - 4 * a * c
    if (d > 0) {
      val an1 = (-b + math.sqrt(d)) / (2 * a)
      val an2 = (-b - math.sqrt(d)) / (2 * a)
      printf("方程有两个解 an1 = %.2f an2 = %.2f", an1, an2)
    } else if (d == 0) {
      val an = (-b) / (2 * a)
      printf("方程有一个解 an = %.2f", an)
    } else {
      println("方程无解")
    }
  }
}
