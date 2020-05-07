package example.composition

class Node(name: String, children: Seq[Element] = Seq.empty) extends Element(name: String) {

  override def add(e: Element): Element = {
    new Node(name, children :+ e)
  }

  override def remove(e: Element): Element = {
    val c = if (children.nonEmpty) children.filter(x => x.name != e.name) else Seq.empty
    new Node(name, c)
  }

  override def display(depth: Int): Unit = {
    println("-" * depth + name)
    children.foreach(_.display(depth + 2))
  }
}
