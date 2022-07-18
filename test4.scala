

object test4 {
  def main (args: Array[String]){
    var coverPrice:Double=24.95
    var discount:Double=0.60
    var shippingCostFirst:Int=3
    var shippingCostNext:Double=0.75
    var total:Int=60
    
    def discountAmount(coverPrice:Double,discount:Double,total:Int):Double=coverPrice*discount*total
    def shippingCost(shippingCostFirst:Int,shippingCostNext:Double):Double=50*shippingCostFirst+10*shippingCostNext
    
    def wholeSaleCost(coverPrice:Double,discount:Double,total:Int,shippingCostFirst:Int,shippingCostNext:Double):Double=discountAmount(coverPrice,discount,total)+shippingCost(shippingCostFirst,shippingCostNext)
    println(wholeSaleCost(coverPrice,discount,total,shippingCostFirst,shippingCostNext))
  }
}