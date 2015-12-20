package com.dell.scala

/**
 * Created by Kishore_Yakkala on 12/17/2015.
 */
object Euler6 extends App{

  def sq(n:Int) = n*n

  var st = System.currentTimeMillis()

  var n = 1 to 100
  println(sq(n.sum)-n.map(sq(_)).sum)
  println(System.currentTimeMillis()-st + " mSec")

}
