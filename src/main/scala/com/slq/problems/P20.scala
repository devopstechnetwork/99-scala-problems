package com.slq.problems

/**
  * Remove the Kth element from a list.
  * Return the list and the removed element in a Tuple. Elements are numbered from 0.
  * Example:

  * scala> removeAt(1, List('a, 'b, 'c, 'd))
  * res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)
  */
class P20[T] {
  def removeAt(n: Int, list: List[T]): (List[T], T) =
    list.zipWithIndex.foldRight((List[T](), list.head)) { case ((elem, idx), (acc, removed)) =>
      if (idx == n) (acc, elem) else (elem :: acc, removed)
    }

  def removeAt2(n: Int, list: List[T]): (List[T], T) = list.splitAt(n) match {
    case (pre, elem :: post) => (pre ::: post, elem)
  }
}
