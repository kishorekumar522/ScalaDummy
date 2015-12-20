package com.dell.scala

/**
 * Created by Kishore_Yakkala on 12/17/2015.
 */
object Euler9 extends App{

  var st = System.currentTimeMillis()

  var limit = (1 to 1000).find(x => x + Math.sqrt(x) >= 1000).get

  var ans = for(b<-1 until limit; a<- 1 to b; c = 1000 - a - b; if a*a + b*b == c*c) yield a*b*c
  println(ans)
  println(System.currentTimeMillis()-st + " mSec")
}
