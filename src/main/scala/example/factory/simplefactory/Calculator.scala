package example.factory.simplefactory

object Calculator {
   def getOperator(operator: String)(a: Int, b: Int): Operator = {
     operator match {
       case "+" => new AddOperator(a, b)
       case "-" => new SubtractOperator(a, b)
     }
   }

  /**
   * Without factor you will have following code in this class
   *
   * def add: (Int, Int) => Int = _ + _
   * def subtract: (Int, Int) => Int = _ - _
   *
   * The problem is if you touch one of these methods, all methods have to be recompiled.
   * In other words, we might accidently touch other parts of the code.
   */
}
