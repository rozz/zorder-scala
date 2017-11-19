import Dependencies._

lazy val root = (project in file("."))
  .settings(
    name := "zorder-scala",
    organization := "pl.net.rozz",
    scalaVersion := "2.12.3",
    version      := "0.1.0-SNAPSHOT"
  )

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.4"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4" % "test"