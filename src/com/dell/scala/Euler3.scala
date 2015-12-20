package com.dell.scala

import scala.math._

/**
 * Created by Kishore_Yakkala on 12/16/2015.
 */
object Euler3 extends App {

// TODO Hello
  var n = 20L

  def factors(n: Long): List[Long] = (2 to sqrt(n).toInt)
    .find(n % _ == 0).fold(List(n))(i => i.toLong :: factors(n/i))

  var st = System.currentTimeMillis()
  val r = factors(n)
  println(r)
  println((System.currentTimeMillis()-st) + " mSec")
}