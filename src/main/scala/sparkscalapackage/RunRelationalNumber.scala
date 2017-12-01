package sparkscalapackage

object RunRationalNumber {
  def main(args: Array[String]): Unit ={
    val firstnumber = new RationalNumber(1,3)
    val secondnumber = new RationalNumber(1,6)
    val resultnumber = firstnumber.add(secondnumber)
    val subofnumbers = firstnumber.sub(secondnumber)
    val mulofnumbers = firstnumber.mul(secondnumber)
    val divofnumbers = firstnumber.div(secondnumber)

    println("First Rational Number:  "+firstnumber)
    println("Second Rational Number: "+secondnumber)
    println("Addition of two Rational Numbers: "+resultnumber)
    println("Subtraction of two Rational Numbers: "+subofnumbers)
    println("Multiplication of two Rational Numbers: "+mulofnumbers)
    println("Division of two Rational Numbers: "+divofnumbers)

  }
}
