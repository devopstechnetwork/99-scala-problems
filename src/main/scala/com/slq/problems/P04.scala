package com.slq.problems

/**
  * Find the number of elements of a list.
  * Example:
  * scala> length(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 6
  */
class P04[A] {
  def length(xs: List[A]): Int = xs match {
    case Nil => 0
    case _ :: ys => 1 + length(ys)
  }

  def length2(xs: List[A]): Int = {
    def go(xs: List[A], acc: Int): Int = xs match {
      case Nil => acc
      case _ :: ys => go(ys, acc + 1)
    }
    go(xs, 0)
  }

  def length3(xs: List[A]): Int = xs.foldLeft(0) { (acc, _) => acc + 1 }

  def lengthBuiltin(xs: List[A]): Int = xs.length
}
