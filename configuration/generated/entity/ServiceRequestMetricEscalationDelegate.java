package entity;

/**
 * ServiceRequestMetricEscalationDelegate
 * Delegate used to store a flag indicating if the metric has been escalated.  To escalate a new metric,
 *     changes have to be made in ServiceRequestMetricEscalationWorkQueue in addition to implementing this delegate.
 *   
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ServiceRequestMetricEscalationDelegate.eti;ServiceRequestMetricEscalationDelegate.eix;ServiceRequestMetricEscalationDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface ServiceRequestMetricEscalationDelegate extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ServiceRequestMetricEscalationDelegate> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ServiceRequestMetricEscalationDelegate>("entity.ServiceRequestMetricEscalationDelegate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ESCALATED_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("Escalated", "Escalated");
  
  /**
   * Gets the value of the Escalated field.
   * Indicates if this metric has been previously escalated
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isEscalated();
  
  
  /**
   * Sets the value of the Escalated field.
   */
  public void setEscalated(java.lang.Boolean value);
  
  
  
}