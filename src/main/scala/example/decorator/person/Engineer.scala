package example.decorator.person

class Engineer(name: String) extends Person {
  def show: Unit = print(s"This is $name.")
}
