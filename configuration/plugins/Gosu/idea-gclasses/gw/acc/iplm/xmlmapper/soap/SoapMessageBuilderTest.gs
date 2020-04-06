package gw.acc.iplm.xmlmapper.soap

uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.PostRq
uses gw.testharness.v3.GUnitTestClass
uses org.w3c.dom.Node

uses javax.xml.transform.TransformerFactory
uses javax.xml.transform.dom.DOMSource
uses javax.xml.transform.stream.StreamResult
uses java.io.StringWriter

class SoapMessageBuilderTest extends GUnitTestClass {

  function testPostRqWrappedInEnvelope(){
    var postRq = ECFMessageUtil.createNewPostRq()
    var builder = new SoapMessageBuilder(postRq)
    var soapMessage = builder.createSoapMessage()

    assertNotNull("No SOAP Header", soapMessage.SOAPHeader)
    assertNotNull("No SOAP Body", soapMessage.SOAPBody)

    var postRqNode = soapMessage.SOAPBody.ChildNodes.item(0)
    assertEquals(postRq.asUTFString(), PostRq.parse(convertNodeToString(postRqNode)).asUTFString())
  }

  private static function convertNodeToString(node: Node): String {
    var stringWriter = new StringWriter()
    TransformerFactory.newInstance().newTransformer().transform(new DOMSource(node), new StreamResult(stringWriter))
    return stringWriter.toString()
  }
}