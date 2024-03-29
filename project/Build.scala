import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "featureSpecBug"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    jdbc,
    anorm,
    "postgresql" % "postgresql" % "9.1-901-1.jdbc4",
    "org.seleniumhq.selenium" % "selenium-java" % "2.31.0" % "test"
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  )

}
