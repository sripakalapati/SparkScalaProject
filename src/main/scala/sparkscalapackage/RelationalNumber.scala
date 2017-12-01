package sparkscalapackage

class RationalNumber(n: Int, d: Int) {

  val numerator = n;
  val denominator = d;
  def add(secondRationalNumber:RationalNumber): RationalNumber ={

    new RationalNumber((numerator*secondRationalNumber.denominator)+(secondRationalNumber.numerator*denominator),denominator*secondRationalNumber.denominator)

  }
  def sub(secondRationalNumber:RationalNumber): RationalNumber ={

    new RationalNumber((numerator*secondRationalNumber.denominator)-(secondRationalNumber.numerator*denominator),denominator*secondRationalNumber.denominator)

  }
  def mul(secondRationalNumber:RationalNumber): RationalNumber ={

    new RationalNumber((numerator)*(secondRationalNumber.numerator),denominator*secondRationalNumber.denominator)

  }
  def div(secondRationalNumber:RationalNumber): RationalNumber ={

    new RationalNumber((numerator)*(secondRationalNumber.denominator),denominator*secondRationalNumber.numerator)

  }
  override def  toString(): String = {
    numerator+"/"+denominator
  }

}
