class ChecksumAccumulator {
  private var sum = 0

  def add(b: Byte): Unit = {
    sum += b
  }

  def rawsum(): Int = sum

  def checksum(): Int = {
    return ~(sum & 0xFF) + 1
  }
}