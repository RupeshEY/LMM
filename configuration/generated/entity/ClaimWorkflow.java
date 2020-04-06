package entity;

/**
 * ClaimWorkflow
 * Base workflow subtype for all workflows that are linked to a claim
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimWorkflow.eti;ClaimWorkflow.eix;ClaimWorkflow.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public abstract class ClaimWorkflow extends entity.Workflow {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ClaimWorkflow> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ClaimWorkflow>("entity.ClaimWorkflow");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIM_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Claim");
  
  protected ClaimWorkflow(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected abstract com.guidewire._generated.entity.ClaimWorkflowInternal __createInternalInterface();
  
  
  protected com.guidewire._generated.entity.ClaimWorkflowInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.ClaimWorkflowInternal)super.__getInternalInterface();
  }
  
  /**
   * Gets the value of the Claim field.
   * The Claim with which this workflow is associated.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim() {
    return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
  }
  
  /**
   * Set defaults for the workflow's activity:
   * -status is open
   * -previous user is current user.
   * -set the claim on the activity to be the one referenced by the workflow.
   * @param activity the activity to initialize
   */
  public void initActivity(entity.Activity activity) {
    ((gw.cc.workflow.entity.ClaimWorkflow)__getDelegateManager().getImplementation("gw.cc.workflow.entity.ClaimWorkflow")).initActivity(activity);
  }
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value) {
    __getInternalInterface().setFieldValue(CLAIM_PROP.get(), value);
  }
  
  static {
    com.guidewire._generated.entity.ClaimWorkflowInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.EntityFriendAccess<entity.ClaimWorkflow, com.guidewire._generated.entity.ClaimWorkflowInternal>() {
      public java.lang.Object getImplementation(entity.ClaimWorkflow bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ClaimWorkflowInternal getInternalInterface(entity.ClaimWorkflow bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      
    });
  }
}