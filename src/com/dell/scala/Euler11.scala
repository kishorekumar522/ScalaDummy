package com.dell.scala

import scala.io.Source

/**
 * Created by Kishore_Yakkala on 12/18/2015.
 */
object Euler11 extends App{

  var st = System.currentTimeMillis()
  var fp = "C:\\mydoc\\setups\\activator-dist-1.3.7\\ScalaDummy\\conf\\euler11data"

  val rst = Source.fromFile(fp).getLines().map(l => l.split(" ").map(_.toInt).toArray).toArray

  def cmpxMultiple(x:Seq[Int],y:Seq[Int])={
      rst
  }

  println(System.currentTimeMillis()-st + " mSec")



}
