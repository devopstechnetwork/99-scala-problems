package com.slq.problems

/**
  * Extract a slice from a list.
  * Given two indices, I and K, the slice is the list containing the elements from and including the Ith element up to but not including the Kth element of the original list. Start counting the elements with 0.
  * Example:

  * scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res0: List[Symbol] = List('d, 'e, 'f, 'g)
  */
class P18[T] {
  def slice(i: Int, k: Int, list: List[T]): List[T] =
    list.slice(i, k)
}
