package com.dell.scala

/**
 * Created by Kishore_Yakkala on 12/19/2015.
 */
object Euler16 extends App{

//  Won't be working as int have size limitation
//  var l = Seq.fill(1000)(2L).foldLeft(1L)((s,c) => s*c)

  var l = BigInt(2).pow(1000).toString.map(_.asDigit).sum

  println(l)

}
