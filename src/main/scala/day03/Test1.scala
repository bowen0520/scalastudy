package com.briup.bigdata.scala.day03

object Test1 {
  def main(args: Array[String]): Unit = {
    var a = true
    for(i<-1 to 100 if a){
      if(i>20){
        a = false
      }
    }
  }
}
