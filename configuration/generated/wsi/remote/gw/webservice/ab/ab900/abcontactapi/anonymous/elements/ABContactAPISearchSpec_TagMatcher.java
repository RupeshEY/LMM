/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ABContactAPISearchSpec_TagMatcher extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPISearchSpec", "TagMatcher", "pogo8" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPISearchSpec", "pogo8" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MatchAllTags = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPITagMatcher", "MatchAllTags", "pogo11" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Tags = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPITagMatcher", "Tags", "pogo11" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.ab.ab900.abcontactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPISearchSpec_TagMatcher" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.ab.ab900.abcontactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.ab.ab900.abcontactapi.types.complex.ABContactAPITagMatcher" );
    }
  };

  public ABContactAPISearchSpec_TagMatcher() {
    super( -1510510071, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.remote.gw.webservice.ab.ab900.abcontactapi.types.complex.ABContactAPITagMatcher() );
  }

  public ABContactAPISearchSpec_TagMatcher( wsi.remote.gw.webservice.ab.ab900.abcontactapi.types.complex.ABContactAPITagMatcher typeInstance ) {
    super( -1510510071, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ABContactAPISearchSpec_TagMatcher( gw.internal.xml.XmlElementState state ) {
    super( -1510510071, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPISearchSpec_TagMatcher> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.remote.gw.webservice.ab.ab900.abcontactapi.types.complex.ABContactAPITagMatcher get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.remote.gw.webservice.ab.ab900.abcontactapi.types.complex.ABContactAPITagMatcher.class );
  }

  public final void set$TypeInstance( wsi.remote.gw.webservice.ab.ab900.abcontactapi.types.complex.ABContactAPITagMatcher typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getMatchAllTags() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MatchAllTags" );
  }


  public final void setMatchAllTags( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MatchAllTags", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPITagMatcher_MatchAllTags getMatchAllTags_elem() {
    return (wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPITagMatcher_MatchAllTags) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MatchAllTags_elem" );
  }


  public final void setMatchAllTags_elem( wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPITagMatcher_MatchAllTags value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MatchAllTags_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPITagMatcher_Tags getTags() {
    return (wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPITagMatcher_Tags) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Tags" );
  }


  public final void setTags( wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPITagMatcher_Tags value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Tags", value );
  }
}