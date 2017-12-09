package sparkscalapackage

object ListAssignment2 {
def main(args:Array[String]): Unit ={
  val list = List(10,20,30)
  val inc = (x:Int)=>x+1
  println("Using imperative:")
  val res=for(li<-list) yield{
      li+1
  }
  println(res)

  println("Using map:")
  println(list.map(inc))
//  println("Using flatmap:")
//  println(list.flatMap(x=>x+1))
}
}
