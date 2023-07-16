package expressions

object Expressions extends App{

  val x = 1 + 2 //expression
  println(x)

  var aVariable = 2
  aVariable += 3

  println(aVariable)

  //Instructions vs Expressions
  //If expression
   val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3

  println(aConditionValue)

  val aCodeBlock = {
    val x = 1
    val z = x + 1

    if(z > 2) 3 else 15
  }

  println(aCodeBlock)
}
