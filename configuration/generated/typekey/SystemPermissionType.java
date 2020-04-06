package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "SystemPermissionType.tti;SystemPermissionType.tix;SystemPermissionType.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class SystemPermissionType implements gw.entity.TypeKey {
  /**
   * Create address book contacts
   * Permission to create a new contact in the address book
   */
  public static final typekey.SystemPermissionType TC_ABCREATE = new typekey.SystemPermissionType("abcreate");
  
  /**
   * Create address book preferred vendors
   * Permission to add a preferred vendor to the address book
   */
  public static final typekey.SystemPermissionType TC_ABCREATEPREF = new typekey.SystemPermissionType("abcreatepref");
  
  /**
   * Delete address book contacts
   * Permission to delete an existing contact in the address book
   */
  public static final typekey.SystemPermissionType TC_ABDELETE = new typekey.SystemPermissionType("abdelete");
  
  /**
   * Delete address book preferred vendors
   * Permission to delete an existing preferred vendor address book entry
   */
  public static final typekey.SystemPermissionType TC_ABDELETEPREF = new typekey.SystemPermissionType("abdeletepref");
  
  /**
   * Edit address book contacts
   * Permission to edit an existing contact in the address book
   */
  public static final typekey.SystemPermissionType TC_ABEDIT = new typekey.SystemPermissionType("abedit");
  
  /**
   * Edit address book preferred vendors
   * Permission to modify an existing preferred vendor address book entry
   */
  public static final typekey.SystemPermissionType TC_ABEDITPREF = new typekey.SystemPermissionType("abeditpref");
  
  /**
   * View address book contacts
   * Permission to view the details of contact entries in the address book
   */
  public static final typekey.SystemPermissionType TC_ABVIEW = new typekey.SystemPermissionType("abview");
  
  /**
   * View address book contact search pages
   * Permission to search contact entries in the address book
   */
  public static final typekey.SystemPermissionType TC_ABVIEWSEARCH = new typekey.SystemPermissionType("abviewsearch");
  
  /**
   * Manage Account
   * Permission to add, edit, or delete accounts
   */
  public static final typekey.SystemPermissionType TC_ACCOUNTMNG = new typekey.SystemPermissionType("accountmng");
  
  /**
   * View Account
   * Permission to view accounts
   */
  public static final typekey.SystemPermissionType TC_ACCOUNTVIEW = new typekey.SystemPermissionType("accountview");
  
  /**
   * Approve any approval activity
   * Permission to approve any approval activity even if the activity is assigned to someone else; the approver is still subject to authority limit restrictions
   */
  public static final typekey.SystemPermissionType TC_ACTAPPROVEANY = new typekey.SystemPermissionType("actapproveany");
  
  /**
   * Create activities
   * Permission to create new activities
   */
  public static final typekey.SystemPermissionType TC_ACTCREATE = new typekey.SystemPermissionType("actcreate");
  
  /**
   * Create activities on closed claim
   * Permission to create a new activity associated with a closed claim
   */
  public static final typekey.SystemPermissionType TC_ACTCREATECLSD = new typekey.SystemPermissionType("actcreateclsd");
  
  /**
   * Edit unowned activities
   * Permission to modify (edit/skip/close) activities owned by other users
   */
  public static final typekey.SystemPermissionType TC_ACTEDITUNOWNED = new typekey.SystemPermissionType("acteditunowned");
  
  /**
   * Approve Rule
   * Permission to approve Rule
   */
  public static final typekey.SystemPermissionType TC_ACTIVITYRULEAPPROVE = new typekey.SystemPermissionType("activityruleapprove");
  
  /**
   * Deploy Rule
   * Permission to deploy Rule
   */
  public static final typekey.SystemPermissionType TC_ACTIVITYRULEDEPLOY = new typekey.SystemPermissionType("activityruledeploy");
  
  /**
   * Edit Rule
   * Permission to edit Rule
   */
  public static final typekey.SystemPermissionType TC_ACTIVITYRULEEDIT = new typekey.SystemPermissionType("activityruleedit");
  
  /**
   * Import Rule
   * Permission to import Rule
   */
  public static final typekey.SystemPermissionType TC_ACTIVITYRULEIMPORT = new typekey.SystemPermissionType("activityruleimport");
  
  /**
   * View Rule
   * Permission to view Rule
   */
  public static final typekey.SystemPermissionType TC_ACTIVITYRULEVIEW = new typekey.SystemPermissionType("activityruleview");
  
  /**
   * Make activities mandatory
   * Permission to set whether an activity is mandatory
   */
  public static final typekey.SystemPermissionType TC_ACTMAKEMAND = new typekey.SystemPermissionType("actmakemand");
  
  /**
   * Own activity
   * Permission to own an activity and to see the Desktop Activities page
   */
  public static final typekey.SystemPermissionType TC_ACTOWN = new typekey.SystemPermissionType("actown");
  
  /**
   * Create activity pattern
   * Permission to create new activity patterns
   */
  public static final typekey.SystemPermissionType TC_ACTPATCREATE = new typekey.SystemPermissionType("actpatcreate");
  
  /**
   * Delete activity pattern
   * Permission to delete activity patterns
   */
  public static final typekey.SystemPermissionType TC_ACTPATDELETE = new typekey.SystemPermissionType("actpatdelete");
  
  /**
   * Edit activity pattern
   * Permission to edit activity patterns
   */
  public static final typekey.SystemPermissionType TC_ACTPATEDIT = new typekey.SystemPermissionType("actpatedit");
  
  /**
   * View activity pattern
   * Permission to view the list of activity patterns or activity pattern details
   */
  public static final typekey.SystemPermissionType TC_ACTPATVIEW = new typekey.SystemPermissionType("actpatview");
  
  /**
   * Assign activity from queue
   * Permission to assign an activity from a queue
   */
  public static final typekey.SystemPermissionType TC_ACTQUEUEASSIGN = new typekey.SystemPermissionType("actqueueassign");
  
  /**
   * Get next activity from queue
   * Permission to get the next activity off of a queue
   */
  public static final typekey.SystemPermissionType TC_ACTQUEUENEXT = new typekey.SystemPermissionType("actqueuenext");
  
  /**
   * Pick activity from queue
   * Permission to pick an activity from a queue
   */
  public static final typekey.SystemPermissionType TC_ACTQUEUEPICK = new typekey.SystemPermissionType("actqueuepick");
  
  /**
   * Reassign owned activities
   * Permission to reassign your own activities
   */
  public static final typekey.SystemPermissionType TC_ACTRAOWN = new typekey.SystemPermissionType("actraown");
  
  /**
   * Reassign unowned activities
   * Permission to reassign activities owned by other users
   */
  public static final typekey.SystemPermissionType TC_ACTRAUNOWN = new typekey.SystemPermissionType("actraunown");
  
  /**
   * Review assignments
   * Permission to review and approve manually-approved assignables
   */
  public static final typekey.SystemPermissionType TC_ACTREVIEWASSIGN = new typekey.SystemPermissionType("actreviewassign");
  
  /**
   * View activities
   * Permission to view activities
   */
  public static final typekey.SystemPermissionType TC_ACTVIEW = new typekey.SystemPermissionType("actview");
  
  /**
   * View all activity queues
   * Permission to view all activity queues, even those in other security zones
   */
  public static final typekey.SystemPermissionType TC_ACTVIEWALLQUEUES = new typekey.SystemPermissionType("actviewallqueues");
  
  /**
   * Execute Data Change
   * Permission to execute the data change.
   */
  public static final typekey.SystemPermissionType TC_ADMINDATACHANGEEXEC = new typekey.SystemPermissionType("admindatachangeexec");
  
  /**
   * View Data Change
   * Permission to view the data change page.
   */
  public static final typekey.SystemPermissionType TC_ADMINDATACHANGEVIEW = new typekey.SystemPermissionType("admindatachangeview");
  
  /**
   * Manage authority limit profiles
   * Permission create, edit, or delete authority limit profiles
   */
  public static final typekey.SystemPermissionType TC_ALPMANAGE = new typekey.SystemPermissionType("alpmanage");
  
  /**
   * View authority limit profiles
   * Permission to view authority limit profiles
   */
  public static final typekey.SystemPermissionType TC_ALPVIEW = new typekey.SystemPermissionType("alpview");
  
  /**
   * Create contact with any tag
   * Permission to create a new contact regardless of which tag(s) it has
   */
  public static final typekey.SystemPermissionType TC_ANYTAGCREATE = new typekey.SystemPermissionType("anytagcreate");
  
  /**
   * Delete contact with any tag
   * Permission to delete a contact regardless of which tag(s) it has
   */
  public static final typekey.SystemPermissionType TC_ANYTAGDELETE = new typekey.SystemPermissionType("anytagdelete");
  
  /**
   * Edit contact with any tag
   * Permission to edit the details of a contact regardless of which tag(s) it has
   */
  public static final typekey.SystemPermissionType TC_ANYTAGEDIT = new typekey.SystemPermissionType("anytagedit");
  
  /**
   * View contact with any tag
   * Permission to view the details of a contact regardless of which tag(s) it has
   */
  public static final typekey.SystemPermissionType TC_ANYTAGVIEW = new typekey.SystemPermissionType("anytagview");
  
  /**
   * Archive objects
   * Permission to archive objects
   */
  public static final typekey.SystemPermissionType TC_ARCHIVE = new typekey.SystemPermissionType("archive");
  
  /**
   * Manage claim associations
   * Permission to create, edit, or delete claim associations
   */
  public static final typekey.SystemPermissionType TC_ASSOCMANAGE = new typekey.SystemPermissionType("assocmanage");
  
  /**
   * View claim associations
   * Permission to view claim associations on a claim
   */
  public static final typekey.SystemPermissionType TC_ASSOCVIEW = new typekey.SystemPermissionType("assocview");
  
  /**
   * Manage attributes
   * Permission to create, edit, or delete user attributes
   */
  public static final typekey.SystemPermissionType TC_ATTRMANAGE = new typekey.SystemPermissionType("attrmanage");
  
  /**
   * View attributes
   * Permission to view the list of user attributes or attribute details
   */
  public static final typekey.SystemPermissionType TC_ATTRVIEW = new typekey.SystemPermissionType("attrview");
  
  /**
   * Create bulk invoices
   * Permission to create bulk invoices
   */
  public static final typekey.SystemPermissionType TC_BULKINVCREATE = new typekey.SystemPermissionType("bulkinvcreate");
  
  /**
   * Delete bulk invoices
   * Permission to delete bulk invoices
   */
  public static final typekey.SystemPermissionType TC_BULKINVDELETE = new typekey.SystemPermissionType("bulkinvdelete");
  
  /**
   * Edit bulk invoices
   * Permission to edit bulk invoices
   */
  public static final typekey.SystemPermissionType TC_BULKINVEDIT = new typekey.SystemPermissionType("bulkinvedit");
  
  /**
   * View bulk invoices
   * Permission to view bulk invoices
   */
  public static final typekey.SystemPermissionType TC_BULKINVVIEW = new typekey.SystemPermissionType("bulkinvview");
  
  /**
   * Manage business week
   * Permission to create, edit, or delete business week
   */
  public static final typekey.SystemPermissionType TC_BUSWKMANAGE = new typekey.SystemPermissionType("buswkmanage");
  
  /**
   * View business week
   * Permission to view the list of business week
   */
  public static final typekey.SystemPermissionType TC_BUSWKVIEW = new typekey.SystemPermissionType("buswkview");
  
  /**
   * Manage catastrophes
   * Permission to create, edit, and activate/deactivate catastrophes
   */
  public static final typekey.SystemPermissionType TC_CATMANAGE = new typekey.SystemPermissionType("catmanage");
  
  /**
   * View catastrophes
   * Permission to view the list of catastrophes and details of individual catastrophes
   */
  public static final typekey.SystemPermissionType TC_CATVIEW = new typekey.SystemPermissionType("catview");
  
  /**
   * Change Contact Subtype
   * Permission to change contact subtype
   */
  public static final typekey.SystemPermissionType TC_CHANGECONTACTSUBTYPE = new typekey.SystemPermissionType("changecontactsubtype");
  
  /**
   * Transfer checks
   * Permission to transfer a check
   */
  public static final typekey.SystemPermissionType TC_CHECKTRANSFER = new typekey.SystemPermissionType("checktransfer");
  
  /**
   * Close claims
   * Permission to close a claim
   */
  public static final typekey.SystemPermissionType TC_CLAIMCLOSE = new typekey.SystemPermissionType("claimclose");
  
  /**
   * Create claims
   * Permission to create a new claim
   */
  public static final typekey.SystemPermissionType TC_CLAIMCREATE = new typekey.SystemPermissionType("claimcreate");
  
  /**
   * Edit claim
   * Permission to edit a claim
   */
  public static final typekey.SystemPermissionType TC_CLAIMEDIT = new typekey.SystemPermissionType("claimedit");
  
  /**
   * Edit closed claims
   * Permission to edit a closed claim
   */
  public static final typekey.SystemPermissionType TC_CLAIMEDITCLSD = new typekey.SystemPermissionType("claimeditclsd");
  
  /**
   * Manage claim integration
   * Permission to perform integration admin functions on a claim
   */
  public static final typekey.SystemPermissionType TC_CLAIMINTEGADMIN = new typekey.SystemPermissionType("claimintegadmin");
  
  /**
   * Own claim
   * Permission to own a claim and see the Desktop Claims page
   */
  public static final typekey.SystemPermissionType TC_CLAIMOWN = new typekey.SystemPermissionType("claimown");
  
  /**
   * Print claims
   * Permission to print a claim
   */
  public static final typekey.SystemPermissionType TC_CLAIMPRINT = new typekey.SystemPermissionType("claimprint");
  
  /**
   * Manage claim parties
   * Permission to create, edit, or delete parties from a claim
   */
  public static final typekey.SystemPermissionType TC_CLAIMPRTSMANAGE = new typekey.SystemPermissionType("claimprtsmanage");
  
  /**
   * Manage parties on closed claims
   * Permission to manage parties involved on a closed claim
   */
  public static final typekey.SystemPermissionType TC_CLAIMPRTSMANCLSD = new typekey.SystemPermissionType("claimprtsmanclsd");
  
  /**
   * Reassign owned claims
   * Permission to reassign your own claims
   */
  public static final typekey.SystemPermissionType TC_CLAIMRAOWN = new typekey.SystemPermissionType("claimraown");
  
  /**
   * Reassign unowned claims
   * Permission to reassign claims owned by other users
   */
  public static final typekey.SystemPermissionType TC_CLAIMRAUNOWN = new typekey.SystemPermissionType("claimraunown");
  
  /**
   * Remove claim flag
   * Permission to remove the flag from flagged claims
   */
  public static final typekey.SystemPermissionType TC_CLAIMREMFLAG = new typekey.SystemPermissionType("claimremflag");
  
  /**
   * Reopen claims
   * Permission to reopen a claim
   */
  public static final typekey.SystemPermissionType TC_CLAIMREOPEN = new typekey.SystemPermissionType("claimreopen");
  
  /**
   * Select policy
   * Permission to select a new policy for an existing claim
   */
  public static final typekey.SystemPermissionType TC_CLAIMSELECTPLCY = new typekey.SystemPermissionType("claimselectplcy");
  
  /**
   * Select policy on closed claims
   * Permission to select a new policy for a closed claim
   */
  public static final typekey.SystemPermissionType TC_CLAIMSLPLCYCLSD = new typekey.SystemPermissionType("claimslplcyclsd");
  
  /**
   * Manage claim users
   * Permission to manage claim users
   */
  public static final typekey.SystemPermissionType TC_CLAIMUSERMANAGE = new typekey.SystemPermissionType("claimusermanage");
  
  /**
   * Manage users on closed claims
   * Permission to manage claim users on a closed claim
   */
  public static final typekey.SystemPermissionType TC_CLAIMUSERMANCLSD = new typekey.SystemPermissionType("claimusermanclsd");
  
  /**
   * Validate claims
   * Permission to run validation rules on a claim
   */
  public static final typekey.SystemPermissionType TC_CLAIMVALIDATE = new typekey.SystemPermissionType("claimvalidate");
  
  /**
   * View claims
   * General permission to view a claim
   */
  public static final typekey.SystemPermissionType TC_CLAIMVIEW = new typekey.SystemPermissionType("claimview");
  
  /**
   * View payments
   * Permission to view checks and payments (and derived information) on a claim
   */
  public static final typekey.SystemPermissionType TC_CLAIMVIEWPAY = new typekey.SystemPermissionType("claimviewpay");
  
  /**
   * View recoveries
   * Permission to view recoveries (and derived information) on a claim
   */
  public static final typekey.SystemPermissionType TC_CLAIMVIEWREC = new typekey.SystemPermissionType("claimviewrec");
  
  /**
   * View recovery reserves
   * Permission to view recovery reserves (and derived information) on a claim
   */
  public static final typekey.SystemPermissionType TC_CLAIMVIEWRECRES = new typekey.SystemPermissionType("claimviewrecres");
  
  /**
   * View reserves
   * Permission to view reserves (and derived information) on a claim
   */
  public static final typekey.SystemPermissionType TC_CLAIMVIEWRES = new typekey.SystemPermissionType("claimviewres");
  
  /**
   * Void cleared payments
   * Permission to void a cleared check
   */
  public static final typekey.SystemPermissionType TC_CLEAREDPAYVOID = new typekey.SystemPermissionType("clearedpayvoid");
  
  /**
   * Manage Coverage Verification
   * Permission to create, edit, and delete Coverage Verification values
   */
  public static final typekey.SystemPermissionType TC_COVVERIFYMANAGE = new typekey.SystemPermissionType("covverifymanage");
  
  /**
   * View Coverage Verification
   * Permission to view the list of Coverage Verification values
   */
  public static final typekey.SystemPermissionType TC_COVVERIFYVIEW = new typekey.SystemPermissionType("covverifyview");
  
  /**
   * Create local contacts
   * Permission to create a new local contact
   */
  public static final typekey.SystemPermissionType TC_CTCCREATE = new typekey.SystemPermissionType("ctccreate");
  
  /**
   * Edit local contacts
   * Permission to edit an existing local contact
   */
  public static final typekey.SystemPermissionType TC_CTCEDIT = new typekey.SystemPermissionType("ctcedit");
  
  /**
   * View local contacts
   * Permission to view and search local contact entries
   */
  public static final typekey.SystemPermissionType TC_CTCVIEW = new typekey.SystemPermissionType("ctcview");
  
  /**
   * Manage service tier
   * Permission to add, edit, or delete service tiers
   */
  public static final typekey.SystemPermissionType TC_CUSTSVCTIERMNG = new typekey.SystemPermissionType("custsvctiermng");
  
  /**
   * View service tier
   * Permission to view service tiers
   */
  public static final typekey.SystemPermissionType TC_CUSTSVCTIERVIEW = new typekey.SystemPermissionType("custsvctierview");
  
  /**
   * Always access debug tools
   * Permission to access debug tools, even when they are disabled by a configuration parameter
   */
  public static final typekey.SystemPermissionType TC_DEBUGTOOLS = new typekey.SystemPermissionType("debugtools");
  
  /**
   * Delete medical note
   * Permission to delete a medical note
   */
  public static final typekey.SystemPermissionType TC_DELMEDNOTE = new typekey.SystemPermissionType("delmednote");
  
  /**
   * Delete private note
   * Permission to delete a private note
   */
  public static final typekey.SystemPermissionType TC_DELPRIVNOTE = new typekey.SystemPermissionType("delprivnote");
  
  /**
   * Delete sensitive documents
   * Permission to delete a sensitive document
   */
  public static final typekey.SystemPermissionType TC_DELSENSDOC = new typekey.SystemPermissionType("delsensdoc");
  
  /**
   * Delete sensitive note
   * Permission to delete a sensitive note
   */
  public static final typekey.SystemPermissionType TC_DELSENSNOTE = new typekey.SystemPermissionType("delsensnote");
  
  /**
   * Create documents
   * Permission to add documents
   */
  public static final typekey.SystemPermissionType TC_DOCCREATE = new typekey.SystemPermissionType("doccreate");
  
  /**
   * Create documents on closed claim
   * Permission to add documents to a closed claim
   */
  public static final typekey.SystemPermissionType TC_DOCCREATECLSD = new typekey.SystemPermissionType("doccreateclsd");
  
  /**
   * Delete documents
   * Permission to remove documents
   */
  public static final typekey.SystemPermissionType TC_DOCDELETE = new typekey.SystemPermissionType("docdelete");
  
  /**
   * Delete documents on closed claim
   * Permission to remove documents from a closed claim
   */
  public static final typekey.SystemPermissionType TC_DOCDELETECLSD = new typekey.SystemPermissionType("docdeleteclsd");
  
  /**
   * Edit documents
   * Permission to edit documents
   */
  public static final typekey.SystemPermissionType TC_DOCEDIT = new typekey.SystemPermissionType("docedit");
  
  /**
   * Modify all documents
   * Permission to edit or delete all documents, regardless of the permissions set on the individual documents
   */
  public static final typekey.SystemPermissionType TC_DOCMODIFYALL = new typekey.SystemPermissionType("docmodifyall");
  
  /**
   * View documents
   * Permission to view documents
   */
  public static final typekey.SystemPermissionType TC_DOCVIEW = new typekey.SystemPermissionType("docview");
  
  /**
   * View all documents
   * Permission to view all documents, regardless of the permissions set on the individual documents
   */
  public static final typekey.SystemPermissionType TC_DOCVIEWALL = new typekey.SystemPermissionType("docviewall");
  
  /**
   * View Dashboard claim activity
   * Permission to view the Dashboard claim activity screen
   */
  public static final typekey.SystemPermissionType TC_EDBCLAIMACT = new typekey.SystemPermissionType("edbclaimact");
  
  /**
   * View Dashboard claim counts
   * Permission to view the Dashboard claim counts screen
   */
  public static final typekey.SystemPermissionType TC_EDBCLAIMCOUNTS = new typekey.SystemPermissionType("edbclaimcounts");
  
  /**
   * View Dashboard current financials
   * Permission to view the Dashboard current financials screen
   */
  public static final typekey.SystemPermissionType TC_EDBCURRFIN = new typekey.SystemPermissionType("edbcurrfin");
  
  /**
   * View Dashboard period financials
   * Permission to view the Dashboard period financials screen
   */
  public static final typekey.SystemPermissionType TC_EDBPDFIN = new typekey.SystemPermissionType("edbpdfin");
  
  /**
   * Edit Deductible
   * Permission to edit Deductible
   */
  public static final typekey.SystemPermissionType TC_EDITDEDUCTIBLE = new typekey.SystemPermissionType("editdeductible");
  
  /**
   * Edit medical note
   * Permission to edit a medical note
   */
  public static final typekey.SystemPermissionType TC_EDITMEDNOTE = new typekey.SystemPermissionType("editmednote");
  
  /**
   * Edit private note
   * Permission to edit a private note
   */
  public static final typekey.SystemPermissionType TC_EDITPRIVNOTE = new typekey.SystemPermissionType("editprivnote");
  
  /**
   * Edit reference data
   * Permission to edit administration reference data
   */
  public static final typekey.SystemPermissionType TC_EDITREFDATA = new typekey.SystemPermissionType("editrefdata");
  
  /**
   * Edit sensitive documents
   * Permission to edit a sensitive document
   */
  public static final typekey.SystemPermissionType TC_EDITSENSDOC = new typekey.SystemPermissionType("editsensdoc");
  
  /**
   * Edit sensitive Med Case Mgmt details
   * Permission to edit sensitive Medical Case Management details
   */
  public static final typekey.SystemPermissionType TC_EDITSENSMCMDETAILS = new typekey.SystemPermissionType("editSensMCMdetails");
  
  /**
   * Edit sensitive note
   * Permission to edit a sensitive note
   */
  public static final typekey.SystemPermissionType TC_EDITSENSNOTE = new typekey.SystemPermissionType("editsensnote");
  
  /**
   * Edit sensitive SIU details
   * Permission to edit sensitive SIU details
   */
  public static final typekey.SystemPermissionType TC_EDITSENSSIUDETAILS = new typekey.SystemPermissionType("editSensSIUdetails");
  
  /**
   * Edit Subrogation details
   * Permission to edit Subrogation-related information
   */
  public static final typekey.SystemPermissionType TC_EDITSUBRODETAILS = new typekey.SystemPermissionType("editsubrodetails");
  
  /**
   * Create evaluations
   * Permission to create an evaluation on a claim
   */
  public static final typekey.SystemPermissionType TC_EVALCREATE = new typekey.SystemPermissionType("evalcreate");
  
  /**
   * Edit evaluations
   * Permission to edit an evaluation on a claim
   */
  public static final typekey.SystemPermissionType TC_EVALEDIT = new typekey.SystemPermissionType("evaledit");
  
  /**
   * Edit evaluation on a closed claim
   * Permission to edit an evaluation on a closed claim
   */
  public static final typekey.SystemPermissionType TC_EVALEDITCLSD = new typekey.SystemPermissionType("evaleditclsd");
  
  /**
   * View evaluations
   * Permission to view an evaluation on a claim
   */
  public static final typekey.SystemPermissionType TC_EVALVIEW = new typekey.SystemPermissionType("evalview");
  
  /**
   * View event messages
   * Permission to view the event messages page
   */
  public static final typekey.SystemPermissionType TC_EVENTMESSAGEVIEW = new typekey.SystemPermissionType("eventmessageview");
  
  /**
   * Exchange Rate Manual Override
   * Permission to override exchange rate with a custom exchange rate.
   */
  public static final typekey.SystemPermissionType TC_EXCHRATEMANUAL = new typekey.SystemPermissionType("exchratemanual");
  
  /**
   * Close exposures
   * Permission to close an exposure
   */
  public static final typekey.SystemPermissionType TC_EXPCLOSE = new typekey.SystemPermissionType("expclose");
  
  /**
   * Create exposures
   * Permission to create a new exposure
   */
  public static final typekey.SystemPermissionType TC_EXPCREATE = new typekey.SystemPermissionType("expcreate");
  
  /**
   * Edit exposures
   * Permission to edit an exposure on a claim
   */
  public static final typekey.SystemPermissionType TC_EXPEDIT = new typekey.SystemPermissionType("expedit");
  
  /**
   * Edit closed exposures
   * Permission to edit a closed exposure
   */
  public static final typekey.SystemPermissionType TC_EXPEDITCLSD = new typekey.SystemPermissionType("expeditclsd");
  
  /**
   * Own exposure
   * Permission to own an exposure and to see the Desktop Exposures page
   */
  public static final typekey.SystemPermissionType TC_EXPOWN = new typekey.SystemPermissionType("expown");
  
  /**
   * Reassign owned exposures
   * Permission to reassign your own exposures
   */
  public static final typekey.SystemPermissionType TC_EXPRAOWN = new typekey.SystemPermissionType("expraown");
  
  /**
   * Reassign unowned exposures
   * Permission to reassign exposures owned by other users
   */
  public static final typekey.SystemPermissionType TC_EXPRAUNOWN = new typekey.SystemPermissionType("expraunown");
  
  /**
   * Reopen exposures
   * Permission to reopen an exposure
   */
  public static final typekey.SystemPermissionType TC_EXPREOPEN = new typekey.SystemPermissionType("expreopen");
  
  /**
   * Validate exposures
   * Permission to run validation rules on exposures
   */
  public static final typekey.SystemPermissionType TC_EXPVALIDATE = new typekey.SystemPermissionType("expvalidate");
  
  /**
   * View exposures
   * Permission to view exposures on a claim
   */
  public static final typekey.SystemPermissionType TC_EXPVIEW = new typekey.SystemPermissionType("expview");
  
  /**
   * Create groups
   * Permission to create groups
   */
  public static final typekey.SystemPermissionType TC_GROUPCREATE = new typekey.SystemPermissionType("groupcreate");
  
  /**
   * Delete groups
   * Permission to delete groups
   */
  public static final typekey.SystemPermissionType TC_GROUPDELETE = new typekey.SystemPermissionType("groupdelete");
  
  /**
   * Edit groups
   * Permission to edit groups
   */
  public static final typekey.SystemPermissionType TC_GROUPEDIT = new typekey.SystemPermissionType("groupedit");
  
  /**
   * View group tree
   * Permission to see the user/group tree on the Administration tab
   */
  public static final typekey.SystemPermissionType TC_GROUPTREEVIEW = new typekey.SystemPermissionType("grouptreeview");
  
  /**
   * View groups
   * Permission to view details of a group
   */
  public static final typekey.SystemPermissionType TC_GROUPVIEW = new typekey.SystemPermissionType("groupview");
  
  /**
   * Manage holidays
   * Permission to create, edit, and delete holidays
   */
  public static final typekey.SystemPermissionType TC_HOLIDAYMANAGE = new typekey.SystemPermissionType("holidaymanage");
  
  /**
   * View holidays
   * Permission to view a list of holidays or holiday details
   */
  public static final typekey.SystemPermissionType TC_HOLIDAYVIEW = new typekey.SystemPermissionType("holidayview");
  
  /**
   * Ignore ACLs
   * Permission that grants the user permissions as if they were always on a claim's ACL with every possible ClaimAccessType
   */
  public static final typekey.SystemPermissionType TC_IGNOREACL = new typekey.SystemPermissionType("ignoreacl");
  
  /**
   * Administer integration
   * Permission to administer integration events
   */
  public static final typekey.SystemPermissionType TC_INTEGADMIN = new typekey.SystemPermissionType("integadmin");
  
  /**
   * All internal tools
   * Permission to access all Internal Tools
   */
  public static final typekey.SystemPermissionType TC_INTERNALTOOLS = new typekey.SystemPermissionType("internaltools");
  
  /**
   * Print listviews
   * Permission to print listviews
   */
  public static final typekey.SystemPermissionType TC_LVPRINT = new typekey.SystemPermissionType("lvprint");
  
  /**
   * Manage load factors
   * Permission to modify the load factors on all users and groups
   */
  public static final typekey.SystemPermissionType TC_MANAGELDFCTRS = new typekey.SystemPermissionType("manageldfctrs");
  
  /**
   * Create manual payments
   * Permission to create manual payment transactions
   */
  public static final typekey.SystemPermissionType TC_MANPAYCREATE = new typekey.SystemPermissionType("manpaycreate");
  
  /**
   * Delete manual payments
   * Permission to delete manual payment transactions
   */
  public static final typekey.SystemPermissionType TC_MANPAYDELETE = new typekey.SystemPermissionType("manpaydelete");
  
  /**
   * Edit manual payments
   * Permission to edit manual payment transactions
   */
  public static final typekey.SystemPermissionType TC_MANPAYEDIT = new typekey.SystemPermissionType("manpayedit");
  
  /**
   * Manage Metric Limits
   * Permission to create, edit, and delete claim and exposure metric limits
   */
  public static final typekey.SystemPermissionType TC_METRICLIMITMANAGE = new typekey.SystemPermissionType("metriclimitmanage");
  
  /**
   * Close matters
   * Permission to close matters on a claim
   */
  public static final typekey.SystemPermissionType TC_MTTRCLOSE = new typekey.SystemPermissionType("mttrclose");
  
  /**
   * Create matters
   * Permission to create new matters on a claim
   */
  public static final typekey.SystemPermissionType TC_MTTRCREATE = new typekey.SystemPermissionType("mttrcreate");
  
  /**
   * Edit matters
   * Permission to edit a matter on a claim
   */
  public static final typekey.SystemPermissionType TC_MTTREDIT = new typekey.SystemPermissionType("mttredit");
  
  /**
   * Edit closed matters
   * Permission to edit a closed matter on a claim
   */
  public static final typekey.SystemPermissionType TC_MTTREDITCLSD = new typekey.SystemPermissionType("mttreditclsd");
  
  /**
   * Own matter
   * Permission to own a matter and to see the Desktop Matters page
   */
  public static final typekey.SystemPermissionType TC_MTTROWN = new typekey.SystemPermissionType("mttrown");
  
  /**
   * Reassign owned matters
   * Permission to reassign your own matters
   */
  public static final typekey.SystemPermissionType TC_MTTRRAOWN = new typekey.SystemPermissionType("mttrraown");
  
  /**
   * Reassign unowned matters
   * Permission to reassign matters owned by other users
   */
  public static final typekey.SystemPermissionType TC_MTTRRAUNOWN = new typekey.SystemPermissionType("mttrraunown");
  
  /**
   * Reopen matters
   * Permission to reopen matters on a claim
   */
  public static final typekey.SystemPermissionType TC_MTTRREOPEN = new typekey.SystemPermissionType("mttrreopen");
  
  /**
   * View matters
   * Permission to view matters
   */
  public static final typekey.SystemPermissionType TC_MTTRVIEW = new typekey.SystemPermissionType("mttrview");
  
  /**
   * Create negotiations
   * Permission to create a negotiation on a claim
   */
  public static final typekey.SystemPermissionType TC_NGTNCREATE = new typekey.SystemPermissionType("ngtncreate");
  
  /**
   * Edit negotiations
   * Permission to edit a negotiation on a claim
   */
  public static final typekey.SystemPermissionType TC_NGTNEDIT = new typekey.SystemPermissionType("ngtnedit");
  
  /**
   * Edit negotiations on closed claims
   * Permission to edit a negotiation on a closed claim
   */
  public static final typekey.SystemPermissionType TC_NGTNEDITCLSD = new typekey.SystemPermissionType("ngtneditclsd");
  
  /**
   * View negotiations
   * Permission to view a negotiation on a claim
   */
  public static final typekey.SystemPermissionType TC_NGTNVIEW = new typekey.SystemPermissionType("ngtnview");
  
  /**
   * Create notes
   * Permission to add notes
   */
  public static final typekey.SystemPermissionType TC_NOTECREATE = new typekey.SystemPermissionType("notecreate");
  
  /**
   * Create notes on closed claims
   * Permission to add a note to a closed claim
   */
  public static final typekey.SystemPermissionType TC_NOTECREATECLSD = new typekey.SystemPermissionType("notecreateclsd");
  
  /**
   * Delete notes
   * Permission to remove notes
   */
  public static final typekey.SystemPermissionType TC_NOTEDELETE = new typekey.SystemPermissionType("notedelete");
  
  /**
   * Edit note
   * Permission to edit the notes
   */
  public static final typekey.SystemPermissionType TC_NOTEEDIT = new typekey.SystemPermissionType("noteedit");
  
  /**
   * Edit note body
   * Permission to edit the body of notes
   */
  public static final typekey.SystemPermissionType TC_NOTEEDITBODY = new typekey.SystemPermissionType("noteeditbody");
  
  /**
   * View notes
   * Permission to view notes
   */
  public static final typekey.SystemPermissionType TC_NOTEVIEW = new typekey.SystemPermissionType("noteview");
  
  /**
   * View confidential notes
   * Permission to view confidential notes
   */
  public static final typekey.SystemPermissionType TC_NOTEVIEWCONF = new typekey.SystemPermissionType("noteviewconf");
  
  /**
   * Create organization
   * Permission to create an organization.
   */
  public static final typekey.SystemPermissionType TC_ORGCREATE = new typekey.SystemPermissionType("orgcreate");
  
  /**
   * Delete organization
   * Permission to delete an organization.
   */
  public static final typekey.SystemPermissionType TC_ORGDELETE = new typekey.SystemPermissionType("orgdelete");
  
  /**
   * Edit organization basic info
   * Permission to edit an organization's basic info.
   */
  public static final typekey.SystemPermissionType TC_ORGEDITBASIC = new typekey.SystemPermissionType("orgeditbasic");
  
  /**
   * Search for organization
   * Permission to search for organizations.
   */
  public static final typekey.SystemPermissionType TC_ORGSEARCH = new typekey.SystemPermissionType("orgsearch");
  
  /**
   * View organization basic info
   * Permission to view an organization's basic info.
   */
  public static final typekey.SystemPermissionType TC_ORGVIEWBASIC = new typekey.SystemPermissionType("orgviewbasic");
  
  /**
   * Own sensitive claims
   * Permission to own sensitive claims
   */
  public static final typekey.SystemPermissionType TC_OWNSENSCLAIM = new typekey.SystemPermissionType("ownsensclaim");
  
  /**
   * Own sensitive claim subobjects
   * Permission to own subobjects on sensitive claims
   */
  public static final typekey.SystemPermissionType TC_OWNSENSCLAIMSUB = new typekey.SystemPermissionType("ownsensclaimsub");
  
  /**
   * Create payments
   * Permission to create payment transactions
   */
  public static final typekey.SystemPermissionType TC_PAYCREATE = new typekey.SystemPermissionType("paycreate");
  
  /**
   * Delete payments
   * Permission to delete payment transactions
   */
  public static final typekey.SystemPermissionType TC_PAYDELETE = new typekey.SystemPermissionType("paydelete");
  
  /**
   * Edit payments
   * Permission to edit payment transactions
   */
  public static final typekey.SystemPermissionType TC_PAYEDIT = new typekey.SystemPermissionType("payedit");
  
  /**
   * Recode payments
   * Permission to recode a payment
   */
  public static final typekey.SystemPermissionType TC_PAYRECODE = new typekey.SystemPermissionType("payrecode");
  
  /**
   * Stop payments
   * Permission to stop a check
   */
  public static final typekey.SystemPermissionType TC_PAYSTOP = new typekey.SystemPermissionType("paystop");
  
  /**
   * Void payments
   * Permission to void a check
   */
  public static final typekey.SystemPermissionType TC_PAYVOID = new typekey.SystemPermissionType("payvoid");
  
  /**
   * Edit policies
   * Permission to edit an unverified policy
   */
  public static final typekey.SystemPermissionType TC_PLCYEDIT = new typekey.SystemPermissionType("plcyedit");
  
  /**
   * Make policies editable
   * Permission to create an unverified policy
   */
  public static final typekey.SystemPermissionType TC_PLCYMAKEEDITABLE = new typekey.SystemPermissionType("plcymakeeditable");
  
  /**
   * View policies
   * Permission to view policy information
   */
  public static final typekey.SystemPermissionType TC_PLCYVIEW = new typekey.SystemPermissionType("plcyview");
  
  /**
   * Purge objects
   * Permission to purge objects from the database
   */
  public static final typekey.SystemPermissionType TC_PURGE = new typekey.SystemPermissionType("purge");
  
  /**
   * Create recoveries
   * Permission to create recovery transactions
   */
  public static final typekey.SystemPermissionType TC_RECCREATE = new typekey.SystemPermissionType("reccreate");
  
  /**
   * Delete recoveries
   * Permission to delete recovery transactions
   */
  public static final typekey.SystemPermissionType TC_RECDELETE = new typekey.SystemPermissionType("recdelete");
  
  /**
   * Edit recoveries
   * Permission to edit recovery transactions
   */
  public static final typekey.SystemPermissionType TC_RECEDIT = new typekey.SystemPermissionType("recedit");
  
  /**
   * Create recovery reserves
   * Permission to create recovery reserve transactions
   */
  public static final typekey.SystemPermissionType TC_RECRESCREATE = new typekey.SystemPermissionType("recrescreate");
  
  /**
   * Delete recovery reserves
   * Permission to delete recovery reserve transactions
   */
  public static final typekey.SystemPermissionType TC_RECRESDELETE = new typekey.SystemPermissionType("recresdelete");
  
  /**
   * Edit recovery reserves
   * Permission to edit recovery reserve transactions
   */
  public static final typekey.SystemPermissionType TC_RECRESEDIT = new typekey.SystemPermissionType("recresedit");
  
  /**
   * Void recoveries
   * Permission to void recovery transactions
   */
  public static final typekey.SystemPermissionType TC_RECVOID = new typekey.SystemPermissionType("recvoid");
  
  /**
   * Manage regions
   * Permission to create, edit, and delete regions
   */
  public static final typekey.SystemPermissionType TC_REGIONMANAGE = new typekey.SystemPermissionType("regionmanage");
  
  /**
   * View regions
   * Permission to view the list of regions and region details
   */
  public static final typekey.SystemPermissionType TC_REGIONVIEW = new typekey.SystemPermissionType("regionview");
  
  /**
   * Edit reinsurance reportable thresholds
   * Permission to edit the reinsurance reportable thresholds
   */
  public static final typekey.SystemPermissionType TC_REINSTHRESHOLDEDIT = new typekey.SystemPermissionType("reinsthresholdedit");
  
  /**
   * View reinsurance reportable thresholds
   * Permission to view the reinsurance reportable thresholds
   */
  public static final typekey.SystemPermissionType TC_REINSTHRESHOLDVIEW = new typekey.SystemPermissionType("reinsthresholdview");
  
  /**
   * Edit reinsurance reportable
   * Permission to edit the reinsurance reportable status on a claim
   */
  public static final typekey.SystemPermissionType TC_REINSURANCEEDIT = new typekey.SystemPermissionType("reinsuranceedit");
  
  /**
   * View Report tab
   * Permission to view the Report tab, if the add-on reporting module is installed
   */
  public static final typekey.SystemPermissionType TC_REPORTING_VIEW = new typekey.SystemPermissionType("reporting_view");
  
  /**
   * Show reports and dashboard
   * Permission to view reports and dashboard in report server
   */
  public static final typekey.SystemPermissionType TC_REPORT_MANAGER = new typekey.SystemPermissionType("report_manager");
  
  /**
   * Show reports
   * Permission to view reports in report server
   */
  public static final typekey.SystemPermissionType TC_REPORT_USER = new typekey.SystemPermissionType("report_user");
  
  /**
   * Create reserves
   * Permission to create reserve transactions
   */
  public static final typekey.SystemPermissionType TC_RESCREATE = new typekey.SystemPermissionType("rescreate");
  
  /**
   * Delete reserves
   * Permission to delete reserve transactions
   */
  public static final typekey.SystemPermissionType TC_RESDELETE = new typekey.SystemPermissionType("resdelete");
  
  /**
   * Edit reserves
   * Permission to edit reserve transactions
   */
  public static final typekey.SystemPermissionType TC_RESEDIT = new typekey.SystemPermissionType("resedit");
  
  /**
   * Resync message
   * Permission to resync message
   */
  public static final typekey.SystemPermissionType TC_RESYNCMESSAGE = new typekey.SystemPermissionType("resyncmessage");
  
  /**
   * Retry message
   * Permission to try to resend the failed message
   */
  public static final typekey.SystemPermissionType TC_RETRYMESSAGE = new typekey.SystemPermissionType("retrymessage");
  
  /**
   * Create review
   * Permission to create a new Review
   */
  public static final typekey.SystemPermissionType TC_REVIEWCREATE = new typekey.SystemPermissionType("reviewcreate");
  
  /**
   * Delete completed review
   * Permission to delete a Review
   */
  public static final typekey.SystemPermissionType TC_REVIEWDELETECOMPLETED = new typekey.SystemPermissionType("reviewdeletecompleted");
  
  /**
   * Delete incomplete review
   * Permission to delete a Review
   */
  public static final typekey.SystemPermissionType TC_REVIEWDELETEINCOMPLETE = new typekey.SystemPermissionType("reviewdeleteincomplete");
  
  /**
   * Edit review
   * Permission to edit the Review page where the scores are entered for each claim
   */
  public static final typekey.SystemPermissionType TC_REVIEWEDIT = new typekey.SystemPermissionType("reviewedit");
  
  /**
   * View review details
   * Permission view the Review page to see the answers entered for each claim
   */
  public static final typekey.SystemPermissionType TC_REVIEWVIEWDETAIL = new typekey.SystemPermissionType("reviewviewdetail");
  
  /**
   * View reviews list
   * Permission to view the list of Reviews and the reviews tab on a Contact
   */
  public static final typekey.SystemPermissionType TC_REVIEWVIEWLIST = new typekey.SystemPermissionType("reviewviewlist");
  
  /**
   * Edit RI transactions & agreements
   * Permission to edit RI transactions & agreements
   */
  public static final typekey.SystemPermissionType TC_RIEDIT = new typekey.SystemPermissionType("riedit");
  
  /**
   * View RI transactions & agreements
   * Permission to view RI transactions & agreements 
   */
  public static final typekey.SystemPermissionType TC_RIVIEW = new typekey.SystemPermissionType("riview");
  
  /**
   * Manage roles
   * Permission to create, edit, or delete roles
   */
  public static final typekey.SystemPermissionType TC_ROLEMANAGE = new typekey.SystemPermissionType("rolemanage");
  
  /**
   * View roles
   * Permission to view the list of roles and role details
   */
  public static final typekey.SystemPermissionType TC_ROLEVIEW = new typekey.SystemPermissionType("roleview");
  
  /**
   * Administer rules
   * Permission to run Guidewire Studio or import rules
   */
  public static final typekey.SystemPermissionType TC_RULEADMIN = new typekey.SystemPermissionType("ruleadmin");
  
  /**
   * Manage script parameters
   * Permission to create, edit, or delete script parameters
   */
  public static final typekey.SystemPermissionType TC_SCRPRMMANAGE = new typekey.SystemPermissionType("scrprmmanage");
  
  /**
   * View script parameters
   * Permission to view the list of script parameters or details of an individual script parameter
   */
  public static final typekey.SystemPermissionType TC_SCRPRMVIEW = new typekey.SystemPermissionType("scrprmview");
  
  /**
   * Manage security zones
   * Permission to create, edit, and delete security zones
   */
  public static final typekey.SystemPermissionType TC_SECZONEMANAGE = new typekey.SystemPermissionType("seczonemanage");
  
  /**
   * Send Email
   * Permission to send Email
   */
  public static final typekey.SystemPermissionType TC_SENDEMAIL = new typekey.SystemPermissionType("sendemail");
  
  /**
   * Skip message
   * Permission to skip the failed message
   */
  public static final typekey.SystemPermissionType TC_SKIPMESSAGE = new typekey.SystemPermissionType("skipmessage");
  
  /**
   * SOAP administration
   * Permission to use the SOAP APIs
   */
  public static final typekey.SystemPermissionType TC_SOAPADMIN = new typekey.SystemPermissionType("soapadmin");
  
  /**
   * Edit claim storage information
   * Permission to edit claim storage information
   */
  public static final typekey.SystemPermissionType TC_STORAGEUPDATE = new typekey.SystemPermissionType("StorageUpdate");
  
  /**
   * Own subrogation
   * Permission to own a subrogation and to see the Desktop Subrogation page
   */
  public static final typekey.SystemPermissionType TC_SUBROOWN = new typekey.SystemPermissionType("subroown");
  
  /**
   * Edit BatchProcess tools page
   * Permission to edit the BatchProcess Internal Tools page
   */
  public static final typekey.SystemPermissionType TC_TOOLSBATCHPROCESSEDIT = new typekey.SystemPermissionType("toolsBatchProcessedit");
  
  /**
   * View BatchProcess tools page
   * Permission to access the BatchProcess Internal Tools page
   */
  public static final typekey.SystemPermissionType TC_TOOLSBATCHPROCESSVIEW = new typekey.SystemPermissionType("toolsBatchProcessview");
  
  /**
   * View Cache Info page
   * Permission to view the CacheInfo Internal Tools page
   */
  public static final typekey.SystemPermissionType TC_TOOLSCACHEINFOVIEW = new typekey.SystemPermissionType("toolsCacheinfoview");
  
  /**
   * Edit Cluster tools page
   * Permission to edit the Cluster Internal Tools page
   */
  public static final typekey.SystemPermissionType TC_TOOLSCLUSTEREDIT = new typekey.SystemPermissionType("toolsClusteredit");
  
  /**
   * View Cluster tools page
   * Permission to access the Cluster Internal Tools page
   */
  public static final typekey.SystemPermissionType TC_TOOLSCLUSTERVIEW = new typekey.SystemPermissionType("toolsClusterview");
  
  /**
   * View Info tools page
   * Permission to access the Info Internal Tools page
   */
  public static final typekey.SystemPermissionType TC_TOOLSINFOVIEW = new typekey.SystemPermissionType("toolsInfoview");
  
  /**
   * Edit ManagementBeans tools page
   * Permission to edit the ManagementBeans presented on Internal Tools page
   */
  public static final typekey.SystemPermissionType TC_TOOLSJMXBEANSEDIT = new typekey.SystemPermissionType("toolsJMXBeansEdit");
  
  /**
   * View ManagementBeans tools page
   * Permission to access the ManagementBeans Internal Tools page
   */
  public static final typekey.SystemPermissionType TC_TOOLSJMXBEANSVIEW = new typekey.SystemPermissionType("toolsJMXBeansview");
  
  /**
   * Edit JProfiler tools page
   * Permission to edit the JProfiler Internal Tools page
   */
  public static final typekey.SystemPermissionType TC_TOOLSJPROFILEREDIT = new typekey.SystemPermissionType("toolsJProfileredit");
  
  /**
   * Edit Log tools page
   * Permission to edit the Log Internal Tools page
   */
  public static final typekey.SystemPermissionType TC_TOOLSLOGEDIT = new typekey.SystemPermissionType("toolsLogedit");
  
  /**
   * View Log tools page
   * Permission to access the Log Internal Tools page
   */
  public static final typekey.SystemPermissionType TC_TOOLSLOGVIEW = new typekey.SystemPermissionType("toolsLogview");
  
  /**
   * Edit StartablePlugin tools page
   * Permission to edit the StartablePlugin Internal Tools page
   */
  public static final typekey.SystemPermissionType TC_TOOLSPLUGINEDIT = new typekey.SystemPermissionType("toolsPluginedit");
  
  /**
   * View StartablePlugin tools page
   * Permission to access the StartablePlugin Internal Tools page
   */
  public static final typekey.SystemPermissionType TC_TOOLSPLUGINVIEW = new typekey.SystemPermissionType("toolsPluginview");
  
  /**
   * Edit Profiler tools page
   * Permission to edit the Profiler Internal Tools page
   */
  public static final typekey.SystemPermissionType TC_TOOLSPROFILEREDIT = new typekey.SystemPermissionType("toolsProfileredit");
  
  /**
   * View Profiler tools page
   * Permission to access the Profiler Internal Tools page
   */
  public static final typekey.SystemPermissionType TC_TOOLSPROFILERVIEW = new typekey.SystemPermissionType("toolsProfilerview");
  
  /**
   * Edit WorkQueue tools page
   * Permission to edit the WorkQueue Internal Tools page
   */
  public static final typekey.SystemPermissionType TC_TOOLSWORKQUEUEEDIT = new typekey.SystemPermissionType("toolsWorkQueueedit");
  
  /**
   * View WorkQueue tools page
   * Permission to access the WorkQueue Internal Tools page
   */
  public static final typekey.SystemPermissionType TC_TOOLSWORKQUEUEVIEW = new typekey.SystemPermissionType("toolsWorkQueueview");
  
  /**
   * Unset the coverage in question field
   * Permission to allow user to set the coverage in question to no from yes
   */
  public static final typekey.SystemPermissionType TC_UNSETCOVINQUESTION = new typekey.SystemPermissionType("unsetcovinquestion");
  
  /**
   * Create users
   * Permission to create a new user
   */
  public static final typekey.SystemPermissionType TC_USERCREATE = new typekey.SystemPermissionType("usercreate");
  
  /**
   * Delete users
   * Permission to delete a user (Note: if a user has had any activity it's recommended to make them non-active rather than delete)
   */
  public static final typekey.SystemPermissionType TC_USERDELETE = new typekey.SystemPermissionType("userdelete");
  
  /**
   * Edit users
   * Permission to edit an existing user, except for roles, authority limits, or attributes
   */
  public static final typekey.SystemPermissionType TC_USEREDIT = new typekey.SystemPermissionType("useredit");
  
  /**
   * Edit user attributes
   * Permission to edit attributes for a user
   */
  public static final typekey.SystemPermissionType TC_USEREDITATTRS = new typekey.SystemPermissionType("usereditattrs");
  
  /**
   * Edit user language
   * Permission to edit language
   */
  public static final typekey.SystemPermissionType TC_USEREDITLANG = new typekey.SystemPermissionType("usereditlang");
  
  /**
   * Grant authority limits
   * Permission to grant or change an authority limit for a user
   */
  public static final typekey.SystemPermissionType TC_USERGRANTAUTH = new typekey.SystemPermissionType("usergrantauth");
  
  /**
   * Grant roles to users
   * Permission to grant or revoke roles
   */
  public static final typekey.SystemPermissionType TC_USERGRANTROLES = new typekey.SystemPermissionType("usergrantroles");
  
  /**
   * View user
   * Permission to view details of a user
   */
  public static final typekey.SystemPermissionType TC_USERVIEW = new typekey.SystemPermissionType("userview");
  
  /**
   * View all users
   * Permission to see users in all visible groups
   */
  public static final typekey.SystemPermissionType TC_USERVIEWALL = new typekey.SystemPermissionType("userviewall");
  
  /**
   * Verify FNOLs (Obsolete)
   * (Obsolete)
   */
  @java.lang.Deprecated
  public static final typekey.SystemPermissionType TC_VERIFYFNOL = new typekey.SystemPermissionType("verifyFNOL");
  
  /**
   * View activity calendar
   * Permission to view activity calendar of other users
   */
  public static final typekey.SystemPermissionType TC_VIEWACTCAL = new typekey.SystemPermissionType("viewactcal");
  
  /**
   * View Admin
   * Permission to view the Admin tab
   */
  public static final typekey.SystemPermissionType TC_VIEWADMIN = new typekey.SystemPermissionType("viewadmin");
  
  /**
   * View Claim Associations subtab
   * Permission to view the claim Associations subtab
   */
  public static final typekey.SystemPermissionType TC_VIEWASSOCIATIONS = new typekey.SystemPermissionType("viewassociations");
  
  /**
   * View claim Loss Details page
   * Permission to view the claim Loss Details page
   */
  public static final typekey.SystemPermissionType TC_VIEWCLAIMBASICS = new typekey.SystemPermissionType("viewclaimbasics");
  
  /**
   * View claim Evaluations
   * Permission to view the claim Evaluations page
   */
  public static final typekey.SystemPermissionType TC_VIEWCLAIMEVALS = new typekey.SystemPermissionType("viewclaimevals");
  
  /**
   * View claim History page
   * Permission to view audit trail (history) for a claim
   */
  public static final typekey.SystemPermissionType TC_VIEWCLAIMHISTORY = new typekey.SystemPermissionType("viewclaimhistory");
  
  /**
   * View claim Negotiations
   * Permission to view the claim Negotiations page
   */
  public static final typekey.SystemPermissionType TC_VIEWCLAIMNGTNS = new typekey.SystemPermissionType("viewclaimngtns");
  
  /**
   * View claim Notes page
   * Permission to view the claim Notes page
   */
  public static final typekey.SystemPermissionType TC_VIEWCLAIMNOTES = new typekey.SystemPermissionType("viewclaimnotes");
  
  /**
   * View claim Parties Involved page
   * Permission to view the claim Parties Involved page
   */
  public static final typekey.SystemPermissionType TC_VIEWCLAIMPARTIES = new typekey.SystemPermissionType("viewclaimparties");
  
  /**
   * View claim Summary page
   * Permission to view the claim Summary page
   */
  public static final typekey.SystemPermissionType TC_VIEWCLAIMSUMMARY = new typekey.SystemPermissionType("viewclaimsummary");
  
  /**
   * View claim sync screens
   * Permission to view claim sync screens
   */
  public static final typekey.SystemPermissionType TC_VIEWCLAIMSYNC = new typekey.SystemPermissionType("viewclaimsync");
  
  /**
   * View Desktop
   * Permission to view the Desktop
   */
  public static final typekey.SystemPermissionType TC_VIEWDESKTOP = new typekey.SystemPermissionType("viewdesktop");
  
  /**
   * View claim Documents page
   * Permission to view the claim Documents page
   */
  public static final typekey.SystemPermissionType TC_VIEWDOCS = new typekey.SystemPermissionType("viewdocs");
  
  /**
   * View claim Exposures page
   * Permission to view the claim Exposures page
   */
  public static final typekey.SystemPermissionType TC_VIEWEXPOSURES = new typekey.SystemPermissionType("viewexposures");
  
  /**
   * View claim Financials
   * Permission to view the Financials Summary and Transaction subtabs on a claim
   */
  public static final typekey.SystemPermissionType TC_VIEWFINSUM = new typekey.SystemPermissionType("viewfinsum");
  
  /**
   * View claim Matters page
   * Permission to view matters
   */
  public static final typekey.SystemPermissionType TC_VIEWMATTERS = new typekey.SystemPermissionType("viewmatters");
  
  /**
   * View medical note
   * Permission to view a medical note
   */
  public static final typekey.SystemPermissionType TC_VIEWMEDNOTE = new typekey.SystemPermissionType("viewmednote");
  
  /**
   * View claim Policy page
   * Permission to view the claim Policy page
   */
  public static final typekey.SystemPermissionType TC_VIEWPOLICY = new typekey.SystemPermissionType("viewpolicy");
  
  /**
   * View policy system
   * Permission to view policy in policy system
   */
  public static final typekey.SystemPermissionType TC_VIEWPOLICYSYSTEM = new typekey.SystemPermissionType("viewpolicysystem");
  
  /**
   * View private note
   * Permission to view a private note
   */
  public static final typekey.SystemPermissionType TC_VIEWPRIVNOTE = new typekey.SystemPermissionType("viewprivnote");
  
  /**
   * View reference data
   * Permission to view administration reference data
   */
  public static final typekey.SystemPermissionType TC_VIEWREFDATA = new typekey.SystemPermissionType("viewrefdata");
  
  /**
   * View Search
   * Permission to view the Search tab
   */
  public static final typekey.SystemPermissionType TC_VIEWSEARCH = new typekey.SystemPermissionType("viewsearch");
  
  /**
   * View sensitive documents
   * Permission to view a sensitive document
   */
  public static final typekey.SystemPermissionType TC_VIEWSENSDOC = new typekey.SystemPermissionType("viewsensdoc");
  
  /**
   * View sensitive Med Case Mgmt details
   * Permission to view sensitive Medical Case Management details
   */
  public static final typekey.SystemPermissionType TC_VIEWSENSMCMDETAILS = new typekey.SystemPermissionType("viewSensMCMdetails");
  
  /**
   * View sensitive note
   * Permission to view a sensitive note
   */
  public static final typekey.SystemPermissionType TC_VIEWSENSNOTE = new typekey.SystemPermissionType("viewsensnote");
  
  /**
   * View sensitive SIU details
   * Permission to view sensitive SIU details
   */
  public static final typekey.SystemPermissionType TC_VIEWSENSSIUDETAILS = new typekey.SystemPermissionType("viewSensSIUdetails");
  
  /**
   * View claim Snapshot
   * Permission to view the FNOL snapshot for a claim
   */
  public static final typekey.SystemPermissionType TC_VIEWSNAPSHOT = new typekey.SystemPermissionType("viewsnapshot");
  
  /**
   * View Subrogation details
   * Permission to view Subrogation-related information
   */
  public static final typekey.SystemPermissionType TC_VIEWSUBRODETAILS = new typekey.SystemPermissionType("viewsubrodetails");
  
  /**
   * View Supervisor Calendar
   * Permission to view the supervisor calendar screen
   */
  public static final typekey.SystemPermissionType TC_VIEWSUPCALENDAR = new typekey.SystemPermissionType("viewsupcalendar");
  
  /**
   * View team
   * Permission to view the Team tab
   */
  public static final typekey.SystemPermissionType TC_VIEWTEAM = new typekey.SystemPermissionType("viewteam");
  
  /**
   * View Vacation
   * Permission to view the Vacation tab
   */
  public static final typekey.SystemPermissionType TC_VIEWVACATION = new typekey.SystemPermissionType("viewvacation");
  
  /**
   * View global workload
   * Permission to view global workload statistics of other users
   */
  public static final typekey.SystemPermissionType TC_VIEWWORKLOAD = new typekey.SystemPermissionType("viewworkload");
  
  /**
   * View claim Workplan
   * Permission to view the claim Workplan page
   */
  public static final typekey.SystemPermissionType TC_VIEWWORKPLAN = new typekey.SystemPermissionType("viewworkplan");
  
  /**
   * Manage WC disability rates
   * Permission to create, edit, and delete values on WC disability rate tables
   */
  public static final typekey.SystemPermissionType TC_WCREFMANAGE = new typekey.SystemPermissionType("wcrefmanage");
  
  /**
   * View WC disability rates
   * Permission to view the values on WC disability rate tables
   */
  public static final typekey.SystemPermissionType TC_WCREFVIEW = new typekey.SystemPermissionType("wcrefview");
  
  /**
   * Manage workflow
   * Permission to view the ManageWorkflow page
   */
  public static final typekey.SystemPermissionType TC_WORKFLOWMANAGE = new typekey.SystemPermissionType("workflowmanage");
  
  /**
   * View workflow
   * Permission to view the Workflow page
   */
  public static final typekey.SystemPermissionType TC_WORKFLOWVIEW = new typekey.SystemPermissionType("workflowview");
  
  /**
   * Add Data Change
   * Permission to add a data change gosu program.
   */
  public static final typekey.SystemPermissionType TC_WSDATACHANGEEDIT = new typekey.SystemPermissionType("wsdatachangeedit");
  
  /**
   * Manage workload classifications
   * Permission to create, edit, or delete weighted workload classifications
   */
  public static final typekey.SystemPermissionType TC_WWLCMANAGE = new typekey.SystemPermissionType("wwlcmanage");
  
  /**
   * View workload classifications
   * Permission to view weighted workload classifications
   */
  public static final typekey.SystemPermissionType TC_WWLCVIEW = new typekey.SystemPermissionType("wwlcview");
  
  /**
   * Manage supplemental workload weight
   * Permission to edit supplemental weight
   */
  public static final typekey.SystemPermissionType TC_WWLMANAGE = new typekey.SystemPermissionType("wwlmanage");
  
  /**
   * View workload weight
   * Permission to view classification and supplemental workload weight
   */
  public static final typekey.SystemPermissionType TC_WWLVIEW = new typekey.SystemPermissionType("wwlview");
  
  /**
   * Manage admin zones
   * Permission to create, edit, or delete admin zones
   */
  public static final typekey.SystemPermissionType TC_ZONEMANAGE = new typekey.SystemPermissionType("zonemanage");
  
  /**
   * View admin zones
   * Permission to view the list of admin zones
   */
  public static final typekey.SystemPermissionType TC_ZONEVIEW = new typekey.SystemPermissionType("zoneview");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.SystemPermissionType> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.SystemPermissionType>("SystemPermissionType");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private SystemPermissionType(java.lang.String code)  {
    _typeKeyImplManager  =  com.guidewire.commons.typelist.TypeKeyImplManager.newInstance(this, code);
  }
  
  public int compareTo(gw.entity.TypeKey arg0) {
    return _typeKeyImplManager.getTypeKeyImpl().compareTo(arg0);
  }
  
  /**
   * 
   * @deprecated Use this object instead.
   */
  @java.lang.Deprecated
  public typekey.SystemPermissionType get() {
    return this;
  }
  
  public static typekey.SystemPermissionType get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.SystemPermissionType> getAllTypeKeys() {
    return TYPE.get().getTypeKeys(true);
  }
  
  /**
   * Returns the list of categories that this key belongs to
   * @return the categories that this key belongs to
   */
  public gw.entity.TypeKey[] getCategories() {
    return _typeKeyImplManager.getTypeKeyImpl().getCategories();
  }
  
  public java.lang.String getCode() {
    return _typeKeyImplManager.getCode();
  }
  
  /**
   * Returns the description for this typekey for the current locale.
   * @return the description for this typekey
   */
  public java.lang.String getDescription() {
    return _typeKeyImplManager.getTypeKeyImpl().getDescription();
  }
  
  /**
   * Returns the description of this typekey for the given locale.
   * @param locale the locale to use to get the description
   * @return a description for this typekey for the given locale
   */
  public java.lang.String getDescription(gw.i18n.ILocale locale) {
    return _typeKeyImplManager.getTypeKeyImpl().getDescription(locale);
  }
  
  public java.lang.String getDisplayName() {
    return _typeKeyImplManager.getTypeKeyImpl().getDisplayName();
  }
  
  /**
   * Returns the name of this typekey for the given locale.
   * @param locale 
   */
  public java.lang.String getDisplayName(gw.i18n.ILocale locale) {
    return _typeKeyImplManager.getTypeKeyImpl().getDisplayName(locale);
  }
  
  /**
   * Gets the entity type associated with this typekey, if any. Returns null if this is not a subtype typekey.
   */
  public gw.entity.IEntityType getEntityType() {
    return _typeKeyImplManager.getTypeKeyImpl().getEntityType();
  }
  
  /**
   * Returns the owning type for this key.
   * @return 
   */
  public gw.entity.ITypeList getIntrinsicType() {
    return _typeKeyImplManager.getTypeKeyImpl().getIntrinsicType();
  }
  
  /**
   * A string containing the typelist name.
   */
  public java.lang.String getListName() {
    return _typeKeyImplManager.getTypeKeyImpl().getListName();
  }
  
  /**
   * Returns the value of the "name" attribute for this typekey.
   * @return the name of this typekey
   * @deprecated Use {@link #getDisplayName()} or {@link #getUnlocalizedName()} instead, as appropriate.
   */
  @java.lang.Deprecated
  public java.lang.String getName() {
    return _typeKeyImplManager.getTypeKeyImpl().getName();
  }
  
  public int getOrdinal() {
    return _typeKeyImplManager.getTypeKeyImpl().getOrdinal();
  }
  
  /**
   * Returns the priority for this type key
   * @return the priority for this type key
   */
  public int getPriority() {
    return _typeKeyImplManager.getTypeKeyImpl().getPriority();
  }
  
  /**
   * Returns the sort order for this type key in the specified language.
   * @param locale 
   * @return the sort order for this type key
   */
  public int getSortOrder(gw.i18n.ILocale locale) {
    return _typeKeyImplManager.getTypeKeyImpl().getSortOrder(locale);
  }
  
  public static typekey.SystemPermissionType getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.SystemPermissionType[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.SystemPermissionType[]{});
  }
  
  public static java.util.List<typekey.SystemPermissionType> getTypeKeys(boolean includeRetired) {
    return TYPE.get().getTypeKeys(includeRetired);
  }
  
  /**
   * Returns the (non-localized) description of this typekey. Generally should not be used by application code. To get a
   * displayable string, use {@link #getDescription()} instead.
   * @return the non-localized description of this typekey
   */
  public java.lang.String getUnlocalizedDescription() {
    return _typeKeyImplManager.getTypeKeyImpl().getUnlocalizedDescription();
  }
  
  /**
   * Returns the (non-localized) name of this typekey. Generally should not be used by application code. To get a
   * displayable string, use {@link #getDisplayName()} instead. To get a unique string identifier for this typekey,
   * use {@link #getCode()} instead.
   * @return the non-localized name of this typekey
   */
  public java.lang.String getUnlocalizedName() {
    return _typeKeyImplManager.getTypeKeyImpl().getUnlocalizedName();
  }
  
  public typekey.SystemPermissionType getValue() {
    return this;
  }
  
  /**
   * Checks to see if this typekey has a category corresponding to the given
   * typekey.  For a match to be found, this typekey has to have a category
   * with the same typelist and code as the given typekey.
   * @param categoryToCheck 
   * @return 
   */
  public boolean hasCategory(gw.entity.TypeKey categoryToCheck) {
    return _typeKeyImplManager.getTypeKeyImpl().hasCategory(categoryToCheck);
  }
  
  /**
   * A boolean that indicates a type code is for internal use by Guidewire software. Internal type codes cannot be
   * removed or modified.
   */
  public boolean isInternal() {
    return _typeKeyImplManager.getTypeKeyImpl().isInternal();
  }
  
  /**
   * Returns true if this type key is retired.  Retired type keys will not show up in the UI.
   * @return true if this type key is retired false if not.
   */
  public boolean isRetired() {
    return _typeKeyImplManager.getTypeKeyImpl().isRetired();
  }
  
  private java.lang.Object readObject(java.io.ObjectInputStream in) throws java.io.InvalidObjectException {
    throw new java.io.InvalidObjectException("Proxy required");
  }
  
  public java.lang.String toString() {
    return getDisplayName();
  }
  
  private java.lang.Object writeReplace() {
    return new com.guidewire.commons.typelist.TypeKeySerializationProxy(this);
  }
  
  static {
    com.guidewire._generated.typekey.SystemPermissionTypeInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.SystemPermissionType>() {
      public void clearCache(typekey.SystemPermissionType typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.SystemPermissionType typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.SystemPermissionType newInstance(java.lang.String code) {
        return new typekey.SystemPermissionType(code);
      }
      
      
    });
  }
}