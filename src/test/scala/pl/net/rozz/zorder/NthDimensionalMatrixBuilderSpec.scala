package pl.net.rozz.zorder


import org.scalatest._


class NthDimensionalMatrixBuilderSpec extends FlatSpec with Matchers {

  "The isPowerOf2 " should " return true for 2" in {
    assert(NthDimensionalMatrix.builder(2).isPowerOf2(2))
  }

  "The isPowerOf2 " should " return true for 4" in {
    assert(NthDimensionalMatrix.builder(2).isPowerOf2(4))
  }

  "The isPowerOf2 " should " return true for 64" in {
    assert(NthDimensionalMatrix.builder(2).isPowerOf2(64))
  }

  "The isPowerOf2 " should " return true for 1024" in {
    assert(NthDimensionalMatrix.builder(2).isPowerOf2(1024))
  }

  "The NthDimensionalMatrixBuilder object" should "create matrix size 2" in {
    val matrix = new NthDimensionalMatrixBuilder(2)
      .withMatrix(
        Seq(
          Seq(1,2),
          Seq(3,4)
        ))
      .build()

  }


}
