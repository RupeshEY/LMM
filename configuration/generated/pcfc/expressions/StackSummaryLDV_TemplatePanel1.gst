<% uses pcf.* %>
<% uses entity.* %>
<% uses typekey.* %>
<% uses gw.api.locale.DisplayKey %>
<%@ params(selectedStackSummary : gw.api.profiler.StackAggregatedQuerySummary) %>

            <div style="width:1040;height:500;overflow-x:scroll;overflow-y:scroll;">
              <pre><%=selectedStackSummary.FilteredStackTrace %></pre>
            </div>
          
        