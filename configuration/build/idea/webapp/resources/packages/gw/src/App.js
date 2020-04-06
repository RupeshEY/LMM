/**
 * The main app object that handles client state and communication with server.
 */
Ext.define('gw.app', function () {
    //
    // private properties and methods:
    //

    /** id of the last AJAX call */
    var _lastReq = null;
    /** css class to mark an html element as an event source. (Used for event not registered at Ext component level.) */
    var _EVENT_SOURCE_CLS = 'g-actionable';
    /** css class to indicate a panel is loading content from server */
    var _PANEL_LOADING_CLS = 'g-panel-loading';
    var _maskedElem = null;
    /** config options from the server */
    var _config = null;
    /** server url */
    var _serverURL = null;
    /** global keymap */
    var _keyMap = null;
    /** keeps track of field focus*/
    var _focusId = null;
    /** keeps track of lv focus row*/
    var _focusDataRecordIndex = -1;
    var _focusDataColumnPos = -1;
    var _focusRowParentId = null;
    var _activeLV = null;
    /** keeps track of mouse state */
    var _mouseDown = false;
    /** a window-timeout to invoke onChange handler */
    var _delayedOnChange = null;
    var _bWarnUnsavedWork = false;
    /** The id of the server-side request, which we send back to the server so the appropriate times can be associated */
    var _serverRequestId = null;
    /** The time when the last event began to be sent to the server.  We use this for performance tracking */
    var _eventStartTime = null;
    /** The time when the last event was actually sent to the server.  We use this for performance tracking */
    var _requestSentTime = null;
    /** Whether SeleniumGW_isGWOperationDone() has logged the action completed data point */
    var _actionCompleteLogged = false;
    /** The id of the last event source, used for performance tracking */
    var _lastEventSourceId = null;
    /** The data that we're going to send over in the magic reqMon field for performance tracking */
    var _reqMonData = null;
    /** true if the window.location is replacing, used for testing */
    var _locationReplacing = false;
    /** true if Ext.onReady() is called, used for testing  */
    var _ready = false;

    var _lastServerCall = null;

    /** keeps track of incoming ajax requests. */
    var _ajaxRequestQueue = [];

    /** keeps track of error messages for all ajax requests. */
    var _errors = [];

    var _gwIsReady = 0;

    /** Added for use in automated testing:  keeps track of the number of outstanding requests to the server */
    var _numOutstandingServerRequests = 0;

    /** dimensions of M in pixels for a form field */
    // @UpgradedSencha - We need the font field dimensions to help us compute a correct
    // approximate width and height for Text/TextAreas
    var _formFieldMFontDimensions = null;

    /** Flag set when processing certain keyboard shortcuts in IE; see _disableIEMenuShortcut for details */
    var _ignoreIEFocusEvent = false;

    /** default AJAX timeout value in seconds */
    var _ajaxTimeoutInSeconds = null;

    function collectChangesFromRecord(rec, store, params) {
        // @UpgradedSencha - Field maps is now an array, need to iterate through each element
        var fields = rec.getFields();
        var raw = rec.getChanges();

        Ext.iterate(raw, function (prop, value) {
            var m = Ext.Array.findBy(fields, function (field) {
                if (field.name === prop) {
                    return true;
                }
            });
            if (m != null) {
                var paramName = gw.GridUtil.getFullIdForCell(store, rec, m.name);
                // PL-31402 :workaround an IE issue, starEdit is deferred in showEditor which cause the data being marked as dirty but value
                // is not set properly. This data shouldn't be collected as 'changed' in this case to prevent data loss.
                if (Ext.isIE &&
                    (Ext.EventObject.type === 'click' || Ext.EventObject.type === 'mousemove')) {
                    if (Ext.ComponentManager.get(store.storeId) && gw.GridUtil.isCellInTemporaryEditingState(paramName, store)) {
                        return true;
                    }
                }
                if (value) {
                    if (value.cb != null) { // cell checkbox value
                        params[paramName + 'CB'] = value.cb
                    }

                    // unbox composite value, AT LAST
                    if (value.value !== undefined) {
                        value = value.value;
                    } else if (value.text !== undefined) {
                        value = value.text;
                    }
                }
                params[paramName] = value
            }
        });
    }

    /**
     * Collect form data and store data changed by the user
     * @return data changes
     */
    function getDataChanges() {
        var params,
            activeCombo,
            mainForm = Ext.getCmp('mainform');

        // too early to get changes
        if (!mainForm) {
            return null;
        }

        if (_focusId && (activeCombo = Ext.ComponentManager.get(_focusId)) instanceof Ext.form.ComboBox) {
            // @SenchaUpgrade: A bounded combo doesn't revert out-of-range value until blur.
            // Have to force it, when the action is invoked by keyboard shortcut and a combo still has focus
            activeCombo.assertValue(); // revert out-of-range value for bounded combo
        }

        gw.GridUtil.commitGridEditorValue();

        // form data
        // Use component query instead of getValues(). Since we are constantly replacing items
        // and having items inside menus and other containers not common to forms, it's more
        // reliable to not use a form
        // params = Ext.ComponentManager.get('mainform').getForm().getValues();
        params = getFormValues(mainForm);

        // store data:
        Ext.data.StoreManager.each(function (store) {

            var rs = store.getUpdatedRecords(),
                rLen = rs.length,
                i = 0;

            for (; i < rLen; i++) {
                //@UpgradedSencha 5.1 GW specific.
                // Ignore tree with modified parentId that is null.
                if (store.type === 'tree' && rs[i].modified.parentId === null) {
                    continue;
                }
                collectChangesFromRecord(rs[i], store, params)
            }

            // special values used for RadioColumn:
            if (store.extraValues) {
                Ext.apply(params, store.extraValues);
                delete store.extraValues; // forget it once send to server
            }
        });

        //checksum:
        var compsWithChecksum = [gw.Util.getTabBarLinksId(), gw.Util.getTabsId(), gw.Util.getInfoBarId(), gw.Util.getSystemAlertBarId()]
            .concat(Ext.ComponentManager.get('westPanel').items.items);
        Ext.each(compsWithChecksum, function (item) {
            if (Ext.isString(item)) {
                item = Ext.ComponentManager.get(item)
            }
            if (item && item.checksum) {
                params[item.id] = item.checksum
            }
        });
        return params
    }

    /**
     * Returns the combined values of all the form fields in the given form as an object. The object field
     * names are the names/ids of the fields and the values are the corresponding field values. If a particular
     * field has more than one value then the values are combined into an array.
     *
     * Based on the Basic.js getValues method; unfortunately we can't use standard Ext JS form handling (we
     * never create a Basic form) so we need our own version of the code, though we omit many of the options
     * provided by getValues because we don't need them.
     *
     * @param mainForm a form
     * @returns Object containing name value pairs for all fields in the form
     */
    function getFormValues(mainForm) {
        var values = {},
            fields = mainForm.query('[isFormField]'),
            f,
            fLen = fields.length,
            isArray = Ext.isArray,
            field, data, val, bucket, name;

        for (f = 0; f < fLen; f++) {
            field = fields[f];

            data = getSubmitData(field);
            if (Ext.isObject(data)) {
                for (name in data) {
                    if (data.hasOwnProperty(name)) {
                        val = data[name];

                        if (values.hasOwnProperty(name)) {
                            bucket = values[name];

                            if (!isArray(bucket)) {
                                bucket = values[name] = [bucket];
                            }

                            if (isArray(val)) {
                                values[name] = bucket.concat(val);
                            } else {
                                bucket.push(val);
                            }
                          } else {
                            values[name] = val;
                        }
                    }
                }
            }
        }

        return values;
    }
    /**
     * Given a form field returns the corresponding data that should be submitted to the server. Usually
     * just calls the standard Ext JS getSubmitData() method but has special handling for the case where
     * a radio group has no button checked. Normally Ext JS returns nothing at all in this case - the
     * group itself always returns null from getSubmitData() and the individual buttons are all unchecked
     * so none of them return anything either. We detect this case and return the empty string for such
     * an empty radio button group, which the server side will interpret as a null value for the whole
     * group.
     * @param field a form field
     * @returns Object containing the submit data for the field, typically a single name-value pair, the
     *   name being this field's name/id and the value being its current stringified value
     */
    function getSubmitData(field) {
        if (isEmptyRadioGroup(field)) {
            var value = {};
            value[field.getId()] = "";
            return value;
        } else {
            return field.getSubmitData();
        }
    }

    function isEmptyRadioGroup(field) {
        return field instanceof Ext.form.RadioGroup && Ext.Array.every(field.getBoxes(), function(box) {
            return !box.getValue();
          });
    }

    function _getCsrfToken() {
        return Ext.util.Cookies.get(gw.app.CSRF_TOKEN_COOKIE_KEY);
    }

    /**
     * It seems there might be a situation where the communcations messages might not be sent over from the server, so
     * provide default messages for them so that any failures in communication will have useful messages.
     * @private
     */
    function _checkDefaultCommunicationMessages() {
        _config = _config || {};
        _config.displayKeys = _config.displayKeys || {};
        if (!_config.displayKeys["ExtJS.Alert.HTTPRequestFailed"]) {
            _config.displayKeys["ExtJS.Alert.HTTPRequestFailed"] = 'ExtJS.Alert.HTTPRequestFailed';
            gw.Debug.log('ExtJS.Alert.HTTPRequestFailed display key not loaded from server.');
        }
        if (!_config.displayKeys["ExtJS.Alert.InvalidServerResponse"]) {
            _config.displayKeys["ExtJS.Alert.InvalidServerResponse"] = 'ExtJS.Alert.InvalidServerResponse';
            gw.Debug.log('ExtJS.Alert.InvalidServerResponse display key not loaded from server.');
        }
        if (!_config.displayKeys["ExtJS.Alert.HTTPRequestTimedOut"]) {
            _config.displayKeys["ExtJS.Alert.HTTPRequestTimedOut"] = 'ExtJS.Alert.HTTPRequestTimedOut';
            gw.Debug.log('ExtJS.Alert.HTTPRequestTimedOut display key not loaded from server.');
        }
    }

    /**
     * Check if an ajax request is currently executing, and queue this request if yes.
     * @see _callServer the callers doc for a description of the parameters!
     * @returns {boolean} true if the request was queued.
     */
    function queueRequestIfLoading(eventSource, eventParam, params, postForm, maskElem, auxConfig) {
        if (Ext.Ajax.isLoading()) {
            gw.Debug.log('<span style="color:olive">Ajax request put in queue.</span> Current request: [' +
            Ext.Ajax.getLatest().id + '] ' + Ext.Ajax.getLatest().options.params);
            var requestParams = [];
            requestParams.eventSource = eventSource;
            requestParams.eventParam = eventParam;
            requestParams.params = params;
            requestParams.postForm = postForm;
            requestParams.maskElem = maskElem;
            requestParams.auxConfig = auxConfig;
            _ajaxRequestQueue.push(requestParams);
            return true;
        }
        return false;
    }


    function clearGridNavigationIfNavigateToNewLocation(isPostOnChange, params) {
        // If it is not postOnChange and is not renderViewRootOnly. then it means going to a different location.
        // In this case we clear the gridNavigation.
      if (!isPostOnChange && !params.renderViewRootOnly) {
        gw.app._gridNavigation = null;
      }
    }

    /**
     * Process newest request that was queued up before.
     */
    function processQueuedRequest(requestOptions) {
        // Check if any more requests are in queue, do not process if a request is 'in flight'.
        if (_ajaxRequestQueue.length > 0 && !Ext.Ajax.isLoading()) {
            var requestParams = _ajaxRequestQueue.shift();
            _callServer(requestParams.eventSource, requestParams.eventParam, requestParams.params, requestParams.postForm, requestParams.maskElem, requestParams.auxConfig)
        } else {
            // Show errors after all requests have been processed:
            if (_errors.length > 0) {
                gw.CmdProc.showErrors({cmd: 'showErrors', errors: _errors});
                _errors = []
            }
        }
    }

    /**
     * Wraps making the Ajax request to process queued up requests submitted before.
     * @param requestParams
     * @returns {Object} the last request (return value of Ext.Ajax.request())
     * @private
     */
    function _processAjaxRequest(requestParams) {
        var realCallback = requestParams.callback;

        gw.Debug.servercalllog(requestParams);

        function _wrappedAjaxCallback(requestOptions, success, response) {
            // Invoke callback to finish up the last request:
            realCallback(requestOptions, success, response);
            processQueuedRequest(requestOptions);
            _numOutstandingServerRequests--;
        }

        requestParams.callback = _wrappedAjaxCallback;
        _numOutstandingServerRequests++;

        if (requestParams.download) {
            return gw.doc.Management.downloadContent(requestParams);
        }

        return Ext.Ajax.request(requestParams)
    }


    /**
     * Sends request to server. Queues up request if another one is currently processing.
     * @param eventSource id of the action source
     * @param eventParam additional param for the action
     * @param params (optional) params for the server request, if not specified, form values are collected
     * @param postForm (optional) if true, and params is not null, form values are added to the params
     * @param maskElem (optional) if not specified the entire page body will be masked during the request
     * @param auxConfig (optional) additional config for the request
     * @return Returns the AJAX request id, if any request sent, -1 if the request was queued.
     */
    function _callServer(eventSource, eventParam, params, postForm, maskElem, auxConfig) {
        gw.Debug.log("Calling server params=" + params);

        // If a pending request is being processed, queue up the new request till the previous one finishes:
        if (queueRequestIfLoading(eventSource, eventParam, params, postForm, maskElem, auxConfig)) {
            return -1;
        }

        // We record the time that the call was initiated and what initiated the call; this data is then pulled
        // out at the end of processing the reply to compute the total end-to-end time and to set the _reqMonData
        // variable.
        _eventStartTime = new Date().getTime();
        if (eventSource == "_refresh_") {
            _lastEventSourceId = eventParam + '.' + eventSource
        } else {
            _lastEventSourceId = eventSource;
        }

        if (!params) { // collect form values, if no params specified:
            params = getDataChanges()
        } else if (postForm) {
            Ext.apply(params, getDataChanges())
        }

        // Add CSRF token.
        params.csrfToken = _getCsrfToken();

        // collect scroll positions, and remember it in this "request scope":
        //@upgradedSencha 5.1 Use scroller object
        var scrollPositions = {};
        Ext.ComponentManager.each(function (id, comp) {
            if (comp.scrollable) {
                var scroll = comp.getScrollable().getPosition();
                if (scroll.x !== 0 || scroll.y !== 0) {
                    scrollPositions[comp.id] = scroll;
                }
            }
        });
        if (Ext.Object.getKeys(scrollPositions).length > 0) {
            params.scrollPositions = Ext.JSON.encode(scrollPositions); // send scroll positions to server
        }

        // apply special params:
        if (eventSource) {
            params.eventSource = eventSource;
        }
        if (eventParam != null) { // allow blank string as eventParam
            params.eventParam = eventParam
        }

        // If _reqMonData is set, that means we have timing data to send back to the server.  So we send it back as
        // the special "reqMon" parameter, then null it out so we don't re-send the same data twice.
        if (_reqMonData) {
            params.reqMon = _reqMonData;
            _reqMonData = null;
        }

        var fullPage = !params.ajaxRequestInfo;
        if (fullPage) { // full page refresh
            if (_focusId) { // send focus id to server
                gw.Debug.log('Sending current focus to server: ' + _focusId);
                params.objFocusId = _focusId;
            }
            if (_delayedOnChange) { // cancel timeout for postOnChange, since we are posting now:
                gw.Debug.log('clear _delayedOnChange');
                clearTimeout(_delayedOnChange);
                _delayedOnChange = null
            }
        }

        _lastServerCall = eventSource + ", " + eventParam + ", " + params ? Ext.encode(params) : "";
        if (maskElem != 'NO_MASK_ELEM') {
            _showBusy.call(gw.app, maskElem)
        }

        var skipFocusOnPOC = false;
        if (params.skipFocusOnPOC) {
            skipFocusOnPOC = true;
            delete params.skipFocusOnPOC;
        }
        var pendingClickComponent = null;
        if (params.pendingClickComponent) {
            pendingClickComponent = params.pendingClickComponent;
            delete params.pendingClickComponent;
        }
        clearGridNavigationIfNavigateToNewLocation(skipFocusOnPOC, params);

        // Apply auxConfig to build all options.
        var options = Ext.apply({
            url: _serverURL,
            params: Ext.urlEncode(params),
            callback: _requestCallback,
            fullPage: fullPage,
            isRenderViewRootOnly: params.renderViewRootOnly,
            skipFocusOnPOC: skipFocusOnPOC,
            pendingClickComponent: pendingClickComponent,
            timeout: gw.app.ajaxTimeout()
        }, auxConfig);

        _lastReq = _processAjaxRequest(options);
        _requestSentTime = new Date().getTime();
        return _lastReq;
    }

    /**
     * processes commands from server response
     * @private
     */
    function _processCommands(commands, requestOptions, response) {
        var startMark = "gwProcessCommandsStart",
            northPanel = Ext.getCmp('northPanel'),
            northPanelRefreshed = false,
            northPanelIsAlreadyVisible = northPanel && northPanel.isVisible();

        gw.Performance.mark(startMark);
        if (!commands || !commands.length) {
            // Bail out if there are no commands to process.  This can happen if there is a JSON parsing error
            return;
        }
        // AHK - 12-11-2012 - As a performance optimization, we want to suspend all layout
        // during command processing, and only actually do the layout once we're done with
        // all commands
        Ext.suspendLayouts();

        gw.Debug.commandlog("--begin--");
        for (var i = 0; i < commands.length; i++) {
            var op = commands[i];
            gw.app.processCommand(op, requestOptions, response);
            northPanelRefreshed = op.target === 'northPanel' || northPanelRefreshed;
        }
        gw.Debug.commandlog("--end--");
        Ext.resumeLayouts(true);

        // PLWEB-6059: Because IE is the greatest browser ever with no bugs
        if (Ext.isIE && northPanelRefreshed && !northPanelIsAlreadyVisible) {
            if (northPanel && northPanel.isVisible()){
                northPanel.hide();
                northPanel.show();
            }
        }

    }

    /**
     * Handles success response from server
     * @param requestOptions request info
     * @param success if the request succeeded
     * @param response response
     */
    function _requestCallback(requestOptions, success, response) {
        // We null out _serverRequestId at the start, since it
        // should be set in the course of processing commands if the server is doing request time monitoring
        _serverRequestId = null;
        var responseReceivedTime = new Date().getTime();
        _hideBusy.call(gw.app);

        _locationReplacing = false;

        if (gw.app.wasUnsuccessfulAjaxStatusHandled(success, response)) {
            return;
        }
        var commands;
        try {
            commands = Ext.decode(response.responseText)
        } catch (e) {
            gw.app.showAlert(gw.app.localize("ExtJS.Alert.InvalidServerResponse", "\n" + response.responseText));
            return;
        }

        _processCommands(commands, requestOptions, response);

        // reset the activeLV back to null after rendering
        if (requestOptions.fullPage && gw.app.getActiveLV() != null) {
            gw.app.setActiveLV(null);
        }

        // re-focus except when renderViewRootOnly=true(autoComplete & InputGroup case)
        if (!requestOptions.isRenderViewRootOnly) {
            _initFocus(requestOptions.skipFocusOnPOC);
        }

        if (requestOptions.postCallback) { // additional op after processing response
            requestOptions.postCallback.call(requestOptions.postCallbackScope ? requestOptions.postCallbackScope : this,
                requestOptions, response)
        }

        _clickPendingComponent(requestOptions);

        //Restore scroll position, if so requested
        //@UpgradedSencha 5.1 Use scroller object
        if (requestOptions.scrollPositions) {
            Ext.Object.each(requestOptions.scrollPositions, function (id, scrollInfo) {
                var comp = Ext.ComponentManager.get(id);
                if (comp) {
                    if (typeof(scrollInfo.x) === 'number' && typeof(scrollInfo.y) === 'number') {
                        comp.getScrollable().scrollTo(scrollInfo.x, scrollInfo.y);
                    }
                }
            });
        }

        var doneProcessingTime = new Date().getTime();
        var requestPrepTime = (_requestSentTime && _eventStartTime ? _requestSentTime - _eventStartTime : 0);
        var responseTime = (_requestSentTime ? responseReceivedTime - _requestSentTime : 0);
        var clientRenderTime = (doneProcessingTime - responseReceivedTime);
        // If _serverRequestId is non-null, that means the server is doing request time monitoring, so we want to set
        // the _reqMonData variable so the data gets sent back to the server on the next event
        if (_serverRequestId) {
            _reqMonData = Ext.JSON.encode([_lastEventSourceId, requestPrepTime, responseTime, clientRenderTime, doneProcessingTime, _serverRequestId, navigator.userAgent]);
        }
        gw.Debug.log('<span style="color:orange">_requestCallback took ' + responseTime + 'ms (response), + ' + clientRenderTime + ' (client)ms</span>');
        _lastEventSourceId = null;
        _eventStartTime = null;
        _requestSentTime = null;
        _actionCompleteLogged = false;
    }

    /**
     * Called after a server call to continue the clicking of a component when that click was interrupted by having
     * to update the server with the latest value from a post on change input
     * @param requestOptions the request options, which may contain the id of the "pending click component"
     * @private
     */
    function _clickPendingComponent(requestOptions) {
        if (!requestOptions.pendingClickComponent) {
            return;
        }
        var cmp = Ext.getCmp(requestOptions.pendingClickComponent);
        if (cmp) {
            if (cmp.disabledForPendingClick) {
                cmp.setDisabled(false);
                delete cmp.disabledForPendingClick;
            }
            if (!cmp.isDisabled()) {
                cmp.fireEvent('click', cmp);
            }
        }
    }

    /**
     * Masks a component to prevent user action.
     * @comp must be a container component. If not specified, the entire page body will be masked
     */
    function _showBusy(comp) {
        _maskedElem = null;
        if (comp) {
            if (comp.items) {
                _maskedElem = comp.getEl()
            }
        } else {
            _maskedElem = Ext.getBody();
        }

        if (_maskedElem) {
            _maskedElem.mask()
        }
    }

    /**
     * Unmask the element masked during last request
     */
    function _hideBusy() {
        if (_maskedElem) {
            _maskedElem.unmask()
        }
    }

    function _isFieldFocusable(f) {
        return f.xtype != 'quickjump' &&
            f.xtype != 'hidden' &&
            f.xtype != 'gHiddenFile' &&
            f.xtype != 'gfile' &&
            f.xtype != 'gfileReadOnly' &&
            !(f instanceof Ext.form.field.Display) && !f.disabled && f.isVisible() && !f.readOnly
    }

    /**
     * Sets initial field focus
     */
    function _initFocus(skipFocusOnPOC) {
        var field = null;

        if (_focusId) { // restore focus
            field = Ext.ComponentManager.get(_focusId);
            if (field) { // Ext Component
                if (_isFieldFocusable(field)) {
                    field = _getFocusableField(field)
                }
                else {
                    field = null
                }
            } else { // DOM Element
                field = Ext.get(_focusId);
            }
            _focusId = null;
        }

        if (!field && !skipFocusOnPOC) { // find the first field on page
            Ext.getCmp('mainform').cascade(function (cmp) {
                // stop everything on the current branch if:
                // - we found the field already
                if (field) {
                    return false;
                }

                // if is focusable and we found the field, stop everything
                if (cmp.isFormField && _isFieldFocusable(cmp)) {
                    field = _getFocusableField(cmp);
                    if (field) {
                        return false;
                    }
                }
            });
        }

        //technically, this is a "selection" and a "focus"
        var lvFocusRow = _focusDataRecordIndex >= 0 && _focusRowParentId;
        if (lvFocusRow) {
            //@UpgradedSencha 5.1 - TODO figure out if we still need this code with the new navigation model
            var grid = Ext.getCmp(_focusRowParentId);
            if (grid){
                var gridNavigationModel = grid.getNavigationModel();
                if (gridNavigationModel && (gridNavigationModel instanceof Ext.grid.NavigationModel)){
                  // clear the old position and set it the position to the first column using the magical method we wrote
                  gridNavigationModel.clearAndSetPosition(_focusDataRecordIndex, _focusDataColumnPos);

                  // focus on the new position in the first column
                  var gridNavPosition = gridNavigationModel.getPosition();
                  if (gridNavPosition) {
                    var cell = grid.view.getCellByPosition(gridNavPosition);
                    if (cell) {
                      cell.focus();
                    }
                  }
                }
            }

          gw.app.resetFocusDataRecordIndex();
        }

        //do not focus on field if we are focusing on the lv row
        if (field && !lvFocusRow) {
            gw.Debug.log('Setting initial focus to ' + field.id);
            if (field instanceof Ext.dom.Element) {
                field.focus();
            } else if (field instanceof Ext.form.Checkbox) {
                var focusEl = field.getFocusEl();
                if (focusEl) {
                    focusEl.focus();
                }
            } else if (field instanceof Ext.form.CheckboxGroup) {
                field = field.items.get(0); //focus on the first input in the group
            } else {
                var selectText = field instanceof Ext.form.field.Text; // @SenchaUpgrade Is it an ExtJs bug that "selectText==true" will cause javascript exception for non-text-input?
                field.focus(selectText);
            }
        }
    }

    function _getFocusableField(field) {
        if (field instanceof Ext.form.FieldContainer) {
            var compFieldToFocus = null;
            field.items.each(function (f) {
                if (_isFieldFocusable(f) && !(f instanceof Ext.form.ComboBox)) { // do not default focus to a dropdown
                    compFieldToFocus = f;
                    return false; // stop iteration
                }
            });
            return compFieldToFocus;
        }
        return field;
    }

    /**
     * Show help info
     */
    function _helpWindow() {
        var helpText = 'Help Window: Alt-Shift-H<br>' +
            'Info Page: Alt-Shift-I<br>' +
            'Server Tools: Alt-Shift-T<br>' +
            'Reload PCFs: Alt-Shift-L<br>' +
            'Widget Page Info: Alt-Shift-W<br>' +
            'Refresh Page: Alt-Shift-F<br>' +
            'JavaScript Debug Info: Alt-Shift-G<br>' +
            'Edit Page Config: Alt-Shift-E (Experimental)';
        Ext.Msg.alert('', helpText);
    }

    /**
     * Displays special frame in popup window
     * @param frameId frame id
     * @param forceWidth set width of frame, defaults to 525
     * @param forceHeight set height of frame, defaults to 330
     */
    function _showFrame(frameId, forceWidth, forceHeight) {
        //this feels like a bit of overkill testing, but there was the one instance calling
        //_showFrame with two string arguments incorrectly, and we need to make sure that second
        //param doesn't become the forcedWidth
        if(isNaN(forceWidth)) forceWidth = undefined;
        if(isNaN(forceHeight)) forceHeight = undefined;
        forceWidth = forceWidth || 525;
        forceHeight = forceHeight || 330;
        return gw.app.openPopup(_serverURL + '?inFrame=' + frameId + '&r=' + Math.floor(Math.random() * 10000),
            frameId,
            'scrollbars=yes,width=' + forceWidth + ',height=' + forceHeight + ',dependent=yes,resizable=yes');
    }

    /**
     * The following is horrible hackery to make keyboard shortcuts work more reliably on IE.
     *
     * The normal event.preventDefault() mechanism does not work for key down events in IE. If a key combination is bound to an IE specific shortcut,
     * like Alt-F (File menu) then the JavaScript event will fire but preventDefault() will not prevent IE from also popping up the IE file menu.
     * Various fixes are suggested on the internet - setting the keyCode to zero, setting returnValue to false, returning false from the event handler -
     * but none of them work reliably. The only thing guaranteed to work is to set up a link with an "accesskey". For example a link with the accesskey
     * "f" will grab Alt-F and the IE file menu will not come up.
     *
     * The following sets up a whole set of such access key links for all the common shortcut keys (A through Z, plus the digits 0 through 9).
     * Unfortunately these links not only grab the shortcut key they also grab focus. We try to patch this up by seeing who had focus before the link
     * was activated and then restoring focus to that same element in the link's onfocus handler. Even this isn't good enough because when menus lose
     * focus they hide themselves and just giving them focus again doesn't make them reappear (explicitly calling show on them doesn't work either).
     * So we expose the shouldIgnoreIEFocusEvent method which allows us to ignore the single focus event that occurs as a result of our workaround.
     * This means Ext JS never sees the focus event and never tries to hide any active menus.
     */
    function _disableIEMenuShortcut() {
        if (Ext.isIE) {
            var ch = 'abcdefghijklmnopqrstuvwxyz01234567890'.split('');
            var str = '<span style="position:absolute">';
            var span, i, anchor;
            var lastElementWithFocus;

            for (i = 0; i < ch.length; i++) {
                str += '<a accessKey="' + ch[i] + '" href="javascript:void(0)" tabIndex="-1"></a>';
            }
            str += '</span>';

            span = Ext.dom.Helper.insertFirst(Ext.getBody(), str);
            for (i = 0; i < span.children.length; i++) {
                anchor = span.children[i];
                anchor.onbeforeactivate = function() {
                    lastElementWithFocus = document.activeElement;
                    _ignoreIEFocusEvent = true;
                };
                anchor.onfocus = function() {
                    var saveLastElementWithFocus = lastElementWithFocus;
                    lastElementWithFocus = null;
                    _ignoreIEFocusEvent = false;
                    _restoreFocusToPreviousElement(saveLastElementWithFocus);
                }
            }
        }
    }

    function _restoreFocusToPreviousElement(lastElementWithFocus) {
        try {
            lastElementWithFocus.focus();
        } catch (e) {
        }
    }

    function _overrideFocusHandlingForFirefox() {

        if (!Ext.supports.FocusinFocusoutEvents) {
            var focusTimeout = 0;
            /*
             * @private: Only override for Firefox
             * EXTJS-17201 - Fix below. Include this code in the application's launch event, or in an "Ext.onReady".
             * This will add the override if it's in a browser that doesn't support FocusIn and FocusOut events.
             */
            Ext.define('ExtOverride.event.publisher.Focus', {
                override: 'Ext.event.publisher.Focus',

                handledDomEvents: ['focus', 'blur'],

                doDelegatedEvent: function(e, invokeAfter) {
                    var me = this;

                    e = me.callSuper([e, false]);

                    if (e) {
                        // clear the set timeout when the focus comes in immediately after a blur
                        if (e.type === 'focus') {
                            clearTimeout(focusTimeout);
                        }
                        if (e.type === 'blur') {
                            var blurredEl = e.target === window ? document.body : e.target;

                            // There might be an upcoming focus event, but if none happens
                            // within 1ms, then we treat this as a focus of the body
                            focusTimeout = setTimeout(function() {
                                focusTimeout = 0;
                                Ext.event.publisher.Focus.previousActiveElement = null;
                                me.processFocusIn(e, blurredEl, document.body, invokeAfter);
                            }, 0);
                            if (e.target === window || e.target === document) {
                                Ext.event.publisher.Focus.previousActiveElement = null;
                            }
                            else {
                                Ext.event.publisher.Focus.previousActiveElement = e.target;
                            }
                        } else {

                            // PLWEB-5956: The previous active element is stale on FF43+. Use the ID get it from the Ext cache
                            var previousActiveElement = Ext.event.publisher.Focus.previousActiveElement;

                            if (previousActiveElement && !document.contains(previousActiveElement)) {
                                previousActiveElement = null;
                            }

                            me.processFocusIn(e, previousActiveElement || document.body, e.target === window ? document.body : e.target, invokeAfter);
                        }
                    }
                }
            });
        }
    }

    function _updateLocalizationInfo() {

        var parseCodes = {
            g: 1,
            c: "if (/(" + _config.localeInfo.amPmSymbols[0] + ")/i.test(results[{0}])) {\n"
            + "if (!h || h == 12) { h = 0; }\n"
            + "} else { if (!h || h < 12) { h = (h || 0) + 12; }}",
            s: "(" + _config.localeInfo.amPmSymbols[0] + "|" + _config.localeInfo.amPmSymbols[1] + ")",
            calcAtEnd: true
        };

        //@SenchaUpgrade this needs to match the default parse function in Ext.Date
        var defaultParseFunction = {
            MS: function (input, strict) {
                // note: the timezone offset is ignored since the MS Ajax server sends
                // a UTC milliseconds-since-Unix-epoch value (negative values are allowed)
                var r = (input || '').match(MSFormatRe);
                return r ? new Date(((r[1] || '') + r[2]) * 1) : null;
            },
            time: function (input, strict) {
                var num = parseInt(input, 10);
                if (num || num === 0) {
                    return new Date(num);
                }
                return null;
            },
            timestamp: function (input, strict) {
                var num = parseInt(input, 10);
                if (num || num === 0) {
                    return new Date(num * 1000);
                }
                return null;
            }
        };

        //@SenchaUpgrade this needs to match the default parse function in Ext.Date
        var defaultFormatFunctions = {
            MS: function () {
                // UTC milliseconds since Unix epoch (MS-AJAX serialized date format (MRSF))
                return '\\/Date(' + this.getTime() + ')\\/';
            },
            time: function () {
                return this.getTime().toString();
            },
            timestamp: function () {
                return utilDate.format(this, 'U');
            }
        };

        Ext.Date.formatCodes.a = "(this.getHours() < 12 ? '" + _config.localeInfo.amPmSymbols[0] + "' : '" + _config.localeInfo.amPmSymbols[1] + "')";
        Ext.Date.formatCodes.A = "(this.getHours() < 12 ? '" + _config.localeInfo.amPmSymbols[0] + "' : '" + _config.localeInfo.amPmSymbols[1] + "')";
        Ext.Date.parseCodes.a = parseCodes;
        Ext.Date.parseCodes.A = parseCodes;

        Ext.Date.parseFunctions = defaultParseFunction;
        Ext.Date.formatFunctions = defaultFormatFunctions;

        Ext.Date.shortMonthName = _config.localeInfo.shortMonths;
        Ext.Date.shortDayName = _config.localeInfo.shortWeekDays;
        Ext.Date.narrowDayName = _config.localeInfo.narrowWeekDays;
        Ext.Date.narrowMonthName = _config.localeInfo.narrowMonths;

        Ext.Date.dayNumbers = {};
        Ext.Date.monthNumbers = {};

        Ext.Array.forEach(_config.localeInfo.dayNames, function (item, idx, arr) {
            Ext.Date.dayNumbers[item] = idx;
        });
        Ext.Array.forEach(_config.localeInfo.monthNames, function (item, idx, arr) {
            Ext.Date.monthNumbers[item] = idx;
        });
        Ext.Array.forEach(_config.localeInfo.shortMonths, function (item, idx, arr) {
            Ext.Date.monthNumbers[item] = idx;
        });
        Ext.Array.forEach(_config.localeInfo.narrowMonths, function (item, idx, arr) {
            Ext.Date.monthNumbers[item] = idx;
        });

        Ext.override(Ext.form.field.Base, {
            invalidText: _config.displayKeys["Java.Web.Validation.StepOff.InvalidValue"]
        });

        Ext.override(Ext.form.CheckboxGroup, {
            blankText: _config.displayKeys["Java.Web.Validation.StepOff.InvalidValue"]
        });
        Ext.override(Ext.PagingToolbar, {
            beforePageText: _config.displayKeys["ExtJS.Paging.BeforePageText"],
            afterPageText: _config.displayKeys["ExtJS.Paging.AfterPageText"],
            firstText: _config.displayKeys["ExtJS.Paging.FirstText"],
            prevText: _config.displayKeys["ExtJS.Paging.PrevText"],
            nextText: _config.displayKeys["ExtJS.Paging.NextText"],
            lastText: _config.displayKeys["ExtJS.Paging.LastText"],
            refreshText: _config.displayKeys["ExtJS.Paging.RefreshText"],
            displayMsg: _config.displayKeys["ExtJS.Paging.DisplayMsg"],
            emptyMsg: _config.displayKeys["ExtJS.Paging.Empty"]
        });

        Ext.override(Ext.grid.header.Container, {
            sortAscText: _config.displayKeys["ExtJS.Grid.Header.Container.SortAscText"],
            sortDescText: _config.displayKeys["ExtJS.Grid.Header.Container.SortDescText"],
            columnsText: _config.displayKeys["ExtJS.Grid.Header.Container.ColumnsText"]
        });

        Ext.override(Ext.grid.feature.Grouping, {
            emptyGroupText: _config.displayKeys["ExtJS.Grid.GroupingFeature.EmptyGroupText"],
            groupByText: _config.displayKeys["ExtJS.Grid.GroupingFeature.GroupByText"],
            showGroupsText: _config.displayKeys["ExtJS.Grid.GroupingFeature.ShowGroupsText"]
        });

        Ext.override(Ext.Date, {
            monthNames: _config.localeInfo.monthNames,
            dayNames: _config.localeInfo.dayNames,
            getShortDayName: function (day) {
                return Ext.Date.shortDayName[day];
            },
            getShortMonthName: function (month) {
                return Ext.Date.shortMonthName[month];
            }
        });

        Ext.override(Ext.MessageBox.buttonText, {
            ok: _config.displayKeys["Button.OK"],
            cancel: _config.displayKeys["Button.Cancel"],
            yes: _config.displayKeys["Button.Yes"],
            no: _config.displayKeys["Button.No"]
        });

        //ExtJs Private
        Ext.override(Ext.picker.Month, {
            cancelText: _config.displayKeys["Button.Cancel"],
            okText: _config.displayKeys["Button.OK"]
        });

        Ext.override(Ext.picker.Date, {
            monthNames: _config.localeInfo.monthNames,
            dayNames: _config.localeInfo.dayNames,
            startDay: _config.localeInfo.firstDayOfWeek,
            ariaTitleDateFormat: _config.localeInfo.ariaTitleDateFormat,
            longDayFormat: _config.localeInfo.longDayFormat,
            ariaTitle: _config.displayKeys["ExtJS.Picker.Date.AriaTitle"],
            todayText: _config.displayKeys["Button.Today"],
            nextText: _config.displayKeys["ExtJS.Picker.Date.NextText"],
            prevText: _config.displayKeys["ExtJS.Picker.Date.PrevText"],
            monthYearText: _config.displayKeys["ExtJS.Picker.Date.MonthYearText"],
            monthYearFormat: _config.localeInfo.monthYearFormat,
            todayTip: _config.displayKeys["ExtJS.Picker.Date.TodayTip"],

            getDayInitial: function (day) {
                return Ext.Date.narrowDayName[Ext.Date.dayNumbers[day]];
            }
        });

        Ext.override(Ext.form.field.Date, {
            startDay: _config.localeInfo.firstDayOfWeek
        });

        Ext.override(gw.ext.TimePickerField, {
            twelveHourMode: _config.localeInfo.twelveHourClock,
            amSymbol: _config.localeInfo.amPmSymbols[0],
            pmSymbol: _config.localeInfo.amPmSymbols[1]
        });

        Ext.override(gw.ext.DateTimePicker, {
            twelveHourMode: _config.localeInfo.twelveHourClock,
            amSymbol: _config.localeInfo.amPmSymbols[0],
            pmSymbol: _config.localeInfo.amPmSymbols[1]
        });
    }

    /**
     * Computes the font dimensions of the letter M  for use in converting display
     * rows/cols into pixel width/height
     * @private
     */
    function _computeFontDimensions() {
        var hiddenLabel = new Ext.form.Label({
            text: 'M',
            renderTo: document.body,
            style: 'display: none'
        });

        var dimensions = Ext.util.TextMetrics.measure(hiddenLabel.el, "M");

        hiddenLabel.destroy();

        _formFieldMFontDimensions = dimensions || {width: 8, height: 10};
    }

    // Registers global key map
    function _registerGlobalKeyMap() {
        var keys = [
// If we register ENTER key here, when a non-default button has focus, ENTER will not be invoked on that button.
// The problem does not happen, when the key map is registered by each widget. (Why??)
//          {key:Ext.event.Event.ENTER, shift:false, alt:false, fn:_handleEnterKey} // ENTER key
        ];
        if (_config.enableTools) {
            keys = keys.concat([
                {
                    key: gw.app.stringToKeyCodes('h'),
                    alt: true,
                    shift: true,
                    defaultEventAction: 'stopEvent',
                    fn: _helpWindow
                },
                {
                    key: gw.app.stringToKeyCodes('i'),
                    alt: true,
                    shift: true,
                    defaultEventAction: 'stopEvent',
                    fn: function () {
                        _showFrame('locinfo')
                    }
                },
                {
                    key: gw.app.stringToKeyCodes('w'),
                    alt: true,
                    shift: true,
                    defaultEventAction: 'stopEvent',
                    fn: function () {
                        _showFrame('widget')
                    }
                },
                {
                    key: gw.app.stringToKeyCodes('l'),
                    alt: true,
                    shift: true,
                    defaultEventAction: 'stopEvent',
                    fn: function () {
                        _callServer('_reloadPCF_')
                    }
                },
                {
                    key: gw.app.stringToKeyCodes('f'),
                    alt: true,
                    shift: true,
                    defaultEventAction: 'stopEvent',
                    fn: function () {
                        gw.app.refresh()
                    }
                },
                {
                    key: gw.app.stringToKeyCodes('e'),
                    alt: true,
                    shift: true,
                    defaultEventAction: 'stopEvent',
                    fn: function () {
                        _callServer('_editCurrentPage_')
                    }
                },
                {
                    key: gw.app.stringToKeyCodes('g'),
                    alt: true,
                    shift: true,
                    defaultEventAction: 'stopEvent',
                    scope: gw.Debug,
                    fn: gw.Debug.start
                }
            ]);
        }
        if (_keyMap) {
            _keyMap.destroy();
        }
        _keyMap = new Ext.util.KeyMap(Ext.getDoc(), keys);
    }

    function _setReady() {
      _ready = true
    }

    //
    // public methods:
    //
    return {
        singleton: true,
        uses: [
            'Ext.Ajax', 'Ext.state.LocalStorageProvider', 'Ext.event.Event'
        ],
        // @UpgradedSencha 5.1 - store these string constants in a relatively global scope to use in lots of places
        ROW_CHECK_COLUMN_CLASS: Ext.baseCSSPrefix + 'grid-checkcolumn',
        ROW_CHECK_COLUMN_CHECKED_CLASS: Ext.baseCSSPrefix + 'grid-checkcolumn-checked',
        GRID_CELL_MENU_CLASS: 'g-cell-menu',
        GW_RADIO_GROUP_CELL_CLASS: 'gw-radio-group-cell',
        HELPER_CELL_ICON_CLASS: 'g-helper-cell-icon',
        ACCORDION_DISABLED_CLASS: 'g-disabled',
        CSRF_TOKEN_COOKIE_KEY: 'csrfToken',
        CSRF_TOKEN_PARAM_KEY: 'csrfToken',

        /**
         * Holds last grid navigation information
         */
        _gridNavigation: null,

        updateConfig: function (config) {
            Ext.apply(_config, config);
            _updateLocalizationInfo();
            _registerGlobalKeyMap();
        },

        getConfig: function () {
            return _config;
        },

        getFocusId: function () {
            return _focusId;
        },

        /**
         * Returns an array of keyCode for each letter in the string.
         * To workaround ExtJs bug that KeyMap only works with keyCode but not letters.
         */
        stringToKeyCodes: function (str) {
            var keyCodes = [];
            if (str != null) {
                str = str.toUpperCase();
                for (var i = 0; i < str.length; i++) {
                    keyCodes[i] = str.charCodeAt(i);
                    // special handling:
                    if (keyCodes[i] == 46 || keyCodes[i] == 62) { // . or >
                        keyCodes[i] = 190;
                    } else if (keyCodes[i] == 44 || keyCodes[i] == 60) { // , or <
                        keyCodes[i] = 188;
                    } else if (keyCodes[i] == 47 || keyCodes[i] == 63) {  // / or ?
                        keyCodes[i] = 191;
                    }
                }
            }
            return keyCodes;
        },

        /**
         * Records field focus
         * @param fieldId id of the field that has the focus (must not be null)
         *
         */
        onFocus: function (fieldId) {
            if (fieldId) {
                _focusId = fieldId;
            }
        },

        onFocusDataRecordIndex: function (dataRecordIndex, dataColumnPos, parentId) {
            if (dataRecordIndex >= 0 && parentId) {
                _focusDataRecordIndex = dataRecordIndex;
                _focusDataColumnPos = dataColumnPos;
                _focusRowParentId = parentId;
            }
        },

        resetFocusDataRecordIndex: function () {
            _focusDataRecordIndex = -1;
            _focusDataColumnPos = -1;
            _focusRowParentId = null;
        },

        /**
         * Records field blur
         * @param fieldId id of field that has blurred
         */
        onBlur: function (fieldId) {
            if (fieldId == _focusId) {
                _focusId = null
            }
        },

        /**
         * Returns id of the last AJAX request. For testing purpose.
         */
        getTransId: function () {
            if (_lastReq) {
                return _lastReq.id; // @SenchaUpgrade "id" is not documented
            }
            return null;
        },

        getEventSourceCls: function () {
            return _EVENT_SOURCE_CLS
        },

        getPanelLoadingCls: function () {
            return _PANEL_LOADING_CLS
        },

        /**
         * Returns the localized string for a displaykey
         * @param displaykey
         * @param (optional) paramValue1, paramValue2 ... paramValueN
         */
        localize: function (displaykey) {
            var args = Ext.Array.clone(arguments);
            args[0] = _config.displayKeys[displaykey];
            return Ext.String.format.apply(String, args)
        },

        /**
         * Starts the page when launch the app
         * @param view layout info
         * @param config server config
         * @param commands commands to be executed after the page layout is initialized
         */
        initPage: function (view, config, commands) {
            window.errors = [];
            window.onerror = function (msg) {
                window.errors.push(msg);
            };

            _serverURL = config.url;
            _config = config;
            _checkDefaultCommunicationMessages();

            Ext.onReady(function () {
                _setReady();

                _overrideFocusHandlingForFirefox();

                //@UpgradedSencha 5.1
                // Add theme data for standalone builds where theme data is not available (GW use-case)
                // Extract it from theme override
                // For GW it will be default unless themeName is specified in Theme override JS file.
                // We do that for Touch and Aria themes for now
                Ext.themeName = Ext.themeName || Ext.theme.name;

                // @UpgradedSencha - Moved the body event listener initialization into the onReady handler, and used the direct
                // addListener() method on the body since Ext.EventManager is deprecated.
                //
                // Prevent the backspace key from invoking the browser back function. This is really a hack. The correct
                // way to do handle history is with window.history.pushState. It is quite difficult to add that on later.
                // This does not seem to prevent the browser back function when focussed on a privacy (e.g. SSN) field
                // in Chrome 37. It does in FF 30.
                Ext.getBody().addListener('keydown', function (e) {
                    // Check key press first to shortcut conditional:  this assumes that backspace is relatively rare compared to other key presses
                    if (e.getKey() == e.BACKSPACE) {
                        var eventTargetType = e.getTarget().type;
                        if (eventTargetType != 'textfield' && eventTargetType != 'textarea' && eventTargetType != 'password' && eventTargetType != 'text' || e.getTarget().readOnly) {
                            e.preventDefault();
                        }
                    }
                });

                _disableIEMenuShortcut();
                Ext.tip.QuickTipManager.init();

                _updateLocalizationInfo();
                // @UpgradedSencha - We need the font field dimensions to help us compute a correct
                // approximate width and height from rows/cols for Text/TextAreas
                _computeFontDimensions();

                // init state manager:
                try {
                    var stateProvider = new Ext.state.LocalStorageProvider();
                    Ext.state.Manager.setProvider(stateProvider);
                } catch (e) {
                    gw.app.showAlert(gw.app.localize('ExtJS.Alert.DOMStorageDisabled'));
                }

                // create Viewport
                Ext.ComponentManager.create(Ext.apply(view, {xtype: 'gview'}));

                // register global click handler
                Ext.getBody().on({
                    // @UpgradedSencha 5.1 - fixed issue where the handler for the eventSourceCls, fires randomly before the
                    // handler specifically set on an element.  We lowered the priority of this handler below the
                    // default (of 0) so that it runs after the defaults.
                    click: {
                        delegate: '.' + gw.app.getEventSourceCls(),
                        stopEvent: true,
                        fn: gw.app.onAction,
                        priority: -10
                    },
                    mousedown: {scope: gw.app, fn: gw.app.onMouseDown}
                });

                _registerGlobalKeyMap();

                // process command after layout is generated
                if (commands) {
                    _processCommands(commands)
                }

                _initFocus();
                _gwIsReady = (new Date()).getTime();
            });
        },

        /**
         * @return the tokenized string for JIC date input format (no time part)
         */
        getJICInputDateFormatTokenized: function () {
            return _config.jpCalendar.dateFormatTokenized;
        },

        /**
         * @return Regex to parse a JIC input date string (optional time part included)
         */
        getJICInputPatternRegex: function () {
            if (typeof _config.jpCalendar.datePatternRegex == typeof '') {
                _config.jpCalendar.datePatternRegex = eval(_config.jpCalendar.datePatternRegex);
            }
            return _config.jpCalendar.datePatternRegex;
        },

        /**
         * @return an array of valid era names
         */
        getJICEras: function () {
            if (_config.jpCalendar.eraNames[0] != '') {  // insert an empty value
                _config.jpCalendar.eraNames.splice(0, 0, '');
            }
            return _config.jpCalendar.eraNames;
        },

        /**
         * @param era
         * @return (string array) an array of years in the give era
         */
        getJICYearsInEra: function (era) {
            if (era == '') {
                if (!_config.jpCalendar.eraDetails[era]) {
                    _config.jpCalendar.eraDetails[era] = ['']; // insert key for empty era
                }
            }

            var eraDetails = _config.jpCalendar.eraDetails[era];
            if (typeof eraDetails[0] == typeof 0) { // initialize the years array
                var years = [''];
                for (var i = 1; i <= eraDetails[1]; i++) {
                    years.push((i >= 10 ? '' : '0') + i);
                }
                eraDetails = _config.jpCalendar.eraDetails[era] = years;
            }

            return eraDetails;
        },

        getJICYearSymbol: function () {
            return _config.jpCalendar.yearSymbol || '';
        },

        getJICMonthSymbol: function () {
            return _config.jpCalendar.monthSymbol || '';
        },

        getJICDaySymbol: function () {
            return _config.jpCalendar.daySymbol || '';
        },

        refresh: function () {
            _callServer('_refresh_');
        },

        popupAboutWindow: function () {
            //_showFrame was being called with 2 arguments here, the second was never used in the function
            //_showFrame('about', 'About.do');
            _showFrame('about', 620); //new branding art is wider than previous default

        },

        clearBrowserState: function () {
            window.localStorage.clear(); // clear local storage
            window.location.reload(); // clear in memory state
        },

        onMouseDown: function (evt, htmlElem) {
            if (htmlElem && htmlElem.tagName != "INPUT" && Ext.get(htmlElem).down('input') == null) {
                gw.Debug.log("onMouseDown for " + htmlElem.id);
                _mouseDown = true;
                Ext.defer(function () {
                    _mouseDown = false
                }, 10)
            }
        },

        /**
         * The global click handler to issue any event to the server
         * @param evt event
         * @param htmlElem element associated with the event, which may be the event target or its delegate
         * @param options
         * @params params
         */
        handleAction: function (evt, htmlElem, options, params) {
            if (!htmlElem.disabled) {
                Ext.menu.Manager.hideAll(); // need to close menu when clicking the icon of a search menu item
                var eventSource;
                var eventParam;
                if (Ext.isString(htmlElem)) {
                    eventSource = htmlElem;
                    eventParam = options ? options.param : null
                } else {
                    var el = Ext.fly(htmlElem);
                    if (_focusId == null) {
                        _focusId = el.getAttribute('id'); // record action source as focused elem
                    }
                    eventSource = el.getAttribute('eventId') || el.getAttribute('id');
                    eventParam = el.getAttribute('eventParam') || (options ? options.param : null);
                }
                _callServer(eventSource + '_act', eventParam, params, undefined, undefined, options);
            }
        },

        /**
         * The wrapper is for global onClick handler, extjs event sometime passes the 4th
         * parameter to the function. This wrapper prevents the event from passing the 4th optional parameter to gw
         * handleAction function.
         *
         * @param event
         * @param elemOrId
         * @param options
         */
        onAction: function (event, elemOrId, options) {
            gw.app.handleAction(event, elemOrId, options);
        },

        /**
         * Handlers for action on an Ext component.
         * @param comp component or component config
         * @param evt event
         * @param el element (only needed when component config is specified)
         */
        handleCompAction: function (comp, evt, el) {
            if (comp.noaction) {
                return false; // return false to not to close the menu
            }
            function doIt(param) {
                var options = param != undefined ? {param: param} : undefined;

                if (comp.download) {
                    options = Ext.apply(options || {}, {download: comp.download});
                }
                if (comp.postOnChangeTarget) {
                    gw.app.requestViewRoot(comp.id, {updateData: true, postOnChangeTarget: comp.postOnChangeTarget});
                } else {
                    gw.app.handleAction(evt, el && el.dom || comp.getEl().dom, options)
                }
            }

            if (comp.confirm) {
                gw.app.confirm('', comp.confirm, function (btn) {
                    if (btn == 'yes' || btn == 'ok') {
                        doIt()
                    }
                })
            } else if (comp.prompt) {
                var promptProp = comp.prompt;
                Ext.Msg.prompt('', comp.prompt[0], function (btn, answer) {
                    if (btn == 'yes' || btn == 'ok') {
                        doIt(answer)
                    }
                }, undefined, undefined, promptProp.length > 1 ? promptProp[1] : undefined);
            } else {
                doIt()
            }
        },

        /**
         * The wrapper around Handlers for action on an Ext component to prevent extjs event from passing the 4th optional
         * parameter to gw handleCompAction function.
         *
         * @param comp
         * @param evt
         * @param el
         */
        onCompAction: function (comp, evt, el) {
            gw.app.handleCompAction(comp, evt, el);
        },

        /**
         * Called when a [Check Spelling] button is clicked
         */
        checkSpelling: function () {
            var fields = [];
            Ext.ComponentManager.each(function (id, comp) {
                if (comp.checkSpelling && !comp.disabled) {
                    fields.push(comp.inputEl.dom)
                }
            });
            window.spellcheck_frame.checkSpelling(fields);
        },

        /**
         * The wrapper for global onchange handler, extjs change event sometime passes the 4th parameter to the function. This
         * wrapper will prevent the event from passing the 4th optional parameter to gw handleChange function.
         *
         * @param field
         * @param newValue
         * @param oldValue
         */
        onChange: function (field, newValue, oldValue, blank, extraParams) {
            gw.app.handleChange(field, newValue, oldValue, null, extraParams);
        },

        onBlurChange: function (comp, evt) {
            if (comp.gchanged) {
              comp.gchanged = false;
              if (!comp.isEqual(comp.newValueBlur, comp.lastValueBlur)) {
                comp.fireEvent('blurchange', comp, comp.newValueBlur, comp.lastValueBlur, null, {'blur_event': evt});
              }
            }
            comp.gChangeOnBlur = false;
        },

        deferChangeTillBlur: function (field) {
            field.gChangeOnBlur = true;
        },

        getActiveLV: function () {
            return _activeLV;
        },

        setActiveLV: function (activeLV) {
            _activeLV = activeLV;
        },

        /**
         * The global onchange handler. The handling may be asynchronus, because it may open a confirm dialog
         * @param field the input field that is changed
         * @param newValue new value
         * @param oldValue old value
         * @param extraParams extra parameter to send back to server
         * @param callback callback after the value is changed
         */
        handleChange: function (field, newValue, oldValue, callback, extraParams) {
            var blur_event;
            // Do nothing, if a dialog is open to confirm the value change:
            if (Ext.Msg.isVisible() ||
                !field.skipConfirm && field.confirm && field.editor) { // do not process cell editor change that hasn't been confirmed
                return false;
            }

            gw.Debug.log("handleChange triggered for " + field.id);
            // Remember and remove blur_event information since it cannot be sent to the server as it contains a
            // circular structure
            if (extraParams && extraParams.blur_event !== undefined) {
                blur_event = extraParams.blur_event;
                delete extraParams.blur_event;
            }
            /**
             * handles onChange
             */

            function maybeResetFocus() {
                if (field.column && field.confirm && !field.editor) {
                    // Focus gets lost when elements without editors (e.g. - checkboxes)
                    // with a confirmation message get changed.  In this case, manually reset
                    // the focus by resetting current position on the grid.
                    var grid = field.column.getRootHeaderCt().grid;
                    gw.GridUtil.restoreLastFocusedCell(grid, gw.app._gridNavigation);
                }
            }

            function applyChanges() {
                var isPostOnChange = gw.app.isPostChangeToServer(field),
                    blurTarget,
                    blurRelatedTarget,
                    relatedTargetElement;

                if (_mouseDown) {// if the mouse is down, delay handling till mouse release

                    function onMouseRelease(evt, elem, options) {
                        if (options.called) {
                            return; // this function may be called twice (by mouseUp and mouseOut), but we only want to execute it once
                        }
                        options.called = true;

                        var eventTarget = gw.app.findComponentByElement(evt.target);
                        if (isPostOnChange && eventTarget && eventTarget.confirmPossible && !eventTarget.isDisabled()) {
                            // Need to post the change right away, just in case its value affects the confirmation
                            // dialog for the target
                            evt.stopEvent();
                            eventTarget.setDisabled(true);
                            eventTarget.disabledForPendingClick = true;
                            extraParams = Ext.apply(extraParams || {}, {pendingClickComponent: eventTarget.id});
                            applyChanges();
                        } else {
                            // defer handling onchange till after mouse release handler (which may
                            // cause a page post and make onchange handler unecessary)
                            gw.Debug.log("onMouseRelease deferring applyChanges for " + field.id);
                            _delayedOnChange = Ext.defer(applyChanges, 10);
                        }
                    }

                    // register callback on mouse release
                    var options = {fn: onMouseRelease, single: true};
                    Ext.getBody().on({
                        mouseup: options,
                        mouseout: options
                    });

                    return;
                }

                if (_config.checkSpellingOnChange == true && field.checkSpelling) {
                    window.spellcheck_frame.checkSpelling(new Array(field.inputEl.dom));
                }

                // if field is in an editor, commit edit value:
                // field.editor might not exist because we don't have editors for check and radio
                if (field.editor) {
                    gw.GridUtil.commitGridEditorValue(field.editor);
                } else if (field.completeEdit) {
                    field.completeEdit(newValue);
                }

                if (isPostOnChange) {
                    if (extraParams) {
                        extraParams.skipFocusOnPOC = true;
                    } else {
                        extraParams = {skipFocusOnPOC: true};
                    }
                    // post change to server, if needed
                    var targetId = field.postOnChangeTarget;
                    if (targetId != null) {
                        var params = {postOnChangeTarget: targetId};
                        // extraParams include inputGroup checkBox value for first time expanding
                        if (extraParams) {
                            Ext.apply(params, extraParams);
                        }
                        // postedToServer is set to true if post to server is happening.
                        gw.app.requestViewRoot(field.eventParam || field.name || field.checkboxName || field.id, params, Ext.fly(targetId),
                            (callback) ? {
                                postCallbackScope: field,
                                postCallback: callback,
                                postedToServer: true
                            } : undefined);

                    } else {
                        _callServer('_refresh_', field.eventParam || field.name || field.hiddenName || field.id, extraParams, true);
                    }

                    // Only attempt to refocus on a blur event with a POC in a LV
                    if (blur_event && gw.app._gridNavigation) {
                        blurRelatedTarget = blur_event.relatedTarget;

                        relatedTargetElement = Ext.get(blurRelatedTarget.id);

                        // If related Element is not a parent of the LV
                        if (relatedTargetElement && !relatedTargetElement.findParent(gw.app._gridNavigation.gridId)) {
                            relatedTargetElement.focus();
                            gw.app._gridNavigation = null;      // clear navigation on grid since we are now outside of it
                        }

                    }

                } else {
                    if (callback) {
                        // field level call back
                        callback.call(field);
                    }
                    gw.reflection.reflect(field, true);
                    maybeResetFocus();
                }
            } // End of applyChanges()

            // TECHDEBT (PL-31325): Check boxes with confirmation messages inside a grid flow here.  At the time the
            //                      handleChange is called for a checkbox, the editor is not instantiated for the field.
            //                      It seems like it should be handled by the cell's editor.
            if (field.confirm && !field.editor) { // show confirmation for inputs in DetailView (confirmation for cell is handled by editor)
                gw.app.confirm('', field.confirm, function (btn) {
                    if (btn == 'yes' || btn == 'ok') {
                        applyChanges()
                    } else { // cancel change:
                        // NOTE:  We should probably get rid of the field.inEditor == true block.  Being a bit paranoid in
                        //        the face of E23 going out in case there is some odd timing issue where an editor appears on the field
                        if (field.editor) { // if the field is in an editor, cancel edit:
                            if (field.editor.editing) {
                                field.editor.cancelEdit(false);
                            } else {
                                // @SenchaUpgrade: using private variable 'context'
                                field.editor.fireEvent('rollback', field.editor.editingPlugin.context);
                            }
                        } else { // revert to the old value
                            var targetComp = field instanceof Ext.form.FieldSet ? field.checkboxCmp : field;
                            targetComp.suspendEvents(false);
                            targetComp.setValue(oldValue);
                            targetComp.resumeEvents();
                        }
                        maybeResetFocus();
                    }
                })
            } else {
                applyChanges();
            }
        },

        /**
         *  Check to see if post change to server is needed for the field
         * @param field
         */
        isPostChangeToServer: function (field) {
            var fieldComp;
            return (field.postOnChange ||
            field.name && field.name != field.id &&
            (fieldComp = Ext.ComponentManager.get(field.name)) && fieldComp.postOnChange)
        },

        /**
         * Sends request to view root widget directly
         * @param viewRootId id of the view root widget
         * @param params request parameters
         * @param auxConfig additional config for the request
         */
        requestViewRoot: function (viewRootId, params, maskElem, auxConfig, bChildrenOnly) {
            var requestParams = {};
            var postForm = false;
            var mask = maskElem || Ext.fly(viewRootId);

            // blur_event is passed from POC-related events to aid with focusing after server responses
            // It should not be sent to the server
            if (params && params.blur_event !== undefined) {
                delete params.blur_event;
            }

            if (params && (params.postOnChangeTarget || params.updateData)) {
                postForm = true;
                mask = undefined;  //during postOnChange, we need to mask app body to prevent typing in input fields
            } else {
                requestParams.renderViewRootOnly = true;
            }
            var ajaxInfo = {viewRootId: viewRootId, childrenOnly: bChildrenOnly};
            if (params) {
                if (params.skipFocusOnPOC) {
                    requestParams.skipFocusOnPOC = params.skipFocusOnPOC;
                }
                if (params.pendingClickComponent) {
                    requestParams.pendingClickComponent = params.pendingClickComponent;
                    delete params.pendingClickComponent;
                }
                ajaxInfo.paramMap = params;
            }

            requestParams.ajaxRequestInfo = Ext.JSON.encode([ajaxInfo]);
            _callServer(null, null, requestParams, postForm, mask, auxConfig);
        },

        isGwReady: function () {
            return _gwIsReady;
        },

        showBusy: function () {
            _showBusy()
        },

        requestViewRoots: function (reqs, fcnCallback) {
            var requestParams = {};
            requestParams.renderViewRootOnly = true;
            requestParams.ajaxRequestInfo = Ext.JSON.encode(reqs);

            _callServer(null, null, requestParams, false, 'NO_MASK_ELEM', {callback: fcnCallback})
        },

        getAjaxQueueSize: function () {
            return _ajaxRequestQueue.length;
        },

        processCommand: function (op, requestOptions, response) {
            var isError = op.cmd == 'showErrors';
            gw.Debug.commandlog(op.cmd);
            if (isError) {
                Ext.each(op.errors, function (error) {
                    if (_errors.indexOf(error) == -1) {
                        _errors.push(error);
                    }
                })
            } else {
                gw.CmdProc[op.cmd](op, response, requestOptions);
            }
            return isError
        },

        /**
         * Adapter to old JavaScript API used by Litigation Calendar
         */
        invokeEvent: function (eventSource, eventParam) {
            _callServer(eventSource, eventParam)
        },

        beforeUnloadHandler: function () {
            if (_bWarnUnsavedWork) {
                return this.localize('Java.UnsavedWork.UnloadApp');
            }
        },

        setWarnUnsavedWork: function (b) {
            _bWarnUnsavedWork = b;
        },

        toggleCalendarType: function (compId, calType) {
            var comp = Ext.ComponentManager.get(compId);
            this.requestViewRoot(compId, {toggleCalType: calType, value: comp.getRawValue()})
        },

        replaceLocation : function(newUrl) {
            _locationReplacing = true;
            window.location.href = newUrl;
        },

        isLocationReplacing : function() {
            return _locationReplacing
        },

        /** displays a confirmation dialog with OK/Cancel button */
        confirm: function (title, msg, fn, scope) {
            Ext.MessageBox.show({
                title: title,
                msg: msg,
                buttons: Ext.MessageBox.OKCANCEL,
                fn: fn,
                scope: scope,
                icon: this.QUESTION
            });
            Ext.defer(function () {
                Ext.MessageBox.focus()
            }, 100);
        },

        setServerRequestId: function (t) {
            _serverRequestId = t;
        },

        setTestActionComplete: function () {
            if (_reqMonData != null) {
                if (!_actionCompleteLogged) {
                    var actionCompleteTime = new Date().getTime();
                    _reqMonData = _reqMonData.substr(0, _reqMonData.length - 1) + ',' + actionCompleteTime + ']';
                    _actionCompleteLogged = true
                }
            } else {
                gw.Debug.log('<span style="color:orange">Request data already submitted.  Unable to add ActionCompleteTime.</span>');
            }
        },

        isReady : function() {
            return _ready
        },

        isLoadMaskVisible: function () {
            if (_maskedElem && _maskedElem.isMasked()) {
                return true;
            }
            return false;
        },

        /** Returns current active csrf token */
        getCsrfToken: function () {
            return _getCsrfToken();
        },

        /**
         * Returns true if the client is in the middle of processing a server request.  Else, return false.
         */
        isProcessingServerRequest: function() {
            return (_numOutstandingServerRequests > 0);
        },

        /**
         * The dimensions of the M character in a form field
         */
        dimensionsOfMCharInPixels: function () {
            return _formFieldMFontDimensions;
        },

        /**
         * Used to spot the special case where a pointless focus event is fired because of a workaround we have to support
         * shortcuts in IE. Don't use unless you know exactly what you are doing. See _disableIEMenuShortcut for more details.
         */
        shouldIgnoreIEFocusEvent: function() {
            return _ignoreIEFocusEvent;
        },

        ajaxTimeout : function() {
            if (_ajaxTimeoutInSeconds === null) {
                _ajaxTimeoutInSeconds = _config.ajaxTimeout || 600;
            }
            return _ajaxTimeoutInSeconds * 1000;
        },

        setAjaxTimeoutInSeconds : function(valueOrNullToRestoreDefault) {
            _ajaxTimeoutInSeconds = valueOrNullToRestoreDefault;
        },

        wasUnsuccessfulAjaxStatusHandled: function(success, response) {
            if (!success) { // unexpected HTTP request failure:
                var message;
                if (response.timedout) {
                    message = gw.app.localize("ExtJS.Alert.HTTPRequestTimedOut");
                } else {
                    message = gw.app.localize("ExtJS.Alert.HTTPRequestFailed", response.status);
                }
                // Temporarily decrement the server requests before putting up an alert box so that WTC knows the request has
                // completed.  We will restore the request counter again so that it will decrement properly in the ajax handler
                _numOutstandingServerRequests--;
                gw.app.showAlert(message);
                _numOutstandingServerRequests++;

                return true;
            }
            return false;
        },

        showAlert: function(message) {
            Ext.MessageBox.alert('', message);
        },

        // Prepare form data for submission
        prepFormData: function(formData) {
            formData.append(gw.app.CSRF_TOKEN_PARAM_KEY, _getCsrfToken());
        },

        findComponentByElement: function(element) {
            var body = document.body,
                search;
            for (search = element; search && search !== body; search = search.parentNode) {
                var cmp = Ext.getCmp(search.id);
                if (cmp) {
                    return cmp;
                }
            }
            return null;
        },

        openPopup: function(url, target, features) {
            if (Ext.isIE) {
                // TODO: Code of last resort...for now.  If you come up
                //       with a better solution, the web pod will buy you a drink.
                //       Attempts to use onblur and onfocusevent caused inconsistent
                //       behaviors even between the same browser versions on different
                //       machines.

                // It ain't worth keeping track of the window reference when using 'setTimeout'
                // as no code currently uses said reference.
                setTimeout(function() { window.open(url, target, features) }, 250);

            } else {
                return window.open(url, target, features);
            }
        },

      /**
       * The appVersion from the server is compared against the client version. Both are generated during build, but
       * the appVersion from the server has a build number attached if that is defined. This means the client and server
       * versions may be different (client 9.1.0 vs server 9.1.0.10). If the server "starts with" the client we guess
       * that it's okay.
       * @param serverVersion The appVersion string from the SystemToolsApi.
       */
        checkVersion: function(serverVersion) {
            if (!Ext.isDefined(Ext.appVersion)) {
                console.warn("Ext.appVersion is not defined. Server side code (version ["+serverVersion+"]) might not match the client js code");
            } else if ((serverVersion != Ext.appVersion) && Ext.String.startsWith(serverVersion, Ext.appVersion)) {
                console.warn("Server version ["+serverVersion+"] matches client version ["+Ext.appVersion+"] only partially.");
            } else if (serverVersion != Ext.appVersion) {
                console.warn("Server version ["+serverVersion+"] does not match the client version ["+Ext.appVersion+"].");
            }
        }
    }
});
