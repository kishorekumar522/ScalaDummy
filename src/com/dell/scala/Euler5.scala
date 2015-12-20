package com.dell.scala

/**
 * Created by Kishore_Yakkala on 12/17/2015.
 */
object Euler5 extends App{

  var st = System.currentTimeMillis()

  println((20 to Int.MaxValue).view.find(x => (2 to 20).forall(x%_==0)))

  println(System.currentTimeMillis()-st + " mSec")
}
