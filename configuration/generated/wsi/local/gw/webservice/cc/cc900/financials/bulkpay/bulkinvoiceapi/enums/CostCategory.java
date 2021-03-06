/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.enums;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
public enum CostCategory implements gw.xml.IXmlSchemaEnumValue {
  Unspecified( "unspecified" ),
  Addnl_living_expenses( "addnl_living_expenses" ),
  Body( "body" ),
  Autoparts( "autoparts" ),
  Baggage( "baggage" ),
  Burial( "burial" ),
  Casemgmt( "casemgmt" ),
  Contents( "contents" ),
  Death( "death" ),
  Ems( "ems" ),
  Autoglass( "autoglass" ),
  Indemnity( "indemnity" ),
  Labor( "labor" ),
  Legal( "legal" ),
  Lifetime( "lifetime" ),
  Lostwages( "lostwages" ),
  Medical( "medical" ),
  Mileage( "mileage" ),
  Wcmileage( "wcmileage" ),
  Other( "other" ),
  Ppd( "ppd" ),
  Ptd( "ptd" ),
  Property_inspection( "property_inspection" ),
  Property_repair( "property_repair" ),
  Reimbursement( "reimbursement" ),
  Rental( "rental" ),
  Salvage( "salvage" ),
  Settlement( "settlement" ),
  Supplemental( "supplemental" ),
  Tpd( "tpd" ),
  Ttd( "ttd" ),
  Towing( "towing" ),
  Trip_cancel_delay( "trip_cancel_delay" ),
  Autoappraisal( "autoappraisal" ),
  Inspection( "inspection" ),
  Vocational( "vocational" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlEnumerationTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlEnumerationTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlEnumerationTypeDataImpl init() {
      return (gw.internal.xml.XmlEnumerationTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.enums.CostCategory" );
    }
  };

  private final java.lang.String _stringValue;

  private CostCategory( java.lang.String stringValue ) {
    _stringValue = stringValue;
  }

  public static final wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.enums.CostCategory forValue( java.lang.String value ) {
    return (wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.enums.CostCategory) TYPE.get().cg_forValue( value );
  } // xmlRefactorRemove

  public static final wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.enums.CostCategory forGosuValue( java.lang.String value ) {
    return (wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.enums.CostCategory) TYPE.get().cg_forValue( value );
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
