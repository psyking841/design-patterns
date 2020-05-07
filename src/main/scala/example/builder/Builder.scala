package example.builder

trait Builder {
  def buildPartA: Builder
  def buildPartB: Builder
  def getResult: Product
}
