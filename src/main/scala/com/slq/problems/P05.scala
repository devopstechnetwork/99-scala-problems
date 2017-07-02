package com.slq.problems

/**
  * Reverse a list.
  * Example:
  * scala> reverse(List(1, 1, 2, 3, 5, 8))
  * res0: List[Int] = List(8, 5, 3, 2, 1, 1)
  */
class P05[A] {
  def reverse(xs: List[A]): List[A] = xs match {
    case Nil => Nil
    case y :: ys => reverse(ys) ++ List(y)
  }

  def reverse2(xs: List[A]): List[A] = {
    def go(xs: List[A], acc: List[A]): List[A] = xs match {
      case Nil => acc
      case y :: ys => go(ys, y :: acc)
    }
    go(xs, List())
  }

  def reverse3(xs: List[A]): List[A] = xs match {
    case Nil => Nil
    case y :: ys => reverse(ys) ::: List(y)
  }

  def reverse4(xs: List[A]): List[A] = xs.foldLeft(List[A]()) { (acc, elem) => elem :: acc }

  def reverseBuiltin(xs: List[A]): List[A] = xs.reverse
}
