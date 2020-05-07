package example.builder

class BuilderImpB(product: Product) extends Builder {
  override def buildPartA: Builder = {
    product.addPart("component A")
    this
  }
  override def buildPartB: Builder = {
    product.addPart("component B")
    this
  }
  override def getResult: Product = product
}
