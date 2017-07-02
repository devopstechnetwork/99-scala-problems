package com.slq.problems

/**
  * Find out whether a list is a palindrome.
  * Example:
  * scala> isPalindrome(List(1, 2, 3, 2, 1))
  * res0: Boolean = true
  */
class P06[A] {

  def isPalindrome(xs: List[A]): Boolean = {
    def reverse(xs: List[A]): List[A] = xs match {
      case Nil => Nil
      case y :: ys => reverse(ys) ++ List(y)
    }
    xs == reverse(xs)
  }

  def isPalindromeBuiltin(xs: List[A]): Boolean = xs == xs.reverse
}
