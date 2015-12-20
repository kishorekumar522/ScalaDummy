package com.dell.scala

/**
 * Created by Kishore_Yakkala on 12/18/2015.
 */
object Euler10 extends App{

  var st = System.currentTimeMillis()

  var primes :Stream[Int] = 2 #:: Stream.from(3).filter(i => (2 to Math.sqrt(i).toInt).forall(i%_!=0))

//  primes.take(10).foreach(println)
  println(primes.takeWhile(_<2000000).foldLeft(0L)(_+_))
  println(System.currentTimeMillis()-st + " mSec")

}
