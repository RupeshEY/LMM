/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class RetrieveClaimRs_ClaimMovement_Extension_Contract_OriginalPolicy_OriginalCurrency extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "OriginalCurrency", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.xchanging.com/retrieveClaim/rs/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Ccy = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "Ccy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OriginalSumInsuredAmount = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "OriginalSumInsuredAmount", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OriginalExcessAmount = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "OriginalExcessAmount", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Contract_OriginalPolicy_OriginalCurrency" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_ClaimMovement_Extension_Contract_OriginalPolicy_OriginalCurrency" );
    }
  };

  public RetrieveClaimRs_ClaimMovement_Extension_Contract_OriginalPolicy_OriginalCurrency() {
    super( -1925648962, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_ClaimMovement_Extension_Contract_OriginalPolicy_OriginalCurrency() );
  }

  public RetrieveClaimRs_ClaimMovement_Extension_Contract_OriginalPolicy_OriginalCurrency( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_ClaimMovement_Extension_Contract_OriginalPolicy_OriginalCurrency typeInstance ) {
    super( -1925648962, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private RetrieveClaimRs_ClaimMovement_Extension_Contract_OriginalPolicy_OriginalCurrency( gw.internal.xml.XmlElementState state ) {
    super( -1925648962, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Contract_OriginalPolicy_OriginalCurrency> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_ClaimMovement_Extension_Contract_OriginalPolicy_OriginalCurrency get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_ClaimMovement_Extension_Contract_OriginalPolicy_OriginalCurrency.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_ClaimMovement_Extension_Contract_OriginalPolicy_OriginalCurrency typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCcy() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Ccy" );
  }


  public final void setCcy( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Ccy", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Contract_OriginalPolicy_OriginalCurrency_Ccy getCcy_elem() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Contract_OriginalPolicy_OriginalCurrency_Ccy) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Ccy_elem" );
  }


  public final void setCcy_elem( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Contract_OriginalPolicy_OriginalCurrency_Ccy value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Ccy_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getOriginalSumInsuredAmount() {
    return (java.math.BigDecimal) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OriginalSumInsuredAmount" );
  }


  public final void setOriginalSumInsuredAmount( java.math.BigDecimal value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OriginalSumInsuredAmount", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Contract_OriginalPolicy_OriginalCurrency_OriginalSumInsuredAmount getOriginalSumInsuredAmount_elem() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Contract_OriginalPolicy_OriginalCurrency_OriginalSumInsuredAmount) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OriginalSumInsuredAmount_elem" );
  }


  public final void setOriginalSumInsuredAmount_elem( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Contract_OriginalPolicy_OriginalCurrency_OriginalSumInsuredAmount value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OriginalSumInsuredAmount_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getOriginalExcessAmount() {
    return (java.math.BigDecimal) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OriginalExcessAmount" );
  }


  public final void setOriginalExcessAmount( java.math.BigDecimal value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OriginalExcessAmount", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Contract_OriginalPolicy_OriginalCurrency_OriginalExcessAmount getOriginalExcessAmount_elem() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Contract_OriginalPolicy_OriginalCurrency_OriginalExcessAmount) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OriginalExcessAmount_elem" );
  }


  public final void setOriginalExcessAmount_elem( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Contract_OriginalPolicy_OriginalCurrency_OriginalExcessAmount value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OriginalExcessAmount_elem", value );
  }
}