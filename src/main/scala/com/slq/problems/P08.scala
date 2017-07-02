package com.slq.problems

/**
  * Eliminate consecutive duplicates of list elements.
  * If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
  * Example:

  * scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  * res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
  */
class P08[A] {
  def compress(xs: List[A]): List[A] = {
    def go(xs: List[A], acc: List[A]): List[A] = (xs, acc) match {
      case (Nil, _) => acc.reverse
      case (y :: ys, List()) => go(ys, y :: acc)
      case (y :: ys, as) => if (y == as.head) go(ys, as) else go(ys, y :: as)
    }

    go(xs, List())
  }

  def compress2(xs: List[A]): List[A] = {
    xs.foldRight(List[A]()) { (elem, acc) =>
      if(acc.isEmpty || elem != acc.head ) elem :: acc
      else acc
    }
  }

  def compressBuiltin(xs: List[A]): List[A] = xs match {
    case Nil => Nil
    case y :: ys => y :: compressBuiltin(ys.dropWhile(_ == y))
  }

}
