<% uses pcf.* %>
<% uses entity.* %>
<% uses typekey.* %>
<% uses gw.api.locale.DisplayKey %>
<%@ params(SelectedQuerySummary : gw.api.profiler.QuerySummary, __writer : java.io.Writer, __escaper : gw.lang.parser.template.StringEscaper) %>
<% function printContent(strContent : String, escape : boolean) { com.guidewire.pl.web.widget.TemplateRenderer.printContent(strContent, escape, __writer, __escaper) } %>
<div style="width:1040;height:500;overflow-x:scroll;overflow-y:scroll;">
              <% printContent(SelectedQuerySummary.PrettyPrintedSQL, false) %>
            </div>
        