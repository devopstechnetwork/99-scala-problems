package com.slq.problems

import org.scalatest.{FunSuite, Matchers}

class P07Test extends FunSuite with Matchers {

  val list = List(1, 2, 3, 4, 5, 6)
  val p07 = new P07()

  test("that empty list already flattened") {
    p07.flatten(List()) should be(List())
  }

  test("that single-element-list is already flattened") {
    p07.flatten(List(1)) should be(List(1))
  }

  test("that nested lists are flattened") {
    p07.flatten(List(1, 2, List(3, 4, 5), 6)) should be(List(1,2,3,4,5,6))
  }
}
