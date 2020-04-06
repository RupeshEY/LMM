package entity;

/**
 * TripExpenseDelegate
 * Fields common to TripSegment, AddnlTripSegment, TripAccommodation and AddnlTripAccommodation
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TripExpenseDelegate.eti;TripExpenseDelegate.eix;TripExpenseDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface TripExpenseDelegate extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TripExpenseDelegate> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TripExpenseDelegate>("entity.TripExpenseDelegate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> AGENTFEES_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("AgentFees", "AgentFees");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> ASSESSMENT_DYNPROP = new com.guidewire.commons.metadata.types.TypekeyDynPropertyInfo("Assessment", "Assessment");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ENDDATE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("EndDate", "EndDate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OTHERFEES_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("OtherFees", "OtherFees");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PAIDAMOUNT_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("PaidAmount", "PaidAmount");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REASONFORDENIAL_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("ReasonForDenial", "ReasonForDenial");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STARTDATE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("StartDate", "StartDate");
  
  /**
   * Gets the value of the AgentFees field.
   * Agent fees incurred
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getAgentFees();
  
  
  /**
   * Gets the value of the Assessment field.
   * Approve, deny or review an expense
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AssessmentAction getAssessment();
  
  
  /**
   * The currency related to this expense's Claim.
   * @return The associated Claim's currency.  Returns NULL if the Claim is currently
   *         unreachable (if, for example, the necessary entity connections have not
   *         yet been made).
   */
  public typekey.Currency getClaimCurrency();
  
  
  /**
   * Gets the value of the EndDate field.
   * The ending date/time for this expense
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEndDate();
  
  
  /**
   * Gets the value of the OtherFees field.
   * Other fees incurred
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getOtherFees();
  
  
  /**
   * Gets the value of the PaidAmount field.
   * Original invoiced amount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getPaidAmount();
  
  
  /**
   * Gets the value of the ReasonForDenial field.
   * Reasons for denial
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getReasonForDenial();
  
  
  /**
   * Gets the value of the StartDate field.
   * The starting date/time for this expense
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartDate();
  
  
  /**
   * Sets the value of the AgentFees field.
   */
  public void setAgentFees(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the Assessment field.
   */
  public void setAssessment(typekey.AssessmentAction value);
  
  
  /**
   * Sets the value of the EndDate field.
   */
  public void setEndDate(java.util.Date value);
  
  
  /**
   * Sets the value of the OtherFees field.
   */
  public void setOtherFees(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the PaidAmount field.
   */
  public void setPaidAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the ReasonForDenial field.
   */
  public void setReasonForDenial(java.lang.String value);
  
  
  /**
   * Sets the value of the StartDate field.
   */
  public void setStartDate(java.util.Date value);
  
  
  
}