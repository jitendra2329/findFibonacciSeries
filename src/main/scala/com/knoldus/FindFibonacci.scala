package com.knoldus

import scala.annotation.tailrec

class FindFibonacci {
  private final def findFibonacci(number: Int): Int = {
    @tailrec
    def helperOfFindFibonacci(number: Int, previousNumber: Int, nextNumber: Int): Int = {
      if (number == 0) 0
      else if (number == 1) nextNumber
      else helperOfFindFibonacci(number - 1, nextNumber, previousNumber + nextNumber)
    }

    helperOfFindFibonacci(number, 0, 1)
  }

  final def inputForFibonacci(number: Int): Int = {
    number match {
      case number if number < 0 => throw new IllegalArgumentException("Invalid Argument!")
      case 0 => 0
      case 1 => 1
      case _ => findFibonacci(number)
    }
  }
}

object Driver extends App {
  private val findFibonacciObject = new FindFibonacci
  println(findFibonacciObject.inputForFibonacci(2))
}