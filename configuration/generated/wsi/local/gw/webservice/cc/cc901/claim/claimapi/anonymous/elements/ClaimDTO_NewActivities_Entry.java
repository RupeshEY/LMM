/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ClaimDTO_NewActivities_Entry extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/ClaimDTO", "Entry", "pogo6" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/ClaimDTO", "pogo6" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ActivityClass = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/ActivityDTO", "ActivityClass", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ActivityPatternPublicID = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/ActivityDTO", "ActivityPatternPublicID", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ActivityStatus = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/ActivityDTO", "ActivityStatus", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ApprovalIssue = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/ActivityDTO", "ApprovalIssue", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AssignedGroupPublicID = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/ActivityDTO", "AssignedGroupPublicID", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AssignedUserPublicID = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/ActivityDTO", "AssignedUserPublicID", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimPublicID = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/ActivityDTO", "ClaimPublicID", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimantPublicID = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/ActivityDTO", "ClaimantPublicID", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CreateTime = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/ActivityDTO", "CreateTime", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CreateUserPublicID = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/ActivityDTO", "CreateUserPublicID", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Description = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/ActivityDTO", "Description", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExposurePublicID = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/ActivityDTO", "ExposurePublicID", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NewNotes = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/ActivityDTO", "NewNotes", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PublicID = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/ActivityDTO", "PublicID", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Subject = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/ActivityDTO", "Subject", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Type = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/ActivityDTO", "Type", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_UpdateTime = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/ActivityDTO", "UpdateTime", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_UpdateUserPublicID = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/ActivityDTO", "UpdateUserPublicID", "pogo" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc901.claim.claimapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ClaimDTO_NewActivities_Entry" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc901.claim.claimapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc901.claim.claimapi.types.complex.ActivityDTO" );
    }
  };

  public ClaimDTO_NewActivities_Entry() {
    super( 1877576043, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.webservice.cc.cc901.claim.claimapi.types.complex.ActivityDTO() );
  }

  public ClaimDTO_NewActivities_Entry( wsi.local.gw.webservice.cc.cc901.claim.claimapi.types.complex.ActivityDTO typeInstance ) {
    super( 1877576043, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ClaimDTO_NewActivities_Entry( gw.internal.xml.XmlElementState state ) {
    super( 1877576043, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ClaimDTO_NewActivities_Entry> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.types.complex.ActivityDTO get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.webservice.cc.cc901.claim.claimapi.types.complex.ActivityDTO.class );
  }

  public final void set$TypeInstance( wsi.local.gw.webservice.cc.cc901.claim.claimapi.types.complex.ActivityDTO typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.enums.ActivityClass getActivityClass() {
    return (wsi.local.gw.webservice.cc.cc901.claim.claimapi.enums.ActivityClass) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ActivityClass" );
  }


  public final void setActivityClass( wsi.local.gw.webservice.cc.cc901.claim.claimapi.enums.ActivityClass value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ActivityClass", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_ActivityClass getActivityClass_elem() {
    return (wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_ActivityClass) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ActivityClass_elem" );
  }


  public final void setActivityClass_elem( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_ActivityClass value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ActivityClass_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getActivityPatternPublicID() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ActivityPatternPublicID" );
  }


  public final void setActivityPatternPublicID( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ActivityPatternPublicID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_ActivityPatternPublicID getActivityPatternPublicID_elem() {
    return (wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_ActivityPatternPublicID) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ActivityPatternPublicID_elem" );
  }


  public final void setActivityPatternPublicID_elem( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_ActivityPatternPublicID value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ActivityPatternPublicID_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getActivityStatus() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ActivityStatus" );
  }


  public final void setActivityStatus( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ActivityStatus", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_ActivityStatus getActivityStatus_elem() {
    return (wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_ActivityStatus) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ActivityStatus_elem" );
  }


  public final void setActivityStatus_elem( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_ActivityStatus value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ActivityStatus_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getApprovalIssue() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ApprovalIssue" );
  }


  public final void setApprovalIssue( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ApprovalIssue", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_ApprovalIssue getApprovalIssue_elem() {
    return (wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_ApprovalIssue) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ApprovalIssue_elem" );
  }


  public final void setApprovalIssue_elem( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_ApprovalIssue value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ApprovalIssue_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAssignedGroupPublicID() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AssignedGroupPublicID" );
  }


  public final void setAssignedGroupPublicID( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AssignedGroupPublicID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_AssignedGroupPublicID getAssignedGroupPublicID_elem() {
    return (wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_AssignedGroupPublicID) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AssignedGroupPublicID_elem" );
  }


  public final void setAssignedGroupPublicID_elem( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_AssignedGroupPublicID value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AssignedGroupPublicID_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAssignedUserPublicID() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AssignedUserPublicID" );
  }


  public final void setAssignedUserPublicID( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AssignedUserPublicID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_AssignedUserPublicID getAssignedUserPublicID_elem() {
    return (wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_AssignedUserPublicID) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AssignedUserPublicID_elem" );
  }


  public final void setAssignedUserPublicID_elem( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_AssignedUserPublicID value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AssignedUserPublicID_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getClaimPublicID() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimPublicID" );
  }


  public final void setClaimPublicID( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimPublicID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_ClaimPublicID getClaimPublicID_elem() {
    return (wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_ClaimPublicID) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimPublicID_elem" );
  }


  public final void setClaimPublicID_elem( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_ClaimPublicID value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimPublicID_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getClaimantPublicID() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimantPublicID" );
  }


  public final void setClaimantPublicID( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimantPublicID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_ClaimantPublicID getClaimantPublicID_elem() {
    return (wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_ClaimantPublicID) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimantPublicID_elem" );
  }


  public final void setClaimantPublicID_elem( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_ClaimantPublicID value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimantPublicID_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getCreateTime() {
    return (java.util.Date) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CreateTime" );
  }


  public final void setCreateTime( java.util.Date value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CreateTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_CreateTime getCreateTime_elem() {
    return (wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_CreateTime) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CreateTime_elem" );
  }


  public final void setCreateTime_elem( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_CreateTime value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CreateTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCreateUserPublicID() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CreateUserPublicID" );
  }


  public final void setCreateUserPublicID( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CreateUserPublicID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_CreateUserPublicID getCreateUserPublicID_elem() {
    return (wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_CreateUserPublicID) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CreateUserPublicID_elem" );
  }


  public final void setCreateUserPublicID_elem( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_CreateUserPublicID value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CreateUserPublicID_elem", value );
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
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_Description getDescription_elem() {
    return (wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_Description) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Description_elem" );
  }


  public final void setDescription_elem( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_Description value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Description_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getExposurePublicID() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExposurePublicID" );
  }


  public final void setExposurePublicID( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExposurePublicID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_ExposurePublicID getExposurePublicID_elem() {
    return (wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_ExposurePublicID) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExposurePublicID_elem" );
  }


  public final void setExposurePublicID_elem( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_ExposurePublicID value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExposurePublicID_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_NewNotes getNewNotes() {
    return (wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_NewNotes) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NewNotes" );
  }


  public final void setNewNotes( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_NewNotes value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NewNotes", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPublicID() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PublicID" );
  }


  public final void setPublicID( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PublicID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_PublicID getPublicID_elem() {
    return (wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_PublicID) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PublicID_elem" );
  }


  public final void setPublicID_elem( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_PublicID value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PublicID_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSubject() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Subject" );
  }


  public final void setSubject( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Subject", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_Subject getSubject_elem() {
    return (wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_Subject) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Subject_elem" );
  }


  public final void setSubject_elem( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_Subject value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Subject_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.enums.ActivityType getType() {
    return (wsi.local.gw.webservice.cc.cc901.claim.claimapi.enums.ActivityType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Type" );
  }


  public final void setType( wsi.local.gw.webservice.cc.cc901.claim.claimapi.enums.ActivityType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Type", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_Type getType_elem() {
    return (wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_Type) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Type_elem" );
  }


  public final void setType_elem( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_Type value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Type_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getUpdateTime() {
    return (java.util.Date) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_UpdateTime" );
  }


  public final void setUpdateTime( java.util.Date value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_UpdateTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_UpdateTime getUpdateTime_elem() {
    return (wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_UpdateTime) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_UpdateTime_elem" );
  }


  public final void setUpdateTime_elem( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_UpdateTime value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_UpdateTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getUpdateUserPublicID() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_UpdateUserPublicID" );
  }


  public final void setUpdateUserPublicID( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_UpdateUserPublicID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_UpdateUserPublicID getUpdateUserPublicID_elem() {
    return (wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_UpdateUserPublicID) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_UpdateUserPublicID_elem" );
  }


  public final void setUpdateUserPublicID_elem( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ActivityDTO_UpdateUserPublicID value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_UpdateUserPublicID_elem", value );
  }
}