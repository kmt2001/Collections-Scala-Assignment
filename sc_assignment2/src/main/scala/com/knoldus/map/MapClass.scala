//@uthor: Krishna Mohan Tiwari
//Date: March 22, 2023

package com.knoldus.map

class MapClass {

  private var mapStorage: Map[String, String] = Map.empty[String, String]

  // Store the new key-values in storage, already defined,  return the size
  def store(map: Map[String, String]): Int = {
    mapStorage ++= map
    mapStorage.size
  }

  // Simply get the value for a given key from storage
  def getValue(key: String): String = {
    mapStorage(key)
  }

  // Return all the key-values of the db
  def getAllValues: Map[String, String] = {
    mapStorage
  }

  // Update the value if key is present, else do nothing, return the size
  def updateMap(key: String, value: String): Int = {
    if (Option(key).isDefined && Option(value).isDefined) { // Check if both key and value are defined
      if (mapStorage.contains(key)) { // Check if key is already present in the map
        mapStorage = mapStorage.updated(key, value) // Update the value for the key
      }
    }
    mapStorage.size
  }

  // Check all the keys in db and figure out how many of them can be converted into int, filter them out by odd values and return them
  def getOddValue: Map[String, String] = {
    mapStorage.filter { case (key, value) =>
      key.matches("\\d+") && key.toInt % 2 != 0 // Check if key can be converted to integer and if it's an odd value
    }
  }

  // Get the value for a given key from storage, if key is not present return empty string
  def getValuesSafely(key: String): String = {
    mapStorage.getOrElse(key, "") // Return the value for the key if it's present, else return empty string
  }
}
