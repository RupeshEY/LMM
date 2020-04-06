package gw.plugin.policy.refresh.pc800

uses gw.plugin.policy.refresh.PolicyRefreshConfigurationBase
uses gw.api.policy.refresh.PolicyExtractor
uses gw.api.policy.refresh.pcintegration.PCPolicyGraph
uses gw.plugin.pcintegration.pc800.PolicySearchConverter
uses wsi.remote.gw.webservice.pc.pc800.entities.Envelope
uses gw.xsd.w3c.xmlschema.types.complex.Element
uses com.google.common.base.Joiner

/**
 * Policy refresh configuration for use when integrating with PolicyCenter 7.x. Automatically finds which types should
 * be considered during policy refresh by examining the XSD types in the PC integration web service.
 */
@Export
class PCPolicyRefreshConfiguration extends PolicyRefreshConfigurationBase {

  var _policyExtractor:PolicyExtractor

  construct() {
    var schema = wsi.remote.gw.webservice.pc.pc800.entities.util.SchemaAccess.Schema
    var rootComplexType = schema.ComplexType.firstWhere( \ ct -> ct.Name=="CCPolicy")
    var pcPolicyGraph = new PCPolicyGraph(schema,
        rootComplexType.$TypeInstance, NamespacePrefix, PolicySearchConverter.INSTANCE.NameMapper)
    _policyExtractor = new PolicyExtractor(pcPolicyGraph.TypeGraph)
  }

  override function getPolicyExtractor(policy : Policy) : PolicyExtractor {
    return _policyExtractor
  }

  private property get NamespacePrefix() : String {
    var nsElems = wsi.remote.gw.webservice.pc.pc800.entities.util.Type.Namespace.split("[.]")
    return Joiner.on(".").join(java.util.Arrays.copyOfRange(nsElems, 0, nsElems.length-1))
  }
}