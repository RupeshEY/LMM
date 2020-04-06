package entity;

/**
 * GlobalPersonName
 * 
 *     This is a shared delegate/interface that allows multiple entities to share definitions of removable globalization fields associated with Persons.
 *   
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "GlobalPersonName.eti;GlobalPersonName.eix;GlobalPersonName.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface GlobalPersonName extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.GlobalPersonName> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.GlobalPersonName>("entity.GlobalPersonName");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FIRSTNAMEKANJI_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("FirstNameKanji", "FirstNameKanji");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LASTNAMEKANJI_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("LastNameKanji", "LastNameKanji");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PARTICLE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("Particle", "Particle");
  
  /**
   * Gets the value of the FirstNameKanji field.
   * First name in kanji (used only for Japanese names and will be null otherwise)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFirstNameKanji();
  
  
  /**
   * Gets the value of the LastNameKanji field.
   * Last name in kanji (used only for Japanese names and will be null otherwise)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLastNameKanji();
  
  
  /**
   * Gets the value of the Particle field.
   * Particle, such as 'de', 'von' (used for French names and will be null otherwise)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getParticle();
  
  
  /**
   * Sets the value of the FirstNameKanji field.
   */
  public void setFirstNameKanji(java.lang.String value);
  
  
  /**
   * Sets the value of the LastNameKanji field.
   */
  public void setLastNameKanji(java.lang.String value);
  
  
  /**
   * Sets the value of the Particle field.
   */
  public void setParticle(java.lang.String value);
  
  
  
}