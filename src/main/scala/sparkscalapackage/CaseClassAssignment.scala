package sparkscalapackage

import scala.io._

object CaseClassAssignment {
  case class Employee(id:Int,
                      name:String,
                      sal:Int,
                      deptNo:Int,
                      loc:String)

  def main(args:Array[String]): Unit = {
    val file = Source.fromFile("E://Hadoop/empdata.txt")
    val lines:List[Employee] = file.getLines().toList.map(li=>li.trim.split('|')
    match {
      case Array(id,name,sal,deptNo,loc)=> Employee(id.toInt,name,sal.toInt,deptNo.toInt,loc)
    }
    )

    println("Employees who are in NJ :" + getEmployeesNJ(lines))

    def getEmployeesNJ(employees: List[CaseClassAssignment.Employee]):List[Employee]={
      employees.filter(emp=>emp.loc == "NJ")
    }

    println("Employee names contain Vowels:" + getEmployeesVowels(lines))

    def getEmployeesVowels(employees: List[CaseClassAssignment.Employee]):List[Employee]={
      employees.filter(emp =>emp.name.contains('A') |
                            emp.name.contains('E') |
                            emp.name.contains('I') |
                            emp.name.contains('O') |
                            emp.name.contains('U'))
    }

    println("Employee who has max salary:" + getEmployeesMaxSalary(lines).name)

    def getEmployeesMaxSalary(employees: List[CaseClassAssignment.Employee]):Employee={
      employees.maxBy(emp=>emp.sal)
    }

//    println("List of Employees:")
//    lines.map(println(_))
//    println("Employees who are in NJ:")
//    lines.filter(emp=>emp.loc == "NJ").map(println(_))
//    println("Employee names contain VOWELS:")
//    lines.filter(emp =>emp.name.contains('A') |
//                      emp.name.contains('E') |
//                      emp.name.contains('I') |
//                      emp.name.contains('O') |
//                      emp.name.contains('U')).map(println(_))
//    println("Employee who has max salary:")
//    println(lines.maxBy(emp => emp.sal))


//    for (line <- file.getLines()) {
//      val cols = line.split('|')
//      val emp: Employee = Employee(cols(0).toInt, cols(1).toString, cols(2).toInt, cols(3).toInt, cols(4).toString)
////       println(emp)
////
////       println("Employees in NJ location:" + getEmployeeLocation(emp))
////
////       println("Employee names contain VOWELS:" + getEmployeeNameVowels(emp))
//    }
//
//    def getEmployeeLocation(employee: Employee): Employee = {
//      var emp: Employee = null
//      if (employee.loc == "NJ")
//        emp = employee
//
//      emp
//    }
//
//    def getEmployeeNameVowels(employee: Employee): String = {
//      var empNameOvel = ""
//            if(employee.name.contains('A') ||
//              employee.name.contains('E') ||
//              employee.name.contains('I') ||
//              employee.name.contains('O') ||
//              employee.name.contains('U') ){
//              empNameOvel = employee.name
//            }
//      empNameOvel
//    }
////
////    def getMaxSalary(employee: Employee): List[Employee]={
////
////    }
  }
}

