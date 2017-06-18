package com.slq.problems

class P01[T] {
  def last(list: List[T]): Option[T] = list match {
    case Nil => None
    case head :: Nil => Some(head)
    case head :: tail => last(tail)
  }
}
