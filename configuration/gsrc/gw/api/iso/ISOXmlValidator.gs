package gw.api.iso

uses xsd.acord.ACORD

uses javax.xml.transform.Source

/**
 * Test utility for validating XML using ISO xsd schema.
 *
 * @author akurland
 */
@Export
class ISOXmlValidator
{
  static final var _validator : ISOXmlValidator as readonly Instance = new ISOXmlValidator()

  private construct() {
  }

  /**
   * Validates the given XML with the ISO schema.
   * @param xml The XML to validate
   * @throws gw.api.xml.XmlValidationFailedException If the XML validation fails
   * @throws AssertionError If something else went wrong trying to perform the validation
   * Use it like this for an XML string: isoXmlValidator.validate(new StreamSource(new StringReader(payload)));
   */
  function validate(xml : Source) {
    ACORD.parse(xml.toString()).validate()
  }
}
