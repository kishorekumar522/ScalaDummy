package com.dell.scala

/**
 * Created by Kishore_Yakkala on 12/19/2015.
 */
object Euler12 extends App{

  def factors(n:Int):Int={
    (1 to Math.sqrt(n).toInt).filter(n%_==0).size*2
  }
//
//
//
//  var l = Stream.from(1).map(x => (1 to x).sum)
//    .find(factors(_).size >= 1000)
//
//  println(l)

  lazy val ts: Stream[Int] =
    0 #:: ts.zipWithIndex.map(p => p._1 + p._2 + 1)

  def p(t: Int) = Range(1, Int.MaxValue)
    .takeWhile(n => n * n <= t)
    .foldLeft(0)((s, n) => if (t % n == 0) s + 2 else s)

  var st = System.currentTimeMillis()

  //  Solution1 : My Solution
  println(Stream.from(1).scanLeft(0)(_+_).find(factors(_)>=500).get)
//  842161320

//  Solution2
//  val r = ts.find(p(_) > 500).get
//  println(r)

  println(System.currentTimeMillis()-st + " mSec")

}

