package com.clyde.scala

object EnumerationMAin extends App {
  object WeekDay extends scala.Enumeration {
    type WeekDay = Value
    val Mon, Tue, Wed, Thu, Fri, Sat, Sun = Value
  }

  println(s"Monday is ${WeekDay.Mon.id}")
  println(WeekDay.Fri.id)
  println(WeekDay.Fri)

  val myWeekDay = WeekDay.Thu
}
