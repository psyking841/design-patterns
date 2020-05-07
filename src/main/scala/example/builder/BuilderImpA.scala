package example.builder

/**
 * The implementation class for builder
 * @param product
 */
class BuilderImpA(product: Product) extends Builder {
  override def buildPartA: Builder = {
    new BuilderImpA(product.addPart("part A"))
  }
  override def buildPartB: Builder = {
    new BuilderImpA(product.addPart("part B"))
  }
  override def getResult: Product = product
}
