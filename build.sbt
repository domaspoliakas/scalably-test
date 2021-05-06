ThisBuild / scalaVersion := "2.13.5"

Global / stRemoteCache := RemoteCache.Rsync(
  push = "dev2:/home/developers/scalably-cache",
  pull = new java.net.URI("http://dev2:6669")
)

lazy val root = project
  .in(file("."))

lazy val submodule =
  project
    .in(file("submodule"))
    .settings(
      scalaJSUseMainModuleInitializer := true,
      npmDependencies in Compile ++= Seq(
        "uuid" -> "8.3.0",
        "@types/uuid" -> "8.3.0"
      ),
      useYarn := true
    )
    .enablePlugins(
      ScalablyTypedConverterPlugin,
      ScalaJSPlugin,
      ScalaJSBundlerPlugin
    )
