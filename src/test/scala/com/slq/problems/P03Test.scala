package com.slq.problems

import java.util.NoSuchElementException

import org.scalatest.{FunSuite, Matchers}

class P03Test extends FunSuite with Matchers {

  val list = List(1, 2, 3)
  val p03 = new P03[Int]()

  test("that throws exception when list has no elements") {
    an[NoSuchElementException] should be thrownBy {
      p03.nth(2, List())
    }
  }

  test("that returns first element of list") {
    p03.nth(0, list) should be (1)
  }

  test("that returns nth element of list") {
    p03.nth(1, list) should be (2)
  }

  test("that returns last element of list") {
    p03.nth(2, list) should be (3)
  }

  test("that throws exception when there are no that many elements in the list") {
    an[NoSuchElementException] should be thrownBy {
      p03.nth(3, list)
    }
  }
}
