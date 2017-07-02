package com.slq.problems

import java.util.NoSuchElementException

/**
  * Find the last element of a list.
  * Example:
  * scala> last(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 8
  */
class P01[A] {
  def last(list: List[A]): A = list match {
    case List() => throw new NoSuchElementException()
    case x :: Nil => x
    case x :: tail => last(tail)
  }

  def lastBuiltin(list: List[A]): A = list.last
}
