package com.slq.problems

/**
  * Create a list containing all integers within a given range.
  * Example:
  *
  * scala> range(4, 9)
  * res0: List[Int] = List(4, 5, 6, 7, 8, 9)
  */
class P22 {
  def range(min: Int, max: Int): List[Int] = min to max toList

  def range2(min: Int, max: Int): List[Int] = List.range(min, max + 1)
}
