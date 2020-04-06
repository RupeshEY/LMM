/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.claim.claimapi.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class AssignmentResponse extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/gw/plugin/assignment", "AssignmentResponse", "pogo16" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/gw/plugin/assignment", "pogo16" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AssignmentCommand = new javax.xml.namespace.QName( "http://guidewire.com/gw/plugin/assignment", "AssignmentCommand", "pogo16" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GroupID = new javax.xml.namespace.QName( "http://guidewire.com/gw/plugin/assignment", "GroupID", "pogo16" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GroupType = new javax.xml.namespace.QName( "http://guidewire.com/gw/plugin/assignment", "GroupType", "pogo16" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_QueueID = new javax.xml.namespace.QName( "http://guidewire.com/gw/plugin/assignment", "QueueID", "pogo16" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReviewAssignment = new javax.xml.namespace.QName( "http://guidewire.com/gw/plugin/assignment", "ReviewAssignment", "pogo16" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReviewerId = new javax.xml.namespace.QName( "http://guidewire.com/gw/plugin/assignment", "ReviewerId", "pogo16" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_UserID = new javax.xml.namespace.QName( "http://guidewire.com/gw/plugin/assignment", "UserID", "pogo16" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.claim.claimapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.claim.claimapi.types.complex.AssignmentResponse" );
    }
  };

  public AssignmentResponse() {
    super( -1273899665, TYPE.get() );
  }

  private AssignmentResponse( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1273899665, state );
  }

  protected AssignmentResponse( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected AssignmentResponse( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.claim.claimapi.types.complex.AssignmentResponse> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.webservice.cc.cc900.claim.claimapi.types.complex.AssignmentResponse get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.claim.claimapi.enums.AssignmentCommand getAssignmentCommand() {
    return (wsi.local.gw.webservice.cc.cc900.claim.claimapi.enums.AssignmentCommand) TYPE.get().getPropertyValue( this, "_AssignmentCommand" );
  }


  public final void setAssignmentCommand( wsi.local.gw.webservice.cc.cc900.claim.claimapi.enums.AssignmentCommand value ) {
    TYPE.get().setPropertyValue( this, "_AssignmentCommand", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.elements.AssignmentResponse_AssignmentCommand getAssignmentCommand_elem() {
    return (wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.elements.AssignmentResponse_AssignmentCommand) TYPE.get().getPropertyValue( this, "_AssignmentCommand_elem" );
  }


  public final void setAssignmentCommand_elem( wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.elements.AssignmentResponse_AssignmentCommand value ) {
    TYPE.get().setPropertyValue( this, "_AssignmentCommand_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getGroupID() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_GroupID" );
  }


  public final void setGroupID( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_GroupID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.elements.AssignmentResponse_GroupID getGroupID_elem() {
    return (wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.elements.AssignmentResponse_GroupID) TYPE.get().getPropertyValue( this, "_GroupID_elem" );
  }


  public final void setGroupID_elem( wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.elements.AssignmentResponse_GroupID value ) {
    TYPE.get().setPropertyValue( this, "_GroupID_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getGroupType() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_GroupType" );
  }


  public final void setGroupType( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_GroupType", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.elements.AssignmentResponse_GroupType getGroupType_elem() {
    return (wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.elements.AssignmentResponse_GroupType) TYPE.get().getPropertyValue( this, "_GroupType_elem" );
  }


  public final void setGroupType_elem( wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.elements.AssignmentResponse_GroupType value ) {
    TYPE.get().setPropertyValue( this, "_GroupType_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getQueueID() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_QueueID" );
  }


  public final void setQueueID( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_QueueID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.elements.AssignmentResponse_QueueID getQueueID_elem() {
    return (wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.elements.AssignmentResponse_QueueID) TYPE.get().getPropertyValue( this, "_QueueID_elem" );
  }


  public final void setQueueID_elem( wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.elements.AssignmentResponse_QueueID value ) {
    TYPE.get().setPropertyValue( this, "_QueueID_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getReviewAssignment() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_ReviewAssignment" );
  }


  public final void setReviewAssignment( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_ReviewAssignment", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.elements.AssignmentResponse_ReviewAssignment getReviewAssignment_elem() {
    return (wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.elements.AssignmentResponse_ReviewAssignment) TYPE.get().getPropertyValue( this, "_ReviewAssignment_elem" );
  }


  public final void setReviewAssignment_elem( wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.elements.AssignmentResponse_ReviewAssignment value ) {
    TYPE.get().setPropertyValue( this, "_ReviewAssignment_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getReviewerId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ReviewerId" );
  }


  public final void setReviewerId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ReviewerId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.elements.AssignmentResponse_ReviewerId getReviewerId_elem() {
    return (wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.elements.AssignmentResponse_ReviewerId) TYPE.get().getPropertyValue( this, "_ReviewerId_elem" );
  }


  public final void setReviewerId_elem( wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.elements.AssignmentResponse_ReviewerId value ) {
    TYPE.get().setPropertyValue( this, "_ReviewerId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getUserID() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_UserID" );
  }


  public final void setUserID( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_UserID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.elements.AssignmentResponse_UserID getUserID_elem() {
    return (wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.elements.AssignmentResponse_UserID) TYPE.get().getPropertyValue( this, "_UserID_elem" );
  }


  public final void setUserID_elem( wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.elements.AssignmentResponse_UserID value ) {
    TYPE.get().setPropertyValue( this, "_UserID_elem", value );
  }

}