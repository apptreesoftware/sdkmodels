name := "sdkmodels"

version := "1.0"

scalaVersion := "2.11.8"

doc in Compile <<= target.map(_ / "none")

libraryDependencies += "com.fasterxml.jackson.module" % "jackson-module-scala" % "2.1.2"
libraryDependencies += "joda-time" % "joda-time" % "2.9.9"
libraryDependencies += "commons-io" % "commons-io" % "2.4"
