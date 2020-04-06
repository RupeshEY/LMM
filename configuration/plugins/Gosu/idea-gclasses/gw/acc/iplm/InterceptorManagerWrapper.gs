package gw.acc.iplm

uses gw.xml.XmlElement

uses javax.xml.soap.SOAPMessage

class InterceptorManagerWrapper {

  public function intercept(request: XmlElement) {
    InterceptorManager.intercept(request)
  }

  public function intercept(request: SOAPMessage) {
    InterceptorManager.intercept(request)
  }

  public function intercept(request: javax.jms.Message) {
    InterceptorManager.intercept(request)
  }

  public function intercept(messageEntity: entity.LMMessage_Ext) {
    InterceptorManager.intercept(messageEntity)
  }
}