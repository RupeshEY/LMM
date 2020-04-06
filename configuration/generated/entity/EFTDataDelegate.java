package entity;

/**
 * EFTDataDelegate
 * Delegate used by Contact and Check to store Electronic funds transfer data
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "EFTDataDelegate.eti;EFTDataDelegate.eix;EFTDataDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface EFTDataDelegate extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.EFTDataDelegate> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.EFTDataDelegate>("entity.EFTDataDelegate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ACCOUNTNAME_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("AccountName", "AccountName");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BANKACCOUNTNUMBER_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("BankAccountNumber", "BankAccountNumber");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> BANKACCOUNTTYPE_DYNPROP = new com.guidewire.commons.metadata.types.TypekeyDynPropertyInfo("BankAccountType", "BankAccountType");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BANKNAME_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("BankName", "BankName");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BANKROUTINGNUMBER_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("BankRoutingNumber", "BankRoutingNumber");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ISPRIMARY_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("IsPrimary", "IsPrimary");
  
  /**
   * Gets the value of the AccountName field.
   * The name on the account
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAccountName();
  
  
  /**
   * Gets the value of the BankAccountNumber field.
   * The bank account number
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBankAccountNumber();
  
  
  /**
   * Gets the value of the BankAccountType field.
   * The type of bank accout e.g. checking, savings etc
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.BankAccountType getBankAccountType();
  
  
  /**
   * Gets the value of the BankName field.
   * The name of the bank
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBankName();
  
  
  /**
   * Gets the value of the BankRoutingNumber field.
   * The routing number is a nine digit bank code used in the United States
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBankRoutingNumber();
  
  
  /**
   * Gets the value of the IsPrimary field.
   * Indicates if this is the primary EFT record for the contact
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIsPrimary();
  
  
  /**
   * Sets the value of the AccountName field.
   */
  public void setAccountName(java.lang.String value);
  
  
  /**
   * Sets the value of the BankAccountNumber field.
   */
  public void setBankAccountNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the BankAccountType field.
   */
  public void setBankAccountType(typekey.BankAccountType value);
  
  
  /**
   * Sets the value of the BankName field.
   */
  public void setBankName(java.lang.String value);
  
  
  /**
   * Sets the value of the BankRoutingNumber field.
   */
  public void setBankRoutingNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the IsPrimary field.
   */
  public void setIsPrimary(java.lang.Boolean value);
  
  
  
}