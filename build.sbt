name := """silhouette-rest-seed"""

version := "2.0"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  cache,
  ws,
//  "com.mohiva" %% "play-silhouette" % "2.0",
//  "com.mohiva" %% "play-silhouette-testkit" % "2.0" % "test",
//  "com.typesafe.play.plugins" %% "play-plugins-mailer" % "2.3.0",
  "com.mohiva" %% "play-silhouette" % "4.0.0",
  "com.mohiva" %% "play-silhouette-password-bcrypt" % "4.0.0",
  "com.mohiva" %% "play-silhouette-crypto-jca" % "4.0.0",
  "com.mohiva" %% "play-silhouette-persistence" % "4.0.0",
  "com.mohiva" %% "play-silhouette-testkit" % "4.0.0" % "test",
  "com.mohiva" %% "play-silhouette-cas" % "4.0.0",
  "com.mohiva" %% "play-silhouette-persistence-reactivemongo" % "4.0.1",
  "net.codingwell" %% "scala-guice" % "4.1.0",
  "com.iheart" %% "ficus" % "1.2.6",
  "org.reactivemongo" %% "play2-reactivemongo" % "0.11.14",
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test/*,
  "com.atlassian.jwt" % "jwt-core" % "1.6.1",
  "com.atlassian.jwt" % "jwt-api" % "1.6.1"*/
)
