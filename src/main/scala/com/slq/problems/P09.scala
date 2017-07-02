package com.slq.problems

/**
  * Pack consecutive duplicates of list elements into sublists.
  * If a list contains repeated elements they should be placed in separate sublists.
  * Example:

  * scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  * res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
  */
class P09[A] {
  def pack(xs: List[A]): List[List[A]] = xs match {
    case Nil => Nil
    case y :: _ =>
      val (heads, tails) = xs span (_ == y)
      heads :: pack(tails)
  }
}


// Can use span partition. Be careful for partition behavior! Span works when packing consequtive duplicate values, while partition will use non-consequtive values as well
// -> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) -> List(List('a, 'a, 'a, 'a, 'a, 'a), List('b), List('c, 'c), List('d), List('e, 'e, 'e, 'e))
