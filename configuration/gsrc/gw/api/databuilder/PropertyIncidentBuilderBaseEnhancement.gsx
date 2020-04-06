package gw.api.databuilder

@Export
enhancement PropertyIncidentBuilderBaseEnhancement<T extends PropertyIncident, B extends PropertyIncidentBuilderBase<T, B>> : gw.api.databuilder.PropertyIncidentBuilderBase<T, B>
{
  public function withPropertyDesc(desc : String) : B {
    this.set(PropertyIncident.Type.TypeInfo.getProperty( "propertyDesc" ), desc)
    return this.thisAsB()
  }
  
  public function withLodgingProvider(lodgingProvider : ValueGenerator< LodgingProvider >) : B {
    this.addArrayElement(T#LodgingProviders, lodgingProvider);
    return this.thisAsB();
  }
}
