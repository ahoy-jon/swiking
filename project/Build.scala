import sbt._

object SwikingBuild extends Build {

  lazy val root = Project(id = "root", base = file(".")) dependsOn sgit
  
  lazy val sgit = Project(id = "sgit", base = file("sgit"))

}