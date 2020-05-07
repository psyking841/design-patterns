package example.builder

object BuilderClient extends App {
  // Two builders, each of which defines a different building approach
  val builder1 = new BuilderImpA(new Product(Seq.empty))
  val builder2 = new BuilderImpB(new Product(Seq.empty))
  Constructor.build(builder1).getResult.show
  Constructor.build(builder2).getResult.show
}
