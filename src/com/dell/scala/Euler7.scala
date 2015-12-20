package com.dell.scala

/**
 * Created by Kishore_Yakkala on 12/17/2015.
 */
object Euler7 extends App{


  var st = System.currentTimeMillis()


//  var prime:Stream[Int] = 2 #:: Stream.from(3).filter(n => (2 to Math.sqrt(n).toInt).forall(n%_!=0))
//  println(prime.take(10001).max)

  lazy val ps: Stream[Int] = 2 #:: Stream.from(3).filter(i =>
    ps.takeWhile(j => j * j <= i).forall(i % _ > 0))
  println(ps(10000))

  println(System.currentTimeMillis()-st + " mSec")

}
