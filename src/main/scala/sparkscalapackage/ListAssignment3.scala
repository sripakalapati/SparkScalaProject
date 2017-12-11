package sparkscalapackage

object ListAssignment3 {
  def main(args:Array[String]): Unit ={
    val list1 = List(10,20,30,40,50)
    val list = List(15, 10, 5, 8, 20, 12)
    val listPart = list.partition(_>30)
    println("Partitioned List:" + listPart)
//    val List1MulPart = list1.partition(x=>(x<30) && (x>50))
//    println("Multiple partitioned list:" + List1MulPart)
    val listSpan =list.span(_<20)
    println("Spanned List:" + listSpan)
    val listSplitAt = list.splitAt(3)
    println("Split list:" + listSplitAt)
    println("Reverse a list with out using native method:" + rev(list1))

    def rev(l: List[Any]): List[Any] = l match {
      case Nil => l
      case head :: tail => rev(tail) ::: List(head)
    }

  }

}
