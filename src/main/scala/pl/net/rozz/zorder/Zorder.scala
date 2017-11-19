package pl.net.rozz.zorder

object Zorder {
  def zorder() = null
}


private class NthDimensionalMatrix[T](n : Int) {

}

class NthDimensionalMatrixBuilder[T](n: Int) {
  val matrix = Seq.

  def this(parentBuilder : NthDimensionalMatrixBuilder[T], index : Seq[Int], value : T) = {
    this(parentBuilder.n)
  }

  def withValue(index : Seq[Int], value : T) : NthDimensionalMatrixBuilder[T] = {
    this
  }

  def build(): NthDimensionalMatrix[T] = {
    new NthDimensionalMatrix[T](n)
  }
}

object NthDimensionalMatrix {
  def builder(dimSize : Int) = new NthDimensionalMatrixBuilder(dimSize)
}

