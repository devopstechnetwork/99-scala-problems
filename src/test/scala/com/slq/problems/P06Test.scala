package com.slq.problems

import org.scalatest.{FunSuite, Matchers}

class P06Test extends FunSuite with Matchers {

  val list = List(1, 2, 3, 4, 5, 6)
  val p06 = new P06[Int]()

  test("that empty list is palindrome") {
    p06.isPalindrome(List()) should be(true)
  }

  test("that single-element-list is palindrome") {
    p06.isPalindrome(List(1)) should be(true)
  }

  test("that list with same elements is palindrome") {
    p06.isPalindrome(List(1, 1, 1, 1, 1, 1)) should be(true)
  }

  test("that random list is not palindrome") {
    p06.isPalindrome(list) should be(false)
  }

  test("that list is palindrome when is the same when read left-to-right and right-to-left") {
    p06.isPalindrome(List(1, 2, 3, 4, 4, 3, 2, 1)) should be(true)
  }
}
