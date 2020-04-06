package gw.entity
uses gw.api.privacy.EncryptionMaskExpressions

@Export
enhancement GWContactPrivacyEnhancement : entity.Contact {
  
  function maskTaxId(taxId :  String) : String {
    return EncryptionMaskExpressions.maskTaxId(taxId)
  }
  
}
