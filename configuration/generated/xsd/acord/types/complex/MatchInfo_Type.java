/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class MatchInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "MatchInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumMatches = new javax.xml.namespace.QName( "", "NumMatches", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumPersonMatches = new javax.xml.namespace.QName( "", "NumPersonMatches", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumVehMatches = new javax.xml.namespace.QName( "", "NumVehMatches", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AdditionalMatchInfo = new javax.xml.namespace.QName( "", "AdditionalMatchInfo", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.MatchInfo_Type" );
    }
  };

  public MatchInfo_Type() {
    super( 69971341, TYPE.get() );
  }

  private MatchInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 69971341, state );
  }

  protected MatchInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected MatchInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.MatchInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.MatchInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumMatches() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumMatches" );
  }


  public final void setNumMatches( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumMatches", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumMatches getNumMatches_elem() {
    return (xsd.acord.NumMatches) TYPE.get().getPropertyValue( this, "_NumMatches_elem" );
  }


  public final void setNumMatches_elem( xsd.acord.NumMatches value ) {
    TYPE.get().setPropertyValue( this, "_NumMatches_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumPersonMatches() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumPersonMatches" );
  }


  public final void setNumPersonMatches( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumPersonMatches", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumPersonMatches getNumPersonMatches_elem() {
    return (xsd.acord.NumPersonMatches) TYPE.get().getPropertyValue( this, "_NumPersonMatches_elem" );
  }


  public final void setNumPersonMatches_elem( xsd.acord.NumPersonMatches value ) {
    TYPE.get().setPropertyValue( this, "_NumPersonMatches_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumVehMatches() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumVehMatches" );
  }


  public final void setNumVehMatches( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumVehMatches", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumVehMatches getNumVehMatches_elem() {
    return (xsd.acord.NumVehMatches) TYPE.get().getPropertyValue( this, "_NumVehMatches_elem" );
  }


  public final void setNumVehMatches_elem( xsd.acord.NumVehMatches value ) {
    TYPE.get().setPropertyValue( this, "_NumVehMatches_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.AdditionalMatchInfo> getAdditionalMatchInfo() {
    return (java.util.List<xsd.acord.AdditionalMatchInfo>) TYPE.get().getPropertyValue( this, "_AdditionalMatchInfo" );
  }


  public final void setAdditionalMatchInfo( java.util.List<xsd.acord.AdditionalMatchInfo> value ) {
    TYPE.get().setPropertyValue( this, "_AdditionalMatchInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Id", value );
  }

}