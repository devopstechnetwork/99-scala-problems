package com.slq.problems

import java.util.NoSuchElementException

import org.scalatest.{FunSuite, Matchers}

class P01Test extends FunSuite with Matchers {

  val p01 = new P01[Int]()

  test("that returns element for single element's list") {
    p01.last(List(3)) should be(3)
  }

  test("that throws exception for empty list") {
    an [NoSuchElementException] should be thrownBy {
      p01.last(List())
    }
  }

  test("that returns last element of list") {
    p01.last(List(1, 1, 2, 3, 5, 8)) should be(8)
  }
}
