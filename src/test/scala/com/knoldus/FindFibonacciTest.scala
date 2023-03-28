package com.knoldus

import org.scalatest.funsuite.AnyFunSuite

class FindFibonacciTest extends AnyFunSuite {
  val fibonacciTest = new FindFibonacci

  test("should return a Integer value") {
    val actualValue = fibonacciTest.inputForFibonacci(8)
    val expectedValue = 21
    assert(actualValue == expectedValue)
  }

  test("should also return  0") {
    val actualValue = fibonacciTest.inputForFibonacci(0)
    val expectedValue = 0
    assert(actualValue == expectedValue)
  }

  test("should also return  1") {
    val actualValue = fibonacciTest.inputForFibonacci(1)
    val expectedValue = 1
    assert(actualValue == expectedValue)
  }

  //This case should return an IllegalArgumentException because we cannot get Fibonacci series of negative numbers
  test("It will thrown an exception") {
    intercept[IllegalArgumentException] {
      fibonacciTest.inputForFibonacci(-2)
    }
  }
}
