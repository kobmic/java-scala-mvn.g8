package $group_id$

import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class StubTest extends Spec with ShouldMatchers {

  describe("your description here") {
    it("should do something") {
      "Hello world" should equal("Hello world")
    }
  }
}
