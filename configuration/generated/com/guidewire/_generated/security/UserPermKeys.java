package com.guidewire._generated.security;

import com.guidewire.cc.domain.community.impl.ViewAnyAdminPermissionHandler;
import com.guidewire.pl.domain.community.impl.DevAllAccessPermissionHandler;
import com.guidewire.pl.domain.community.impl.EditVacationPermissionHandler;
import com.guidewire.pl.system.security.ObjectPermissionKey;
import com.guidewire.pl.system.security.OptionalObjectPermissionKey;
import com.guidewire.pl.system.security.PermissionKey;
import com.guidewire.pl.system.security.StaticPermissionKey;
import com.guidewire.pl.system.security.WrapPermissionKey;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(comments = "security-config-app.xml;security-config-pl.xml;security-config.xml", date = "", value = "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
public class UserPermKeys {
  public static final StaticPermissionKey VIEWINFO = new StaticPermissionKey("ViewInfo", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("internaltools", "toolsInfoview").build());
  
  public static final StaticPermissionKey VIEWMBEANS = new StaticPermissionKey("ViewMBeans", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("internaltools", "toolsJMXBeansview").build());
  
  public static final WrapPermissionKey EDITMBEANS = new WrapPermissionKey("EditMBeans", VIEWMBEANS, com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("internaltools", "toolsJMXBeansEdit").build());
  
  public static final StaticPermissionKey EDITJPROFILER = new StaticPermissionKey("EditJProfiler", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("internaltools", "toolsJProfileredit").build());
  
  public static final StaticPermissionKey VIEWBATCHPROCESS = new StaticPermissionKey("ViewBatchProcess", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("internaltools", "toolsBatchProcessview").build());
  
  public static final WrapPermissionKey EDITBATCHPROCESS = new WrapPermissionKey("EditBatchProcess", VIEWBATCHPROCESS, com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("internaltools", "toolsBatchProcessedit").build());
  
  public static final StaticPermissionKey VIEWWORKQUEUE = new StaticPermissionKey("ViewWorkQueue", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("internaltools", "toolsWorkQueueview").build());
  
  public static final WrapPermissionKey EDITWORKQUEUE = new WrapPermissionKey("EditWorkQueue", VIEWWORKQUEUE, com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("internaltools", "toolsWorkQueueedit").build());
  
  public static final StaticPermissionKey VIEWPROFILER = new StaticPermissionKey("ViewProfiler", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("internaltools", "toolsProfilerview").build());
  
  public static final WrapPermissionKey EDITPROFILER = new WrapPermissionKey("EditProfiler", VIEWPROFILER, com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("internaltools", "toolsProfileredit").build());
  
  public static final StaticPermissionKey VIEWCACHEINFO = new StaticPermissionKey("ViewCacheInfo", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("internaltools", "toolsCacheinfoview").build());
  
  public static final StaticPermissionKey VIEWPLUGIN = new StaticPermissionKey("ViewPlugin", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("internaltools", "toolsPluginview").build());
  
  public static final WrapPermissionKey EDITPLUGIN = new WrapPermissionKey("EditPlugin", VIEWPLUGIN, com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("internaltools", "toolsPluginedit").build());
  
  public static final StaticPermissionKey VIEWLOG = new StaticPermissionKey("ViewLog", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("internaltools", "toolsLogview").build());
  
  public static final StaticPermissionKey EDITLOG = new StaticPermissionKey("EditLog", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("internaltools", "toolsLogedit").build());
  
  public static final StaticPermissionKey VIEWCLUSTER = new StaticPermissionKey("ViewCluster", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("internaltools", "toolsClusterview").build());
  
  public static final WrapPermissionKey EDITCLUSTER = new WrapPermissionKey("EditCluster", VIEWCLUSTER, com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("internaltools", "toolsClusteredit").build());
  
  public static final StaticPermissionKey VIEWDATACHANGE = new StaticPermissionKey("ViewDataChange", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("admindatachangeview").build());
  
  public static final WrapPermissionKey EXECUTEDATACHANGE = new WrapPermissionKey("ExecuteDataChange", VIEWDATACHANGE, com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("admindatachangeexec").build());
  
  public static final StaticPermissionKey SERVERTOOLS = new StaticPermissionKey("ServerTools", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("internaltools", "toolsInfoview", "toolsJMXBeansview", "toolsJProfileredit", "toolsBatchProcessview", "toolsWorkQueueview", "toolsProfilerview", "toolsPluginview", "toolsLogview", "toolsLogedit", "toolsClusterview").withDisplayKey("Web.ServerTools.NoPermission").build());
  
  public static final StaticPermissionKey CREATE = new StaticPermissionKey("create", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("usercreate").withDescription("Permission to create a new user").build());
  
  public static final OptionalObjectPermissionKey VIEW = new OptionalObjectPermissionKey("view", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("userview").withDescription("Permission to view a user's details").build());
  
  public static final OptionalObjectPermissionKey EDIT = new OptionalObjectPermissionKey("edit", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("useredit").withDescription("Permission to edit an existing user").build());
  
  public static final OptionalObjectPermissionKey DELETE = new OptionalObjectPermissionKey("delete", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("userdelete").withDescription("Permission to delete a user").build());
  
  public static final StaticPermissionKey VIEWALLUSERS = new StaticPermissionKey("viewallusers", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("userviewall").withDescription("Permission to view all users in the system").build());
  
  public static final StaticPermissionKey USEREDITLANG = new StaticPermissionKey("usereditlang", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("usereditlang").withDescription("Permission to change the language for a user").build());
  
  public static final StaticPermissionKey MANAGEATTRIBUTES = new StaticPermissionKey("manageattributes", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("usereditattrs").withDescription("Permission to add and remove attributes from a user").build());
  
  public static final StaticPermissionKey GRANTROLES = new StaticPermissionKey("grantroles", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("usergrantroles").withDescription("Permission to assign a user roles").build());
  
  public static final StaticPermissionKey GRANTAUTHORITYLIMITS = new StaticPermissionKey("grantauthoritylimits", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("usergrantauth").withDescription("Permission to give a user authority limits").build());
  
  public static final StaticPermissionKey VIEWDESTINATION = new StaticPermissionKey("viewdestination", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("integadmin").withDescription("Permission to view a message destination").build());
  
  public static final StaticPermissionKey SUSPENDDESTINATION = new StaticPermissionKey("suspenddestination", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("integadmin").withDescription("Permission to suspend a message destination").build());
  
  public static final StaticPermissionKey RESUMEDESTINATION = new StaticPermissionKey("resumedestination", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("integadmin").withDescription("Permission to resume a message destination").build());
  
  public static final StaticPermissionKey VIEWTEAM = new StaticPermissionKey("viewteam", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("viewteam").withDescription("Permission to view the team pages").build());
  
  public static final StaticPermissionKey VIEWSEARCH = new StaticPermissionKey("viewsearch", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("viewsearch").withDescription("Permission to view the search pages").build());
  
  public static final StaticPermissionKey VIEWWORKLOAD = new StaticPermissionKey("viewworkload", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("viewworkload").withDescription("Permission to view global workload information of other users").build());
  
  public static final StaticPermissionKey VIEWACTCAL = new StaticPermissionKey("viewactcal", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("viewactcal").withDescription("Permission to view activity calendar of other users").build());
  
  public static final StaticPermissionKey ALWAYSACCESSDEBUGTOOLS = new StaticPermissionKey("alwaysaccessdebugtools", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("debugtools").withDescription("Permission to always access the debug tools").build());
  
  public static final StaticPermissionKey SOAPADMIN = new StaticPermissionKey("soapadmin", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("soapadmin").withDescription("Permission to use the SOAP tools").build());
  
  public static final StaticPermissionKey JMXADMIN = new StaticPermissionKey("jmxadmin", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("soapadmin").withDescription("Permission to use the JMX monitoring interface").build());
  
  public static final StaticPermissionKey RULEADMIN = new StaticPermissionKey("ruleadmin", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("ruleadmin").withDescription("Permission to use the rule composer").build());
  
  public static final StaticPermissionKey INTEGRATIONADMIN = new StaticPermissionKey("integrationadmin", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("integadmin").withDescription("Permission to perform integration tasks").build());
  
  public static final StaticPermissionKey PRINTLISTVIEWS = new StaticPermissionKey("printlistviews", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("lvprint").withDescription("Permission to print list views").build());
  
  public static final StaticPermissionKey IMPORTADMINDATA = new StaticPermissionKey("importadmindata", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("soapadmin").withDescription("Permission to import admin data").build());
  
  public static final StaticPermissionKey EXPORTADMINDATA = new StaticPermissionKey("exportadmindata", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("soapadmin").withDescription("Permission to export admin data").build());
  
  public static final StaticPermissionKey DEVALLACCESS = new StaticPermissionKey("DevAllAccess", entity.User.class.getSimpleName(), new DevAllAccessPermissionHandler());
  
  public static final ObjectPermissionKey EDITVACATION = new ObjectPermissionKey("editvacation", entity.User.class.getSimpleName(), new EditVacationPermissionHandler());
  
  public static final StaticPermissionKey IGNOREACL = new StaticPermissionKey("ignoreacl", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("ignoreacl").withDescription("Permission that ignores claim ACLs (i.e. the user is always considered to be on the ACL)").build());
  
  public static final StaticPermissionKey VIEWANYADMIN = new StaticPermissionKey("viewanyadmin", entity.User.class.getSimpleName(), new ViewAnyAdminPermissionHandler());
  
  public static final StaticPermissionKey VIEWANYEDB = new StaticPermissionKey("viewanyedb", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("edbclaimcounts", "edbclaimact", "edbcurrfin", "edbpdfin").withDescription("Permission to view at least one of the executive dashboard screens").withDisplayKey("Java.Error.Permission.ViewAnyDashboard").build());
  
  public static final StaticPermissionKey VIEWEDBCLAIMACT = new StaticPermissionKey("viewedbclaimact", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("edbclaimact").withDescription("Permission to view the executive dashboard claim activity page").build());
  
  public static final StaticPermissionKey VIEWEDBCLAIMCOUNTS = new StaticPermissionKey("viewedbclaimcounts", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("edbclaimcounts").withDescription("Permission to view the executive dashboard claim counts page").build());
  
  public static final StaticPermissionKey VIEWEDBCURRFIN = new StaticPermissionKey("viewedbcurrfin", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("edbcurrfin").withDescription("Permission to view the executive dashboard current financials page").build());
  
  public static final StaticPermissionKey VIEWEDBPDFIN = new StaticPermissionKey("viewedbpdfin", entity.User.class.getSimpleName(), com.guidewire.pl.system.security.PermissionHandlerConfig.builder().withPermissions("edbpdfin").withDescription("Permission to view the executive dashboard period financials page").build());
  
  public static List<PermissionKey> getPermissionKeys() {
    List<PermissionKey> permissionKeys = new ArrayList<>();
    permissionKeys.add(VIEWINFO);
    permissionKeys.add(VIEWMBEANS);
    permissionKeys.add(EDITMBEANS);
    permissionKeys.add(EDITJPROFILER);
    permissionKeys.add(VIEWBATCHPROCESS);
    permissionKeys.add(EDITBATCHPROCESS);
    permissionKeys.add(VIEWWORKQUEUE);
    permissionKeys.add(EDITWORKQUEUE);
    permissionKeys.add(VIEWPROFILER);
    permissionKeys.add(EDITPROFILER);
    permissionKeys.add(VIEWCACHEINFO);
    permissionKeys.add(VIEWPLUGIN);
    permissionKeys.add(EDITPLUGIN);
    permissionKeys.add(VIEWLOG);
    permissionKeys.add(EDITLOG);
    permissionKeys.add(VIEWCLUSTER);
    permissionKeys.add(EDITCLUSTER);
    permissionKeys.add(VIEWDATACHANGE);
    permissionKeys.add(EXECUTEDATACHANGE);
    permissionKeys.add(SERVERTOOLS);
    permissionKeys.add(CREATE);
    permissionKeys.add(VIEW);
    permissionKeys.add(EDIT);
    permissionKeys.add(DELETE);
    permissionKeys.add(VIEWALLUSERS);
    permissionKeys.add(USEREDITLANG);
    permissionKeys.add(MANAGEATTRIBUTES);
    permissionKeys.add(GRANTROLES);
    permissionKeys.add(GRANTAUTHORITYLIMITS);
    permissionKeys.add(VIEWDESTINATION);
    permissionKeys.add(SUSPENDDESTINATION);
    permissionKeys.add(RESUMEDESTINATION);
    permissionKeys.add(VIEWTEAM);
    permissionKeys.add(VIEWSEARCH);
    permissionKeys.add(VIEWWORKLOAD);
    permissionKeys.add(VIEWACTCAL);
    permissionKeys.add(ALWAYSACCESSDEBUGTOOLS);
    permissionKeys.add(SOAPADMIN);
    permissionKeys.add(JMXADMIN);
    permissionKeys.add(RULEADMIN);
    permissionKeys.add(INTEGRATIONADMIN);
    permissionKeys.add(PRINTLISTVIEWS);
    permissionKeys.add(IMPORTADMINDATA);
    permissionKeys.add(EXPORTADMINDATA);
    permissionKeys.add(DEVALLACCESS);
    permissionKeys.add(EDITVACATION);
    permissionKeys.add(IGNOREACL);
    permissionKeys.add(VIEWANYADMIN);
    permissionKeys.add(VIEWANYEDB);
    permissionKeys.add(VIEWEDBCLAIMACT);
    permissionKeys.add(VIEWEDBCLAIMCOUNTS);
    permissionKeys.add(VIEWEDBCURRFIN);
    permissionKeys.add(VIEWEDBPDFIN);
    return java.util.Collections.unmodifiableList(permissionKeys);
  }
  
  
}