import org.scalatest.flatspec.AnyFlatSpec

class ImplementTest extends AnyFlatSpec {

  "find method " should "must tell to give some argument when no argument is provided" in {

     assert(Implement.find(0,Array(""))=="Please enter argument as your name")

  }
  it should "say hello to you in uppercase if provided only one argument as your name" in {
    assert(Implement.find(1,Array("Akash"))=="HELLO AKASH")
  }

  it should "tell to give argument with flag if provided the only argument as flag" in {
    assert(Implement.find(1,Array("-e"))=="Please provide argument with flag")
  }
it should "not accept more than two flags" in {
  assert(Implement.find(3,Array("akash","aki","-e"))=="Please do not provide more than 2 flags")
}





  }





