package com.slq.problems

import java.util.NoSuchElementException

import org.scalatest.{FunSuite, Matchers}

class P02Test extends FunSuite with Matchers {

  val p02 = new P02[Int]()

  test("that throws exception when list has no elements") {
    an[NoSuchElementException] should be thrownBy {
      p02.penultimate(List())
    }
  }

  test("that throws exception when list has only one element") {
    an[NoSuchElementException] should be thrownBy {
      p02.penultimate(List(1))
    }
  }

  test("that return last but one element of a list") {
    p02.penultimate(List(1, 2, 3)) should be(2)
  }
}
