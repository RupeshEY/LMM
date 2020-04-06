<% uses gw.api.locale.DisplayKey %>
<% uses gw.api.calendar.CalendarState %>
<% uses com.guidewire.cc.web.calendar.MonthModel %>
<% uses com.guidewire.pl.web.widget.LabeledValue %>
<%@ params(
 model : MonthModel, nextMonth1 : MonthModel, nextMonth2 : MonthModel,
 calendarState : CalendarState,
 activityFilters : LabeledValue[],
 matterFilters : LabeledValue[],
 detailMatterFilters : LabeledValue[],
 priorityFilters : LabeledValue[],
 assignedFilters : LabeledValue[],
 groupFilters : LabeledValue[],
 _id : String)
%>


            <table border="0" cellpadding="2px" cellspacing="0" style="border-collapse: collapse">
              <tr>
                <td class="dateNavigatorSmallText">
                    <%= DisplayKey.get("JSP.LitigationCalendar.JumpTo") %> <select name="JumpDate" size="1" class="dateNavigatorSmallText"
                              onchange="Events.invokeEvent( '<%= _id %>', true, this.options[this.selectedIndex].value )">
                      <option value="clearCalendarState=1"><%= DisplayKey.get("JSP.LitigationCalendar.Today") %>
                      <option value="year=<%= model.Year%>&month=<%= model.Month%>&today=<%= model.Today %>&selectedDay=<%= model.SelectedDay %>" selected><%= model.Title %>
                      <% for ( var i in 0..|11 ) { %>
                        <option value="year=<%= model.getYear( i+1 )%>&month=<%= model.getMonth(  i+1 )%>&today=0&selectedDay=1"><%= model.getTitle(  i+1 ) %>
                      <% } %>
                    </select>
                </td>
              </tr>
            </table>
