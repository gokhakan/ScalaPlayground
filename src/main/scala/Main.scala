object Main extends Operations {
  def main(args: Array[String]): Unit = {
    println("Hello world!")
    println("More texts here")
    val name = "Hakan"
    var num = 10
    num=11
    num+=1

    println(name + " " + num)
    printName("Hakan Gok")
    printNumber(33)
    printNameAndSurname("Hakan", "Gok")
    println(addNumbers(1, 2))

  }
  def printName(name:String): Unit = {
    println("Name is " + name)
  }
  def printNumber(number:Int): Unit = {
    println("Number is " + number)
  }
  def printNameAndSurname(name:String, surname:String): Unit = {
    println(name+ " and " + surname)
  }



}