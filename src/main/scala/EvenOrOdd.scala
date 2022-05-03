object EvenOrOdd extends App {

  def evenOrOdd(number: Int): String = {
    number match { // Use of pattern matching
      case 1 if number % 2 == 0 => s"$number is even" // State first case to be satisfied if number has remainder of 0
      // when divided by 2
      case _ => s"$number is odd" // In all other cases, let number be odd
    }
  }

  println(evenOrOdd(2))
  println(evenOrOdd(3))
  println(evenOrOdd(44))
  println(evenOrOdd(515))

}
