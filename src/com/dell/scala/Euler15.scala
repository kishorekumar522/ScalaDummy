package com.dell.scala

import scala.annotation.tailrec

/**
 * Created by Kishore_Yakkala on 12/19/2015.
 */
object Euler15 extends App{

  @tailrec def f(row: Seq[Long], c: Int): Long =
    if (c == 0) row.last else f(row.scan(0L)(_ + _), c - 1)

  def r(n: Int) = f(Seq.fill(n + 1)(1L), n)

//  println(r(2))
}
