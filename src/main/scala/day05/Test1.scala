package com.briup.bigdata.scala.day05

object Test1 {
  def main(args: Array[String]): Unit = {
    val p1 = new Dog("小狗")
    println(p1.name)
    println(p1.age)

    var res = if(p1.name.equals("as"))
      "sdad"
    println(res)

    println(getSum(getSum(1,2),1))

    getStr
    println(getStr)
  }

  def getSum(a:Int,b:Int):Int={
    a+b;
  }
  def getStr{
    println("aaa")
  }
}



class Dog(inName: String,inAge: Int){
  var name = inName
  var age = inAge

  def this(name: String){
    this(name,2)
  }

}
