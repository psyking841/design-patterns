package example.composition

// The downside is you have to implemnt add and remove for leaf, which are not applicable
class Leaf(name: String) extends Element(name) {

  override def add(e: Element): Element = this

  override def remove(e: Element): Element = this

  override def display(depth: Int): Unit = println("-" * depth + name)

}
