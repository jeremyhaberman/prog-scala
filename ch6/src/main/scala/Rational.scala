class Rational(n: Int, d: Int) {
    require(d != 0, "d cannot be 0")

    val numerator: Int = n
    val denominator: Int = d
    
    override def toString = numerator + "/" + denominator

    def add(that: Rational): Rational = {
        new Rational(
            numerator * that.denominator + that.numerator * denominator,
            denominator * that.denominator
        )
    }
}