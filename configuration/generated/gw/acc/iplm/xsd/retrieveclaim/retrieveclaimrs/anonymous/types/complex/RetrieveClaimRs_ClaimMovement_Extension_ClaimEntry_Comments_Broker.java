/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_Comments_Broker extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LineNumber = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "LineNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommentDetails = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "CommentDetails", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_Comments_Broker" );
    }
  };

  public RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_Comments_Broker() {
    super( -1064338980, TYPE.get() );
  }

  private RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_Comments_Broker( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1064338980, state );
  }

  protected RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_Comments_Broker( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_Comments_Broker( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_Comments_Broker> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_Comments_Broker get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigInteger getLineNumber() {
    return (java.math.BigInteger) TYPE.get().getPropertyValue( this, "_LineNumber" );
  }


  public final void setLineNumber( java.math.BigInteger value ) {
    TYPE.get().setPropertyValue( this, "_LineNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.LineNumber getLineNumber_elem() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.LineNumber) TYPE.get().getPropertyValue( this, "_LineNumber_elem" );
  }


  public final void setLineNumber_elem( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.LineNumber value ) {
    TYPE.get().setPropertyValue( this, "_LineNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCommentDetails() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CommentDetails" );
  }


  public final void setCommentDetails( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CommentDetails", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.CommentDetails getCommentDetails_elem() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.CommentDetails) TYPE.get().getPropertyValue( this, "_CommentDetails_elem" );
  }


  public final void setCommentDetails_elem( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.CommentDetails value ) {
    TYPE.get().setPropertyValue( this, "_CommentDetails_elem", value );
  }

}
