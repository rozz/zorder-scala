package pl.net.rozz.zorder


import org.scalatest._


class NthDimensionalMatrixBuilderSpec extends FlatSpec with Matchers {
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
