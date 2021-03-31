val scala3Version = "3.0.0-RC1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "greeter",
    organization := "com.example",
    version := "1.0.2",
    scalaVersion := scala3Version,
    publishTo := Some(
      "proxy" at s"https://repo1.maven.org/maven2/"
    )
  )
