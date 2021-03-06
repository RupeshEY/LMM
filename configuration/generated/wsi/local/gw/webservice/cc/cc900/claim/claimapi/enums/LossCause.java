/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.claim.claimapi.enums;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
public enum LossCause implements gw.xml.IXmlSchemaEnumValue {
  Abandonment( "abandonment" ),
  Animal( "animal" ),
  Animal_bite( "animal_bite" ),
  Assault( "assault" ),
  Breach( "breach" ),
  Broken_glass( "broken_glass" ),
  Burglary( "burglary" ),
  Burn_scald( "burn_scald" ),
  Cancellation( "cancellation" ),
  Caught_in( "caught_in" ),
  Leftcollision( "leftcollision" ),
  Bikecollision( "bikecollision" ),
  Fixedobjcoll( "fixedobjcoll" ),
  Vehcollision( "vehcollision" ),
  Otherobjcoll( "otherobjcoll" ),
  Pedcollision( "pedcollision" ),
  Trainbuscoll( "trainbuscoll" ),
  Electrical_curr( "electrical_curr" ),
  Air_crash( "air_crash" ),
  Rail_crash( "rail_crash" ),
  Water_veh_crash( "water_veh_crash" ),
  Cut( "cut" ),
  Loadingdamage( "loadingdamage" ),
  Death( "death" ),
  Delay( "delay" ),
  Documents( "documents" ),
  Earthquake( "earthquake" ),
  Errors( "errors" ),
  Excess( "excess" ),
  Explosion( "explosion" ),
  Fall( "fall" ),
  FallingObject( "FallingObject" ),
  Construction( "construction" ),
  Fire( "fire" ),
  Glassbreakage( "glassbreakage" ),
  Hail( "hail" ),
  Vandalism( "vandalism" ),
  Official_duty( "official_duty" ),
  Med_error( "med_error" ),
  Miscellaneous( "miscellaneous" ),
  Missed_departure( "missed_departure" ),
  Mold( "mold" ),
  Motorvehicle( "motorvehicle" ),
  Personal_misconduct( "personal_misconduct" ),
  Preex_med_condition( "preex_med_condition" ),
  Product( "product" ),
  Professional_sports( "professional_sports" ),
  Rearend( "rearend" ),
  Riotandcivil( "riotandcivil" ),
  Rollover( "rollover" ),
  Rubbed( "rubbed" ),
  Snowice( "snowice" ),
  Strain( "strain" ),
  Striking( "striking" ),
  Struck( "struck" ),
  Structfailure( "structfailure" ),
  Terrorism_hijack( "terrorism_hijack" ),
  Theftparts( "theftparts" ),
  Theftentire( "theftentire" ),
  Waterdamage( "waterdamage" ),
  Wind( "wind" ),
  Animalcollision( "animalcollision" ),
  Firedamage( "firedamage" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlEnumerationTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlEnumerationTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlEnumerationTypeDataImpl init() {
      return (gw.internal.xml.XmlEnumerationTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.claim.claimapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.claim.claimapi.enums.LossCause" );
    }
  };

  private final java.lang.String _stringValue;

  private LossCause( java.lang.String stringValue ) {
    _stringValue = stringValue;
  }

  public static final wsi.local.gw.webservice.cc.cc900.claim.claimapi.enums.LossCause forValue( java.lang.String value ) {
    return (wsi.local.gw.webservice.cc.cc900.claim.claimapi.enums.LossCause) TYPE.get().cg_forValue( value );
  } // xmlRefactorRemove

  public static final wsi.local.gw.webservice.cc.cc900.claim.claimapi.enums.LossCause forGosuValue( java.lang.String value ) {
    return (wsi.local.gw.webservice.cc.cc900.claim.claimapi.enums.LossCause) TYPE.get().cg_forValue( value );
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
