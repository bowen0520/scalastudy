package com.briup.bigdata.scala.day04

object Test2 {
  def main(args: Array[String]): Unit = {
    var cat: Cat = new Cat
    cat.age = 3
  }
}
//class声明时不定义权限修饰符时，默认时public
class Cat{
  //当我们声明一个默认属性时会对应一个private 属性
  //同时会生成两个方法，get/set
  var name: String = "Cat"
  var age: Int = 2
  var color: String = "白色"

  def get: Unit ={

  }
}
