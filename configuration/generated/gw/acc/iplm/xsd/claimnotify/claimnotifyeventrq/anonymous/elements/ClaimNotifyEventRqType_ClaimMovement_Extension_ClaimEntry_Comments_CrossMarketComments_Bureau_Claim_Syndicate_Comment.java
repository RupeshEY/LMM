/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_Comments_CrossMarketComments_Bureau_Claim_Syndicate_Comment extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "Comment", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.xchanging.com/claimnotify/rq/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LineNumber = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "LineNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommentDetails = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "CommentDetails", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_Comments_CrossMarketComments_Bureau_Claim_Syndicate_Comment" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_Comments_CrossMarketComments_Bureau_Claim_Syndicate_Comment" );
    }
  };

  public ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_Comments_CrossMarketComments_Bureau_Claim_Syndicate_Comment() {
    super( 1762798501, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_Comments_CrossMarketComments_Bureau_Claim_Syndicate_Comment() );
  }

  public ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_Comments_CrossMarketComments_Bureau_Claim_Syndicate_Comment( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_Comments_CrossMarketComments_Bureau_Claim_Syndicate_Comment typeInstance ) {
    super( 1762798501, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_Comments_CrossMarketComments_Bureau_Claim_Syndicate_Comment( gw.internal.xml.XmlElementState state ) {
    super( 1762798501, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_Comments_CrossMarketComments_Bureau_Claim_Syndicate_Comment> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_Comments_CrossMarketComments_Bureau_Claim_Syndicate_Comment get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_Comments_CrossMarketComments_Bureau_Claim_Syndicate_Comment.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_Comments_CrossMarketComments_Bureau_Claim_Syndicate_Comment typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigInteger getLineNumber() {
    return (java.math.BigInteger) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LineNumber" );
  }


  public final void setLineNumber( java.math.BigInteger value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LineNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.LineNumber getLineNumber_elem() {
    return (gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.LineNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LineNumber_elem" );
  }


  public final void setLineNumber_elem( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.LineNumber value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LineNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCommentDetails() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CommentDetails" );
  }


  public final void setCommentDetails( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CommentDetails", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.CommentDetails getCommentDetails_elem() {
    return (gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.CommentDetails) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CommentDetails_elem" );
  }


  public final void setCommentDetails_elem( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.CommentDetails value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CommentDetails_elem", value );
  }
}