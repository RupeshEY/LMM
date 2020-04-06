<% uses pcf.* %>
<% uses entity.* %>
<% uses typekey.* %>
<% uses gw.api.locale.DisplayKey %>
<%@ params(controller : gw.bizrules.pcf.ConditionBuilderController, __writer : java.io.Writer, __escaper : gw.lang.parser.template.StringEscaper) %>
<% function printContent(strContent : String, escape : boolean) { com.guidewire.pl.web.widget.TemplateRenderer.printContent(strContent, escape, __writer, __escaper) } %>
<div style="width:800;height:500;padding:25px;">
        <% printContent(controller.prettyPrint(), false) %>
      </div>

              