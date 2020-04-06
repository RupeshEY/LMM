<% uses pcf.* %>
<% uses entity.* %>
<% uses typekey.* %>
<% uses gw.api.locale.DisplayKey %>
<%@ params(cCheck : gw.api.database.ConsistencyCheck, __writer : java.io.Writer, __escaper : gw.lang.parser.template.StringEscaper) %>
<% function printContent(strContent : String, escape : boolean) { com.guidewire.pl.web.widget.TemplateRenderer.printContent(strContent, escape, __writer, __escaper) } %>
<div style="width:1040;height:500;overflow-x:scroll;overflow-y:scroll;">
  <% printContent(com.guidewire.pl.perfdownload.platform.analyzer.sql.SQLPrettyPrinterFactory.getSQLPrettyPrinter().printText(cCheck.QueryToIdentifyRows, true), false) %>
</div>

        