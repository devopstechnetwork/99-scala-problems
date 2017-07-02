package com.slq.problems

import java.util.NoSuchElementException

/**
  * Find the last but one element of a list.
  * Example:
  * scala> penultimate(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 5
  */
class P02[A] {
  def penultimate(list: List[A]): A = list match {
    case List(x, _) => x
    case _ :: tail => penultimate(tail)
    case _ => throw new NoSuchElementException()
  }

  def penultimateBuiltin(list: List[A]): A = list.init.last

  def penultimateBuiltin(n: Int, list: List[A]): A = {
    list.takeRight(n).head
  }
}
