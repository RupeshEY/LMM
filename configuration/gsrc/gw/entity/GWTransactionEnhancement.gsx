package gw.entity
uses java.util.TreeSet

@Export
enhancement GWTransactionEnhancement : Transaction
{
  /**
   * Gets the set of LineCategories associated with the given Transaction as
   * a comma-separated string.
   */   
  function getLineCategoryNames() : String {
    // Use a sorted set because a.) we don't want duplicates, and b.) we
    // want a consistent ordering.
    var lineCategories = new TreeSet()
    for (var lineItem in this.LineItems) {
      lineCategories.add(lineItem.LineCategory.DisplayName)
    }
    var collectionString = lineCategories.toString()
    // NOTE pdalbora 23-Jul-2003 -- The Javadoc description of java.util.AbstractCollection.toString()
    // describes precisely how it implements toString(). From this we can assume that
    // the returned string is surrounded by brackets, which we don't want.
    return collectionString.substring(1, collectionString.length() - 1)
  }
}
