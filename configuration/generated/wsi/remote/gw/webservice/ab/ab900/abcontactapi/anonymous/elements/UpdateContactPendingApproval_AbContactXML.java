/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class UpdateContactPendingApproval_AbContactXML extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPI", "abContactXML", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPI", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_XmlBackedInstance = new javax.xml.namespace.QName( "http://guidewire.com/ctc/beanmodel", "xmlBackedInstance", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.ab.ab900.abcontactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.UpdateContactPendingApproval_AbContactXML" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.ab.ab900.abcontactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.types.complex.UpdateContactPendingApproval_AbContactXML" );
    }
  };

  public UpdateContactPendingApproval_AbContactXML() {
    super( -645084092, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.types.complex.UpdateContactPendingApproval_AbContactXML() );
  }

  public UpdateContactPendingApproval_AbContactXML( wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.types.complex.UpdateContactPendingApproval_AbContactXML typeInstance ) {
    super( -645084092, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private UpdateContactPendingApproval_AbContactXML( gw.internal.xml.XmlElementState state ) {
    super( -645084092, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.UpdateContactPendingApproval_AbContactXML> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.types.complex.UpdateContactPendingApproval_AbContactXML get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.types.complex.UpdateContactPendingApproval_AbContactXML.class );
  }

  public final void set$TypeInstance( wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.types.complex.UpdateContactPendingApproval_AbContactXML typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.ab.ab900.beanmodel.XmlBackedInstance getXmlBackedInstance() {
    return (wsi.remote.gw.webservice.ab.ab900.beanmodel.XmlBackedInstance) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_XmlBackedInstance" );
  }


  public final void setXmlBackedInstance( wsi.remote.gw.webservice.ab.ab900.beanmodel.XmlBackedInstance value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_XmlBackedInstance", value );
  }
}
