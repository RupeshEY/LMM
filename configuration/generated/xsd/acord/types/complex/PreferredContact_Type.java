/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class PreferredContact_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "PreferredContact_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PreferencePriority = new javax.xml.namespace.QName( "", "PreferencePriority", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ContactDuration = new javax.xml.namespace.QName( "", "ContactDuration", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BlackoutDuration = new javax.xml.namespace.QName( "", "BlackoutDuration", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.PreferredContact_Type" );
    }
  };

  public PreferredContact_Type() {
    super( -204294189, TYPE.get() );
  }

  private PreferredContact_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -204294189, state );
  }

  protected PreferredContact_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected PreferredContact_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.PreferredContact_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.PreferredContact_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getPreferencePriority() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_PreferencePriority" );
  }


  public final void setPreferencePriority( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_PreferencePriority", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PreferencePriority getPreferencePriority_elem() {
    return (xsd.acord.PreferencePriority) TYPE.get().getPropertyValue( this, "_PreferencePriority_elem" );
  }


  public final void setPreferencePriority_elem( xsd.acord.PreferencePriority value ) {
    TYPE.get().setPropertyValue( this, "_PreferencePriority_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ContactDuration getContactDuration() {
    return (xsd.acord.ContactDuration) TYPE.get().getPropertyValue( this, "_ContactDuration" );
  }


  public final void setContactDuration( xsd.acord.ContactDuration value ) {
    TYPE.get().setPropertyValue( this, "_ContactDuration", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BlackoutDuration getBlackoutDuration() {
    return (xsd.acord.BlackoutDuration) TYPE.get().getPropertyValue( this, "_BlackoutDuration" );
  }


  public final void setBlackoutDuration( xsd.acord.BlackoutDuration value ) {
    TYPE.get().setPropertyValue( this, "_BlackoutDuration", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Id", value );
  }

}