Ext.define('gw.override.form.field.Base', {
    override: 'Ext.form.field.Base',
    uses: ['Ext.tip.QuickTipManager', 'Ext.toolbar.Toolbar', 'gw.app', 'gw.Util'],

    hideEmptyLabel: true,
    labelSeparator: '', // do not add ':' after the label
    checkChangeBuffer: 0, // no delay

    /*
     * Override initLabelable to show empty labels that have required indicators (*)
     */
    initLabelable: function () {
        var me = this;

        if (me.getFieldLabel() == '' && !me.hideEmptyLabel && me.required) {
            me.setFieldLabel('&#160;');
        }

        me.callParent(arguments);
    },

    /**
     * Overrides default property in the constructor, so that it won't override the config from a component instance
     */
    constructor: function () {
        var me = this;

        me.plugins = me.plugins || [];
        me.plugins.push({ptype: 'helperitem', pluginId: 'helper'});
        me.callParent(arguments);
    },

    // @SenchaUpgrade mimic the same method of Button. Remove when ExtJs supports tooltip for Text field
    setTooltip: function (tooltip, initial) {
        var me = this;

        if (me.rendered) {
            if (!initial || !tooltip) {
                me.clearTip();
            }
            if (tooltip) {
                if (Ext.quickTipsActive && Ext.isObject(tooltip)) {
                    Ext.tip.QuickTipManager.register(Ext.apply({
                            target: me.inputEl.id
                        },
                        tooltip));
                } else {
                    me.inputEl.dom.setAttribute(me.getTipAttr(), tooltip);
                }
            }
        }
        me.tooltip = tooltip;

        return me;
    },

    // @SenchaUpgrade mimic the same method of Button. Remove when ExtJs supports tooltip for Text field
    getTipAttr: function () {
        return 'data-qtip';
    },

    // @SenchaUpgrade mimic the same method of Button. Remove when ExtJs supports tooltip for Text field
    clearTip: function () {
        var me = this,
            inputEl = me.inputEl;

        if (me.rendered) {
            if (Ext.quickTipsActive && Ext.isObject(me.tooltip)) {
                Ext.tip.QuickTipManager.unregister(inputEl);
            } else {
                inputEl.dom.removeAttribute(me.getTipAttr());
            }
        }
    },

    /**
     * Forces change handlers right away, and not to wait till blur
     */
    flushChange: function () {
        var me = this;
        if (me.gChangeOnBlur && me.gchanged) {
            me.gchanged = false;
            me.fireEvent('blurchange', me, me.newValueBlur, me.lastValueBlur);
        }
    },

    getInsertionRenderData: function(data, names) {
      var i = names.length,
          name, value;
      while (i--) {
        name = names[i];
        value = this[name];
        if (value) {
          // @UpgradedSencha: Our template data can be objects, this does not work with labelableInsertions
          // labelableRenderProps was removed in 5.0 and the old Ext.copyTo functionality is gone.
          // our object data needs to be copied over to 'data' instead of being passed through Ext.XTemplate.getTpl
          // override
          // if (typeof value != 'string') {
          if (typeof value !== 'string' && typeof value !== 'object') {
            // --end override
            if (!value.isTemplate) {
              value = Ext.XTemplate.getTpl(this, name);
            }
            value = value.apply(data);
          }
        }
        data[name] = value || '';
      }
      return data;
    },

    // @UpgradedSencha - make the labelable data selectable
    initRenderData: function () {
        var data = this.callParent();
        return gw.Util.makeLabelableDataSelectable(data);
    },

    initComponent: function () {
        var me = this;

        // @UpgradedSencha - set the default label width if necessary
        gw.Util.setDefaultLabelWidth(me);

        if (me.item || me.altVal || me.prefix || me.suffix) {
            me.labelableRenderTpl = gw.Util.getLabelableRenderTpl();
        }

        // @SenchaUpgrade add altVal to label rendering data
        if (me.altVal) {
            me.labelableInsertions.push('altVal');
            me.labelableInsertions.push('altId');
            me.altId = me.getInputId() + '_altFooter';
        }

        if (me.required) {
            me.cls = (me.cls ? me.cls + ' ' : '') + 'g-required';
        }

        // Only active and inactive are allowed in the PCF schema, more modes can be added later
        if (me.imeMode) {
          me.on('beforerender', function() {
             me.fieldCls += ' g-ime-mode-' + me.imeMode;
          });
        }

        // If we don't have a name from the config, then we MUST set it to the component's ID.  This allows the private
        // method gw.app.getFormValues() to work properly
        me.name = me.name || me.id;

        me.callParent(arguments);

        me.on({
            // when an form field is under a toolbar, make the label size by content:
            added: function (comp, container) {
                if (comp.fieldLabel && container instanceof Ext.toolbar.Toolbar) {
                    // insert a separate label as sibling to size the label by content:
                    var index = container.items.indexOf(comp),
                        extraCls = comp.labelClsExtra;
                    container.insert(index, {
                        xtype: 'label',
                        forId: comp.id,
                        style: comp.labelStyle,
                        cls: (Ext.isString(extraCls) ? extraCls : '') + ' ' + me.cls,
                        html: comp.fieldLabel
                    });

                    comp.hideLabel = true; // hide the original label
                }
            },

            /**
             * Registers tooltip, if any, but only if the field isn't marked as invalid
             * For those cases we mark field as invalid and call appropriate method
             * @SenchaUpgrade Should we ask sencha to support tooltip on form field?
             */
            afterrender: function (field) {
                if (field.invalid) {
                    field.markInvalid(field.invalidText ? field.invalidText : ''); // use ExtJs default indicator
                } else if (field.tooltip && !field.invalid) {
                    field.setTooltip(field.tooltip, /*initial*/true);
                }
            },
            /**
             * Unregister tooltip, if any
             */
            beforedestroy: function (field) {
              field.clearTip();
            },
            /**
             * Keeps track if this field has focus.
             * If the field has focus, wait till BLUR before fire gw change event.
             */
            focus: gw.app.deferChangeTillBlur,
            /**
             * Determines whether to fire gw change event right away or wait till BLUR time.
             */
            change: function (comp, newValue, oldValue) {
                if (!comp.gChangeOnBlur) { // fire change right away, if the component doesn't have focus:
                    comp.fireEvent('blurchange', comp, newValue, oldValue);
                } else { // tracks changed state, but don't fire gw change event yet:
                    //@UpgradedSencha 5.1 special case for simplecombo
                    if(comp.xtype === 'simplecombo' && newValue === null) {
                        comp.newValueBlur = comp.lastValueBlur = comp.lastValueBlur || oldValue;
                        return true;
                    }

                    if (!comp.gchanged) {
                        comp.gchanged = true; // value changed
                        comp.lastValueBlur = oldValue; // track the last value
                    }
                    comp.newValueBlur = newValue; // track the new value
                }
            },
            /**
             * Fires gw change event, if the value has changed since FOCUS:
             */
            blur: gw.app.onBlurChange,

            /**
             * AHK - 5/29/2013
             * We never want the regular tooltip to display at the same time as the error tooltip,
             * since they can overlap weirdly.  So if there's a tooltip, we want to unregister it when
             * the field is marked invalid, and re-register it when the field is valid again.
             * See PL-26189
             * @SenchaUpgrade
             */
            validitychange: function (comp, isValid) {
              if (comp.tooltip) {
                if (isValid) {
                  comp.setTooltip(comp.tooltip, /*initial*/true);
                } else {
                  comp.clearTip();
                }
              }
            },
            /**
             * Registers gw change handler when the field is changed and lost focus
             */
            blurchange: gw.app.onChange
        });
    }
});

Ext.define('EXTJS17248.form.field.Base', {
    override: 'Ext.form.field.Base',

    onFieldMutation: function(e) {
        // When using propertychange, we want to skip out on various values, since they won't cause
        // the underlying value to change.
        if (!this.readOnly && !(e.type === 'propertychange' && this.ignoreChangeRe.test(e.browserEvent.propertyName))) {
            this.startCheckChangeTask();
        }
    },

    startCheckChangeTask: function() {
        var me = this,
            task = me.checkChangeTask;

        if (!task) {
            me.checkChangeTask = task = new Ext.util.DelayedTask(me.doCheckChangeTask, me);
        }
        if (!me.bindNotifyListener) {
            // We continually create/destroy the listener as needed (see doCheckChangeTask) because we're listening
            // to a global event, so we don't want the event to be triggered unless absolutely necessary. In this case,
            // we only need to fix the value when we have a pending change to check.
            me.bindNotifyListener = Ext.on('beforebindnotify', me.onBeforeNotify, me, {destroyable: true});
        }
        task.delay(me.checkChangeBuffer);
    }
});

// @SenchaUpgrade (Fixed in 5.1.1)
Ext.define('EXTJS16491.form.field.Base', {
    override: 'Ext.form.field.Base',
    setRawValue: function(value) {
        var me = this,
            rawValue = me.rawValue;

        if (!me.transformRawValue.$nullFn) {
            value = me.transformRawValue(value);
        }

        value = Ext.valueFrom(value, '');

        if (rawValue === undefined || rawValue !== value) {
            me.rawValue = value;

            // Some Field subclasses may not render an inputEl
            if (me.inputEl) {
                me.bindChangeEvents(false);
                me.inputEl.dom.value = value;
                me.bindChangeEvents(true);
            }

            if (me.rendered && me.reference) {
                me.publishState('rawValue', value);
            }
        }

        return value;
    },
    initEvents: function() {
        var me = this,
            inputEl = me.inputEl,
            onFieldMutation = me.onFieldMutation,
            events = me.checkChangeEvents,
            len = events.length,
            i, event;

        if (inputEl) {
            me.mon(inputEl, Ext.supports.SpecialKeyDownRepeat ? 'keydown' : 'keypress', me.fireKey, me);

            for (i = 0; i < len; ++i) {
                event = events[i];
                if (event === 'propertychange') {
                    me.usesPropertychange = true;
                }
                if (event === 'textInput') {
                    me.usesTextInput = true;
                }
                me.mon(inputEl, event, onFieldMutation, me);
            }
        }
        me.callParent();
    },
    bindChangeEvents: function(active) {
        var method = active ? 'resumeEvent' : 'suspendEvent',
            inputEl = this.inputEl;

        if (this.usesPropertychange) {
            inputEl[method]('propertychange');
        }

        if (this.usesTextInput) {
            inputEl[method]('textInput');
        }
    },
    deprecated: {
        "5": {
            methods: {
                doComponentLayout: function() {
                    // In IE if propertychange is one of the checkChangeEvents, we need to remove
                    // the listener prior to layout and re-add it after, to prevent it from firing
                    // needlessly for attribute and style changes applied to the inputEl.
                    this.bindChangeEvents(false);
                    this.callParent(arguments);
                    this.bindChangeEvents(true);
                }
            }
        }
    }

});
