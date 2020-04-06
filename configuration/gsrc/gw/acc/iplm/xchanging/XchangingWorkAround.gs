package gw.acc.iplm.xchanging

uses gw.acc.iplm.dto.XchangingFixParamDTO
uses gw.xml.XmlElement

/**
 * This interface has worked around method for known issues with in Xchanging.
 */
interface XchangingWorkAround {
  public function xchangingFix(xchangingFixDTO: XchangingFixParamDTO): XmlElement
}