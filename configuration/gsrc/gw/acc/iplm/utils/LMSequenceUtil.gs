package gw.acc.iplm.utils

uses gw.acc.iplm.exception.lm.LMErrorCodeType
uses gw.acc.iplm.exception.lm.LMException
uses gw.lang.reflect.interval.IntegerInterval

class LMSequenceUtil {

  private static final var SHORT_ALPHABET   = 'A'..'T'
  private static final var FULL_ALPHABET    = 'A'..'Z'
  private static final var NUMBERS_ALPHABET = '1'..'9'

  private static final var SEQUENCE_REGEX = "[A-T][A-Z]"
  private static final var OVERFLOW_REGEX = "[A-T][1-9]"
  private static final var OUT_OF_SEQUENCE_REGEX = "(X|U)[A-Z]"

  private static final var lastNormalSequence = 520

  /**
   * Converts an SCM message sequence from a code (e.g. AA is the first message, AB is the second message, etc..) to
   * a sequence number.
   * does not include  XA..XZ nor UA..UZ
   *
   * The sequence begins with AA and goes up until T9, like so:
   * 1 -> AA
   * 2 -> AB
   * ...
   * 26 -> AZ
   * 27 -> BA
   * ...
   * TZ -> 520
   * A1 -> 521
   * ...
   * A9 -> 529
   * B1 -> 530
   * ...
   * T9 -> 700
   *
   * @param code SCM message sequence
   * @return Sequence
   * @throws LMException (INVALID_SEQUENCE) When the code doesn't match the expected sequence format
   */
  static function convert(code: String) : Integer {

    if (code.matches(SEQUENCE_REGEX)) {
      return convertCodeToSequence({SHORT_ALPHABET, FULL_ALPHABET}, code)

    } else if (code.matches(OVERFLOW_REGEX)) {
      return convertCodeToSequence({SHORT_ALPHABET, NUMBERS_ALPHABET}, code, lastNormalSequence + 1)
    }

    throw new LMException(LMErrorCodeType.INVALID_SEQUENCE)
  }

  /**
   * Checks if the code is valid according to any of the valid sequence formats,
   * AA..AZ through to TA..TZ
   * A1..A9 through to T1..T9
   * XA..XZ and UA..UZ
   * @param code: the code to validate
   */
  public static function isValidCode(code:String):Boolean{
    return isRegularCode(code) or isOutOfSequenceCode(code)
  }

  /**
   * Check if a code is part of the Out Of Sequence codes (XA..XZ or UA..UZ)
   *
   * @param code Movement reference code
   * @return Is a out of sequence code
   */
  public static function isOutOfSequenceCode(code : String): Boolean {
    return code?.matches(OUT_OF_SEQUENCE_REGEX)
  }

  private static function isRegularCode(code: String): Boolean {
    return code?.matches(SEQUENCE_REGEX) or code?.matches(OVERFLOW_REGEX)
  }

  /**
   * Given a list of alphabets, convert a {@link java.lang.String} code to an {@link java.lang.Integer}.
   * By default, the Code corresponding to the first number returns 1, but this can be changed by changing the offset
   * parameter.
   *
   * Consider this example:
   * Convert the Code B4 to Integer, when the first character can take values between 'A' and 'T' and the second
   * character can take values between '2' and '5'.
   * This function should be called like so and should return 7:
   *
   * {@code convertCodeToSequence({'A'..'T', '2'..'5'}, "B4")}
   *
   * @param alphabets List of Alphabets, one for each character in code
   * @param code {@link java.lang.String} code to be converted to an {@link java.lang.Integer}
   * @param offset The first number of a given alphabet returns this number
   * @return Code converted to {@link java.lang.Integer}. If any character falls outside a given alphabet, returns null.
   *
   * @throws IllegalArgumentException When the number of alphabets doesn't match the Code length
   * @throws IndexOutOfBoundsException When a character in Code falls outside of the bounds of an alphabet
   */
  protected static function convertCodeToSequence(alphabets: IntegerInterval[], code: String, offset: Integer = 1) : Integer {
    if (code.length != alphabets.Count) {
      throw new IllegalArgumentException("The Code length should match the number of alphabets")
    }

    var count = offset

    alphabets.eachWithIndex(\alphabet, index -> {
      final var lastAlphabet = index == alphabets.Count - 1

      final var character = code.charAt(index)
      final var characterValue = alphabet.toHashMap().get(character)
      final var characterWeight = (lastAlphabet) ? 1 : alphabets[index + 1].Count

      if (characterValue == null) {
        throw new IndexOutOfBoundsException("Character out of bounds for alphabet")
      }

      count += characterValue * characterWeight
    })

    return count
  }
}