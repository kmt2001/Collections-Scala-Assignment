//@uthor: Krishna Mohan Tiwari
//Date: March 22, 2023

package com.knoldus.seq

class Sequence {

  // Initialize empty sequence of string and integer
  private var sequenceString: Seq[String] = Seq.empty[String]
  private var sequenceInt: Seq[Int] = Seq.empty[Int]

  // Check the type of element, if it is int save it to sequenceInt, if it is string save it to sequenceString, else return IllegalArgumentException,  return the size
  def store(element: Any): Int = {
    element match {
      case intValue: Int =>
        sequenceInt :+= intValue // Add element to sequenceInt
        sequenceInt.size // Return size of sequenceInt
      case stringValue: String =>
        sequenceString :+= stringValue // Add element to sequenceString
        sequenceString.size // Return size of sequenceString
      case _ =>
        throw new IllegalArgumentException("Invalid element type") // Throw exception for invalid element type
    }
  }

  // Check the type of element, if it is int remove it from sequenceInt, if it is string remove it from sequenceString, else return IllegalArgumentException,  return the size
  def removeElement(element: Any): Int = {
    element match {
      case intValue: Int =>
        sequenceInt = sequenceInt.filter(_ != intValue) // Remove element from sequenceInt
        sequenceInt.size // Return size of sequenceInt
      case stringValue: String =>
        sequenceString = sequenceString.filter(_ != stringValue) // Remove element from sequenceString
        sequenceString.size // Return size of sequenceString
      case _ =>
        throw new IllegalArgumentException("Invalid element type") // Throw exception for invalid element type
    }
  }
}
