package sparkscalapackage

import scala.math

object ListAssignment {
  def main(args:Array[String]): Unit ={
    val words = List("spark","scala","trainig")
    println(words)
    words.map(x=>println(x))
    println("2nd element in list: " + words(1))
    println("Length of list : " + words.length)
    println("Count words of length 4:" + words.count(x=>x.length==4))
//    for(li <- words if li.length == 3){
//      println(li)
//    }
    val list1 = words.drop(1)
    println(list1)
    val list2 = words.dropRight(2)
    println(list2)
    println("Does list contan spark: " + words.contains("spark"))
    val list3 = words.filter(x=>x.length == 5)
    println("List of 5 letter words: " + list3)
    println("First word in a list: " + words.head)
    println("Words except last word: " + words.init)
    println("List is empty or not: " + words.isEmpty)
    println("Last word in a list: " + words.last)
    val list5 = words.map(x=> x.concat("easy"))
    println("List after appedning easy to each word: " + list5)
//    println("Suare root of 3:" + sqrt(3))
  }

}
