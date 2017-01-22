import java.io._
object Test {
   def main(args: Array[String]) {
      println("Hello\tWorld\n\n" )
      var a = 100
      val scala ="hello"
      var value :Int =20;
      println(a+" "+ scala)
      println(value)
      val str: String ="scala string immutable"
      println(str)
      var calc = new Calculator(10,20)
      calc.add(calc.obj1, 30)
      
   }
} 

class Calculator(valx:Int, valy:Int){
  var obj1 = valx
  var obj2 = valy
  
  def add(val1:Int, val2:Int){
    var answer = val1+val2
    println(answer)
  }
  
}