

object test5 {
  def main (args: Array[String]){
    var x:Int=2
    var y:Int=3
    var p:Int=8
    var q:Int=7
    def easy(x:Int,p:Int)=x*p*2
    def tempo(y:Int,q:Int)=y*q
    def total(x:Int,y:Int,p:Int,q:Int):Int=easy(x,p)+tempo(y,q)
    println(total(x,y,p,q))
  }
}