package example.composition

abstract class Element(val name: String) {
  def add(e: Element): Element
  def remove(e: Element): Element
  def display(depth: Int): Unit
}
