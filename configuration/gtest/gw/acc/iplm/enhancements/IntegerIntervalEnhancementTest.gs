package gw.acc.iplm.enhancements

uses gw.testharness.v3.GUnitTestClass

class IntegerIntervalEnhancementTest extends GUnitTestClass {

  function testToHashMap() {
    final var interval = 'A'..'D'
    final var expectedHashMap = {'A' -> 0,
                                 'B' -> 1,
                                 'C' -> 2,
                                 'D' -> 3}

    assertEquals(expectedHashMap, interval.toHashMap())
  }

  function testToHashMap_OpenEnded() {
    final var interval = 'A'..|'D'
    final var expectedHashMap = {'A' -> 0,
        'B' -> 1,
        'C' -> 2}

    assertEquals(expectedHashMap, interval.toHashMap())
  }


}