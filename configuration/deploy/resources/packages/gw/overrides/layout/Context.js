/**
 * Fix PLWEB-4769: Charts fail to render after a full-page refresh
 *
 * We call comp.removeAll() during replaceItems which removes the elements from the DOM even
 * when layout is suspended. This causes the item cache to return a stale ContextItem where the DOM
 * is null.
 *
 * Ext JS keeps a layout queue of things that need laying out; it's stored in a static inside
 * Component (Component.pendingLayouts). The layout queue is represented by an object of type
 * Ext.layout.Context which contains a queue of actual layout objects (which belong to panels and other
 * widgets that need to be laid out) plus a cache of ContextItem objects, which store per layout transient
 * state. The ContextItems are stored in the "items" map in the Context, which is keyed by id.
 *
 * Whenever we call back to the server we "suspend layouts" - freeze the layout queue.
 * Then we wait for the response and process the commands in that response. A very common command
 * (used whenever we move between pages or fully refresh a page) is "replaceItems", which rips
 * out a whole bunch of widgets and replaces them - sometimes with an entirely new set of widgets
 * other times with a whole bunch of nearly identical widgets (e.g. for a page refresh). Then, once
 * we've processed all the command we resume layouts again.
 * So after this happens we've got a layout queue that may contain layouts for items that have been
 * removed plus the ContextItem cache which contains a bunch of cached information (including dom elements)
 * that may also be for removed items. So we run a high risk of processing zombie layouts and finding
 * zombie ContextItems in the cache. There have been previous bugs in this area and they're very hard
 * to track down. On the whole there seem to be guards in the code such that processing the zombie layout
 * is usually harmless (plus, it is suspected that, the layout queue is very often empty when we call back to the server)
 * but it all seems like a very dodgy area.
 *
 * This fix is attacking the ContextItem cache part of the problem. If we lookup an id in the cache
 * and the corresponding dom element is gone then almost certainly this item is a zombie and needs to
 * deleted and re-created. One thing it is still worrisome though is why are we asking for this context
 * item? If we're asking because we're laying out a new component that happens to have the same id as
 * one that got ripped out then creating a new ContextItem is the way to go. But if we're dealing with
 * a zombie layout it is not very clear (though maybe we'd never even get as far as asking for the ContextItem
 * for a zombie?)
 */
Ext.define('gw.override.layout.Context', {
  override: 'Ext.layout.Context',

  getItem: function(target, el) {
    var id = el.id,
        items = this.items,
        item = items[id];

        // Check if there's a cache miss as well as a stale cache hit
        // If either condition exists, return a new ContextItem and push it on the cache
        if (!item || !item.el || !item.el.dom) {
          item = (items[id] = new Ext.layout.ContextItem({
            context: this,
            target: target,
            el: el
          }));
          return item;
        } else {
          return this.callParent(arguments);
        }
  }

});