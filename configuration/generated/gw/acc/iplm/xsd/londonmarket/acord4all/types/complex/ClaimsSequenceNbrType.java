/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.londonmarket.acord4all.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ClaimsSequenceNbrType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.xchanging.com/ACORD4ALLEDI/xml", "ClaimsSequenceNbr_type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.xchanging.com/ACORD4ALLEDI/xml", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Count = new javax.xml.namespace.QName( "http://www.xchanging.com/ACORD4ALLEDI/xml", "Count", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.acord4all.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.acord4all.types.complex.ClaimsSequenceNbrType" );
    }
  };

  public ClaimsSequenceNbrType() {
    super( 1313630289, TYPE.get() );
  }

  private ClaimsSequenceNbrType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1313630289, state );
  }

  protected ClaimsSequenceNbrType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ClaimsSequenceNbrType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.londonmarket.acord4all.types.complex.ClaimsSequenceNbrType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.londonmarket.acord4all.types.complex.ClaimsSequenceNbrType get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getCount() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_Count" );
  }


  public final void setCount( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_Count", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.acord4all.Count getCount_elem() {
    return (gw.acc.iplm.xsd.londonmarket.acord4all.Count) TYPE.get().getPropertyValue( this, "_Count_elem" );
  }


  public final void setCount_elem( gw.acc.iplm.xsd.londonmarket.acord4all.Count value ) {
    TYPE.get().setPropertyValue( this, "_Count_elem", value );
  }

}
