// variables whose values are set in initMap()
var mapName;
var credential;
var selectionMessageNodeID;
var refreshUponSelection;
var zoom;
var autoScale;
var centerLatLong;
var _margin;
var _boundingBoxWidth;
var _boundingBoxHeight;
var markerSize;
var MAX_ZOOM;

var useKilometers;
var haveLegendImage;

var popupMapWidth;
var popupMapHeight;
var popupMapElementName;

var cantLoadMapMessage;

var selectionColor;
var selectionPoint1;
var selectionPoint2;

var areaOfInterestColor;

var areaOfInterestPoint1;
var areaOfInterestPoint2;

var isIE = navigator.appName == "Microsoft Internet Explorer";
var map;
var lineLayer;
var selectLayer;
var url = "./MapOverlay.do";
var height;
var width;
var fillColor;
var messageElement;
var x = 0;
var y = 0;

function HeatMap() { }

HeatMap.prototype.listen = function() {
    window.event = this;
    window.event.shiftKey = false;
    // have this fire before Bing Map's to set shift key state first
    document.addEventListener('mousedown', setWindowEvent, true);
};

function setWindowEvent(e) {
    parent["mapFrame"].focus();
    window.event = e;
}

// main method that sets up the map
HeatMap.prototype.LoadMap = function () {
    initMap();
    fillColor = new Microsoft.Maps.Color(0, 0, 0, 0);
    messageElement = selectionMessageNodeID != null ? this.findByIDSuffix(selectionMessageNodeID) : null;
    var popupMapElement = this.findByIDSuffix(popupMapElementName);
    if (popupMapElement != null) {
        popupMapElement.onclick = function popupMap() {
            window.open("./MapOverlay.do?map.html=iframe&mapName=" + mapName, "popupMap",
                "width=" + popupMapWidth + ",height=" + popupMapHeight + ",status=yes,menubar=yes,resizable=yes", true)
                .focus();
        }
    }
    if (window.parent.name == "") {
      window.parent.name = "plugh" // make sure there's a window name for jumping from a claim tooltip to a claim
    }

    var loading_msg = document.getElementById("loading_msg");
    if (typeof Microsoft.Maps.Map == "function") {
        loading_msg.parentNode.removeChild(loading_msg);
    } else {
        loading_msg.innerHTML = cantLoadMapMessage;
        return;
    }

    this.getMapSize();

    // adjust the zoom based on the actual window size only when first loaded
    if (autoScale) {
        zoom = this.computeZoom();
        this.updateZoom(zoom);
    }

    map = new Microsoft.Maps.Map(document.getElementById("mapDiv"), { credentials:credential , center : centerLatLong});
    map.setView({center : centerLatLong, zoom : zoom});
    var tileSourceSpec = new Microsoft.Maps.TileSource({
        uriConstructor:url+'?tile={quadkey}.png&mapName=catMap'
    });

    var tileLayer= new Microsoft.Maps.TileLayer({ mercator: tileSourceSpec});

    map.layers.insert(tileLayer);

    if (areaOfInterestColor != null && areaOfInterestPoint1 != null) {
        this.drawRectangle(areaOfInterestPoint1, areaOfInterestPoint2, areaOfInterestColor, "areaOfInterestLayer");
    }

    if (selectionPoint1 != null) {
        // show the previous selected rectangle
        this.drawSelectionRectangle(selectionPoint1, selectionPoint2);
    }

    // set up mouse handler
    Microsoft.Maps.Events.addHandler(map, 'click', displayLatLong);
    Microsoft.Maps.Events.addHandler(map, "mousedown", this.mouseEventHandler);
    Microsoft.Maps.Events.addHandler(map, "mouseup", this.mouseEventHandler);
    Microsoft.Maps.Events.addHandler(map, "mousemove", this.mouseEventHandler);
    Microsoft.Maps.Events.addHandler(map, "viewchangeend", this.mapNKeyEventHandler);
    Microsoft.Maps.Events.addHandler(map, "viewchange", this.mapNKeyEventHandler);
    if (window.event == null) { // IE and chrome have this property, but FireFox needs event handlers
        this.listen()
    }
    // add resize listener
    if (window.addEventListener)
        window.addEventListener('resize', this.onResize, false);
    else if (window.attachEvent)
        window.attachEvent('onresize', this.onResize);

    this.onResize();  // do initial positioning
};

function displayLatLong(e) {
    if (e.targetType == "map") {
        var point = new Microsoft.Maps.Point(e.getX(), e.getY());
        var loc = e.target.tryPixelToLocation(point);

    }
}

HeatMap.prototype.UnloadMap = function () {
     // IE garbage collection is inadequate
     document.removeEventListener('mousedown', setWindowEvent, true);
     map.dispose();
};

// clip value so that min <= value <= max
HeatMap.prototype.clip = function (value, min, max) {
    if (value < min)
        value = min;
    else if (value > max)
        value = max;
    return value;
};

// get the lat long for the specified pixel position
HeatMap.prototype.getLL = function (x, y) {
    var ll = map.tryPixelToLocation(new Microsoft.Maps.Point(x,y));
    ll.latitude = this.clip(ll.latitude, -90, +90);
    ll.longitude = this.clip(ll.longitude, -180, +180);
    return ll
};

// remove the selection graphic (i.e., rectangle)
HeatMap.prototype.removeSelectionGraphic = function() {
    // issues with layers (in IE) so will use v7 entitycollection since there aren't many
    // things to clear
    if (selectLayer != null) {
        map.entities.clear();
    }
};

HeatMap.prototype.drawSelectionRectangle = function (pointA, pointB) {
    selectLayer = this.drawRectangle(pointA, pointB, selectionColor, "selectionLayer")
};

// draw a rectangle
HeatMap.prototype.drawRectangle = function (pointA, pointB, color, layerName) {
    var rectPoints = new Array(
        pointA,
        new Microsoft.Maps.Location(pointA.latitude, pointB.longitude),
        pointB,
        new Microsoft.Maps.Location(pointB.latitude, pointA.longitude)
    );

    //var layer = new Microsoft.Maps.Layer(layerName);
    //map.layers.insert(layer);

    var rectangle = new Microsoft.Maps.Polygon(rectPoints, {fillColor:fillColor, strokeColor:color, strokeThickness:2});
    //layer.add(rectangle);
    map.entities.push(rectangle);
    return rectangle;
};

//----

// set an element's opacity between 0 and 1
HeatMap.prototype.setOpacity = function (el, opacity) {
    if (isIE) {
        el.style.filter = "alpha(opacity=" + (opacity*100.).toFixed(0) + ")";
    } else {
        el.style.opacity = opacity.toFixed(2);
    }
};

// computes the integer part of the log base 2 of the argument,
// always rounding the log down.  Assume value is positive.
HeatMap.prototype.logBase2 = function (value) {
    var rv = 0;
    value >>= 1;

    while (value > 0) {
        value >>= 1;
        rv++;
    }
    return rv;
};

// compute the zoom based on the bounding box and the actual window size
HeatMap.prototype.computeZoom = function () {
    this.getMapSize();
    var _zoom;

    var minSize = -1;
    if (_boundingBoxHeight != 0) {
        minSize = ((height - _margin*2)<< MAX_ZOOM) / _boundingBoxHeight;
    }
    if (_boundingBoxWidth != 0) {
        var lngSize = ((width - _margin*2)<< MAX_ZOOM) / _boundingBoxWidth;
        minSize = (_boundingBoxHeight != 0) ? Math.min(minSize, lngSize) : lngSize;
    }
    _zoom = (minSize != -1) ? this.logBase2(minSize) : 0;
    if (_zoom > MAX_ZOOM)
        _zoom = MAX_ZOOM;

    return _zoom;
};

HeatMap.prototype.clearSelection = function () {
    this.setSelectionMessage(" ");
    this.removeSelectionGraphic();
};

// round a number to 5 decimal places
HeatMap.prototype.digits5 = function (x) {
    return Math.round(x*100000)/100000;
};

// find a document element using a suffix of its id
HeatMap.prototype.findByIDSuffix = function (idSuffix) {
    var elements = window.parent.document.getElementsByTagName("*");
    for (var i = 0; i < elements.length; i++) {
        var element = elements[i];
        var index = element.id.indexOf(idSuffix);
        if (index != -1 && index + idSuffix.length == element.id.length) {
            return element;  // assume there's only one match
        }
    }
    return null;
};

// put the selection message text on the screen, refresh the page if not just clearing the field
HeatMap.prototype.setSelectionMessage = function (responseText) {
    if (messageElement != null)
        messageElement.innerHTML = responseText;
    if (refreshUponSelection && responseText != " ")
        heatMap.refreshPage();
};

HeatMap.prototype.setCursor = function () {
    document.getElementById("mapDiv").style.cursor =
        (true) ? "default" : 'url("' + Microsoft.Maps.Globals.cursorPath + 'grab.cur"), move'

};

var startLL;
var currentLL;
var selecting = false;
var mouseDown;

HeatMap.prototype.mouseEventHandler = function (e) {
    return heatMap.mouseEventHandler2(e);
};

HeatMap.prototype.mouseEventHandler2 = function (e) {
    var event = e.eventName;
    var windowEvent = window.event || this;// can use the default shift false value

    if (event == "mousedown") {
        mouseDown = true;
        this.setCursor();
        if (windowEvent.shiftKey) {
            // start a selection
            this.clearSelection();
            currentLL = startLL = map.tryPixelToLocation(new Microsoft.Maps.Point(e.getX(), e.getY()));
            selecting = true;
            return true;  // consume the event
        } else {
            // tooltip
            ttMouseDownPosition = e;
            this.clearToolTip();
            if (!fetchingTooltip && !windowEvent.shiftKey) {
                fetchingTooltip = true;
                x = e.getX()
                y = e.getY()
                this.fetchTip();
            }
        }
    } else if (event == "mouseup") {
        mouseDown = false;
    }

    if (event == "mousemove" && !(mouseDown || windowEvent.shiftKey)) {
        this.setCursor();
        return true;  // consume the event
    }

    if (!selecting)
        return false;  // not selecting - don't catch

    if (event == "mouseup") {
        var firstLat = startLL.latitude
        var firstLong = startLL.longitude
        var secondLat = currentLL.latitude
        var secondLong = currentLL.longitude

        // always send top left as the first point and bottom right as the second point no matter
        // which corners were entered or their order
          if (firstLat < secondLat) {
              firstLat = currentLL.latitude;
              secondLat = startLL.latitude;
          }
          if (firstLong > secondLong) {
              firstLong = currentLL.longitude;
              secondLong = startLL.longitude;
          }
        this.postToServer("?point1Lat=" + this.digits5(firstLat) + "&point1Lng=" + this.digits5(firstLong) +
            "&point2Lat=" + this.digits5(secondLat) + "&point2Lng=" + this.digits5(secondLong),
            this.setSelectionMessage);
        selecting = false;

    } else if (event == "mousemove") {
        if (selecting) {
            currentLL = this.getLL(e.getX(), e.getY());
            this.clearSelection();
            this.drawSelectionRectangle(startLL, currentLL);
        }

    }
    return true; // suppress further processing
};

HeatMap.prototype.mapNKeyEventHandler = function (e) { return heatMap.mapNKeyEventHandler2(e); };

HeatMap.prototype.mapNKeyEventHandler2 = function (e) {
    var event = e.eventName;
    if (event == "viewchangeend" || event == undefined) {
        this.clearToolTip();
        console.log("TODO: remove event == undefined and the this.clearTooltip() when you see event == viewchangeend : " + event )
        this.updateZoom(map.getZoom());
        this.updateCenter();  // needed to make control-click-drag work correctly (Bing doesn't report a pan event with the zoom
        // even though the center may be changed) - this may be fixed in v8
    } else if (event == "viewchange") {
        this.clearToolTip();
    } else if (event == "onkeypress") {
        if (e.keyCode == 27) { // Escape key
            this.clearToolTip();
            return true;
        }
    }
};

HeatMap.prototype.updateZoom = function (zoom) {
    // zoom can be non-integer for when the zoom effect is occurring
    if (Number(zoom) === parseInt(zoom)) {
        this.postToServer("?zoomLevel=" + zoom);
    }
};

HeatMap.prototype.updateCenter = function () {
    var center = map.getCenter();
    this.postToServer("?centerLat=" + this.digits5(center.latitude) + "&centerLng=" + this.digits5(center.longitude));
};

HeatMap.prototype.getMapSize = function () {
    var bboxElement = window.parent.document.getElementById("mapFrame");
    if (bboxElement == null)
        bboxElement = window.document.documentElement;
    var bbox = bboxElement.getBoundingClientRect();
    height = bbox.bottom - bbox.top;
    width = bbox.right - bbox.left;

    if (haveLegendImage) {
        var legendBBox = document.getElementById("legendImg").getBoundingClientRect();
        width -= legendBBox.right - legendBBox.left;
    }
};

HeatMap.prototype.onResize = function () {
    heatMap.getMapSize();
    document.getElementById("mapDiv").style.height = height + "px";
};

// create and send new async POST
HeatMap.prototype.postToServer = function (urlParamString, callback) {
    var request = new XMLHttpRequest(); // or use AJAXImpl_createXMLHttpRequest for IE6
    request.open("POST", url + urlParamString + "&mapName=" + mapName);

    // callback function
    request.onreadystatechange = function() {
      if (request.readyState == 4 && request.status == 200) {
        if (callback != null)
          callback(request.responseText);
  //          console.log("got reply: " + request.responseText);
      }
    };

    var csrfToken = getCookie(window.parent.gw.app.CSRF_TOKEN_COOKIE_KEY);
    if (csrfToken) {
      request.setRequestHeader("Content-type","application/x-www-form-urlencoded");
      request.send(window.parent.gw.app.CSRF_TOKEN_PARAM_KEY + "=" + csrfToken);
    } else {
      request.send(".");
    }

};

// refresh the page
HeatMap.prototype.refreshPage = function () {
    window.parent.gw.app.refresh();
};


// Tooltip support
var fetchingTooltip;
var ttMouseDownPosition;
var ttLatLong;
var ttCursorAdj = 2; // cursor click point adjustment
var ttControl, ttLine;
var ttLineColor;

// request the tooltip
HeatMap.prototype.fetchTip = function() {
    ttLatLong = map.tryPixelToLocation(new Microsoft.Maps.Point(ttMouseDownPosition.getX(),
        ttMouseDownPosition.getY()));
    this.postToServer("?ttLat=" + this.digits5(ttLatLong.latitude) + "&ttLng=" + this.digits5(ttLatLong.longitude), this.showToolTip);
};

HeatMap.prototype.clearToolTip = function() {
    if (ttControl != null) {
        var el = document.getElementById( 'UiControls' );
        //hide and reuse instead of completely removing
        el.style.display = "none"
        //map.layers.remove(lineLayer);
        map.entities.remove(ttLine);
        ttControl = null;
    }
};

// show the tooltip
HeatMap.prototype.showToolTip = function(msg) {
    ttLineColor = new Microsoft.Maps.Color(1, 0, 0, 0);
    heatMap.setCursor();
    fetchingTooltip = false;
    if (msg != "") {
        var comma = msg.indexOf(","), bar = msg.indexOf("|");
        var positionLL;
        if (bar > 0) {
            var lat = msg.substring(0, comma);
            var lng = msg.substring(comma+1, bar);
            positionLL = new Microsoft.Maps.Location(lat, lng);
        } else {
            positionLL = ttLatLong;
        }
        msg = msg.substring(bar+1);
        var el = heatMap.addUiControl(msg);
        heatMap.positionToolTip(el, positionLL);
        ttControl = el;
    }
};

HeatMap.prototype.addUiControl = function (msg) {
    var root = document.getElementById("mapDiv");

    var rootUiControls = document.getElementById("UiControls");
    if (rootUiControls == null) {
        rootUiControls = document.createElement('div');
        rootUiControls.setAttribute("id", "UiControls");
        rootUiControls.setAttribute("class", "CustomUiControls");
        //rootUiControls.style.zIndex = 1;
        root.insertBefore(rootUiControls, root.firstChild);
    }
    rootUiControls.style.background = "#fffec1";
    rootUiControls.style.padding = "5px";
    rootUiControls.style.fontFamily = "Verdana,Arial,Helvetica,sans-serif";  // todo: reference CSS
    rootUiControls.style.fontSize = "12.8px";
    rootUiControls.style.border = "1px solid #ababab";
    rootUiControls.style.position = "absolute";
    rootUiControls.style.zIndex = 100;
    heatMap.setOpacity(rootUiControls, 1);
    rootUiControls.style.cursor = "default";
    rootUiControls.style.display = "inline";
    rootUiControls.innerHTML = msg;
    return rootUiControls
};

// position the tooltip and draw a line to the point that was clicked
HeatMap.prototype.positionToolTip = function(el, positionLL) {
    // Bing Maps API currently inverts negative y pixel location when converting back from location to pixel
    //var pixelPos = map.tryLocationToPixel(positionLL);
    // use the pixel coordinates from when the mouse event was handled
    var pixelPos = new Microsoft.Maps.Point(x, y)
    var xPos = pixelPos.x, yPos = pixelPos.y;
    var delta = 20;
    var tipHeight = el.offsetHeight;
    var tipWidth = el.offsetWidth;
    var vertical;
    var xTipPos = pixelPos.x, yTipPos = pixelPos.y;
    var xMarker = xPos, yMarker = yPos;
    var markerAdj = markerSize/2;

    // currently, coordinate system is 0,0 for the map center, but 0,0 for upper left for the div element
    // upper left corner is -x,-y on the map
    if (tipHeight + delta < height/2 + yPos) {
        yTipPos -= tipHeight + delta;  // above
        yMarker -= markerAdj;
        vertical = true;
    } else if (yPos + tipHeight + delta < (height/2)) {
        yTipPos += delta;  // below
        yMarker += markerAdj;
        vertical = true;
    } else if (tipWidth + delta < width/2 + xPos) {
        xTipPos -= tipWidth + delta;   // left
        xMarker -= markerAdj;
    } else if (xPos + tipHeight + delta < (width/2)) {
        xTipPos += delta;   // right
        yMarker += markerAdj;
    } else {
        yTipPos = 0;    // give up, go for upper left corner
        vertical = true;
    }

    if (vertical) {
        xTipPos = this.tryToCenter(tipWidth, xPos, width);
    } else {
        yTipPos = this.tryToCenter(tipHeight, yPos, height);
    }

    el.style.left = xTipPos + width/2 + "px";
    el.style.top = yTipPos + height/2 + "px";

    var linePoints = [
        this.getLL(xMarker, yMarker),
        this.getLL(xTipPos + tipWidth/2, yTipPos + tipHeight/2)
    ];

    var line = new Microsoft.Maps.Polyline(linePoints, {fillColor:ttLineColor, strokeColor:ttLineColor, strokeThickness:2});
    //lineLayer = new Microsoft.Maps.Layer("line");
    //lineLayer.setZIndex(100);
    //lineLayer.add(line);
    //the recommended way of adding objects to layers to the map does not render properly in IE
    //map.layers.insert(lineLayer);
    map.entities.push(line);
    ttLine = line;
};

// returns the left/top position for the tooltip for vertical/horizontal placement
HeatMap.prototype.tryToCenter = function(tipSize, mousePos, mapSize)  {
    var okLeft = mousePos > -1*(mapSize/2) + tipSize/2;
    var okRight = mousePos + tipSize/2 < mapSize/2;

    if (tipSize > mapSize/2 || !okLeft) {
        return -1*(mapSize/2);
    } else if (okRight) { // both OK
        return mousePos - tipSize/2;
    } else { // left OK
        return mapSize/2 - tipSize;
    }
};

var heatMap = new HeatMap();

  // auxilary function to read cookies
  function getCookie(cname) {
    var name = cname + "=";
    var ca = document.cookie.split(';');
    for (var i = 0; i < ca.length; i++) {
      var c = ca[i];
      while (c.charAt(0) == ' ')
        c = c.substring(1);
      if (c.indexOf(name) != -1)
        return c.substring(name.length, c.length);
    }
    return "";
  }

