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

<div>
      <table border="0" cellpadding="0" cellspacing="0" width="auto" class="largeMonth">

        <tr>
          <td colspan="6" class="largeMonthTitleCell">
              <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse; margin-left: auto; margin-right: auto;">
                <tr>
                  <td class="dateNavigatorButton"
                      onclick="Events.invokeEvent( '<%= _id %>', true, 'year=<%= model.Year%>&month=<%= model.Month%>&today=0&selectedDay=1&monthOffset=-1' );"
                      style="padding-right: 10px">
                    <img src="images/app/date_prev.png" width="13" height="13" alt="Previous"/>
                  </td>
                  <td class="dateNavigatorTitle"><%= model.Title %></td>
                  <td class="dateNavigatorButton"
                      onclick="Events.invokeEvent( '<%= _id %>', true, 'year=<%= model.Year%>&month=<%= model.Month%>&today=0&selectedDay=1&monthOffset=1' );"
                      style="padding-left: 10px">
                    <img src="images/app/date_next.png" width="13" height="13" alt="Next"/>
                  </td>
                </tr>
              </table>
          </td>
      </tr>
        <tr>
          <td class="largeDayName">
            <%= model.getDayNameLong( 1 ) %>
          </td>
          <td class="largeDayName">
            <%= model.getDayNameLong( 2 ) %>
          </td>
          <td class="largeDayName">
            <%= model.getDayNameLong( 3 ) %>
          </td>
          <td class="largeDayName">
            <%= model.getDayNameLong( 4 ) %>
          </td>
          <td class="largeDayName">
            <%= model.getDayNameLong( 5 ) %>
          </td>
          <td class="largeDayName">
            <%= DisplayKey.get("Web.Calendar.Day.Weekend", model.getDayNameMedium( 6 ), model.getDayNameMedium( 0 )) %>
          </td>
        </tr>


          <% for( var days in model.getMatrix() index iWeek ) {
                if( days == null ) {
                  break;
                }
          %>
        <tr>
          <%    for( var day in days index i ) {
                  if( i == 6 ) {
                    break;
                }
          %>
            <td class='largeDateCell'>
              <div class='<%= getLargeDateBoxClass( i, day ) %> <%= shouldBoldenBorder(i, day) ? "largeDateBoxBoldBorder" : "" %>'>
                 <% if( i < 5 ) { %>
                   <% renderDayCell(day, day.DayOfMonth == 1 || (i == 0 && day.Month != model.Month), 4); %>
                 <% } else { %>
                    <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse;" width="100%" height="100%">
                      <tr height="50%">
                        <td valign="top">
                           <% renderDayCell(day, day.DayOfMonth == 1, 1); %>
                        </td>
                      </tr>
                      <tr height="50%">
                        <td valign="top" class="largeWeekend2DateContent">
                           <% renderDayCell(days[6], days[6].DayOfMonth == 1, 1); %>
                        </td>
                      </tr>
                    </table>
                 <% } %>

              </div>
            </td>
      <% } %>
         </tr>
    <% } %>

    </table>
</div>

  <% if( model.OrderedEventContexts.length > 0 ) { %>
<div>
        <table border="0" cellpadding="10px" cellspacing="0" style="margin: 5px;" width="auto">
          <tr>
            <td valign="top">
              <table border="0" style="border-collapse: collapse" cellpadding="0" cellspacing="5" width="100%" height="100%">
              <% for(e in model.OrderedEventContexts) { e.prepareDisplayNames() }
                 for( e in model.OrderedEventContexts index iCtx ) {
                   if( iCtx % 2 == 1 ) {
                     continue;
                   } %>
                <tr>
                  <td class="eventFootnote">
                   <%= e.Id + " : " + e.NoteDescription %>
                  </td>
                </tr>
              <% } %>
              </table>
            </td>
            <td valign="top">
              <table border="0" style="border-collapse: collapse" cellpadding="0" cellspacing="5" width="100%" height="100%">
              <% for( e in model.OrderedEventContexts index iCtx ) {
                   if( iCtx % 2 == 0 ) {
                     continue;
                   } %>
                <tr>
                  <td class="eventFootnote">
                   <%= e.Id + " : " + e.NoteDescription %>
                  </td>
                </tr>
              <% } %>
              </table>
            </td>
          </tr>
        </table>

</div>
  <% } %>

<%
  function shouldBoldenBorder( iColumn : Number,
                               day : com.guidewire.cc.web.calendar.DayModel ) : Boolean
  {
    if( iColumn == 5 )
    {
      if( day.Today || day.Next.Today )
      {
        return true;
      }
    }
    else if( day.Today )
    {
      return true;
    }
    return false;
  }

  function getLargeDateBoxClass( iColumn : Number,
                                 day : com.guidewire.cc.web.calendar.DayModel ) : String
  {
    if( iColumn == 5 )
    {
      if( day.Selected || day.Next.Selected )
      {
        return "largeDateBoxSelectedDay";
      }
      else
      {
        var iDelta = model.getDaysFromSelectedDay( day );
        if( iDelta > 0 && iDelta < 7 )
        {
          return "largeDateBoxSelectedWeek";
        }
        else if( day.Month != model.Month )
        {
          return "largeDateBoxOtherMonth";
        }
        else
        {
          return "largeDateBox";
        }
      }
    }
    else
    {
      if( day.Selected )
      {
        return "largeDateBoxSelectedDay";
      }
      else
      {
        var iDelta = model.getDaysFromSelectedDay( day );
        if( iDelta > 0 && iDelta < 7 )
        {
          return "largeDateBoxSelectedWeek";
        }
        else if( day.Month != model.Month )
        {
          return "largeDateBoxOtherMonth";
        }
        else
        {
          return "largeDateBox";
        }
      }
    }
  }



  function getLargeDateLineClass( day : com.guidewire.cc.web.calendar.DayModel ) : String
  {
    if( day.isCritical( 1 ) )
    {
      return "largeDateLineCritical1";
    }
    else
    {
      return "largeDateLine";
    }
  }

%>

<% function renderDayCell(day : com.guidewire.cc.web.calendar.DayModel, showMonthName : boolean, maxEventsToShow : int) { %>
        <div class="<%= getLargeDateLineClass( day ) %>"
            onclick="Events.invokeEvent( '<%= _id %>', true, 'year=<%= day.Year%>&month=<%= day.Month%>&today=0&selectedDay=<%= day.DayOfMonth%>' )">
            <%= DisplayKey.get("Web.Calendar.Day.Format", showMonthName ? day.format("MMMM d") : day.DayOfMonth) %>
        </div>
        <div class="largeDateContentEventLineContainer">
         <%
           for( var event in day.Events index count ) {
             if (count == maxEventsToShow ) { %>
               <div class="largeDateContentEventLine" style="text-align: center;">
                 <a class="linkDateContentEventLine"
                    href="javascript:Events.invokeEvent( '<%= _id %>', true, 'year=<%= day.Year%>&month=<%= day.Month%>&today=0&selectedDay=<%= day.DayOfMonth%>' )"
                    title="<%= event.ShortLabel %>">
                   (<%= day.Events.length-maxEventsToShow + " " + DisplayKey.get("JSP.LitigationCalendar.MoreEvents")%>)</a>
               </div>
          <%  break;
             }
          %>
            <div class="largeDateContentEventLine">
              <% renderLink( event ); %>
            </div>
         <% } %>
        </div>

<% } %>

<% function renderLink( event : com.guidewire.cc.web.calendar.EventModel ) {
     if( event.Action != null && event.Action.length() > 0 ) { %>
     <% if (event.isCritical(1)) { %><img class="linkDateContentEventCriticalBullet" src="images/app/red_bullet_trimmed.png" title="<%= DisplayKey.get("Web.Calendar.Tooltip.TopPriority") %>"><% } %>
     <a class="linkDateContentEventLine"
        href="javascript:Events.invokeEvent( '<%= _id %>', true, '<%= event.Action %>' )"
        title="<%= event.ShortLabel %>">
       <%= event.CalendarDisplay %></a>
  <% } else { %>
     <% if (event.isCritical(1)) { %><img class="linkDateContentEventCriticalBullet" src="images/app/red_bullet_trimmed.png" title="<%= DisplayKey.get("Web.Calendar.Tooltip.TopPriority") %>"><% } %>
     <span class="linkDateContentEventLine"
           title="<%= event.ShortLabel %>"">
       <%= event.CalendarDisplay %></span>
  <% } %>
<% } %>
