name := "solr-function-query-sample"

organization := "jp.co.mixi.rd"

version := "0.1.0"

scalaVersion := "2.9.2"


libraryDependencies ++= Seq(
    "org.scalatest" % "scalatest_2.9.2" % "1.7.2" % "test"
   ,"org.apache.solr" % "solr-test-framework" % "3.6.0" % "test"
   ,"org.apache.solr" % "solr-core" % "3.6.0"
)

scalacOptions ++= Seq( "-deprecation", "-unchecked" )
