name :="Assignment"
version :="1.0"
scalaVersion :="2.12.12"

lazy val util =project.in(file("util")).settings(
  libraryDependencies +="org.scalatest" %% "scalatest" % "3.2.5" % "test"
)
lazy val root =project.in(file(".")).settings(
  libraryDependencies +="org.scalatest" %% "scalatest" % "3.2.5" % "test")
  .dependsOn(util).aggregate(util).enablePlugins(JavaAppPackaging)
