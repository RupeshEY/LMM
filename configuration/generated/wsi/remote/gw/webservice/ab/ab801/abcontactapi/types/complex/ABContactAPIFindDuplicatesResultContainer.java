/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.ab.ab801.abcontactapi.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ABContactAPIFindDuplicatesResultContainer extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab801/abcontactapi/ABContactAPIFindDuplicatesResultContainer", "ABContactAPIFindDuplicatesResultContainer", "pogo15" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/ab/ws/gw/webservice/ab/ab801/abcontactapi/ABContactAPIFindDuplicatesResultContainer", "pogo15" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Results = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab801/abcontactapi/ABContactAPIFindDuplicatesResultContainer", "Results", "pogo15" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TotalResults = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab801/abcontactapi/ABContactAPIFindDuplicatesResultContainer", "TotalResults", "pogo15" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.ab.ab801.abcontactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.ab.ab801.abcontactapi.types.complex.ABContactAPIFindDuplicatesResultContainer" );
    }
  };

  public ABContactAPIFindDuplicatesResultContainer() {
    super( 1438410127, TYPE.get() );
  }

  private ABContactAPIFindDuplicatesResultContainer( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1438410127, state );
  }

  protected ABContactAPIFindDuplicatesResultContainer( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ABContactAPIFindDuplicatesResultContainer( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.gw.webservice.ab.ab801.abcontactapi.types.complex.ABContactAPIFindDuplicatesResultContainer> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.gw.webservice.ab.ab801.abcontactapi.types.complex.ABContactAPIFindDuplicatesResultContainer get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.ABContactAPIFindDuplicatesResultContainer_Results getResults() {
    return (wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.ABContactAPIFindDuplicatesResultContainer_Results) TYPE.get().getPropertyValue( this, "_Results" );
  }


  public final void setResults( wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.ABContactAPIFindDuplicatesResultContainer_Results value ) {
    TYPE.get().setPropertyValue( this, "_Results", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getTotalResults() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_TotalResults" );
  }


  public final void setTotalResults( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_TotalResults", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.ABContactAPIFindDuplicatesResultContainer_TotalResults getTotalResults_elem() {
    return (wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.ABContactAPIFindDuplicatesResultContainer_TotalResults) TYPE.get().getPropertyValue( this, "_TotalResults_elem" );
  }


  public final void setTotalResults_elem( wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.ABContactAPIFindDuplicatesResultContainer_TotalResults value ) {
    TYPE.get().setPropertyValue( this, "_TotalResults_elem", value );
  }

}