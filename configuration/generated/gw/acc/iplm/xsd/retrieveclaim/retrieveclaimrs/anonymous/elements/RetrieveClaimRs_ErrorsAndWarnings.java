/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class RetrieveClaimRs_ErrorsAndWarnings extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "ErrorsAndWarnings", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.xchanging.com/retrieveClaim/rs/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Result = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "Result", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ErrorsAndWarnings" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_ErrorsAndWarnings" );
    }
  };

  public RetrieveClaimRs_ErrorsAndWarnings() {
    super( -429950358, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_ErrorsAndWarnings() );
  }

  public RetrieveClaimRs_ErrorsAndWarnings( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_ErrorsAndWarnings typeInstance ) {
    super( -429950358, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private RetrieveClaimRs_ErrorsAndWarnings( gw.internal.xml.XmlElementState state ) {
    super( -429950358, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ErrorsAndWarnings> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_ErrorsAndWarnings get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_ErrorsAndWarnings.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_ErrorsAndWarnings typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ErrorsAndWarnings_Result> getResult() {
    return (java.util.List<gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ErrorsAndWarnings_Result>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Result" );
  }


  public final void setResult( java.util.List<gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ErrorsAndWarnings_Result> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Result", value );
  }

}
