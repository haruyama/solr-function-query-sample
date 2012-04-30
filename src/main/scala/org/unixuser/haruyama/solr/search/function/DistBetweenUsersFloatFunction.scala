package org.unixuser.haruyama.solr.search.function

import org.apache.solr.search.function.DocValues
import org.apache.solr.search.function.MultiFloatFunction
import org.apache.solr.search.function.ValueSource

class DistBetweenUsersFloatFunction(sources : Array[ValueSource]) extends MultiFloatFunction(sources) {

  override protected def name() : String = "dist_between_users"

  override protected def func(doc : Int, valsArr : Array[DocValues]) : Float = {

    require(valsArr.length == 2, "dist_between_users needs 2 arguments, but " + valsArr.length + " argument(s).")

    val first  = valsArr(0).intVal(doc)
    val second = valsArr(1).intVal(doc)

    DistBetweenUsersStorage.get(first, second)
  }
}
