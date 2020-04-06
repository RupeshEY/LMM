package gw.acc.iplm.config

uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.ECFUtils
uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Party
uses org.w3c.dom.Node

uses javax.xml.parsers.DocumentBuilderFactory

/**
 * This Class loads data from iplm-company-config.xml file and create each array for Lirma, Lloyd's and ILU
 * with membership information such as syndicate Id, name and Bureau.
 */
class LMCompaniesDataLoader {

  private static var _companies: List<Party>

  construct() {
    _companies = getPreconfiguredParties()
  }

  property get LloydsCompanies(): List<Party> {
    return _companies.where(\company -> company.FirstAgency.equalsIgnoreCase(ECFBureauType_Ext.TC_LLOYDS.Code))
  }

  property get LirmaCompanies(): List<Party> {
    return _companies.where(\company -> company.FirstAgency.equalsIgnoreCase(ECFBureauType_Ext.TC_LIRMA.Code))
  }

  property get ILUCompanies(): List<Party> {
    return _companies.where(\company -> company.FirstAgency.equalsIgnoreCase(ECFBureauType_Ext.TC_ILU.Code))
  }

  property get AllCompanies(): List<Party> {
    return _companies
  }

  private function getPreconfiguredParties(): List<Party> {
    var documentFactory = DocumentBuilderFactory.newInstance()
    var documentBuilder = documentFactory.newDocumentBuilder()
    var document = documentBuilder.parse(ECFConstants.ECF_COMPANY_CONFIG)
    document.getDocumentElement().normalize()
    var nodesList = document.getElementsByTagName(ECFConstants.COMPANY_PARENT_NODE)
    return getParties(ECFUtils.getChildNodes(nodesList))
  }


  private function getParties(nodes: List<Node>): List<Party> {
    var parties = new ArrayList<Party>()
    for (node in nodes) {
      var childNodes = ECFUtils.getChildNodes(node.ChildNodes)
      var party = new Party()
      var id = new ArrayList<String>()
      id.add(childNodes.firstWhere(\elt -> elt.NodeName == ECFConstants.ID_CHILD_NODE).getTextContent())
      party.Id = id
      party.Name = childNodes.firstWhere(\elt -> elt.NodeName == ECFConstants.NAME_CHILD_NODE).getTextContent()
      party.Id_elem.first().Agency = node.getAttributes().getNamedItem(ECFConstants.BUREAU_ATTRIBUTE).getTextContent()
      parties.add(party)
    }
    return parties
  }

}