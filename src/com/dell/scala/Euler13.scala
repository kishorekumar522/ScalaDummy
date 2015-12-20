package com.dell.scala

import scala.io.Source

/**
 * Created by Kishore_Yakkala on 12/19/2015.
 */
object Euler13 extends App{

  var txt = Source.fromFile("C:\\mydoc\\setups\\activator-dist-1.3.7\\ScalaDummy\\conf\\euler13data").getLines()

  var st = System.currentTimeMillis()
  println(txt.map(l => l.take(11).toLong).sum.toString.take(10))
  println(System.currentTimeMillis()-st + " mSec")

}
