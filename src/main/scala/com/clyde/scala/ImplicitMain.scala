package com.clyde.scala

object ImplicitMain extends App {


  val vowels = List("a", "e", "i", "o", "u")

  implicit class ImprovedString(s: String) {
    def getStringVocale(): Int = {
      s.foldLeft(0)((sum, letter) =>  sum  + (if(vowels.contains(letter.toString.toLowerCase)) 1 else 0))
    }
  }

  implicit class ImprovedString2(s: String) {
    def getStringVocale2(): Int = {
      s.foldRight(0)((letter, sum) =>  sum  + (if(vowels.contains(letter.toString.toLowerCase)) 1 else 0))
    }
  }

  val s: String = "Two strings"

  println(s.getStringVocale)
  println(s.getStringVocale2)

}
