/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc800.contact.contactapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class MergeContacts extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_KeptContactABUID = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/contact/ContactAPI", "keptContactABUID", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DeletedContactABUID = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/contact/ContactAPI", "deletedContactABUID", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc800.contact.contactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc800.contact.contactapi.anonymous.types.complex.MergeContacts" );
    }
  };

  public MergeContacts() {
    super( -271189598, TYPE.get() );
  }

  private MergeContacts( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -271189598, state );
  }

  protected MergeContacts( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected MergeContacts( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.webservice.cc.cc800.contact.contactapi.anonymous.types.complex.MergeContacts> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.webservice.cc.cc800.contact.contactapi.anonymous.types.complex.MergeContacts get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getKeptContactABUID() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_KeptContactABUID" );
  }


  public final void setKeptContactABUID( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_KeptContactABUID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.contact.contactapi.anonymous.elements.MergeContacts_KeptContactABUID getKeptContactABUID_elem() {
    return (wsi.local.gw.webservice.cc.cc800.contact.contactapi.anonymous.elements.MergeContacts_KeptContactABUID) TYPE.get().getPropertyValue( this, "_KeptContactABUID_elem" );
  }


  public final void setKeptContactABUID_elem( wsi.local.gw.webservice.cc.cc800.contact.contactapi.anonymous.elements.MergeContacts_KeptContactABUID value ) {
    TYPE.get().setPropertyValue( this, "_KeptContactABUID_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDeletedContactABUID() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_DeletedContactABUID" );
  }


  public final void setDeletedContactABUID( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_DeletedContactABUID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.contact.contactapi.anonymous.elements.MergeContacts_DeletedContactABUID getDeletedContactABUID_elem() {
    return (wsi.local.gw.webservice.cc.cc800.contact.contactapi.anonymous.elements.MergeContacts_DeletedContactABUID) TYPE.get().getPropertyValue( this, "_DeletedContactABUID_elem" );
  }


  public final void setDeletedContactABUID_elem( wsi.local.gw.webservice.cc.cc800.contact.contactapi.anonymous.elements.MergeContacts_DeletedContactABUID value ) {
    TYPE.get().setPropertyValue( this, "_DeletedContactABUID_elem", value );
  }

}