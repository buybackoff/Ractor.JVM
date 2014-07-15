name := "Ractor.JVM"

version := "1.0"

scalaVersion := "2.11.1"

resolvers += "rediscala" at "http://dl.bintray.com/etaty/maven"

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-async" % "0.9.1", // Could use different Futures, e.g. from Akka that is included with Rediscala
  "com.etaty.rediscala" %% "rediscala" % "1.3.1",
  "com.google.code.gson" % "gson" % "2.2"
)