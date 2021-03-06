resolvers += Classpaths.sbtPluginReleases
resolvers += Classpaths.typesafeReleases

// need this to resolve http://jcenter.bintray.com/org/jenkins-ci/jenkins/1.26/
// which is used by plugin "org.kohsuke" % "github-api" % "1.68"
resolvers += "Bintray Jcenter" at "https://jcenter.bintray.com/"

libraryDependencies += "org.kohsuke" % "github-api" % "1.68"

addSbtPlugin("com.typesafe.sbt" % "sbt-multi-jvm" % "0.3.8")

addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.1.9")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.0")
addSbtPlugin("io.spray" % "sbt-boilerplate" % "0.6.0")
addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.6.0")
addSbtPlugin("com.lightbend.paradox" % "sbt-paradox" % "0.2.2")
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.1")
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.13.0")
addSbtPlugin("com.eed3si9n" % "sbt-unidoc" % "0.3.3")
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.8.0")

// plugins that are currently not needed (but kept here for reference for now)
// addSbtPlugin("com.typesafe.sbt" % "sbt-s3" % "0.5")

// addSbtPlugin("com.thoughtworks.sbt-api-mappings" % "sbt-api-mappings" % "0.2.2")
// addSbtPlugin("pl.project13.scala" % "sbt-jmh" % "0.2.11")
// addSbtPlugin("pl.project13.sbt" % "sbt-jol" % "0.1.1")
// addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.0.0-RC1")
// for advanced PR validation features
// addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.1.8")
// addSbtPlugin("de.heikoseeberger" % "sbt-header" % "1.6.0") // not a good idea, as it rewrites foreign headers as well
// addSbtPlugin("com.typesafe.sbt" % "sbt-site" % "0.7.1")
// addSbtPlugin("com.typesafe.sbt" % "sbt-osgi" % "0.9.1")

