ThisBuild / scalaVersion := "3.6.4"
// ThisBuild / scalaVersion := "2.13.16"

lazy val module1 = project in file("module1")

lazy val module2 = project in file("module2")

lazy val module3 = (project in file("module3"))
  .dependsOn(module1, module2)

lazy val root = (project in file("."))
  .settings(
    name := "chimney-issues"
  )
  .aggregate(module1)
  .aggregate(module2)
  .aggregate(module3)
