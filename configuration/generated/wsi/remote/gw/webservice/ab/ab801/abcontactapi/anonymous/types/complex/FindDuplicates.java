/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class FindDuplicates extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AbContactXML = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab801/abcontactapi/ABContactAPI", "abContactXML", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AbContactAPISearchSpec = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab801/abcontactapi/ABContactAPI", "abContactAPISearchSpec", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.ab.ab801.abcontactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.types.complex.FindDuplicates" );
    }
  };

  public FindDuplicates() {
    super( -192125733, TYPE.get() );
  }

  private FindDuplicates( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -192125733, state );
  }

  protected FindDuplicates( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected FindDuplicates( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.types.complex.FindDuplicates> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.types.complex.FindDuplicates get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.FindDuplicates_AbContactXML getAbContactXML() {
    return (wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.FindDuplicates_AbContactXML) TYPE.get().getPropertyValue( this, "_AbContactXML" );
  }


  public final void setAbContactXML( wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.FindDuplicates_AbContactXML value ) {
    TYPE.get().setPropertyValue( this, "_AbContactXML", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.FindDuplicates_AbContactAPISearchSpec getAbContactAPISearchSpec() {
    return (wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.FindDuplicates_AbContactAPISearchSpec) TYPE.get().getPropertyValue( this, "_AbContactAPISearchSpec" );
  }


  public final void setAbContactAPISearchSpec( wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.FindDuplicates_AbContactAPISearchSpec value ) {
    TYPE.get().setPropertyValue( this, "_AbContactAPISearchSpec", value );
  }

}