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

<div style="padding-left: 5px; padding-top: 5px; width: 350px;">
      <table valign="top" align="left" border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse" width="100%">
        <tr>
          <td class="weekTitleCell">
            <!-- Week Navigator -->
            <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse; margin-left: auto; margin-right: auto;">
              <tr>
                <td class="weekNavigatorButton"
                    onclick="Events.invokeEvent( '<%= _id %>', true, 'year=<%= model.Year%>&month=<%= model.Month%>&today=0&selectedDay=<%= model.SelectedDay %>&weekOffset=-1' )"
                    style="padding-right: 10px">
                  <img src="images/app/week_prev.png" width="8" height="9" alt="week_prev"/>
                </td>
                <td class="weekNavigatorTitle">
                  <%= model.WeekTitle %>
                </td>
                <td class="weekNavigatorButton"
                    onclick="Events.invokeEvent( '<%= _id %>', true, 'year=<%= model.Year%>&month=<%= model.Month%>&today=0&selectedDay=<%= model.SelectedDay %>&weekOffset=1' );"
                    style="padding-left: 10px">
                  <img src="images/app/week_next.png" width="8" height="9" alt="week_next"/>
                </td>
              </tr>
            </table>
          </td>
        </tr>
        <tr>
          <td class="calendarWeek">
            <!-- Week Days -->
            <table border="0" cellpadding="8px" cellspacing="0" style="border-collapse: collapse" width="100%">
            <% for( day in model.SelectedDaysForFullWeek index iDay ) { %>
                <tr>
                  <td>
                    <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse" width="100%">
                      <tr>
                        <td class="weekDayTitle">
                          <%= day.format() %>
                        </td>
                      </tr>
                      <tr>
                        <td style="padding-top: 3px; padding-left: 17px">
                          <% if( day.Events.length == 0 ) { %>
                            <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse" width="100%">
                              <tr>
                                <td valign="top" class="weekNoEvents" style="padding-right: 6px;">
                                  <%= DisplayKey.get("JSP.LitigationCalendar.NoEvents") %>
                                </td>
                              </tr>
                            </table>
                          <% } else {  %>
                            <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
                            <% var iEvent = 0;
                               for( var ev in day.Events ) {
                                 var eventList : java.util.List;
                                 if( ev.ChildCount > 0 ) {
                                     eventList = ev.Children;
                                 } else {
                                   var collections : java.util.Collections;
                                   eventList = collections.singletonList( ev );
                                 }
                                 for( var event in (eventList as java.util.List<com.guidewire.cc.web.calendar.EventModel>) ) {
                                   iEvent = iEvent + 1;
                            %>
                                <tr>
                                  <td colspan="2" style="padding-top: 3px">
                                      <div class="dateNavigatorSmallText" style='white-space: nowrap;'>
                                        <%= event.EventTimeDisplay %>
                                      </div>
                                  </td>
                                </tr>
                                <tr>
                                  <td valign="top">
                                    <img id="collapseDay<%= iDay %>Event<%= iEvent %>" src="images/app/collapse.png" width="11" height="11" alt="<%= gw.api.locale.DisplayKey.get( "JSP.LitigationCalendar.Collapse.Tooltip" ) %>" style='display:<%= day.Selected ? "inline" : "none" %>; cursor: pointer;'
                                         onclick='document.getElementById("day<%= iDay %>Event<%= iEvent %>").style.display = "none";
                                                  document.getElementById("expandDay<%= iDay %>Event<%= iEvent %>").style.display = "inline";
                                                  document.getElementById("collapseDay<%= iDay %>Event<%= iEvent %>").style.display = "none";
                                                  Ext.getCmp("<%= _id %>").doComponentLayout();'/>
                                    <img id="expandDay<%= iDay %>Event<%= iEvent %>" src="images/app/expand.png" width="11" height="11" alt=""<%= gw.api.locale.DisplayKey.get( "JSP.LitigationCalendar.Expand.Tooltip" ) %>"" style='display:<%= day.Selected ? "none" : "inline" %>; cursor: pointer;'
                                         onclick='document.getElementById("day<%= iDay %>Event<%= iEvent %>").style.display = "table-row";
                                                  document.getElementById("collapseDay<%= iDay %>Event<%= iEvent %>").style.display = "inline";
                                                  document.getElementById("expandDay<%= iDay %>Event<%= iEvent %>").style.display = "none";
                                                  Ext.getCmp("<%= _id %>").doComponentLayout();'/>
                                  </td>


                                  <td valign="top" style="padding-left: 5px; padding-bottom: 3px;">
                                    <div class="longWeekDisplay">
                                      <div class="dateNavigatorSmallText">
                                        <% if (event.isCritical(1)) { %><img class="dateNavigatorSmallTextCriticalBullet" src="images/app/red_bullet_trimmed.png" title="<%= DisplayKey.get("Web.Calendar.Tooltip.TopPriority") %>"><% } %>
                                        <a class="dateNavigatorSmallText" href="javascript:Events.invokeEvent( '<%= _id %>', true, '<%= event.Action %>' )"><%= event.LongWeekDisplay %></a>
                                      </div>
                                      <div id="day<%= iDay %>Event<%= iEvent %>" style='display:<%= day.Selected ? "inline" : "none" %>' >
                                        <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse;">
                                        <% for( propertyKey in event.Context.PropertyKeys ) { %>
                                          <tr>
                                            <td class="weekPropertyName">
                                              <%= gw.api.locale.DisplayKey.get( propertyKey.getKey() ) %>:
                                            </td>
                                            <td class="weekPropertyValue">
                                              <%= event.Context.getProperty( propertyKey ) %>
                                            </td>
                                          </tr>
                                        <% }%>
                                        </table>
                                      </div>

                                    </div>
                                  </td>
                                </tr>
                              <% } %>
                            <% } %>
                            </table>
                          <% } %>
                        </td>
                      </tr>
                    </table>
                  </td>
                </tr>
            <% } %>
            </table>
          </td>
        </tr>
      </table>
</div>

