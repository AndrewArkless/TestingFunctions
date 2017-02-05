import Renewal._
object helper {
  val myOption=Some("andrew")
  def getStuff(f:Renewal=>String)={
    val x="Ellen"
    val y="Cat"
    f(Renewal(x,y))
  }
}
