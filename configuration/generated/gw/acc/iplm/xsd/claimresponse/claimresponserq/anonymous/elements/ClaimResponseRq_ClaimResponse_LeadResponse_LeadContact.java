/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ClaimResponseRq_ClaimResponse_LeadResponse_LeadContact extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.xchanging.com/claimResponse/rq/1", "LeadContact", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.xchanging.com/claimResponse/rq/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PersonName = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PersonName", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Telephone = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Telephone", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Email = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Email", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.claimresponse.claimresponserq.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_LeadContact" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.claimresponse.claimresponserq.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.types.complex.ClaimResponseRq_ClaimResponse_LeadResponse_LeadContact" );
    }
  };

  public ClaimResponseRq_ClaimResponse_LeadResponse_LeadContact() {
    super( 868521530, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.types.complex.ClaimResponseRq_ClaimResponse_LeadResponse_LeadContact() );
  }

  public ClaimResponseRq_ClaimResponse_LeadResponse_LeadContact( gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.types.complex.ClaimResponseRq_ClaimResponse_LeadResponse_LeadContact typeInstance ) {
    super( 868521530, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ClaimResponseRq_ClaimResponse_LeadResponse_LeadContact( gw.internal.xml.XmlElementState state ) {
    super( 868521530, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_LeadContact> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.types.complex.ClaimResponseRq_ClaimResponse_LeadResponse_LeadContact get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.types.complex.ClaimResponseRq_ClaimResponse_LeadResponse_LeadContact.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.types.complex.ClaimResponseRq_ClaimResponse_LeadResponse_LeadContact typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPersonName() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PersonName" );
  }


  public final void setPersonName( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PersonName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PersonName getPersonName_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PersonName) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PersonName_elem" );
  }


  public final void setPersonName_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PersonName value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PersonName_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTelephone() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Telephone" );
  }


  public final void setTelephone( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Telephone", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Telephone getTelephone_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Telephone) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Telephone_elem" );
  }


  public final void setTelephone_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Telephone value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Telephone_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEmail() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Email" );
  }


  public final void setEmail( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Email", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Email getEmail_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Email) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Email_elem" );
  }


  public final void setEmail_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Email value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Email_elem", value );
  }
}