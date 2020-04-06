package entity;

/**
 * WC_PD_LimitsDelegate
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "WC_PD_LimitsDelegate.eti;WC_PD_LimitsDelegate.eix;WC_PD_LimitsDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface WC_PD_LimitsDelegate extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.WC_PD_LimitsDelegate> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.WC_PD_LimitsDelegate>("entity.WC_PD_LimitsDelegate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> JURISDICTIONSTATE_DYNPROP = new com.guidewire.commons.metadata.types.TypekeyDynPropertyInfo("JurisdictionState", "JurisdictionState");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PD_BENEFITENDDATE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("PD_BenefitEndDate", "PD_BenefitEndDate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PD_BENEFITSTARTDATE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("PD_BenefitStartDate", "PD_BenefitStartDate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RATECOMMENTS_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("RateComments", "RateComments");
  
  /**
   * Gets the value of the JurisdictionState field.
   * Jurisdiction State. The Jurisdiction must be associated with JurisdictionType.TC_INSURANCE.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Jurisdiction getJurisdictionState();
  
  
  /**
   * Gets the value of the PD_BenefitEndDate field.
   * PD Benefit Expiration Date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getPD_BenefitEndDate();
  
  
  /**
   * Gets the value of the PD_BenefitStartDate field.
   * PD Benefit Effective Date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getPD_BenefitStartDate();
  
  
  /**
   * Gets the value of the RateComments field.
   * Additional comments.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRateComments();
  
  
  /**
   * Checks if this partial disability benefit range overlaps with another one of the same type. In general no two
   * items of the same type should overlap as we want to be able to look up just a single item when calculating
   * benefits.
   * @param other the other WC_PD_LimitsDelegate
   * @return true if date ranges overlap, false otherwise
   */
  public boolean overlaps(entity.WC_PD_LimitsDelegate other);
  
  
  /**
   * Sets the value of the JurisdictionState field.
   */
  public void setJurisdictionState(typekey.Jurisdiction value);
  
  
  /**
   * Sets the value of the PD_BenefitEndDate field.
   */
  public void setPD_BenefitEndDate(java.util.Date value);
  
  
  /**
   * Sets the value of the PD_BenefitStartDate field.
   */
  public void setPD_BenefitStartDate(java.util.Date value);
  
  
  /**
   * Sets the value of the RateComments field.
   */
  public void setRateComments(java.lang.String value);
  
  
  
}