/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "BulkClaimInformation", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.xchanging.com/retrieveClaim/rs/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NoOfItems = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "NoOfItems", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_HeaderUCR = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "HeaderUCR", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_HeaderTransactionReference = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "HeaderTransactionReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Component = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "Component", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation" );
    }
  };

  public RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation() {
    super( 1938373502, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation() );
  }

  public RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation typeInstance ) {
    super( 1938373502, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation( gw.internal.xml.XmlElementState state ) {
    super( 1938373502, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigInteger getNoOfItems() {
    return (java.math.BigInteger) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NoOfItems" );
  }


  public final void setNoOfItems( java.math.BigInteger value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NoOfItems", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation_NoOfItems getNoOfItems_elem() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation_NoOfItems) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NoOfItems_elem" );
  }


  public final void setNoOfItems_elem( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation_NoOfItems value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NoOfItems_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getHeaderUCR() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_HeaderUCR" );
  }


  public final void setHeaderUCR( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_HeaderUCR", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation_HeaderUCR getHeaderUCR_elem() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation_HeaderUCR) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_HeaderUCR_elem" );
  }


  public final void setHeaderUCR_elem( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation_HeaderUCR value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_HeaderUCR_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getHeaderTransactionReference() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_HeaderTransactionReference" );
  }


  public final void setHeaderTransactionReference( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_HeaderTransactionReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation_HeaderTransactionReference getHeaderTransactionReference_elem() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation_HeaderTransactionReference) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_HeaderTransactionReference_elem" );
  }


  public final void setHeaderTransactionReference_elem( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation_HeaderTransactionReference value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_HeaderTransactionReference_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation_Component> getComponent() {
    return (java.util.List<gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation_Component>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Component" );
  }


  public final void setComponent( java.util.List<gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation_Component> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Component", value );
  }

}