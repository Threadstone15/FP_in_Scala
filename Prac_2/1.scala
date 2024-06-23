object Var_ass {

def Var_ass(): Unit = {
  
  var i, j, k = 2
  var m, n = 5
  var f = 12.0f
  var g = 4.0f
  var c = 'X'
  
  val a = k + 12 * m
  val b = m / j
  val c1 = n % j
  val d = m / j * j
  val e = f + 10 * 5 + g
  i+=1
  val f1 = i * n

  println(s"a) $a")
  println(s"b) $b")
  println(s"c) $c1")
  println(s"d) $d")
  println(s"e) $e")
  println(s"f) $f1")

}

  def main(args: Array[String]): Unit = {
        Var_ass()
    }  

}


