/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ABClientAPIAddressBookUIDContainer_AddressBookUIDTuples_Entry extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/webservice/contactapi/ab900/ABClientAPIAddressBookUIDContainer", "Entry", "pogo3" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pl/ws/gw/webservice/contactapi/ab900/ABClientAPIAddressBookUIDContainer", "pogo3" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EntityType = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/webservice/contactapi/ab900/ABClientAPIAddressBookUIDTuple", "EntityType", "pogo4" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_External_PublicID = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/webservice/contactapi/ab900/ABClientAPIAddressBookUIDTuple", "External_PublicID", "pogo4" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LinkID = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/webservice/contactapi/ab900/ABClientAPIAddressBookUIDTuple", "LinkID", "pogo4" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.contact.contactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.elements.ABClientAPIAddressBookUIDContainer_AddressBookUIDTuples_Entry" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.contact.contactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.contact.contactapi.types.complex.ABClientAPIAddressBookUIDTuple" );
    }
  };

  public ABClientAPIAddressBookUIDContainer_AddressBookUIDTuples_Entry() {
    super( -1857386928, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.webservice.cc.cc900.contact.contactapi.types.complex.ABClientAPIAddressBookUIDTuple() );
  }

  public ABClientAPIAddressBookUIDContainer_AddressBookUIDTuples_Entry( wsi.local.gw.webservice.cc.cc900.contact.contactapi.types.complex.ABClientAPIAddressBookUIDTuple typeInstance ) {
    super( -1857386928, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ABClientAPIAddressBookUIDContainer_AddressBookUIDTuples_Entry( gw.internal.xml.XmlElementState state ) {
    super( -1857386928, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.elements.ABClientAPIAddressBookUIDContainer_AddressBookUIDTuples_Entry> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.webservice.cc.cc900.contact.contactapi.types.complex.ABClientAPIAddressBookUIDTuple get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.webservice.cc.cc900.contact.contactapi.types.complex.ABClientAPIAddressBookUIDTuple.class );
  }

  public final void set$TypeInstance( wsi.local.gw.webservice.cc.cc900.contact.contactapi.types.complex.ABClientAPIAddressBookUIDTuple typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEntityType() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EntityType" );
  }


  public final void setEntityType( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EntityType", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.elements.ABClientAPIAddressBookUIDTuple_EntityType getEntityType_elem() {
    return (wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.elements.ABClientAPIAddressBookUIDTuple_EntityType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EntityType_elem" );
  }


  public final void setEntityType_elem( wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.elements.ABClientAPIAddressBookUIDTuple_EntityType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EntityType_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getExternal_PublicID() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_External_PublicID" );
  }


  public final void setExternal_PublicID( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_External_PublicID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.elements.ABClientAPIAddressBookUIDTuple_External_PublicID getExternal_PublicID_elem() {
    return (wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.elements.ABClientAPIAddressBookUIDTuple_External_PublicID) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_External_PublicID_elem" );
  }


  public final void setExternal_PublicID_elem( wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.elements.ABClientAPIAddressBookUIDTuple_External_PublicID value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_External_PublicID_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLinkID() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LinkID" );
  }


  public final void setLinkID( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LinkID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.elements.ABClientAPIAddressBookUIDTuple_LinkID getLinkID_elem() {
    return (wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.elements.ABClientAPIAddressBookUIDTuple_LinkID) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LinkID_elem" );
  }


  public final void setLinkID_elem( wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.elements.ABClientAPIAddressBookUIDTuple_LinkID value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LinkID_elem", value );
  }
}