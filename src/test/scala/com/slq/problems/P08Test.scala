package com.slq.problems

import org.scalatest.{FunSuite, Matchers}

class P08Test extends FunSuite with Matchers {

  val p08 = new P08[Int]()

  test("that empty list does not need to be compressed") {
    p08.compress(List()) should be(List())
  }

  test("that single-element-list does not need to be compressed") {
    p08.compress(List(1)) should be(List(1))
  }

  test("that list is compressed") {
    p08.compress(List(1, 2, 2, 2, 3, 3, 4, 5, 6, 6, 6)) should be(List(1, 2, 3, 4, 5, 6))
  }
}
