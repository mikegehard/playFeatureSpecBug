package test

import org.specs2.mutable.Specification
import play.api.test.{Helpers, FakeApplication, WithBrowser}
import java.util.concurrent.TimeUnit
import org.openqa.selenium.Keys

class IntegrationSpec extends Specification {

  val additionalConfig = Map(
    "db.default.url" -> "postgres://retrospectr:password@localhost/RetrospectrTest"
  )
  val app = FakeApplication(additionalConfiguration = additionalConfig)
//  val app = FakeApplication()

  "testing first test test per file" should {
    "test1" in new WithBrowser(webDriver = Helpers.FIREFOX, app = app) {
      browser.goTo("/")

      browser.pageSource must contain("Your new application is ready.")
    }
  }

  "testing second test per file" should {
    "test2" in new WithBrowser(webDriver = Helpers.FIREFOX, app = app) {
      browser.goTo("/")

      browser.pageSource must contain("Your new application is ready.")
    }
  }
}