package com.dell.scala

/**
 * Created by Kishore_Yakkala on 12/17/2015.
 */
object Euler4 extends App{

  var st = System.currentTimeMillis()

  println((999 to 100 by -1).map(x => (x to 100 by -1).find(y => (x*y).toString == (x*y).toString.reverse).getOrElse(0)*x).filter(_!=0).max)

//  println((100 to 999).view
//    .flatMap(i => (i to 999).map(_ * i))
//    .filter(n => n.toString == n.toString.reverse)
//    .max)
  println(System.currentTimeMillis()-st + " mSec")
}
