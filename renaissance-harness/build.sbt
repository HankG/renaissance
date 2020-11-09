lazy val renaissanceCore = RootProject(uri("../renaissance-core"))

lazy val renaissanceHarness = (project in file("."))
  .settings(
    name := "renaissance-harness",
    version := (version in renaissanceCore).value,
    organization := (organization in renaissanceCore).value,
    scalaVersion := "2.13.3",
    libraryDependencies ++= Seq(
      "commons-io" % "commons-io" % "2.6",
      "com.github.scopt" %% "scopt" % "4.0.0-RC2",
      "io.spray" %% "spray-json" % "1.3.5"
    )
  )
  .dependsOn(
    renaissanceCore
  )
