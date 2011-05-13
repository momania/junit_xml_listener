import sbt._


class JUnitXmlListenerProject(info: ProjectInfo) extends PluginProject(info) {
  val publishTo = if (version.toString.endsWith("-SNAPSHOT")) {
    "Scala Tools Nexus" at "http://nexus/nexus/content/repositories/snapshots"
  } else {
    "Scala Tools Nexus" at "http://nexus/nexus/content/repositories/releases"
  }

  override def managedStyle = ManagedStyle.Maven

  val efgfpNexusSnapshotsRepository = "Nexus Snapshots" at "http://nexus/nexus/content/groups/public-snapshots"
  val efgfpNexusReleasesRepository = "Nexus Releases" at "http://nexus/nexus/content/groups/public"
}
