organization := "com.github.gphat"

name := "ssf_scala"

scalaVersion := "2.12.4"
crossScalaVersions := Seq("2.11.11", "2.12.4")

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

resolvers ++= Seq("snapshots", "releases").map(Resolver.sonatypeRepo)

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.3" % "test"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.3" % "test"
libraryDependencies += "com.thesamet.scalapb" %% "scalapb-runtime" % "0.7.0-rc6"

releasePublishArtifactsAction := PgpKeys.publishSigned.value

Publish.settings
