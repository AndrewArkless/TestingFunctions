import org.scalatest.{Matchers, WordSpecLike}

/**
  * Created by User on 04/02/2017.
  */
class helperSpec extends WordSpecLike with Matchers {
  val f=(a:Renewal)=>a.y
  "calling helper" should {
    "return Andrew" in {
      helper.getStuff(f) shouldBe "Ellen"
    }
  }
}
