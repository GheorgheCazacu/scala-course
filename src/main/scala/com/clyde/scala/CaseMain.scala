package com.clyde.scala

object CaseMain extends App {
  def caseInAction(x: Any) = x match {
    case 10 => "you are a student of 10!"
    case true => "this is a boolean true"
    case Nil => "this is Nil"
    case _ => "finally the default case"
  }

  println(caseInAction(10))
  println(caseInAction(true))
  println(caseInAction(Nil))
  println(caseInAction(false))

}
