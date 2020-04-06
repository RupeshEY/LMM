package gw.api.databuilder

@Export
enhancement MobilePropertyIncidentBuilderBaseEnhancement<T extends MobilePropertyIncident, B extends MobilePropertyIncidentBuilderBase<T,B>> : gw.api.databuilder.MobilePropertyIncidentBuilderBase<T, B>
{
  public function withLocationAddress(address : AddressBuilder) : B {
    this.set(MobilePropertyIncident.Type.TypeInfo.getProperty( "LocationAddress" ), address)
    return this.thisAsB()
  }
}
