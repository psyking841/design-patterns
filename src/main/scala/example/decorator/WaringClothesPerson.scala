package example.decorator

class WaringClothesPerson extends DecoratedPerson {
  override def show: Unit = {
    //Adding component to the person
    print("Waring T-shirt. ")
    super.show
  }
}
