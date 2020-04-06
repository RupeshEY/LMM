package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "OrderedItemDelegate.eti;OrderedItemDelegate.eix;OrderedItemDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface OrderedItemDelegateInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, gw.cc.ordereditem.entity.OrderedItemDelegate {
  /**
   * Gets the value of the ItemOrder field.
   * Used to order items in creation order, must be unique per incident
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getItemOrder();
  
  
  /**
   * Sets the value of the ItemOrder field.
   */
  public void setItemOrder(java.lang.Integer value);
  
  
  
}