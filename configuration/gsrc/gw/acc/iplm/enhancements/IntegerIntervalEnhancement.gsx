package gw.acc.iplm.enhancements

uses gw.lang.reflect.interval.IntegerInterval

enhancement IntegerIntervalEnhancement: IntegerInterval {

  /**
   * Converts an Integer Interval (e.g. 'A'..'Z') to an HashMap in the format {Character -> Character Index in Interval}
   * @return IntegerInterval as an HashMap
   */
  function toHashMap() : HashMap<Character, Integer> {
    var map = new HashMap<Character, Integer>(this.Count)

    this.eachWithIndex(\elt, index -> map.put(elt as char, index))

    return map
  }

}
