package sparkscalapackage

object RunRationalNumber {
  def main(args: Array[String]): Unit ={
    val firstNumber = new RationalNumber(1,3)
    val secondNumber = new RationalNumber(1,6)
    val addOfNumber = firstNumber.add(secondNumber)
    val subOfNumbers = firstNumber.sub(secondNumber)
    val mulOfNumbers = firstNumber.mul(secondNumber)
    val divOfNumbers = firstNumber.div(secondNumber)

    println("First Rational Number: "+firstNumber)
    println("Second Rational Number: "+secondNumber)
    println("Addition of two Rational Numbers: "+addOfNumber)
    println("Subtraction of two Rational Numbers: "+subOfNumbers)
    println("Multiplication of two Rational Numbers: "+mulOfNumbers)
    println("Division of two Rational Numbers: "+divOfNumbers)

  }
}
