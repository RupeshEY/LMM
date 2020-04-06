package gw.acc.iplm.utils

uses gw.acc.iplm.exception.lm.LMErrorCodeType
uses gw.acc.iplm.testutils.AssertUtils
uses gw.testharness.v3.GUnitTestClass
uses junit.framework.TestCase

class LMSequenceUtilTest extends GUnitTestClass {

  function testConvert_FirstElementNormalRange() {
    final var code = "AA"
    final var expectedSequenceNumber = 1

    TestCase.assertEquals(expectedSequenceNumber, LMSequenceUtil.convert(code))
  }

  function testConvert_FirstElementOverflowRange() {
    final var code = "A1"
    final var expectedSequenceNumber = 521

    assertEquals(expectedSequenceNumber, LMSequenceUtil.convert(code))
  }

  function testConvert_LastElementNormalRange() {
    final var code = "TZ"
    final var expectedSequenceNumber = 520

    assertEquals(expectedSequenceNumber, LMSequenceUtil.convert(code))
  }

  function testConvert_LastElementOverflowRange() {
    final var code = "T9"
    final var expectedSequenceNumber = 700

    assertEquals(expectedSequenceNumber, LMSequenceUtil.convert(code))
  }

  function testConvert_ShortCodeThrowsException() {
    final var code = "T"

    AssertUtils.assertCausesLMExceptionWithType(\-> LMSequenceUtil.convert(code), LMErrorCodeType.INVALID_SEQUENCE)
  }

  function testConvert_InvalidNormalCodeThrowsException() {
    final var code = "VA"

    AssertUtils.assertCausesLMExceptionWithType(\-> LMSequenceUtil.convert(code), LMErrorCodeType.INVALID_SEQUENCE)
  }

  function testConvert_InvalidOverflowCodeThrowsException() {
    final var code = "A0"

    AssertUtils.assertCausesLMExceptionWithType(\-> LMSequenceUtil.convert(code), LMErrorCodeType.INVALID_SEQUENCE)
  }

  function testConvertCodeToSequence_ThrowsExceptionWhenCodeIsTooLong(): void {
    final var code = "FF"

    assertCausesException(\-> LMSequenceUtil.convertCodeToSequence({'A'..'E'}, code), IllegalArgumentException)
  }

  function testConvertCodeToSequence_ThrowsExceptionWhenOutOfBounds(): void {
    final var code = "F"

    assertCausesException(\-> LMSequenceUtil.convertCodeToSequence({'A'..'E'}, code), IndexOutOfBoundsException)
  }

  function testIsValidCode_ValidForFirstElementNormalRange():void
  {
    final var code = "AA"

    assertTrue(LMSequenceUtil.isValidCode(code))
  }

  function testIsValidCode_ValidForLastElementNormalRange():void
  {
    final var code = "TZ"

    assertTrue(LMSequenceUtil.isValidCode(code))
  }

  function testIsValidCode_ValidForFirstElementOverflow():void
  {
    final var code = "A1"

    assertTrue(LMSequenceUtil.isValidCode(code))
  }

  function testIsValidCode_ValidForLastElementOverflow():void
  {
    final var code = "T9"

    assertTrue(LMSequenceUtil.isValidCode(code))
  }

  function testIsValidCode_ValidForFirstElementOutOfSequenceX():void
  {
    final var code = "XA"

    assertTrue(LMSequenceUtil.isValidCode(code))
  }

  function testIsValidCode_ValidForLastElementOutOfSequenceX():void
  {
    final var code = "XZ"

    assertTrue(LMSequenceUtil.isValidCode(code))
  }

  function testIsValidCode_ValidForFirstElementOutOfSequenceU():void
  {
    final var code = "UA"

    assertTrue(LMSequenceUtil.isValidCode(code))
  }

  function testIsValidCode_ValidForLastElementOutOfSequenceU():void
  {
    final var code = "UZ"

    assertTrue(LMSequenceUtil.isValidCode(code))
  }

  function testIsValidCode_InValidForCodeTooShort():void
  {
    final var code = "A"

    assertFalse(LMSequenceUtil.isValidCode(code))
  }

  function testIsValidCode_InValidForCodeTooLong():void
  {
    final var code = "AAA"

    assertFalse(LMSequenceUtil.isValidCode(code))
  }

  function testIsValidCode_InValidForCodeOutOfNormalBounds():void
  {
    final var code = "VA"

    assertFalse(LMSequenceUtil.isValidCode(code))
  }

  function testIsValidCode_InValidForCodeOutOfOverflowBounds():void
  {
    final var code = "V1"

    assertFalse(LMSequenceUtil.isValidCode(code))
  }

  function testIsValidCode_InValidForBadFormatOverflowCode():void
  {
    final var code = "A0"

    assertFalse(LMSequenceUtil.isValidCode(code))
  }

  function testIsOutOfSequenceCode_NullCode() {
    final var code : String = null
    assertFalse(LMSequenceUtil.isOutOfSequenceCode(code))
  }

  function testIsOutOfSequenceCode_EmptyCode() {
    final var code = " "
    assertFalse(LMSequenceUtil.isOutOfSequenceCode(code))
  }

  function testIsOutOfSequenceCode_LowerX() {
    final var code = "XA"
    assertTrue(LMSequenceUtil.isOutOfSequenceCode(code))
  }

  function testIsOutOfSequenceCode_TopX() {
    final var code = "XZ"
    assertTrue(LMSequenceUtil.isOutOfSequenceCode(code))
  }

  function testIsOutOfSequenceCode_InvalidX() {
    final var code = "X0"
    assertFalse(LMSequenceUtil.isOutOfSequenceCode(code))
  }

  function testIsOutOfSequenceCode_LowerU() {
    final var code = "UA"
    assertTrue(LMSequenceUtil.isOutOfSequenceCode(code))
  }

  function testIsOutOfSequenceCode_TopU() {
    final var code = "UZ"
    assertTrue(LMSequenceUtil.isOutOfSequenceCode(code))
  }

  function testIsOutOfSequenceCode_InvalidU() {
    final var code = "U0"
    assertFalse(LMSequenceUtil.isOutOfSequenceCode(code))
  }

  function testIsOutOfSequenceCode_ValidRegularCode() {
    final var code = "AA"
    assertFalse(LMSequenceUtil.isOutOfSequenceCode(code))
  }
}