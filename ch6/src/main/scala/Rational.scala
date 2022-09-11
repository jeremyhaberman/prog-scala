class Rational(n: Int, d: Int) {
    require(d != 0, "d cannot be 0")
    override def toString = n + "/" + d
}