package com.slq.problems

/**
  * Flatten a nested list structure.
  * Example:
  * scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
  * res0: List[Any] = List(1, 1, 2, 3, 5, 8)
  */
class P07 {
  def flatten(xs: List[Any]): List[Any] = xs flatMap {
    case elem => List(elem)
    case list: List[_] => flatten(list)
  }
}

// Due to List[Any] it's hard to use builtin flatten method
