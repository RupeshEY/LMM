// _proto_overrides_
//@UpgradedSencha 5.1 This file, while combining, should be placed before any application code so the prototype level property override would kick in.
// Fixes  stopEvent, stopPropagation and preventDefault options on listeners

Ext.util.Event.prototype.fire = function() {

    var arraySlice = Array.prototype.slice,
        arrayInsert = Ext.Array.insert,
        toArray = Ext.Array.toArray,
        fireArgs = {};

    var me = this,
        listeners = me.listeners,
        count = listeners.length,
        isElement = me.observable.isElement,
        options, delegate, fireInfo, i, args, listener, len, delegateEl, currentTarget,
        type, chained, firingArgs, e;

    if (!me.suspended && count > 0) {
        me.firing = true;
        args = arguments.length ? arraySlice.call(arguments, 0) : [];
        len = args.length;
        if (isElement) {
            e = args[0];
        }
        for (i = 0; i < count; i++) {
            listener = listeners[i];
            options = listener.o;

            if (isElement) {
                if (currentTarget) {
                    // restore the previous currentTarget if we changed it last time
                    // around the loop while processing the delegate option.
                    e.setCurrentTarget(currentTarget);
                }

                // For events that have been translated to provide device compatibility,
                // e.g. mousedown -> touchstart, we want the event object to reflect the
                // type that was originally listened for, not the type of the actual event
                // that fired. The listener's "type" property reflects the original type.
                type = listener.type;

                if (type) {
                    // chain a new object to the event object before changing the type.
                    // This is more efficient than creating a new event object, and we
                    // don't want to change the type of the original event because it may
                    // be used asynchronously by other handlers
                    chained = e;
                    e = args[0] = chained.chain({ type: type });
                }

                // In Ext4 Ext.EventObject was a singleton event object that was reused as events
                // were fired.  Set Ext.EventObject to the last fired event for compatibility.
                Ext.EventObject = e;
            }

            firingArgs = args;

            if (options) {
                if (isElement) {
                    delegate = options.delegate;

                    if (delegate) {
                        // prepending the currentTarget.id to the delegate selector
                        // allows us to match selectors such as "> div"
                        delegateEl = e.getTarget('#' + e.currentTarget.id + ' ' + delegate);
                        if (delegateEl) {
                            args[1] = delegateEl;
                            // save the current target before changing it to the delegateEl
                            // so that we can restore it next time around
                            currentTarget = e.currentTarget;
                            e.setCurrentTarget(delegateEl);
                        } else {
                            continue;
                        }
                    }

                    if (options.preventDefault) {
                        e.preventDefault();
                    }

                    if (options.stopPropagation) {
                        e.stopPropagation();
                    }

                    if (options.stopEvent) {
                        e.stopEvent();
                    }
                }

                args[len] = options;

                if (options.args) {
                    firingArgs = options.args.concat(args);
                }
            }

            fireInfo = me.getFireInfo(listener);
            try {
                // We are going to log the event being fired for Guidewire purposes
                gw.Debug.eventlog(me.name, fireInfo.scope, me.observable.dom, fireInfo.fn, e, firingArgs);
                if (fireInfo.fn.apply(fireInfo.scope, firingArgs) === false) {
                    return (me.firing = false);
                }
            } finally {
                // We are going to log the processing completion of the event being fired
                gw.Debug.eventprocessed(me.name, e);
            }

            if (chained) {
                // if we chained the event object for type translation we need to
                // un-chain it before proceeding to process the next listener, which
                // may not be a translated event.
                e = args[0] = chained;
                chained = null;
            }
        }
    }
    me.firing = false;
    return true;
};

//@UpgradedSencha 5.1 Change multiSortLimit value after the class is being defined.
//multiSortLimit has getter and setter , thus we prepend underscore.
Ext.util.Collection.prototype._multiSortLimit = 2;
Ext.util.Sortable.prototype._multiSortLimit = 2;

// Turn on native JSON parsing instead of using eval to minimize security risks
Ext.USE_NATIVE_JSON = true;

// Sencha Issue:
// https://support.sencha.com/index.php#ticket-22301
// PLWEB-4943 Need to restrict this workaround to non-touch device;
// otherwise, tap will not work on touch devices
if (!Ext.supports.TouchEvents) {
  Ext.dom.Element.prototype.eventMap.click = 'click';
}
