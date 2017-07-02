package com.slq.problems

import org.scalatest.{FunSuite, Matchers}

class P05Test extends FunSuite with Matchers {

  val list = List(1, 2, 3, 4, 5, 6)
  val p05 = new P05[Int]()

  test("that empty list should still be empty after reverse") {
    p05.reverse2(List()) should be(List())
  }

  test("that single-element-list is the same after reverse") {
    p05.reverse2(List(1)) should be(List(1))
  }

  test("that all elements are in reverse order") {
    p05.reverse2(list) should be(List(6, 5, 4, 3, 2, 1))
  }
}
