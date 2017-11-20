package pl.net.rozz.zorder

import scala.annotation.tailrec

object Zorder {
  def zorder() = null
}


class NthDimensionalMatrix[T](n : Int, matrix : Seq[Seq[T]]) {

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
      require(isPowerOf2(n), s"Dimension of matrix must be a power of 2. It's actually $n.")
    }

    require(matrix.length == n, "Matrix size must agree with its declared dimension")
    require(matrix.forall(row => row.length == n), "Row size must agree with its declared dimension")

    new NthDimensionalMatrix[T](n, matrix)
  }

  @tailrec
  final def isPowerOf2(n: Int): Boolean = {
    if (n==2) true
    else if (n==0 || !(n.toDouble/2).isValidInt) false
    else isPowerOf2(n/2)
  }
}

object NthDimensionalMatrix {
  def builder(dimSize : Int) = new NthDimensionalMatrixBuilder(dimSize)
}

