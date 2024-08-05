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
    val inputList = List(1,2,3,4,5,6,7,13,15,17,23)
    val primeNumbers = filterPrime(inputList)
    
    // Print the result
    println(s"Input List: $inputList")

    if(primeNumbers.isEmpty){
      println("No Prime Number in the list")
    }else{
      println(s"Prime Numbers: $primeNumbers")
    }
     
  }
