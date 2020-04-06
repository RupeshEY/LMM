<% uses pcf.* %>
<% uses entity.* %>
<% uses typekey.* %>
<% uses gw.api.locale.DisplayKey %>
<%@ params(SelectedQuerySummary : gw.api.profiler.QuerySummary) %>
<div style="width:1040;height:500;overflow-x:scroll;overflow-y:scroll;">
              <pre><%=SelectedQuerySummary.FullStackTrace%></pre>
            </div>
        