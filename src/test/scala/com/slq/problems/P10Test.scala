package com.slq.problems

import org.scalatest._

class P10Test extends FlatSpec with Matchers {

  val p10 = new P10[String]()

  it should "encode empty list to empty list" in {
    val list = List()
    p10.encode(list) shouldBe List()
  }

  it should "encode consecutive duplicate elements" in {
    val list = List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e")
    val encodedList = p10.encode(list)
    encodedList should have size 6
    encodedList(0) should equal((4, "a"))
    encodedList(1) should equal((1, "b"))
    encodedList(2) should equal((2, "c"))
    encodedList(3) should equal((2, "a"))
    encodedList(4) should equal((1, "d"))
    encodedList(5) should equal((4, "e"))
  }
}
