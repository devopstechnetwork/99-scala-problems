package com.slq.problems

/**
  * Find the Kth element of a list.
  * By convention, the first element in the list is element 0.
  * Example:
  * scala> nth(2, List(1, 1, 2, 3, 5, 8))
  * res0: Int = 2
  */
class P03[A] {
  def nth(n: Int, list: List[A]): A = list match {
    case List() => throw new NoSuchElementException
    case head :: tail => if (n == 0) head else nth(n - 1, tail)
  }

  def nth2(n: Int, list: List[A]): A = (n, list) match {
    case (_, List()) => throw new NoSuchElementException
    case (0, h :: _) => h
    case (_, _ :: tail) => nth2(n-1, tail)
  }

  def nthBuiltin(n: Int, xs: List[A]): A = xs(n)
}
