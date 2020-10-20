lazy val renaissanceCore = RootProject(uri("../../renaissance-core"))

lazy val actors = (project in file("."))
  .settings(
    name := "actors212",
    version := (version in renaissanceCore).value,
    organization := (organization in renaissanceCore).value,
    scalaVersion := "2.12.12",
    libraryDependencies ++= Seq(
      // akka-actor 2.4.20 supports Scala 2.11, 2.12
      // akka-actor 2.5.32 supports Scala 2.11, 2.12, 2.13
      // akka-actor 2.6.10 supports Scala 2.12, 2.13
      "com.typesafe.akka" %% "akka-actor" % "2.5.32",
    )
  )
  .dependsOn(
    renaissanceCore
  )
