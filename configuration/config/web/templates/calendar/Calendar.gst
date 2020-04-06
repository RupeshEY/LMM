<div style="padding: 10px;">
    <table border="0" valign="top" cellpadding="5px" cellspacing="0" style="border-collapse: collapse;">

    <tr>
        <td align="left" valign="top">
            <!-- Date Navigator -->
            <%
              gw.api.util.TemplateUtil.renderTemplate( "calendar/CalendarTitleNavigator", __renderContext, __valueProvider );
            %>
        </td>
        <td align="right" valign="top">
            <%
                gw.api.util.TemplateUtil.renderTemplate( "calendar/CalendarFilters", __renderContext, __valueProvider );
             %>
        </td>
        <td>
        </td>
      </tr>

      <tr>
        <td align="left" valign="top" colspan="2" rowspan="2">
          <%
            gw.api.util.TemplateUtil.renderTemplate( "calendar/CalendarMonth", __renderContext, __valueProvider );
          %>
        </td>
        <td align="left" valign="top">
            <%
              gw.api.util.TemplateUtil.renderTemplate( "calendar/CalendarSmall", __renderContext, __valueProvider );
            %>
        </td>
      </tr>

      <tr>
          <td align="left" valign="top">

              <!-- Calendar controls (list view lists, navigation ctrl, small calendars) -->
                      <%
                        gw.api.util.TemplateUtil.renderTemplate( "calendar/CalendarWeek", __renderContext, __valueProvider );
                      %>
              <!-- End of Calendar controls (list view lists, navigation ctrl, small calendars) -->

          </td>
      </tr>


    </table> <!-- End of Calendar controls (list view lists, navigation ctrl, small calendars), and big month calendar -->
</div>

