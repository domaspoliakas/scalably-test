addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.5.0")
addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % "0.20.0")
resolvers += MavenRepository(
  "sonatype-s01-snapshots",
  "https://s01.oss.sonatype.org/content/repositories/snapshots"
)
addSbtPlugin(
  "org.scalablytyped.converter" % "sbt-converter" % "1.0.0-beta32+8-1a2a84b1-SNAPSHOT"
)
