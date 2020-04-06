package entity;

/**
 * GlobalContactName
 * 
 *     This is a shared delegate/interface that allows multiple entities to share definitions of removable globalization fields associated with Contacts.
 *   
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "GlobalContactName.eti;GlobalContactName.eix;GlobalContactName.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface GlobalContactName extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.GlobalContactName> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.GlobalContactName>("entity.GlobalContactName");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NAMEKANJI_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("NameKanji", "NameKanji");
  
  /**
   * Gets the value of the NameKanji field.
   * This contact's name in kanji (used only for Japanese names and will be null otherwise)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getNameKanji();
  
  
  /**
   * Sets the value of the NameKanji field.
   */
  public void setNameKanji(java.lang.String value);
  
  
  
}