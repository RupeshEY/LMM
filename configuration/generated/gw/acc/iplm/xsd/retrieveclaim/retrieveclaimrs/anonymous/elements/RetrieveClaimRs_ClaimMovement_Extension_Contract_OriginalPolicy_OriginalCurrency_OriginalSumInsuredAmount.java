/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class RetrieveClaimRs_ClaimMovement_Extension_Contract_OriginalPolicy_OriginalCurrency_OriginalSumInsuredAmount extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "OriginalSumInsuredAmount", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.xchanging.com/retrieveClaim/rs/1", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Contract_OriginalPolicy_OriginalCurrency_OriginalSumInsuredAmount" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.simple.RetrieveClaimRs_ClaimMovement_Extension_Contract_OriginalPolicy_OriginalCurrency_OriginalSumInsuredAmount" );
    }
  };

  public RetrieveClaimRs_ClaimMovement_Extension_Contract_OriginalPolicy_OriginalCurrency_OriginalSumInsuredAmount() {
    super( 735029449, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.simple.RetrieveClaimRs_ClaimMovement_Extension_Contract_OriginalPolicy_OriginalCurrency_OriginalSumInsuredAmount() );
  }

  public RetrieveClaimRs_ClaimMovement_Extension_Contract_OriginalPolicy_OriginalCurrency_OriginalSumInsuredAmount( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.simple.RetrieveClaimRs_ClaimMovement_Extension_Contract_OriginalPolicy_OriginalCurrency_OriginalSumInsuredAmount typeInstance ) {
    super( 735029449, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private RetrieveClaimRs_ClaimMovement_Extension_Contract_OriginalPolicy_OriginalCurrency_OriginalSumInsuredAmount( gw.internal.xml.XmlElementState state ) {
    super( 735029449, state );
  }

  public RetrieveClaimRs_ClaimMovement_Extension_Contract_OriginalPolicy_OriginalCurrency_OriginalSumInsuredAmount( java.math.BigDecimal value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Contract_OriginalPolicy_OriginalCurrency_OriginalSumInsuredAmount> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.simple.RetrieveClaimRs_ClaimMovement_Extension_Contract_OriginalPolicy_OriginalCurrency_OriginalSumInsuredAmount get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.simple.RetrieveClaimRs_ClaimMovement_Extension_Contract_OriginalPolicy_OriginalCurrency_OriginalSumInsuredAmount.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.simple.RetrieveClaimRs_ClaimMovement_Extension_Contract_OriginalPolicy_OriginalCurrency_OriginalSumInsuredAmount typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getValue() {
    return (java.math.BigDecimal) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal get$Value() {
    return (java.math.BigDecimal) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "Value" );
  }

  public final void setValue( java.math.BigDecimal value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "Value", value );
  }

  public final void set$Value( java.math.BigDecimal value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "Value", value );
  }
}