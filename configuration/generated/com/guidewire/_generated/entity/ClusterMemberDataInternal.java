package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClusterMemberData.eti;ClusterMemberData.eix;ClusterMemberData.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClusterMemberDataInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire.pl.domain.clusterinfo.ClusterMemberDataPublicMethods, com.guidewire.pl.domain.clusterinfo.impl.ClusterMemberDataInternalMethods {
  /**
   * Gets the value of the BgTasksStopped field.
   * Time background tasks stopped
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getBgTasksStopped();
  
  
  /**
   * Gets the value of the Build field.
   * Build and schema version string
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBuild();
  
  
  /**
   * Gets the value of the ConnectionStarted field.
   * Time connection started
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getConnectionStarted();
  
  
  /**
   * Gets the value of the ConnectionStopped field.
   * Time connection stopped
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getConnectionStopped();
  
  
  /**
   * Gets the value of the Data field.
   * Data
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.lang.Blob getData();
  
  
  /**
   * Gets the value of the Env field.
   * Env value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEnv();
  
  
  /**
   * Gets the value of the LastUpdate field.
   * Last update
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getLastUpdate();
  
  
  /**
   * Gets the value of the LogicalName field.
   * Node logical name
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLogicalName();
  
  
  /**
   * Gets the value of the PlannedShutdownInitiated field.
   * Time planned shutdown initiated
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getPlannedShutdownInitiated();
  
  
  /**
   * Gets the value of the PlannedShutdownTime field.
   * Time shutdown planned
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getPlannedShutdownTime();
  
  
  /**
   * Gets the value of the Roles field.
   * Server roles
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRoles();
  
  
  /**
   * Gets the value of the RunLevel field.
   * Run level
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRunLevel();
  
  
  /**
   * Gets the value of the ServerId field.
   * Server ID
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getServerId();
  
  
  /**
   * Gets the value of the ServerStarted field.
   * Time server started
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getServerStarted();
  
  
  /**
   * Gets the value of the UserSessions field.
   * Number of user sessions
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getUserSessions();
  
  
  /**
   * Gets the value of the Uuid field.
   * UUID
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getUuid();
  
  
  /**
   * Sets the value of the BgTasksStopped field.
   */
  public void setBgTasksStopped(java.util.Date value);
  
  
  /**
   * Sets the value of the Build field.
   */
  public void setBuild(java.lang.String value);
  
  
  /**
   * Sets the value of the ConnectionStarted field.
   */
  public void setConnectionStarted(java.util.Date value);
  
  
  /**
   * Sets the value of the ConnectionStopped field.
   */
  public void setConnectionStopped(java.util.Date value);
  
  
  /**
   * Sets the value of the Data field.
   */
  public void setData(gw.lang.Blob value);
  
  
  /**
   * Sets the value of the Env field.
   */
  public void setEnv(java.lang.String value);
  
  
  /**
   * Sets the value of the LastUpdate field.
   */
  public void setLastUpdate(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the LogicalName field.
   */
  public void setLogicalName(java.lang.String value);
  
  
  /**
   * Sets the value of the PlannedShutdownInitiated field.
   */
  public void setPlannedShutdownInitiated(java.util.Date value);
  
  
  /**
   * Sets the value of the PlannedShutdownTime field.
   */
  public void setPlannedShutdownTime(java.util.Date value);
  
  
  /**
   * Sets the value of the Roles field.
   */
  public void setRoles(java.lang.String value);
  
  
  /**
   * Sets the value of the RunLevel field.
   */
  public void setRunLevel(java.lang.String value);
  
  
  /**
   * Sets the value of the ServerId field.
   */
  public void setServerId(java.lang.String value);
  
  
  /**
   * Sets the value of the ServerStarted field.
   */
  public void setServerStarted(java.util.Date value);
  
  
  /**
   * Sets the value of the UserSessions field.
   */
  public void setUserSessions(java.lang.Integer value);
  
  
  /**
   * Sets the value of the Uuid field.
   */
  public void setUuid(java.lang.String value);
  
  
  
}