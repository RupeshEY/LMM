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


<div style="padding-left: 5px">
	  	<table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
        <tr>
          <td class="smallDateLine" colspan="7"
               onclick="Events.invokeEvent( '<%= _id %>', true, 'year=<%= nextMonth1.Year %>&month=<%= nextMonth1.Month %>&today=0&selectedDay=1' )">
              <%= nextMonth1.Title %>
          </td>
        </tr>
                <% for( var days in nextMonth1.getMatrix() ) {
                     if( days == null ) {
                       break;
                     }
                   %>
         <tr>
                  <% for( var day in days index i ) {
                       if( i == 6 ) {
                         break;
                       } %>
                       <td class="<%= getSmallDateBoxClass( nextMonth1, day, i==5 ? days[6] : null) %>"
                           onclick="Events.invokeEvent( '<%= _id %>', true, 'year=<%= day.Year %>&month=<%= day.Month %>&today=0&selectedDay=<%= day.DayOfMonth %>' )"
                           onmouseenter="this.style.fontWeight = 'bold';"
                           onmouseleave="this.style.fontWeight = 'normal';">
                         <%= i == 5 ? DisplayKey.get("Web.Calendar.Day.Weekend", day.DayOfMonth, days[6].DayOfMonth) : day.DayOfMonth %>
                       </td>
                  <% } %>
        </tr>
                <% } %>
		</table>
</div>
<%

  function getSmallDateBoxClass( smallMonthModel : com.guidewire.cc.web.calendar.MonthModel,
                                 day : com.guidewire.cc.web.calendar.DayModel,
                                 daySix : com.guidewire.cc.web.calendar.DayModel) : String
  {
    var dayInMonth = day.Month == smallMonthModel.Month
    var daySixInMonth = daySix != null && daySix.Month == smallMonthModel.Month
    if( not dayInMonth && (daySix == null or not daySixInMonth))
    {
      return "smallDateContentOtherMonth";
    }
    else if( (dayInMonth && day.isCritical(1)) || (daySix != null && daySixInMonth && daySix.isCritical(1)) )
    {
      return "smallDateContentCritical1";
    }
    else
    {
      return "smallDateContent";
    }
  }

%>
