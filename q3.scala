  // Helper function to check if a number is prime
  def isPrime(num: Int): Boolean = {
    if (num <= 1) false
    else (2 until num).forall(i => num % i != 0)
  }

  // Function to filter prime numbers from a list
  def filterPrime(numbers: List[Int]): List[Int] = {
    // Use the filter method with a lambda function to select prime numbers
    numbers.filter(num => isPrime(num))
  }

  def main(args: Array[String]): Unit = {
    // Example input list
    val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,101)
    
    // Call the filterPrime function
    val primeNumbers = filterPrime(inputList)
    
    // Print the result
    println(s"Input List: $inputList")
    println(s"Prime Numbers: $primeNumbers")
  }
