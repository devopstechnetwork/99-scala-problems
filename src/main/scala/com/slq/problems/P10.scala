package com.slq.problems

import com.slq.problems.P09

/**
  * Run-length encoding of a list.
  * Use the result of problem P09 to implement the so-called run-length encoding data compression method. Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.
  * Example:

  * scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  * res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  */
class P10[A] {

  def encode(xs: List[A]): List[(Int, A)] = xs match {
    case Nil => Nil
    case y :: _ =>
      val (heads, tails) = xs span (_ == y)
      (heads.size, heads.head) :: encode(tails)
  }

  // should use P09 companion object, but let's leave it for now
  def encode2(xs: List[A]): List[(Int, A)] = new P09[A].pack(xs) map (elem => (elem.size, elem.head))
}
