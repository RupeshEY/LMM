/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.claim.claimapi.enums;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
public enum NameSuffix implements gw.xml.IXmlSchemaEnumValue {
  Jr( "jr" ),
  Sr( "sr" ),
  C_Ir( "c_Ir" ),
  C_II( "c_II" ),
  C_III( "c_III" ),
  C_IV( "c_IV" ),
  C_md( "c_md" ),
  C_phd( "c_phd" ),
  C_do( "c_do" ),
  Esq( "esq" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlEnumerationTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlEnumerationTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlEnumerationTypeDataImpl init() {
      return (gw.internal.xml.XmlEnumerationTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.claim.claimapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.claim.claimapi.enums.NameSuffix" );
    }
  };

  private final java.lang.String _stringValue;

  private NameSuffix( java.lang.String stringValue ) {
    _stringValue = stringValue;
  }

  public static final wsi.local.gw.webservice.cc.cc900.claim.claimapi.enums.NameSuffix forValue( java.lang.String value ) {
    return (wsi.local.gw.webservice.cc.cc900.claim.claimapi.enums.NameSuffix) TYPE.get().cg_forValue( value );
  } // xmlRefactorRemove

  public static final wsi.local.gw.webservice.cc.cc900.claim.claimapi.enums.NameSuffix forGosuValue( java.lang.String value ) {
    return (wsi.local.gw.webservice.cc.cc900.claim.claimapi.enums.NameSuffix) TYPE.get().cg_forValue( value );
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
