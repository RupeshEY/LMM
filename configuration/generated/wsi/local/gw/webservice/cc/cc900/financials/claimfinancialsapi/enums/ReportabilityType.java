/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.enums;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
public enum ReportabilityType implements gw.xml.IXmlSchemaEnumValue {
  Notreportable( "notreportable" ),
  Reportable( "reportable" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlEnumerationTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlEnumerationTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlEnumerationTypeDataImpl init() {
      return (gw.internal.xml.XmlEnumerationTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.enums.ReportabilityType" );
    }
  };

  private final java.lang.String _stringValue;

  private ReportabilityType( java.lang.String stringValue ) {
    _stringValue = stringValue;
  }

  public static final wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.enums.ReportabilityType forValue( java.lang.String value ) {
    return (wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.enums.ReportabilityType) TYPE.get().cg_forValue( value );
  } // xmlRefactorRemove

  public static final wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.enums.ReportabilityType forGosuValue( java.lang.String value ) {
    return (wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.enums.ReportabilityType) TYPE.get().cg_forValue( value );
  }

  @java.lang.Override
  public final gw.xml.XmlSimpleValue getSimpleValue() {
    return TYPE.get().getEnumSimpleValue( this );
  } // xmlRefactorRemove

  @java.lang.Override
  public final java.lang.String getStringValue() {
    return _stringValue; // xmlRefactorRemove
  } // xmlRefactorRemove

  @java.lang.Override
  public final java.lang.String getSerializedValue() {
    return _stringValue;
  }

  @java.lang.Override
  public final java.lang.String getValue() {
    return (java.lang.String) TYPE.get().getEnumSimpleValue( this ).getValue();
  } // xmlRefactorRemove

  @java.lang.Override
  public final java.lang.String getGosuValue() {
    return (java.lang.String) TYPE.get().getEnumSimpleValue( this ).getValue();
  }

  @java.lang.Override
  public final String getCode() {
    return name();
  }

  @java.lang.Override
  public final int getOrdinal() {
    return ordinal();
  }

  @java.lang.Override
  public final String toString() {
    return _stringValue;
  }

}
