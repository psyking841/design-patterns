package example.composition

/**
 * Using an interface to treat leaf and node with the same interface
 */
object ClientApp extends App {
  val root = new Node("root")

  // Add node to subtree
  val subtree1 = new Node("node1").add(new Leaf("leafC")).add(new Leaf("leafD"))

  // Add subtree to root, and other two leaves
  root.add(new Leaf("leafA")).add(new Leaf("leafB")).add(subtree1).display(1)
}
