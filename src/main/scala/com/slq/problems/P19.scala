package com.slq.problems

/**
  * Rotate a list N places to the left.
  * Examples:
  * scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)

  * scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
  */
class P19[T] {
  def rotate(n: Int, list: List[T]): List[T] = {
    def rotate(m: Int): List[T] =
      list.drop(m) ++ list.take(m)

    if (n > 0) rotate(n) else rotate(list.length + n)
  }
}
