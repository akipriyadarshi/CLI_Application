import org.scalatest.flatspec.AnyFlatSpec
class UtilityTest extends AnyFlatSpec{
  "get method" should "tell sorry with a message if no country found" in {
    assert(Utility.get("NONE","-x")==", Sorry no country starting from letter x")

  }
  it should "give valid result if country name if found" in {
    assert(Utility.get("Armenia","-a")=="from Armenia which is a great country")
  }

}
