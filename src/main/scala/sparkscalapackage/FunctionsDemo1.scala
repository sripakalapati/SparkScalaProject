package sparkscalapackage

object FunctionsDemo1 {
def main(args:Array[String]): Unit ={
  val list = List(10,20,30)

//  Using imperative statements
  println("Filtered elements:")
  for(i<-list){
    if(i>10) {
      println(i)
    }
  }

// Using method
  def filterElements(element:Int): Boolean ={
    var result:Boolean = false
    if(element>10)
      result = true
    result
 }
  println("Filtered elements using method:")
  for(i<-list){
    if (filterElements(i) == true){
      println(i)
    }
  }

//  Using function literal with type
  println("Filtered elements using function literals with type:")
  list.filter((x:Int)=>x>10).map(println(_))

//  using function literal without tpe
  println("Filtered elements using function literals without type:")
  list.filter(x=>x>10).map(println(_))

//  Using function literal with short hand form
  println("Filtered elements using function literals with short hand:")
  list.filter(_>10).map(println(_))

}
}
