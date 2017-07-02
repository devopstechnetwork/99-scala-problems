package com.slq.problems

/**
  * Split a list into two parts.
  * The length of the first part is given. Use a Tuple for your result.
  * Example:

  * scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  */
class P17[T] {
  def split(n: Int, list: List[T]): (List[T], List[T]) =
    (list.take(n), list.drop(n))

  def split2(n: Int, list: List[T]): (List[T], List[T]) =
    list.splitAt(n)
}
