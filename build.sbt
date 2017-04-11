name := "sdkmodels"

version := "1.0"

scalaVersion := "2.12.1"

libraryDependencies += "com.fasterxml.jackson.module" % "jackson-module-scala" % "2.1.2"
libraryDependencies += "joda-time" % "joda-time" % "2.9.9"

lazy val sdkmodels = (project in file("."))