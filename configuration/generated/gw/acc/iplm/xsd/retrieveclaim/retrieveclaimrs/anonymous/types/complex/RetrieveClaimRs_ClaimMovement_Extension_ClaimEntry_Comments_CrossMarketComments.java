/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_Comments_CrossMarketComments extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Bureau = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "Bureau", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_PrivateCommentIndicator = new javax.xml.namespace.QName( "", "PrivateCommentIndicator", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_Comments_CrossMarketComments" );
    }
  };

  public RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_Comments_CrossMarketComments() {
    super( 1713858957, TYPE.get() );
  }

  private RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_Comments_CrossMarketComments( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1713858957, state );
  }

  protected RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_Comments_CrossMarketComments( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_Comments_CrossMarketComments( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_Comments_CrossMarketComments> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_Comments_CrossMarketComments get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_Comments_CrossMarketComments_Bureau> getBureau() {
    return (java.util.List<gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_Comments_CrossMarketComments_Bureau>) TYPE.get().getPropertyValue( this, "_Bureau" );
  }


  public final void setBureau( java.util.List<gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_Comments_CrossMarketComments_Bureau> value ) {
    TYPE.get().setPropertyValue( this, "_Bureau", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.enums.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_Comments_CrossMarketComments_PrivateCommentIndicator getPrivateCommentIndicator() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.enums.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_Comments_CrossMarketComments_PrivateCommentIndicator) TYPE.get().getPropertyValue( this, "_PrivateCommentIndicator" );
  }


  public final void setPrivateCommentIndicator( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.enums.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_Comments_CrossMarketComments_PrivateCommentIndicator value ) {
    TYPE.get().setPropertyValue( this, "_PrivateCommentIndicator", value );
  }

}