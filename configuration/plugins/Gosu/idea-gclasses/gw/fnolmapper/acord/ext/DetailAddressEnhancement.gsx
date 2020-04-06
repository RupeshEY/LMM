package gw.fnolmapper.acord.ext
uses java.lang.StringBuilder

@Export
enhancement DetailAddressEnhancement : xsd.acord.DetailAddr {
  //gets a display name suitable for address line
  property get DisplayName() : String {
    var sb = new StringBuilder()
    if(this.StreetNumber!=null)
      sb.append(this.StreetNumber + " ")
    if(this.PostDirectionCd_elem!=null)
      sb.append(this.PostDirectionCd_elem.$Text + " ")
    if(this.StreetName!=null)
      sb.append(this.StreetName + " ")
    if(this.StreetTypeCd!=null)
      sb.append(this.StreetTypeCd + " ")
    if(this.PostDirectionCd!=null)
      sb.append(this.PostDirectionCd + " ")
    if(this.UnitNumber!=null)
      sb.append(this.UnitNumber)
    return sb.toString().trim()
  }
}
