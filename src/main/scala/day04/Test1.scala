package com.briup.bigdata.scala.day04

object Test1 {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 10 if(i == 5)){
      println(i)
    }


    /*getPyramid(10)

    getMultiplicationTable*/
  }

  def getPyramid(num: Int){
    for(i <- 1 to num){
      println(" "*(num-i)+"*"*((i-1)*2+1))
    }
  }

  def getMultiplicationTable{
    for(i <- 1 to 9){
      for(j <- 1 to i){
        printf("%d + %d = %d\t",j,i,j*i)
      }
      println()
    }
  }
}
