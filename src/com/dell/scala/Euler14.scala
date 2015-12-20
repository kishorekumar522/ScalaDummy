package com.dell.scala

/**
 * Created by Kishore_Yakkala on 12/19/2015.
 */
object Euler14 extends App{

  def CollatzSeq(n:Long, c:Int=0):Int= {

    if(n==1){
      c + 1
    } else  {
      CollatzSeq( if(n%2==0) n/2 else (3 * n)+(1), c+1)
    }
  }

  var rst = (1L until 1000000L).view.map(n => (n, CollatzSeq(n))).reduceLeft((p,c) => if(p._2 > c._2) p else c )
  println(rst)
}
