package example.builder

class Product(val parts: Seq[String]) {
  def addPart(p: String): Product = new Product(parts :+ p)
  def show: Unit = parts.foreach(print)
}
