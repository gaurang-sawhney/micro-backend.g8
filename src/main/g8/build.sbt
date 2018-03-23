lazy val commonSettings = Seq(
  organization  := "com.sap",
  version       := "0.1-SNAPSHOT",
  pollInterval  := 50,
  scalaVersion in ThisBuild := "2.11.11")

lazy val appRoot = (project in file("."))
  .settings(commonSettings: _*)
  .settings(libraryDependencies += "com.sap.hcp.cf.logging" % "cf-java-logging-support-servlet" % "2.1.4",
    libraryDependencies += "com.sap.xs2.security" % "java-container-security" % "0.28.0",
    libraryDependencies += "org.springframework.security" % "spring-security-web" % "4.2.3.RELEASE",
    libraryDependencies += "org.cloudfoundry.identity" % "cloudfoundry-identity-client-lib" % "4.8.0")