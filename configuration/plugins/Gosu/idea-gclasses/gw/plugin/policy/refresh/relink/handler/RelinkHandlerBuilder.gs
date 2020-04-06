package gw.plugin.policy.refresh.relink.handler

uses gw.api.policy.refresh.relink.PerLinkHandler
uses gw.api.policy.refresh.relink.RelinkHandler
uses gw.api.policy.refresh.relink.LinkHandler
uses gw.entity.IEntityType
uses gw.api.policy.refresh.relink.BaseLinkHandler
uses gw.api.policy.refresh.relink.RelinkItem
uses gw.api.policy.refresh.relink.RelinkContext

/**
 * Builder for creating a <code>RelinkHandler</code> using individual
 * <code>LinkHandler</code> implementations for each foreign key. Any
 * foreign keys not explicitly specified will be handled using the
 * <code>DefaultLinkHandler</code>.
 */
@Export
class RelinkHandlerBuilder<T extends KeyableBean> {
  
  var _relinkHandler:PerLinkHandler<T> = new PerLinkHandler<T>()
  var _type:IEntityType

  construct(type:IEntityType) {
    _type = type
  }
  
  /**
   * Adds a <code>LinkHandler</code> for the specified foreign key on the owner entity.
   */
  function withLinkHandler(fkName:String, handler:LinkHandler<T>) : RelinkHandlerBuilder<T> {
    _relinkHandler.register(_type, fkName, handler)
    return this
  }
  
  /**
   * Returns a <code>LinkHandler</code> that defines a no-op for <code>handleRemovedLinkTarget</code>,
   * the case where the target on the broken link has no match in the new policy.
   */
  function withIgnoreRemovedTargetHandler(fkName:String) : RelinkHandlerBuilder<T> {
    return withLinkHandler(fkName, new BaseLinkHandler<T>() {
       override function handleRemovedLinkTarget(item:RelinkItem<T>, ctx:RelinkContext) {}
    })
  }
  
  /**
   * Returns a <code>LinkHandler</code> that removes/retires the owner entity of the broken foreign key 
   * when there is no match for the target in the new policy. Useful when the FK owner is not retireable
   * and should be deleted when the target is removed.
   */
  function withRemoveOwnerWhenTargetRemovedHandler(fkName:String) : RelinkHandlerBuilder<T> {
    return withLinkHandler(fkName, new BaseLinkHandler<T>() {
       override function handleRemovedLinkTarget(item:RelinkItem<T>, ctx:RelinkContext) {
         item.Owner.remove()
       }
    })
  }
  
  /**
   * Builds the final <code>RelinkHandler</code>.
   */
  function build() : RelinkHandler<T> {
    return _relinkHandler
  }
}
