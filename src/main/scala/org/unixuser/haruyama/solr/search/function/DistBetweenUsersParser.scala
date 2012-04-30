package org.unixuser.haruyama.solr.search.function

import org.apache.lucene.queryParser.ParseException

import org.apache.solr.common.util.NamedList
import org.apache.solr.search.FunctionQParser
import org.apache.solr.search.ValueSourceParser

import org.apache.solr.search.function.DocValues
import org.apache.solr.search.function.MultiFloatFunction
import org.apache.solr.search.function.ValueSource

class DistBetweenUsersParser extends ValueSourceParser {

  // In actual environments, you would set parameters of storage.
  //override def init(args : NamedList[String]) { }

  override def parse(fp :FunctionQParser) : ValueSource = {
    val sources = fp.parseValueSourceList();

    return new DistBetweenUsersFloatFunction(sources.toArray(new Array[ValueSource](sources.size)))
  }
}
