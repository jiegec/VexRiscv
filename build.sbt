val spinalVersion = "1.6.1"

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.github.spinalhdl",
      scalaVersion := "2.12.13",
      version      := "2.0.0"
    )),
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.5",
      "org.yaml" % "snakeyaml" % "1.8",
      "com.github.spinalhdl" %% "spinalhdl-core" % spinalVersion,
      "com.github.spinalhdl" %% "spinalhdl-lib" % spinalVersion,
      compilerPlugin(
        "com.github.spinalhdl" %% "spinalhdl-idsl-plugin" % spinalVersion
      )
    ),
    name := "VexRiscv"
  )

fork := true
