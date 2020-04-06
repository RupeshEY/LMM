<% uses pcf.* %>
<% uses entity.* %>
<% uses typekey.* %>
<% uses gw.api.locale.DisplayKey %>
<%@ params(__writer : java.io.Writer, __escaper : gw.lang.parser.template.StringEscaper) %>
<% function printContent(strContent : String, escape : boolean) { com.guidewire.pl.web.widget.TemplateRenderer.printContent(strContent, escape, __writer, __escaper) } %>

          <iframe id="cognosFrame" src="<%printContent(gw.plugin.cognos.CognosPlugin.getSetCognosCookiesUrl(), false)%>?gwGatewayEndPointUrl=<%printContent(gw.plugin.cognos.CognosPlugin.getGatewayEndPointUrl(), false)%>&gwDispatcherEndPointUrl=<%printContent(gw.plugin.cognos.CognosPlugin.getDispatcherEndPointUrl(), false)%>&gwNamespace=<%printContent(com.guidewire.pl.system.dependency.PLDependencies.getPluginConfig().getPluginDef("CognosPlugin").getParams().get("namespace"), false)%>&gwUser=<%printContent(com.guidewire.pl.system.dependency.PLDependencies.getCommonDependencies().getCurrentUser().getCredential().getUserName().toLowerCase(), false)%>&gwPassword=<%printContent(java.net.URLEncoder.encode(com.guidewire.pl.system.dependency.PLDependencies.getCommonDependencies().getCurrentUser().getCredential().getPassword()), false)%>" scrolling="no" style="overflow: auto;width:100%;height:1050px"></iframe>
        
      