package example.builder

object Constructor {
  def build(builder: Builder): Builder = {
    builder.buildPartA.buildPartB
  }
}
