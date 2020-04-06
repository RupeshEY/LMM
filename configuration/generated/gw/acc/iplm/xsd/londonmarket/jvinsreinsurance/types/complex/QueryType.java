/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class QueryType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "QueryType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_QueryDescription = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "QueryDescription", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_QueryIndicator = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "QueryIndicator", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.QueryType" );
    }
  };

  public QueryType() {
    super( -1960556288, TYPE.get() );
  }

  private QueryType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1960556288, state );
  }

  protected QueryType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected QueryType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.QueryType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.QueryType get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getQueryDescription() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_QueryDescription" );
  }


  public final void setQueryDescription( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_QueryDescription", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.QueryDescription getQueryDescription_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.QueryDescription) TYPE.get().getPropertyValue( this, "_QueryDescription_elem" );
  }


  public final void setQueryDescription_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.QueryDescription value ) {
    TYPE.get().setPropertyValue( this, "_QueryDescription_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getQueryIndicator() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_QueryIndicator" );
  }


  public final void setQueryIndicator( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_QueryIndicator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.QueryIndicator getQueryIndicator_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.QueryIndicator) TYPE.get().getPropertyValue( this, "_QueryIndicator_elem" );
  }


  public final void setQueryIndicator_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.QueryIndicator value ) {
    TYPE.get().setPropertyValue( this, "_QueryIndicator_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.QueryType_Extension getExtension() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.QueryType_Extension) TYPE.get().getPropertyValue( this, "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.QueryType_Extension value ) {
    TYPE.get().setPropertyValue( this, "_Extension", value );
  }

}