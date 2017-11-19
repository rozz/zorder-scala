package pl.net.rozz.zorder

object Zorder {
  def zorder() = null
}


private class NthDimensionalMatrix[T](n : Int, matrix : Seq[Seq[T]]) {

}

class NthDimensionalMatrixBuilder[T](val n: Int) {

  private var matrix : Seq[Seq[T]] = Seq(Seq())

  def this (parent : NthDimensionalMatrixBuilder[T], matrix : Seq[Seq[T]]) = {
    this(parent.n)

    this.matrix = matrix
  }

  def withMatrix(matrix : Seq[Seq[T]]) : NthDimensionalMatrixBuilder[T] = {
    new NthDimensionalMatrixBuilder[T](this, matrix)
  }

  def build(): NthDimensionalMatrix[T] = {
    import scala.math.sqrt; {
      require(sqrt(n).isValidInt, "Dimension of matrix must be a power of 2")
    }

    require(matrix.length == n, "Matrix size must agree with its declared dimension")
    require(matrix.forall(row => row.length == n), "Row size must agree with its declared dimension")

    new NthDimensionalMatrix[T](n, matrix)
  }
}

object NthDimensionalMatrix {
  def builder(dimSize : Int) = new NthDimensionalMatrixBuilder(dimSize)
}

