enablePlugins(ScalaJSPlugin)

name := "ArduinoWorkshop"
scalaVersion := "3.3.1" // oder 2.13

// Aktiviert DOM-Support
libraryDependencies ++= Seq(
  "com.raquo" %%% "laminar" % "16.0.0"
)

// Erstellt main.js für die HTML Datei
scalaJSUseMainModuleInitializer := true