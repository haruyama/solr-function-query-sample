package org.unixuser.haruyama.solr.search.function

import org.apache.solr.core.SolrCore;

object DistBetweenUsersStorage {
  private val distMap = Map("1,2" -> 1.0f, "1,3" -> 2.0f)

  def get(first: Int, second : Int) : Float = {

    if (first == second) {
      return Float.MinValue
    }

//    org.apache.solr.core.SolrCore.log.info("first: " + first)
//    org.apache.solr.core.SolrCore.log.info("second: " + second)
//    org.apache.solr.core.SolrCore.log.info("value:" + distMap.getOrElse("%d,%d".format(math.min(first, second), math.max(first, second)), 0.0f))

    distMap.getOrElse("%d,%d".format(math.min(first, second), math.max(first, second)), 0.0f)
  }
}
