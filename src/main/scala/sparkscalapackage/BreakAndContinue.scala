package sparkscalapackage

import util.control.Breaks._

object BreakAndContinue {
  def main(args:Array[String]): Unit ={
//    Break example
    println("Numbers till 5 using break: ")
    breakable {
      for (i <- 1 to 10) {
       if (i > 5) break
        println(i)
      }
    }
//    Continue example
    println("Odd numbers using continue(break): ")
      for (i <- 1 to 10) {
        breakable {
          if (i % 2 == 0) break()
          println(i)
        }
      }
  }
}
