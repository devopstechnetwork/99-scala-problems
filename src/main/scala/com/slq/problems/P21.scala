package com.slq.problems

/**
  * Insert an element at a given position into a list.
  * Example:
  *
  * scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
  * res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)
  */
class P21[T] {
  def insertAt(elem: T, n: Int, list: List[T]): List[T] = list.splitAt(n) match {
    case (pre, post) => pre ::: elem :: post
  }
}
