/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.importtoolsapi.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ImportResultSummary extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/webservice/importTools", "ImportResultSummary", "pogo" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/gw/api/webservice/importTools", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Count = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/webservice/importTools", "Count", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EntityName = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/webservice/importTools", "EntityName", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Type = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/webservice/importTools", "Type", "pogo" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.importtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.importtoolsapi.types.complex.ImportResultSummary" );
    }
  };

  public ImportResultSummary() {
    super( 1593305566, TYPE.get() );
  }

  private ImportResultSummary( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1593305566, state );
  }

  protected ImportResultSummary( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ImportResultSummary( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.wsi.pl.importtoolsapi.types.complex.ImportResultSummary> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.wsi.pl.importtoolsapi.types.complex.ImportResultSummary get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getCount() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_Count" );
  }


  public final void setCount( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_Count", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportResultSummary_Count getCount_elem() {
    return (wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportResultSummary_Count) TYPE.get().getPropertyValue( this, "_Count_elem" );
  }


  public final void setCount_elem( wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportResultSummary_Count value ) {
    TYPE.get().setPropertyValue( this, "_Count_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEntityName() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_EntityName" );
  }


  public final void setEntityName( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_EntityName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportResultSummary_EntityName getEntityName_elem() {
    return (wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportResultSummary_EntityName) TYPE.get().getPropertyValue( this, "_EntityName_elem" );
  }


  public final void setEntityName_elem( wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportResultSummary_EntityName value ) {
    TYPE.get().setPropertyValue( this, "_EntityName_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getType() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_Type" );
  }


  public final void setType( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_Type", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportResultSummary_Type getType_elem() {
    return (wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportResultSummary_Type) TYPE.get().getPropertyValue( this, "_Type_elem" );
  }


  public final void setType_elem( wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportResultSummary_Type value ) {
    TYPE.get().setPropertyValue( this, "_Type_elem", value );
  }

}
