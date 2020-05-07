package example.decorator

class WaringPantsPerson extends DecoratedPerson {
  override def show: Unit = {
    warePants
    super.show
  }

  def warePants: Unit = {
    print("Waring pants. ")
  }
}
