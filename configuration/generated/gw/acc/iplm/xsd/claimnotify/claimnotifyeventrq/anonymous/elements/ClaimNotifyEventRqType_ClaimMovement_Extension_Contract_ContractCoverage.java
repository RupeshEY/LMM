/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractCoverage extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "ContractCoverage", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.xchanging.com/claimnotify/rq/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoverageAmount = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "CoverageAmount", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoverageAmount2 = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CoverageAmount", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Description = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Description", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumberOfLines = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "NumberOfLines", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoveragePercentage = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CoveragePercentage", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoverageBasis = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CoverageBasis", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoverageBasisDescription = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CoverageBasisDescription", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoverageSubjectMatter = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CoverageSubjectMatter", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoverageSubjectMatterDescription = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CoverageSubjectMatterDescription", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumberOfUnits = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "NumberOfUnits", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_CoverageType = new javax.xml.namespace.QName( "", "CoverageType", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractCoverage" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractCoverage" );
    }
  };

  public ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractCoverage() {
    super( -779507065, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractCoverage() );
  }

  public ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractCoverage( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractCoverage typeInstance ) {
    super( -779507065, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractCoverage( gw.internal.xml.XmlElementState state ) {
    super( -779507065, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractCoverage> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractCoverage get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractCoverage.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractCoverage typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractCoverage_CoverageAmount> getCoverageAmount() {
    return (java.util.List<gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractCoverage_CoverageAmount>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CoverageAmount" );
  }


  public final void setCoverageAmount( java.util.List<gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractCoverage_CoverageAmount> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CoverageAmount", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CoverageAmount getCoverageAmount2() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CoverageAmount) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CoverageAmount2" );
  }


  public final void setCoverageAmount2( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CoverageAmount value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CoverageAmount2", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDescription() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Description" );
  }


  public final void setDescription( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Description", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Description getDescription_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Description) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Description_elem" );
  }


  public final void setDescription_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Description value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Description_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.NumberOfLines getNumberOfLines() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.NumberOfLines) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumberOfLines" );
  }


  public final void setNumberOfLines( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.NumberOfLines value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumberOfLines", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CoveragePercentage getCoveragePercentage() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CoveragePercentage) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CoveragePercentage" );
  }


  public final void setCoveragePercentage( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CoveragePercentage value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CoveragePercentage", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCoverageBasis() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CoverageBasis" );
  }


  public final void setCoverageBasis( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CoverageBasis", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CoverageBasis getCoverageBasis_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CoverageBasis) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CoverageBasis_elem" );
  }


  public final void setCoverageBasis_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CoverageBasis value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CoverageBasis_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCoverageBasisDescription() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CoverageBasisDescription" );
  }


  public final void setCoverageBasisDescription( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CoverageBasisDescription", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CoverageBasisDescription getCoverageBasisDescription_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CoverageBasisDescription) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CoverageBasisDescription_elem" );
  }


  public final void setCoverageBasisDescription_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CoverageBasisDescription value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CoverageBasisDescription_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CoverageSubjectMatter getCoverageSubjectMatter() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CoverageSubjectMatter) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CoverageSubjectMatter" );
  }


  public final void setCoverageSubjectMatter( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CoverageSubjectMatter value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CoverageSubjectMatter", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCoverageSubjectMatterDescription() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CoverageSubjectMatterDescription" );
  }


  public final void setCoverageSubjectMatterDescription( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CoverageSubjectMatterDescription", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CoverageSubjectMatterDescription getCoverageSubjectMatterDescription_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CoverageSubjectMatterDescription) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CoverageSubjectMatterDescription_elem" );
  }


  public final void setCoverageSubjectMatterDescription_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CoverageSubjectMatterDescription value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CoverageSubjectMatterDescription_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.NumberOfUnits getNumberOfUnits() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.NumberOfUnits) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumberOfUnits" );
  }


  public final void setNumberOfUnits( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.NumberOfUnits value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumberOfUnits", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.ContractCoverageType_Extension getExtension() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.ContractCoverageType_Extension) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.ContractCoverageType_Extension value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Extension", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCoverageType() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CoverageType" );
  }


  public final void setCoverageType( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CoverageType", value );
  }
}
