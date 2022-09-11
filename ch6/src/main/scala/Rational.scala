class Rational(n: Int, d: Int) {
    require(d != 0, "d cannot be 0")

    private val g = gcd(n.abs, d.abs)
    val numerator: Int = n / g
    val denominator: Int = d / g

    def this(n: Int) = this(n, 1)
    
    override def toString = numerator + "/" + denominator

    def +(that: Rational): Rational =
        new Rational(
            (numerator * that.denominator) + (that.numerator * denominator),
            denominator * that.denominator
        )
    
    def +(i: Int): Rational = this + new Rational(i)
    
    def -(that: Rational): Rational = 
        new Rational(
            (numerator * that.denominator) - (that.numerator * denominator),
            denominator * that.denominator
        )
    
    def -(i: Int): Rational = this - new Rational(i)

    def *(that: Rational): Rational = 
        new Rational(numerator * that.numerator, denominator * that.denominator)

    def *(i: Int): Rational = this * new Rational(i)

    def /(that: Rational): Rational = 
        new Rational(numerator * that.denominator, denominator * that.numerator)

    def /(i: Int): Rational = this / new Rational(i)

    def lessThan(that: Rational): Boolean = 
        this.numerator * that.denominator < that.numerator * this.denominator

    def max(that: Rational) = if (lessThan(that)) that else this

    private def gcd(a: Int, b: Int): Int = 
        if (b == 0) a else gcd(b, a % b)
}