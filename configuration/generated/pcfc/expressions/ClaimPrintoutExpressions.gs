package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimPrintoutExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Associations1SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 159, column 53
    function locationRef_22 () : pcf.api.Destination {
      return pcf.ClaimAssociations.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintSection (id=Associations1Section) at ClaimPrintout.pcf: line 154, column 48
    function printable_24 () : java.lang.Boolean {
      return perm.ClaimAssociation.view
    }
    
    // PrintSection (id=Associations1Section) at ClaimPrintout.pcf: line 154, column 48
    function visible_23 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithoutDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Associations2SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 560, column 46
    function locationRef_136 (ClaimAssociation :  ClaimAssociation) : pcf.api.Destination {
      return pcf.ClaimAssociationDetail.createDestination(Claim, ClaimAssociation)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 556, column 52
    function locationRef_137 () : pcf.api.Destination {
      return pcf.ClaimAssociations.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintSection (id=Associations2Section) at ClaimPrintout.pcf: line 551, column 48
    function printable_139 () : java.lang.Boolean {
      return perm.ClaimAssociation.view
    }
    
    // PrintSection (id=Associations2Section) at ClaimPrintout.pcf: line 551, column 48
    function visible_138 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Associations3SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on PrintSection (id=Associations3Section) at ClaimPrintout.pcf: line 1220, column 48
    function defaultSetter_373 (__VALUE_TO_SET :  java.lang.Object) : void {
      __selectedValue = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1225, column 53
    function locationRef_366 () : pcf.api.Destination {
      return pcf.ClaimAssociations.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 1235, column 46
    function locationRef_367 (ClaimAssociation :  ClaimAssociation) : pcf.api.Destination {
      return pcf.ClaimAssociationDetail.createDestination(Claim, ClaimAssociation)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1231, column 52
    function locationRef_368 () : pcf.api.Destination {
      return pcf.ClaimAssociations.createDestination(Claim)
    }
    
    // PrintSection (id=Associations3Section) at ClaimPrintout.pcf: line 1220, column 48
    function value_370 () : java.lang.Object {
      return null
    }
    
    // 'printable' attribute on PrintSection (id=Associations3Section) at ClaimPrintout.pcf: line 1220, column 48
    function visible_369 () : java.lang.Boolean {
      return perm.ClaimAssociation.view
    }
    
    // 'childrenVisible' attribute on PrintSection (id=Associations3Section) at ClaimPrintout.pcf: line 1220, column 48
    function visible_371 () : java.lang.Boolean {
      return __selectedValue
    }
    
    // PrintSection (id=Associations3Section) at ClaimPrintout.pcf: line 1220, column 48
    function visible_375 () : java.lang.Boolean {
      return Choice == "CustomChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Checks1SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 296, column 57
    function locationRef_62 () : pcf.api.Destination {
      return pcf.ClaimFinancialsChecks.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintSection (id=Checks1Section) at ClaimPrintout.pcf: line 291, column 52
    function printable_64 () : java.lang.Boolean {
      return perm.Claim.viewpayments(Claim)
    }
    
    // PrintSection (id=Checks1Section) at ClaimPrintout.pcf: line 291, column 52
    function visible_63 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithoutDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Checks2SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 769, column 39
    function locationRef_196 (CheckView :  CheckView) : pcf.api.Destination {
      return pcf.ClaimFinancialsChecksDetailPrint.createDestination(Claim, CheckView)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 765, column 56
    function locationRef_197 () : pcf.api.Destination {
      return pcf.ClaimFinancialsChecks.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintSection (id=Checks2Section) at ClaimPrintout.pcf: line 760, column 52
    function printable_199 () : java.lang.Boolean {
      return perm.Claim.viewpayments(Claim)
    }
    
    // PrintSection (id=Checks2Section) at ClaimPrintout.pcf: line 760, column 52
    function visible_198 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Checks3SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on PrintSection (id=Checks3Section) at ClaimPrintout.pcf: line 1695, column 52
    function defaultSetter_559 (__VALUE_TO_SET :  java.lang.Object) : void {
      __selectedValue = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1700, column 57
    function locationRef_552 () : pcf.api.Destination {
      return pcf.ClaimFinancialsChecks.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 1710, column 39
    function locationRef_553 (CheckView :  CheckView) : pcf.api.Destination {
      return pcf.ClaimFinancialsChecksDetailPrint.createDestination(Claim, CheckView)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1706, column 56
    function locationRef_554 () : pcf.api.Destination {
      return pcf.ClaimFinancialsChecks.createDestination(Claim)
    }
    
    // PrintSection (id=Checks3Section) at ClaimPrintout.pcf: line 1695, column 52
    function value_556 () : java.lang.Object {
      return null
    }
    
    // 'printable' attribute on PrintSection (id=Checks3Section) at ClaimPrintout.pcf: line 1695, column 52
    function visible_555 () : java.lang.Boolean {
      return perm.Claim.viewpayments(Claim)
    }
    
    // 'childrenVisible' attribute on PrintSection (id=Checks3Section) at ClaimPrintout.pcf: line 1695, column 52
    function visible_557 () : java.lang.Boolean {
      return __selectedValue
    }
    
    // PrintSection (id=Checks3Section) at ClaimPrintout.pcf: line 1695, column 52
    function visible_561 () : java.lang.Boolean {
      return Choice == "CustomChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimLossEmployerLiability1SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on PrintSection (id=ClaimLossEmployerLiability1Section) at ClaimPrintout.pcf: line 202, column 121
    function label_38 () : java.lang.String {
      return CoverageSubtype.TC_WCEMPLIABCOV.Description
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 207, column 70
    function locationRef_36 () : pcf.api.Destination {
      return pcf.TopLevelExposureDetail.createDestination(employerLiability)
    }
    
    // 'printable' attribute on PrintSection (id=ClaimLossEmployerLiability1Section) at ClaimPrintout.pcf: line 202, column 121
    function printable_39 () : java.lang.Boolean {
      return helper.isWorkersCompClaim() and employerLiability != null and perm.Exposure.view(employerLiability)
    }
    
    // PrintSection (id=ClaimLossEmployerLiability1Section) at ClaimPrintout.pcf: line 202, column 121
    function visible_37 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithoutDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimLossEmployerLiability2SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on PrintSection (id=ClaimLossEmployerLiability2Section) at ClaimPrintout.pcf: line 604, column 121
    function label_153 () : java.lang.String {
      return CoverageSubtype.TC_WCEMPLIABCOV.Description
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 609, column 70
    function locationRef_151 () : pcf.api.Destination {
      return pcf.TopLevelExposureDetail.createDestination(employerLiability)
    }
    
    // 'printable' attribute on PrintSection (id=ClaimLossEmployerLiability2Section) at ClaimPrintout.pcf: line 604, column 121
    function printable_154 () : java.lang.Boolean {
      return helper.isWorkersCompClaim() and employerLiability != null and perm.Exposure.view(employerLiability)
    }
    
    // PrintSection (id=ClaimLossEmployerLiability2Section) at ClaimPrintout.pcf: line 604, column 121
    function visible_152 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimLossEmployerLiabilitySectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on PrintSection (id=ClaimLossEmployerLiabilitySection) at ClaimPrintout.pcf: line 1279, column 121
    function defaultSetter_416 (__VALUE_TO_SET :  java.lang.Object) : void {
      __selectedValue = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'label' attribute on PrintSection (id=ClaimLossEmployerLiabilitySection) at ClaimPrintout.pcf: line 1279, column 121
    function label_414 () : java.lang.Object {
      return CoverageSubtype.TC_WCEMPLIABCOV.Description
    }
    
    // 'label' attribute on PrintSection (id=ClaimLossEmployerLiabilitySection) at ClaimPrintout.pcf: line 1279, column 121
    function label_420 () : java.lang.String {
      return CoverageSubtype.TC_WCEMPLIABCOV.Description
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1284, column 70
    function locationRef_410 () : pcf.api.Destination {
      return pcf.TopLevelExposureDetail.createDestination(employerLiability)
    }
    
    // PrintSection (id=ClaimLossEmployerLiabilitySection) at ClaimPrintout.pcf: line 1279, column 121
    function value_412 () : java.lang.Object {
      return null
    }
    
    // 'printable' attribute on PrintSection (id=ClaimLossEmployerLiabilitySection) at ClaimPrintout.pcf: line 1279, column 121
    function visible_411 () : java.lang.Boolean {
      return helper.isWorkersCompClaim() and employerLiability != null and perm.Exposure.view(employerLiability)
    }
    
    // 'childrenVisible' attribute on PrintSection (id=ClaimLossEmployerLiabilitySection) at ClaimPrintout.pcf: line 1279, column 121
    function visible_413 () : java.lang.Boolean {
      return __selectedValue
    }
    
    // PrintSection (id=ClaimLossEmployerLiabilitySection) at ClaimPrintout.pcf: line 1279, column 121
    function visible_419 () : java.lang.Boolean {
      return Choice == "CustomChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimLossIndemityTimeLoss1SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on PrintSection (id=ClaimLossIndemityTimeLoss1Section) at ClaimPrintout.pcf: line 190, column 119
    function label_34 () : java.lang.String {
      return CoverageSubtype.TC_WCWORKERSCOMPWAGES.Description
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 195, column 69
    function locationRef_32 () : pcf.api.Destination {
      return pcf.TopLevelExposureDetail.createDestination(indemityTimeLoss)
    }
    
    // 'printable' attribute on PrintSection (id=ClaimLossIndemityTimeLoss1Section) at ClaimPrintout.pcf: line 190, column 119
    function printable_35 () : java.lang.Boolean {
      return helper.isWorkersCompClaim() and indemityTimeLoss != null and perm.Exposure.view(indemityTimeLoss)
    }
    
    // PrintSection (id=ClaimLossIndemityTimeLoss1Section) at ClaimPrintout.pcf: line 190, column 119
    function visible_33 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithoutDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimLossIndemityTimeLoss2SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on PrintSection (id=ClaimLossIndemityTimeLoss2Section) at ClaimPrintout.pcf: line 592, column 119
    function label_149 () : java.lang.String {
      return CoverageSubtype.TC_WCWORKERSCOMPWAGES.Description
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 597, column 69
    function locationRef_147 () : pcf.api.Destination {
      return pcf.TopLevelExposureDetail.createDestination(indemityTimeLoss)
    }
    
    // 'printable' attribute on PrintSection (id=ClaimLossIndemityTimeLoss2Section) at ClaimPrintout.pcf: line 592, column 119
    function printable_150 () : java.lang.Boolean {
      return helper.isWorkersCompClaim() and indemityTimeLoss != null and perm.Exposure.view(indemityTimeLoss)
    }
    
    // PrintSection (id=ClaimLossIndemityTimeLoss2Section) at ClaimPrintout.pcf: line 592, column 119
    function visible_148 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimLossIndemityTimeLoss3SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on PrintSection (id=ClaimLossIndemityTimeLoss3Section) at ClaimPrintout.pcf: line 1267, column 119
    function defaultSetter_404 (__VALUE_TO_SET :  java.lang.Object) : void {
      __selectedValue = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'label' attribute on PrintSection (id=ClaimLossIndemityTimeLoss3Section) at ClaimPrintout.pcf: line 1267, column 119
    function label_402 () : java.lang.Object {
      return CoverageSubtype.TC_WCWORKERSCOMPWAGES.Description
    }
    
    // 'label' attribute on PrintSection (id=ClaimLossIndemityTimeLoss3Section) at ClaimPrintout.pcf: line 1267, column 119
    function label_408 () : java.lang.String {
      return CoverageSubtype.TC_WCWORKERSCOMPWAGES.Description
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1272, column 69
    function locationRef_398 () : pcf.api.Destination {
      return pcf.TopLevelExposureDetail.createDestination(indemityTimeLoss)
    }
    
    // PrintSection (id=ClaimLossIndemityTimeLoss3Section) at ClaimPrintout.pcf: line 1267, column 119
    function value_400 () : java.lang.Object {
      return null
    }
    
    // 'printable' attribute on PrintSection (id=ClaimLossIndemityTimeLoss3Section) at ClaimPrintout.pcf: line 1267, column 119
    function visible_399 () : java.lang.Boolean {
      return helper.isWorkersCompClaim() and indemityTimeLoss != null and perm.Exposure.view(indemityTimeLoss)
    }
    
    // 'childrenVisible' attribute on PrintSection (id=ClaimLossIndemityTimeLoss3Section) at ClaimPrintout.pcf: line 1267, column 119
    function visible_401 () : java.lang.Boolean {
      return __selectedValue
    }
    
    // PrintSection (id=ClaimLossIndemityTimeLoss3Section) at ClaimPrintout.pcf: line 1267, column 119
    function visible_407 () : java.lang.Boolean {
      return Choice == "CustomChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimLossMedicalDetail1SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on PrintSection (id=ClaimLossMedicalDetail1Section) at ClaimPrintout.pcf: line 178, column 115
    function label_30 () : java.lang.String {
      return CoverageSubtype.TC_WCWORKERSCOMPMED.Description
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 183, column 67
    function locationRef_28 () : pcf.api.Destination {
      return pcf.TopLevelExposureDetail.createDestination(medicalDetails)
    }
    
    // 'printable' attribute on PrintSection (id=ClaimLossMedicalDetail1Section) at ClaimPrintout.pcf: line 178, column 115
    function printable_31 () : java.lang.Boolean {
      return helper.isWorkersCompClaim() and medicalDetails != null and perm.Exposure.view(medicalDetails)
    }
    
    // PrintSection (id=ClaimLossMedicalDetail1Section) at ClaimPrintout.pcf: line 178, column 115
    function visible_29 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithoutDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimLossMedicalDetail2SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on PrintSection (id=ClaimLossMedicalDetail2Section) at ClaimPrintout.pcf: line 580, column 115
    function label_145 () : java.lang.String {
      return CoverageSubtype.TC_WCWORKERSCOMPMED.Description
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 585, column 67
    function locationRef_143 () : pcf.api.Destination {
      return pcf.TopLevelExposureDetail.createDestination(medicalDetails)
    }
    
    // 'printable' attribute on PrintSection (id=ClaimLossMedicalDetail2Section) at ClaimPrintout.pcf: line 580, column 115
    function printable_146 () : java.lang.Boolean {
      return helper.isWorkersCompClaim() and medicalDetails != null and perm.Exposure.view(medicalDetails)
    }
    
    // PrintSection (id=ClaimLossMedicalDetail2Section) at ClaimPrintout.pcf: line 580, column 115
    function visible_144 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimLossMedicalDetail3SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on PrintSection (id=ClaimLossMedicalDetail3Section) at ClaimPrintout.pcf: line 1255, column 115
    function defaultSetter_392 (__VALUE_TO_SET :  java.lang.Object) : void {
      __selectedValue = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'label' attribute on PrintSection (id=ClaimLossMedicalDetail3Section) at ClaimPrintout.pcf: line 1255, column 115
    function label_390 () : java.lang.Object {
      return CoverageSubtype.TC_WCWORKERSCOMPMED.Description
    }
    
    // 'label' attribute on PrintSection (id=ClaimLossMedicalDetail3Section) at ClaimPrintout.pcf: line 1255, column 115
    function label_396 () : java.lang.String {
      return CoverageSubtype.TC_WCWORKERSCOMPMED.Description
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1260, column 67
    function locationRef_386 () : pcf.api.Destination {
      return pcf.TopLevelExposureDetail.createDestination(medicalDetails)
    }
    
    // PrintSection (id=ClaimLossMedicalDetail3Section) at ClaimPrintout.pcf: line 1255, column 115
    function value_388 () : java.lang.Object {
      return null
    }
    
    // 'printable' attribute on PrintSection (id=ClaimLossMedicalDetail3Section) at ClaimPrintout.pcf: line 1255, column 115
    function visible_387 () : java.lang.Boolean {
      return helper.isWorkersCompClaim() and medicalDetails != null and perm.Exposure.view(medicalDetails)
    }
    
    // 'childrenVisible' attribute on PrintSection (id=ClaimLossMedicalDetail3Section) at ClaimPrintout.pcf: line 1255, column 115
    function visible_389 () : java.lang.Boolean {
      return __selectedValue
    }
    
    // PrintSection (id=ClaimLossMedicalDetail3Section) at ClaimPrintout.pcf: line 1255, column 115
    function visible_395 () : java.lang.Boolean {
      return Choice == "CustomChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPrintoutExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'action' attribute on NonDownloadPrintOutButton at ClaimPrintout.pcf: line 101, column 58
    function action_10 () : void {
      CurrentLocation.cancel()
    }
    
    // 'action' attribute on PrintOutButton (id=ClaimPrint) at ClaimPrintout.pcf: line 98, column 21
    function action_9 () : void {
      gw.api.print.PrintOutAction.printPrintOut(printSettings)
    }
    
    // 'canVisit' attribute on PrintOut (id=ClaimPrintout) at ClaimPrintout.pcf: line 53, column 89
    static function canVisit_674 (Claim :  Claim) : java.lang.Boolean {
      return perm.Claim.view(Claim) and perm.Claim.print(Claim)
    }
    
    // 'value' attribute on PrintOut (id=ClaimPrintout) at ClaimPrintout.pcf: line 53, column 89
    function defaultSetter_88 (__VALUE_TO_SET :  java.lang.Object) : void {
      Choice = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'initialValue' attribute on Variable at ClaimPrintout.pcf: line 63, column 48
    function initialValue_0 () : gw.api.print.ClaimPrintoutHelper {
      return new gw.api.print.ClaimPrintoutHelper(Claim)
    }
    
    // 'initialValue' attribute on Variable at ClaimPrintout.pcf: line 67, column 42
    function initialValue_1 () : gw.api.print.PrintSettings {
      return helper.createPrintSettings()
    }
    
    // 'initialValue' attribute on Variable at ClaimPrintout.pcf: line 71, column 24
    function initialValue_2 () : Exposure {
      return helper.getMedicalDetails()
    }
    
    // 'initialValue' attribute on Variable at ClaimPrintout.pcf: line 75, column 24
    function initialValue_3 () : Exposure {
      return helper.getIndemityTimeLoss()
    }
    
    // 'initialValue' attribute on Variable at ClaimPrintout.pcf: line 79, column 24
    function initialValue_4 () : Exposure {
      return helper.getEmployerLiability()
    }
    
    // 'initialValue' attribute on Variable at ClaimPrintout.pcf: line 83, column 23
    function initialValue_5 () : boolean {
      return (helper.isWorkersCompClaim() or helper.isHomeownersClaim()) and (gw.api.policy.PolicyTabUtil.hasTab(Claim, "Properties") or gw.api.policy.PolicyTabUtil.hasTab(Claim, "Classcodes"))
    }
    
    // 'initialValue' attribute on Variable at ClaimPrintout.pcf: line 87, column 23
    function initialValue_6 () : boolean {
      return helper.isTravelClaim() and (gw.api.policy.PolicyTabUtil.hasTab(Claim, "Trips") or gw.api.policy.PolicyTabUtil.hasTab(Claim, "Classcodes"))
    }
    
    // 'initialValue' attribute on Variable at ClaimPrintout.pcf: line 91, column 23
    function initialValue_7 () : boolean {
      return (helper.isWorkersCompClaim() or helper.isHomeownersClaim()) and gw.api.policy.PolicyTabUtil.hasTab(Claim, "Statcodes")
    }
    
    // 'label' attribute on PrintGroup (id=AllClaimPagesWithDetails) at ClaimPrintout.pcf: line 393, column 230
    function label_8 () : java.lang.Object {
      return (Claim.LossType == LossType.TC_WC)? DisplayKey.get("Java.PrintClaimOptionsForm.Label.AllClaimPagesWithDetailsForWC") : DisplayKey.get("Java.PrintClaimOptionsForm.Label.AllClaimPagesWithDetails")
    }
    
    // 'locationRef' attribute on PrintLocationDetail at ClaimPrintout.pcf: line 938, column 32
    function locationRef_250 (Activity :  Activity) : pcf.api.Destination {
      return pcf.ActivityDetailPrint.createDestination(Activity)
    }
    
    // 'locationRef' attribute on PrintLocationDetail at ClaimPrintout.pcf: line 943, column 40
    function locationRef_251 (ClaimAssociation :  ClaimAssociation) : pcf.api.Destination {
      return pcf.ClaimAssociationDetail.createDestination(Claim, ClaimAssociation)
    }
    
    // 'locationRef' attribute on PrintLocationDetail at ClaimPrintout.pcf: line 948, column 32
    function locationRef_252 (Exposure :  Exposure) : pcf.api.Destination {
      return pcf.ExposureDetail.createDestination(Exposure)
    }
    
    // 'locationRef' attribute on PrintLocationDetail at ClaimPrintout.pcf: line 954, column 36
    function locationRef_253 (selectedClaimContact :  ClaimContact) : pcf.api.Destination {
      return pcf.ClaimContactPrintDetails.createDestination(Claim, selectedClaimContact)
    }
    
    // 'locationRef' attribute on PrintLocationDetail at ClaimPrintout.pcf: line 959, column 38
    function locationRef_254 (ClaimUserModel :  ClaimUserModel) : pcf.api.Destination {
      return pcf.ClaimUserPrintDetails.createDestination(Claim, ClaimUserModel)
    }
    
    // 'locationRef' attribute on PrintLocationDetail at ClaimPrintout.pcf: line 966, column 33
    function locationRef_255 (VehicleRU :  VehicleRU) : pcf.api.Destination {
      return pcf.ClaimPolicyVehicleDetail.createDestination(Claim, VehicleRU)
    }
    
    // 'locationRef' attribute on PrintLocationDetail at ClaimPrintout.pcf: line 973, column 38
    function locationRef_257 (PolicyLocation :  PolicyLocation) : pcf.api.Destination {
      return pcf.PolicyLocationPrint.createDestination(PolicyLocation, Claim)
    }
    
    // 'locationRef' attribute on PrintLocationDetail at ClaimPrintout.pcf: line 979, column 35
    function locationRef_259 (Endorsement :  Endorsement) : pcf.api.Destination {
      return pcf.ClaimPolicyEndorsementDetail.createDestination(Claim, Endorsement)
    }
    
    // 'locationRef' attribute on PrintLocationDetail at ClaimPrintout.pcf: line 985, column 32
    function locationRef_260 (StatCode :  StatCode) : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodeDetail.createDestination(Claim, StatCode)
    }
    
    // 'locationRef' attribute on PrintLocationDetail at ClaimPrintout.pcf: line 991, column 38
    function locationRef_261 (AggregateLimit :  AggregateLimit) : pcf.api.Destination {
      return pcf.ClaimPolicyAggregateLimitDetail.createDestination(Claim, AggregateLimit)
    }
    
    // 'locationRef' attribute on PrintLocationDetail at ClaimPrintout.pcf: line 996, column 39
    function locationRef_262 (TransactionView :  TransactionView) : pcf.api.Destination {
      return pcf.TransactionDetailPrint.createDestination(Claim, TransactionView)
    }
    
    // 'locationRef' attribute on PrintLocationDetail at ClaimPrintout.pcf: line 1001, column 33
    function locationRef_263 (CheckView :  CheckView) : pcf.api.Destination {
      return pcf.ClaimFinancialsChecksDetailPrint.createDestination(Claim, CheckView)
    }
    
    // 'locationRef' attribute on PrintLocationDetail at ClaimPrintout.pcf: line 1006, column 32
    function locationRef_264 (DocumentParam :  Document) : pcf.api.Destination {
      return pcf.DocumentDetailsPrint.createDestination(Claim, DocumentParam)
    }
    
    // 'locationRef' attribute on PrintLocationDetail at ClaimPrintout.pcf: line 1012, column 34
    function locationRef_265 (Evaluation :  Evaluation) : pcf.api.Destination {
      return pcf.ClaimEvaluationPrintDetail.createDestination(Evaluation)
    }
    
    // 'locationRef' attribute on PrintLocationDetail at ClaimPrintout.pcf: line 1018, column 35
    function locationRef_266 (Negotiation :  Negotiation) : pcf.api.Destination {
      return pcf.ClaimNegotiationPrintDetail.createDestination(Negotiation)
    }
    
    // 'locationRef' attribute on PrintLocationDetail at ClaimPrintout.pcf: line 1023, column 30
    function locationRef_267 (Matter :  Matter) : pcf.api.Destination {
      return pcf.MatterDetailPage.createDestination(Claim, Matter)
    }
    
    // 'printable' attribute on PrintLocationDetail at ClaimPrintout.pcf: line 966, column 33
    function printable_256 () : java.lang.Boolean {
      return helper.isAutoClaim()
    }
    
    // 'printable' attribute on PrintLocationDetail at ClaimPrintout.pcf: line 973, column 38
    function printable_258 () : java.lang.Boolean {
      return canShowClaimPolicyLocations
    }
    
    // 'value' attribute on PrintOut (id=ClaimPrintout) at ClaimPrintout.pcf: line 53, column 89
    function value_87 () : java.lang.String {
      return Choice
    }
    
    // PrintOut (id=ClaimPrintout) at ClaimPrintout.pcf: line 53, column 89
    function value_89 () : java.lang.Object {
      return Choice
    }
    
    property get Choice () : java.lang.String {
      return getVariableValue("Choice", 0) as java.lang.String
    }
    
    property set Choice ($arg :  java.lang.String) {
      setVariableValue("Choice", 0, $arg)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimPrintout {
      return super.CurrentLocation as pcf.ClaimPrintout
    }
    
    property get canShowClaimPolicyLocations () : boolean {
      return getVariableValue("canShowClaimPolicyLocations", 0) as java.lang.Boolean
    }
    
    property set canShowClaimPolicyLocations ($arg :  boolean) {
      setVariableValue("canShowClaimPolicyLocations", 0, $arg)
    }
    
    property get canShowClaimPolicyTrips () : boolean {
      return getVariableValue("canShowClaimPolicyTrips", 0) as java.lang.Boolean
    }
    
    property set canShowClaimPolicyTrips ($arg :  boolean) {
      setVariableValue("canShowClaimPolicyTrips", 0, $arg)
    }
    
    property get canShowPolicyStatCodes () : boolean {
      return getVariableValue("canShowPolicyStatCodes", 0) as java.lang.Boolean
    }
    
    property set canShowPolicyStatCodes ($arg :  boolean) {
      setVariableValue("canShowPolicyStatCodes", 0, $arg)
    }
    
    property get employerLiability () : Exposure {
      return getVariableValue("employerLiability", 0) as Exposure
    }
    
    property set employerLiability ($arg :  Exposure) {
      setVariableValue("employerLiability", 0, $arg)
    }
    
    property get helper () : gw.api.print.ClaimPrintoutHelper {
      return getVariableValue("helper", 0) as gw.api.print.ClaimPrintoutHelper
    }
    
    property set helper ($arg :  gw.api.print.ClaimPrintoutHelper) {
      setVariableValue("helper", 0, $arg)
    }
    
    property get indemityTimeLoss () : Exposure {
      return getVariableValue("indemityTimeLoss", 0) as Exposure
    }
    
    property set indemityTimeLoss ($arg :  Exposure) {
      setVariableValue("indemityTimeLoss", 0, $arg)
    }
    
    property get medicalDetails () : Exposure {
      return getVariableValue("medicalDetails", 0) as Exposure
    }
    
    property set medicalDetails ($arg :  Exposure) {
      setVariableValue("medicalDetails", 0, $arg)
    }
    
    property get printSettings () : gw.api.print.PrintSettings {
      return getVariableValue("printSettings", 0) as gw.api.print.PrintSettings
    }
    
    property set printSettings ($arg :  gw.api.print.PrintSettings) {
      setVariableValue("printSettings", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshot2SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 872, column 54
    function locationRef_222 () : pcf.api.Destination {
      return pcf.ClaimSnapshotLossDetails.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 875, column 55
    function locationRef_224 () : pcf.api.Destination {
      return pcf.ClaimSnapshotPartiesInvolved.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 878, column 84
    function locationRef_226 () : pcf.api.Destination {
      return pcf.ClaimSnapshotPolicy.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 881, column 85
    function locationRef_228 () : pcf.api.Destination {
      return pcf.ClaimSnapshotExposures.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 884, column 53
    function locationRef_230 () : pcf.api.Destination {
      return pcf.ClaimSnapshotNotes.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 887, column 47
    function locationRef_232 () : pcf.api.Destination {
      return pcf.ClaimSnapshotDocuments.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 890, column 54
    function locationRef_234 () : pcf.api.Destination {
      return pcf.ClaimSnapshotExtraFields.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 872, column 54
    function printable_221 () : java.lang.Boolean {
      return perm.System.viewclaimbasics
    }
    
    // 'printable' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 875, column 55
    function printable_223 () : java.lang.Boolean {
      return perm.System.viewclaimparties
    }
    
    // 'printable' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 878, column 84
    function printable_225 () : java.lang.Boolean {
      return perm.Policy.view(Claim.Policy) and perm.System.viewpolicy
    }
    
    // 'printable' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 881, column 85
    function printable_227 () : java.lang.Boolean {
      return !helper.isWorkersCompClaim() and perm.System.viewexposures
    }
    
    // 'printable' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 884, column 53
    function printable_229 () : java.lang.Boolean {
      return perm.System.viewclaimnotes
    }
    
    // 'printable' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 887, column 47
    function printable_231 () : java.lang.Boolean {
      return perm.System.viewdocs
    }
    
    // 'printable' attribute on PrintSection (id=ClaimSnapshot2Section) at ClaimPrintout.pcf: line 866, column 52
    function printable_236 () : java.lang.Boolean {
      return helper.canPrintClaimSnapshot()
    }
    
    // PrintSection (id=ClaimSnapshot2Section) at ClaimPrintout.pcf: line 866, column 52
    function visible_235 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshot3SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on PrintSection (id=ClaimSnapshot3Section) at ClaimPrintout.pcf: line 1838, column 52
    function defaultSetter_644 (__VALUE_TO_SET :  java.lang.Object) : void {
      __selectedValue = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'label' attribute on PrintSection (id=ClaimSnapshot3Section) at ClaimPrintout.pcf: line 1838, column 52
    function label_642 () : java.lang.Object {
      return (Claim.LossType == LossType.TC_WC) ? DisplayKey.get("Java.PrintClaimOptionsForm.Options.FirstReportOfInjurySnapshot") : DisplayKey.get("Java.PrintClaimOptionsForm.Options.FNOLSnapshot")
    }
    
    // 'label' attribute on PrintSection (id=ClaimSnapshot3Section) at ClaimPrintout.pcf: line 1838, column 52
    function label_648 () : java.lang.String {
      return (Claim.LossType == LossType.TC_WC) ? DisplayKey.get("Java.PrintClaimOptionsForm.Options.FirstReportOfInjurySnapshot") : DisplayKey.get("Java.PrintClaimOptionsForm.Options.FNOLSnapshot")
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1844, column 54
    function locationRef_626 () : pcf.api.Destination {
      return pcf.ClaimSnapshotLossDetails.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1847, column 55
    function locationRef_628 () : pcf.api.Destination {
      return pcf.ClaimSnapshotPartiesInvolved.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1850, column 84
    function locationRef_630 () : pcf.api.Destination {
      return pcf.ClaimSnapshotPolicy.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1853, column 85
    function locationRef_632 () : pcf.api.Destination {
      return pcf.ClaimSnapshotExposures.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1856, column 53
    function locationRef_634 () : pcf.api.Destination {
      return pcf.ClaimSnapshotNotes.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1859, column 47
    function locationRef_636 () : pcf.api.Destination {
      return pcf.ClaimSnapshotDocuments.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1862, column 54
    function locationRef_638 () : pcf.api.Destination {
      return pcf.ClaimSnapshotExtraFields.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1844, column 54
    function printable_625 () : java.lang.Boolean {
      return perm.System.viewclaimbasics
    }
    
    // 'printable' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1847, column 55
    function printable_627 () : java.lang.Boolean {
      return perm.System.viewclaimparties
    }
    
    // 'printable' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1850, column 84
    function printable_629 () : java.lang.Boolean {
      return perm.Policy.view(Claim.Policy) and perm.System.viewpolicy
    }
    
    // 'printable' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1853, column 85
    function printable_631 () : java.lang.Boolean {
      return !helper.isWorkersCompClaim() and perm.System.viewexposures
    }
    
    // 'printable' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1856, column 53
    function printable_633 () : java.lang.Boolean {
      return perm.System.viewclaimnotes
    }
    
    // 'printable' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1859, column 47
    function printable_635 () : java.lang.Boolean {
      return perm.System.viewdocs
    }
    
    // PrintSection (id=ClaimSnapshot3Section) at ClaimPrintout.pcf: line 1838, column 52
    function value_640 () : java.lang.Object {
      return null
    }
    
    // 'printable' attribute on PrintSection (id=ClaimSnapshot3Section) at ClaimPrintout.pcf: line 1838, column 52
    function visible_639 () : java.lang.Boolean {
      return helper.canPrintClaimSnapshot()
    }
    
    // 'childrenVisible' attribute on PrintSection (id=ClaimSnapshot3Section) at ClaimPrintout.pcf: line 1838, column 52
    function visible_641 () : java.lang.Boolean {
      return __selectedValue
    }
    
    // PrintSection (id=ClaimSnapshot3Section) at ClaimPrintout.pcf: line 1838, column 52
    function visible_647 () : java.lang.Boolean {
      return Choice == "CustomChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Documents1SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 320, column 61
    function locationRef_68 () : pcf.api.Destination {
      return pcf.ClaimDocumentsPrint.createDestination(Claim, true)
    }
    
    // 'printable' attribute on PrintSection (id=Documents1Section) at ClaimPrintout.pcf: line 315, column 42
    function printable_70 () : java.lang.Boolean {
      return perm.System.viewdocs
    }
    
    // PrintSection (id=Documents1Section) at ClaimPrintout.pcf: line 315, column 42
    function visible_69 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithoutDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Documents2SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 794, column 61
    function locationRef_203 () : pcf.api.Destination {
      return pcf.ClaimDocumentsPrint.createDestination(Claim, true)
    }
    
    // 'printable' attribute on PrintSection (id=Documents2Section) at ClaimPrintout.pcf: line 789, column 42
    function printable_205 () : java.lang.Boolean {
      return perm.System.viewdocs
    }
    
    // PrintSection (id=Documents2Section) at ClaimPrintout.pcf: line 789, column 42
    function visible_204 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Documents3SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on PrintSection (id=Documents3Section) at ClaimPrintout.pcf: line 1736, column 42
    function defaultSetter_579 (__VALUE_TO_SET :  java.lang.Object) : void {
      __selectedValue = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1741, column 61
    function locationRef_573 () : pcf.api.Destination {
      return pcf.ClaimDocumentsPrint.createDestination(Claim, true)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1747, column 62
    function locationRef_574 () : pcf.api.Destination {
      return pcf.ClaimDocumentsPrint.createDestination(Claim, false)
    }
    
    // PrintSection (id=Documents3Section) at ClaimPrintout.pcf: line 1736, column 42
    function value_576 () : java.lang.Object {
      return null
    }
    
    // 'printable' attribute on PrintSection (id=Documents3Section) at ClaimPrintout.pcf: line 1736, column 42
    function visible_575 () : java.lang.Boolean {
      return perm.System.viewdocs
    }
    
    // 'childrenVisible' attribute on PrintSection (id=Documents3Section) at ClaimPrintout.pcf: line 1736, column 42
    function visible_577 () : java.lang.Boolean {
      return __selectedValue
    }
    
    // PrintSection (id=Documents3Section) at ClaimPrintout.pcf: line 1736, column 42
    function visible_581 () : java.lang.Boolean {
      return Choice == "CustomChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFMessagesSection2ExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on PrintSection (id=ECFMessagesSection) at ClaimPrintout.pcf: line 1891, column 42
    function defaultSetter_667 (__VALUE_TO_SET :  java.lang.Object) : void {
      __selectedValue = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1897, column 49
    function locationRef_662 () : pcf.api.Destination {
      return pcf.ClaimMessages.createDestination(Claim)
    }
    
    // PrintSection (id=ECFMessagesSection) at ClaimPrintout.pcf: line 1891, column 42
    function value_664 () : java.lang.Object {
      return null
    }
    
    // 'printable' attribute on PrintSection (id=ECFMessagesSection) at ClaimPrintout.pcf: line 1891, column 42
    function visible_663 () : java.lang.Boolean {
      return Claim.isECFVisible()
    }
    
    // 'childrenVisible' attribute on PrintSection (id=ECFMessagesSection) at ClaimPrintout.pcf: line 1891, column 42
    function visible_665 () : java.lang.Boolean {
      return __selectedValue
    }
    
    // PrintSection (id=ECFMessagesSection) at ClaimPrintout.pcf: line 1891, column 42
    function visible_669 () : java.lang.Boolean {
      return Choice == "CustomChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFMessagesSectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 918, column 49
    function locationRef_241 () : pcf.api.Destination {
      return pcf.ClaimMessages.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintSection (id=ECFMessagesSection) at ClaimPrintout.pcf: line 912, column 42
    function printable_243 () : java.lang.Boolean {
      return Claim.isECFVisible()
    }
    
    // PrintSection (id=ECFMessagesSection) at ClaimPrintout.pcf: line 912, column 42
    function visible_242 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Evaluations1SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 332, column 52
    function locationRef_71 () : pcf.api.Destination {
      return pcf.ClaimEvaluations.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintSection (id=Evaluations1Section) at ClaimPrintout.pcf: line 327, column 48
    function printable_73 () : java.lang.Boolean {
      return perm.System.viewclaimevals
    }
    
    // PrintSection (id=Evaluations1Section) at ClaimPrintout.pcf: line 327, column 48
    function visible_72 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithoutDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Evaluations2SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 811, column 40
    function locationRef_206 (Evaluation :  Evaluation) : pcf.api.Destination {
      return pcf.ClaimEvaluationPrintDetail.createDestination(Evaluation)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 807, column 51
    function locationRef_207 () : pcf.api.Destination {
      return pcf.ClaimEvaluations.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintSection (id=Evaluations2Section) at ClaimPrintout.pcf: line 801, column 48
    function printable_209 () : java.lang.Boolean {
      return perm.System.viewclaimevals
    }
    
    // PrintSection (id=Evaluations2Section) at ClaimPrintout.pcf: line 801, column 48
    function visible_208 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Evaluations3SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on PrintSection (id=Evaluations3Section) at ClaimPrintout.pcf: line 1754, column 48
    function defaultSetter_590 (__VALUE_TO_SET :  java.lang.Object) : void {
      __selectedValue = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1759, column 52
    function locationRef_583 () : pcf.api.Destination {
      return pcf.ClaimEvaluations.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 1770, column 40
    function locationRef_584 (Evaluation :  Evaluation) : pcf.api.Destination {
      return pcf.ClaimEvaluationPrintDetail.createDestination(Evaluation)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1766, column 51
    function locationRef_585 () : pcf.api.Destination {
      return pcf.ClaimEvaluations.createDestination(Claim)
    }
    
    // PrintSection (id=Evaluations3Section) at ClaimPrintout.pcf: line 1754, column 48
    function value_587 () : java.lang.Object {
      return null
    }
    
    // 'printable' attribute on PrintSection (id=Evaluations3Section) at ClaimPrintout.pcf: line 1754, column 48
    function visible_586 () : java.lang.Boolean {
      return perm.System.viewclaimevals
    }
    
    // 'childrenVisible' attribute on PrintSection (id=Evaluations3Section) at ClaimPrintout.pcf: line 1754, column 48
    function visible_588 () : java.lang.Boolean {
      return __selectedValue
    }
    
    // PrintSection (id=Evaluations3Section) at ClaimPrintout.pcf: line 1754, column 48
    function visible_592 () : java.lang.Boolean {
      return Choice == "CustomChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposures1SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 220, column 50
    function locationRef_40 () : pcf.api.Destination {
      return pcf.ClaimExposures.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintSection (id=Exposures1Section) at ClaimPrintout.pcf: line 215, column 80
    function printable_42 () : java.lang.Boolean {
      return !helper.isWorkersCompClaim() and perm.System.viewexposures
    }
    
    // PrintSection (id=Exposures1Section) at ClaimPrintout.pcf: line 215, column 80
    function visible_41 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithoutDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposures2SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 626, column 38
    function locationRef_155 (Exposure :  Exposure) : pcf.api.Destination {
      return pcf.ExposureDetail.createDestination(Exposure)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 622, column 49
    function locationRef_156 () : pcf.api.Destination {
      return pcf.ClaimExposures.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintSection (id=Exposures2Section) at ClaimPrintout.pcf: line 617, column 80
    function printable_158 () : java.lang.Boolean {
      return !helper.isWorkersCompClaim() and perm.System.viewexposures
    }
    
    // PrintSection (id=Exposures2Section) at ClaimPrintout.pcf: line 617, column 80
    function visible_157 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposures3SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on PrintSection (id=Exposures3Section) at ClaimPrintout.pcf: line 1292, column 80
    function defaultSetter_429 (__VALUE_TO_SET :  java.lang.Object) : void {
      __selectedValue = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1297, column 50
    function locationRef_422 () : pcf.api.Destination {
      return pcf.ClaimExposures.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 1307, column 38
    function locationRef_423 (Exposure :  Exposure) : pcf.api.Destination {
      return pcf.ExposureDetail.createDestination(Exposure)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1303, column 49
    function locationRef_424 () : pcf.api.Destination {
      return pcf.ClaimExposures.createDestination(Claim)
    }
    
    // PrintSection (id=Exposures3Section) at ClaimPrintout.pcf: line 1292, column 80
    function value_426 () : java.lang.Object {
      return null
    }
    
    // 'printable' attribute on PrintSection (id=Exposures3Section) at ClaimPrintout.pcf: line 1292, column 80
    function visible_425 () : java.lang.Boolean {
      return !helper.isWorkersCompClaim() and perm.System.viewexposures
    }
    
    // 'childrenVisible' attribute on PrintSection (id=Exposures3Section) at ClaimPrintout.pcf: line 1292, column 80
    function visible_427 () : java.lang.Boolean {
      return __selectedValue
    }
    
    // PrintSection (id=Exposures3Section) at ClaimPrintout.pcf: line 1292, column 80
    function visible_431 () : java.lang.Boolean {
      return Choice == "CustomChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FinancialsSummary1SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 257, column 63
    function locationRef_49 () : pcf.api.Destination {
      return pcf.FinancialsSummaryTitlePrint.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 259, column 73
    function locationRef_50 () : pcf.api.Destination {
      return pcf.FinancialsSummaryExposurePrint.createDestination(Claim, false)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 261, column 77
    function locationRef_51 () : pcf.api.Destination {
      return pcf.FinancialsSummaryExposureOnlyPrint.createDestination(Claim, false)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 263, column 73
    function locationRef_52 () : pcf.api.Destination {
      return pcf.FinancialsSummaryClaimantPrint.createDestination(Claim, false)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 265, column 73
    function locationRef_53 () : pcf.api.Destination {
      return pcf.FinancialsSummaryCoveragePrint.createDestination(Claim, false)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 267, column 78
    function locationRef_54 () : pcf.api.Destination {
      return pcf.FinancialsSummaryClaimCostOnlyPrint.createDestination(Claim, false)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 269, column 82
    function locationRef_55 () : pcf.api.Destination {
      return pcf.FinancialsSummaryReservingCurrencyPrint.createDestination(Claim, false)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 271, column 81
    function locationRef_56 () : pcf.api.Destination {
      return pcf.FinancialsSummaryRecoveryCategoryPrint.createDestination(Claim, false)
    }
    
    // 'printable' attribute on PrintSection (id=FinancialsSummary1Section) at ClaimPrintout.pcf: line 252, column 44
    function printable_58 () : java.lang.Boolean {
      return perm.System.viewfinsum
    }
    
    // PrintSection (id=FinancialsSummary1Section) at ClaimPrintout.pcf: line 252, column 44
    function visible_57 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithoutDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FinancialsSummary2SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 722, column 63
    function locationRef_182 () : pcf.api.Destination {
      return pcf.FinancialsSummaryTitlePrint.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 724, column 73
    function locationRef_183 () : pcf.api.Destination {
      return pcf.FinancialsSummaryExposurePrint.createDestination(Claim, false)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 726, column 77
    function locationRef_184 () : pcf.api.Destination {
      return pcf.FinancialsSummaryExposureOnlyPrint.createDestination(Claim, false)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 728, column 73
    function locationRef_185 () : pcf.api.Destination {
      return pcf.FinancialsSummaryClaimantPrint.createDestination(Claim, false)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 730, column 73
    function locationRef_186 () : pcf.api.Destination {
      return pcf.FinancialsSummaryCoveragePrint.createDestination(Claim, false)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 732, column 78
    function locationRef_187 () : pcf.api.Destination {
      return pcf.FinancialsSummaryClaimCostOnlyPrint.createDestination(Claim, false)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 734, column 82
    function locationRef_188 () : pcf.api.Destination {
      return pcf.FinancialsSummaryReservingCurrencyPrint.createDestination(Claim, false)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 736, column 81
    function locationRef_189 () : pcf.api.Destination {
      return pcf.FinancialsSummaryRecoveryCategoryPrint.createDestination(Claim, false)
    }
    
    // 'printable' attribute on PrintSection (id=FinancialsSummary2Section) at ClaimPrintout.pcf: line 717, column 44
    function printable_191 () : java.lang.Boolean {
      return perm.System.viewfinsum
    }
    
    // PrintSection (id=FinancialsSummary2Section) at ClaimPrintout.pcf: line 717, column 44
    function visible_190 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FinancialsSummary3SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on PrintSection (id=FinancialsSummary3Section) at ClaimPrintout.pcf: line 1509, column 44
    function defaultSetter_517 (__VALUE_TO_SET :  java.lang.Object) : void {
      __selectedValue = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1514, column 63
    function locationRef_491 () : pcf.api.Destination {
      return pcf.FinancialsSummaryTitlePrint.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1516, column 73
    function locationRef_492 () : pcf.api.Destination {
      return pcf.FinancialsSummaryExposurePrint.createDestination(Claim, false)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1518, column 77
    function locationRef_493 () : pcf.api.Destination {
      return pcf.FinancialsSummaryExposureOnlyPrint.createDestination(Claim, false)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1520, column 73
    function locationRef_494 () : pcf.api.Destination {
      return pcf.FinancialsSummaryClaimantPrint.createDestination(Claim, false)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1522, column 73
    function locationRef_495 () : pcf.api.Destination {
      return pcf.FinancialsSummaryCoveragePrint.createDestination(Claim, false)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1524, column 78
    function locationRef_496 () : pcf.api.Destination {
      return pcf.FinancialsSummaryClaimCostOnlyPrint.createDestination(Claim, false)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1526, column 82
    function locationRef_497 () : pcf.api.Destination {
      return pcf.FinancialsSummaryReservingCurrencyPrint.createDestination(Claim, false)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1528, column 81
    function locationRef_498 () : pcf.api.Destination {
      return pcf.FinancialsSummaryRecoveryCategoryPrint.createDestination(Claim, false)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1534, column 63
    function locationRef_499 () : pcf.api.Destination {
      return pcf.FinancialsSummaryTitlePrint.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1536, column 73
    function locationRef_500 () : pcf.api.Destination {
      return pcf.FinancialsSummaryExposurePrint.createDestination(Claim, false)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1542, column 63
    function locationRef_501 () : pcf.api.Destination {
      return pcf.FinancialsSummaryTitlePrint.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1544, column 77
    function locationRef_502 () : pcf.api.Destination {
      return pcf.FinancialsSummaryExposureOnlyPrint.createDestination(Claim, false)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1550, column 63
    function locationRef_503 () : pcf.api.Destination {
      return pcf.FinancialsSummaryTitlePrint.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1552, column 73
    function locationRef_504 () : pcf.api.Destination {
      return pcf.FinancialsSummaryClaimantPrint.createDestination(Claim, false)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1558, column 63
    function locationRef_505 () : pcf.api.Destination {
      return pcf.FinancialsSummaryTitlePrint.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1560, column 73
    function locationRef_506 () : pcf.api.Destination {
      return pcf.FinancialsSummaryCoveragePrint.createDestination(Claim, false)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1566, column 63
    function locationRef_507 () : pcf.api.Destination {
      return pcf.FinancialsSummaryTitlePrint.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1568, column 78
    function locationRef_508 () : pcf.api.Destination {
      return pcf.FinancialsSummaryClaimCostOnlyPrint.createDestination(Claim, false)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1574, column 63
    function locationRef_509 () : pcf.api.Destination {
      return pcf.FinancialsSummaryTitlePrint.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1576, column 82
    function locationRef_510 () : pcf.api.Destination {
      return pcf.FinancialsSummaryReservingCurrencyPrint.createDestination(Claim, false)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1582, column 63
    function locationRef_511 () : pcf.api.Destination {
      return pcf.FinancialsSummaryTitlePrint.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1584, column 81
    function locationRef_512 () : pcf.api.Destination {
      return pcf.FinancialsSummaryRecoveryCategoryPrint.createDestination(Claim, false)
    }
    
    // PrintSection (id=FinancialsSummary3Section) at ClaimPrintout.pcf: line 1509, column 44
    function value_514 () : java.lang.Object {
      return null
    }
    
    // 'printable' attribute on PrintSection (id=FinancialsSummary3Section) at ClaimPrintout.pcf: line 1509, column 44
    function visible_513 () : java.lang.Boolean {
      return perm.System.viewfinsum
    }
    
    // 'childrenVisible' attribute on PrintSection (id=FinancialsSummary3Section) at ClaimPrintout.pcf: line 1509, column 44
    function visible_515 () : java.lang.Boolean {
      return __selectedValue
    }
    
    // PrintSection (id=FinancialsSummary3Section) at ClaimPrintout.pcf: line 1509, column 44
    function visible_519 () : java.lang.Boolean {
      return Choice == "CustomChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FinancialsTransaction1SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 284, column 125
    function locationRef_59 () : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactionsPrint.createDestination(Claim, gw.api.financials.ClaimFinancialsTransactionsOption.ALL)
    }
    
    // 'printable' attribute on PrintSection (id=FinancialsTransaction1Section) at ClaimPrintout.pcf: line 278, column 62
    function printable_61 () : java.lang.Boolean {
      return perm.Claim.viewtransactiondetails(Claim)
    }
    
    // PrintSection (id=FinancialsTransaction1Section) at ClaimPrintout.pcf: line 278, column 62
    function visible_60 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithoutDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FinancialsTransaction2SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 752, column 45
    function locationRef_192 (TransactionView :  TransactionView) : pcf.api.Destination {
      return pcf.TransactionDetailPrint.createDestination(Claim, TransactionView)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 748, column 124
    function locationRef_193 () : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactionsPrint.createDestination(Claim, gw.api.financials.ClaimFinancialsTransactionsOption.ALL)
    }
    
    // 'printable' attribute on PrintSection (id=FinancialsTransaction2Section) at ClaimPrintout.pcf: line 743, column 62
    function printable_195 () : java.lang.Boolean {
      return perm.Claim.viewtransactiondetails(Claim)
    }
    
    // PrintSection (id=FinancialsTransaction2Section) at ClaimPrintout.pcf: line 743, column 62
    function visible_194 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FinancialsTransactionSectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on PrintSection (id=FinancialsTransactionSection) at ClaimPrintout.pcf: line 1591, column 62
    function defaultSetter_548 (__VALUE_TO_SET :  java.lang.Object) : void {
      __selectedValue = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1597, column 125
    function locationRef_521 () : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactionsPrint.createDestination(Claim, gw.api.financials.ClaimFinancialsTransactionsOption.ALL)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 1607, column 45
    function locationRef_522 (TransactionView :  TransactionView) : pcf.api.Destination {
      return pcf.TransactionDetailPrint.createDestination(Claim, TransactionView)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1603, column 124
    function locationRef_523 () : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactionsPrint.createDestination(Claim, gw.api.financials.ClaimFinancialsTransactionsOption.ALL)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1616, column 129
    function locationRef_524 () : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactionsPrint.createDestination(Claim, gw.api.financials.ClaimFinancialsTransactionsOption.RESERVE)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 1627, column 45
    function locationRef_526 (TransactionView :  TransactionView) : pcf.api.Destination {
      return pcf.TransactionDetailPrint.createDestination(Claim, TransactionView)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1623, column 128
    function locationRef_527 () : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactionsPrint.createDestination(Claim, gw.api.financials.ClaimFinancialsTransactionsOption.RESERVE)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1636, column 129
    function locationRef_529 () : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactionsPrint.createDestination(Claim, gw.api.financials.ClaimFinancialsTransactionsOption.PAYMENT)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 1647, column 45
    function locationRef_531 (TransactionView :  TransactionView) : pcf.api.Destination {
      return pcf.TransactionDetailPrint.createDestination(Claim, TransactionView)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1643, column 128
    function locationRef_532 () : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactionsPrint.createDestination(Claim, gw.api.financials.ClaimFinancialsTransactionsOption.PAYMENT)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1656, column 130
    function locationRef_534 () : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactionsPrint.createDestination(Claim, gw.api.financials.ClaimFinancialsTransactionsOption.RECOVERY)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 1667, column 45
    function locationRef_536 (TransactionView :  TransactionView) : pcf.api.Destination {
      return pcf.TransactionDetailPrint.createDestination(Claim, TransactionView)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1663, column 129
    function locationRef_537 () : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactionsPrint.createDestination(Claim, gw.api.financials.ClaimFinancialsTransactionsOption.RECOVERY)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1676, column 138
    function locationRef_539 () : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactionsPrint.createDestination(Claim, gw.api.financials.ClaimFinancialsTransactionsOption.RECOVERY_RESERVE)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 1687, column 45
    function locationRef_541 (TransactionView :  TransactionView) : pcf.api.Destination {
      return pcf.TransactionDetailPrint.createDestination(Claim, TransactionView)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1683, column 137
    function locationRef_542 () : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactionsPrint.createDestination(Claim, gw.api.financials.ClaimFinancialsTransactionsOption.RECOVERY_RESERVE)
    }
    
    // 'printable' attribute on PrintOption (id=FinancialsTransactionReservesWithoutDetailsOption) at ClaimPrintout.pcf: line 1614, column 54
    function printable_525 () : java.lang.Boolean {
      return perm.Claim.viewreserves(Claim)
    }
    
    // 'printable' attribute on PrintOption (id=FinancialsTransactionPaymentsWithoutDetailsOption) at ClaimPrintout.pcf: line 1634, column 54
    function printable_530 () : java.lang.Boolean {
      return perm.Claim.viewpayments(Claim)
    }
    
    // 'printable' attribute on PrintOption (id=FinancialsTransactionRecoveriesWithoutDetailsOption) at ClaimPrintout.pcf: line 1654, column 56
    function printable_535 () : java.lang.Boolean {
      return perm.Claim.viewrecoveries(Claim)
    }
    
    // 'printable' attribute on PrintOption (id=FinancialsTransactionRecoveryReservesWithoutDetailsOption) at ClaimPrintout.pcf: line 1674, column 119
    function printable_540 () : java.lang.Boolean {
      return perm.Claim.viewrecoveryreserves(Claim) and gw.api.print.ClaimPrintoutHelper.UseRecoveryReserves
    }
    
    // PrintSection (id=FinancialsTransactionSection) at ClaimPrintout.pcf: line 1591, column 62
    function value_545 () : java.lang.Object {
      return null
    }
    
    // 'printable' attribute on PrintSection (id=FinancialsTransactionSection) at ClaimPrintout.pcf: line 1591, column 62
    function visible_544 () : java.lang.Boolean {
      return perm.Claim.viewtransactiondetails(Claim)
    }
    
    // 'childrenVisible' attribute on PrintSection (id=FinancialsTransactionSection) at ClaimPrintout.pcf: line 1591, column 62
    function visible_546 () : java.lang.Boolean {
      return __selectedValue
    }
    
    // PrintSection (id=FinancialsTransactionSection) at ClaimPrintout.pcf: line 1591, column 62
    function visible_550 () : java.lang.Boolean {
      return Choice == "CustomChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class History1SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'filter' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 384, column 48
    function filter_83 (VALUE :  gw.entity.TypeKey) : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return gw.api.util.CoreFilters.ALL
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 384, column 48
    function locationRef_84 () : pcf.api.Destination {
      return pcf.ClaimHistory.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintSection (id=History1Section) at ClaimPrintout.pcf: line 377, column 50
    function printable_86 () : java.lang.Boolean {
      return perm.System.viewclaimhistory
    }
    
    // PrintSection (id=History1Section) at ClaimPrintout.pcf: line 377, column 50
    function visible_85 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithoutDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class History2SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'filter' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 905, column 48
    function filter_237 (VALUE :  gw.entity.TypeKey) : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return gw.api.util.CoreFilters.ALL
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 905, column 48
    function locationRef_238 () : pcf.api.Destination {
      return pcf.ClaimHistory.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintSection (id=History2Section) at ClaimPrintout.pcf: line 898, column 50
    function printable_240 () : java.lang.Boolean {
      return perm.System.viewclaimhistory
    }
    
    // PrintSection (id=History2Section) at ClaimPrintout.pcf: line 898, column 50
    function visible_239 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class History3SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on PrintSection (id=History3Section) at ClaimPrintout.pcf: line 1870, column 50
    function defaultSetter_658 (__VALUE_TO_SET :  java.lang.Object) : void {
      __selectedValue = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'filter' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1877, column 48
    function filter_650 (VALUE :  gw.entity.TypeKey) : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return gw.api.util.CoreFilters.ALL
    }
    
    // 'filter' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1885, column 48
    function filter_652 (VALUE :  HistoryType) : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return new gw.api.filters.TypeKeyFilter(VALUE, History#Type.PropertyInfo as gw.entity.ITypekeyPropertyInfo)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1877, column 48
    function locationRef_651 () : pcf.api.Destination {
      return pcf.ClaimHistory.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1885, column 48
    function locationRef_653 () : pcf.api.Destination {
      return pcf.ClaimHistory.createDestination(Claim)
    }
    
    // PrintSection (id=History3Section) at ClaimPrintout.pcf: line 1870, column 50
    function value_655 () : java.lang.Object {
      return null
    }
    
    // 'printable' attribute on PrintSection (id=History3Section) at ClaimPrintout.pcf: line 1870, column 50
    function visible_654 () : java.lang.Boolean {
      return perm.System.viewclaimhistory
    }
    
    // 'childrenVisible' attribute on PrintSection (id=History3Section) at ClaimPrintout.pcf: line 1870, column 50
    function visible_656 () : java.lang.Boolean {
      return __selectedValue
    }
    
    // PrintSection (id=History3Section) at ClaimPrintout.pcf: line 1870, column 50
    function visible_660 () : java.lang.Boolean {
      return Choice == "CustomChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class HomeownerPropertyIncident2SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 506, column 106
    function locationRef_118 () : pcf.api.Destination {
      return pcf.DwellingIncidentPrint.createDestination(Claim, helper.DwellingIncident)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 510, column 122
    function locationRef_120 () : pcf.api.Destination {
      return pcf.PropertyContentsIncidentPrint.createDestination(Claim, helper.PersonalPropertyIncident)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 514, column 118
    function locationRef_122 () : pcf.api.Destination {
      return pcf.OtherStructureIncidentPrint.createDestination(Claim, helper.OtherStructureIncident)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 518, column 118
    function locationRef_124 () : pcf.api.Destination {
      return pcf.LivingExpensesIncidentPrint.createDestination(Claim, helper.LivingExpensesIncident)
    }
    
    // 'printable' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 506, column 106
    function printable_117 () : java.lang.Boolean {
      return helper.DwellingIncident != null and perm.Incident.view(helper.DwellingIncident)
    }
    
    // 'printable' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 510, column 122
    function printable_119 () : java.lang.Boolean {
      return helper.PersonalPropertyIncident != null and perm.Incident.view(helper.PersonalPropertyIncident)
    }
    
    // 'printable' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 514, column 118
    function printable_121 () : java.lang.Boolean {
      return helper.OtherStructureIncident != null and perm.Incident.view(helper.OtherStructureIncident)
    }
    
    // 'printable' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 518, column 118
    function printable_123 () : java.lang.Boolean {
      return helper.LivingExpensesIncident != null and perm.Incident.view(helper.LivingExpensesIncident)
    }
    
    // 'printable' attribute on PrintOption (id=HomeownerIncidentOption) at ClaimPrintout.pcf: line 502, column 50
    function printable_125 () : java.lang.Boolean {
      return helper.isHomeownersClaim()
    }
    
    // PrintSection (id=HomeownerPropertyIncident2Section) at ClaimPrintout.pcf: line 498, column 48
    function visible_126 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class HomeownerPropertyIncident3SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on PrintSection (id=HomeownerPropertyIncident3Section) at ClaimPrintout.pcf: line 1167, column 48
    function defaultSetter_348 (__VALUE_TO_SET :  java.lang.Object) : void {
      __selectedValue = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1175, column 106
    function locationRef_336 () : pcf.api.Destination {
      return pcf.DwellingIncidentPrint.createDestination(Claim, helper.DwellingIncident)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1179, column 122
    function locationRef_338 () : pcf.api.Destination {
      return pcf.PropertyContentsIncidentPrint.createDestination(Claim, helper.PersonalPropertyIncident)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1183, column 118
    function locationRef_340 () : pcf.api.Destination {
      return pcf.OtherStructureIncidentPrint.createDestination(Claim, helper.OtherStructureIncident)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1187, column 118
    function locationRef_342 () : pcf.api.Destination {
      return pcf.LivingExpensesIncidentPrint.createDestination(Claim, helper.LivingExpensesIncident)
    }
    
    // 'printable' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1175, column 106
    function printable_335 () : java.lang.Boolean {
      return helper.DwellingIncident != null and perm.Incident.view(helper.DwellingIncident)
    }
    
    // 'printable' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1179, column 122
    function printable_337 () : java.lang.Boolean {
      return helper.PersonalPropertyIncident != null and perm.Incident.view(helper.PersonalPropertyIncident)
    }
    
    // 'printable' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1183, column 118
    function printable_339 () : java.lang.Boolean {
      return helper.OtherStructureIncident != null and perm.Incident.view(helper.OtherStructureIncident)
    }
    
    // 'printable' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1187, column 118
    function printable_341 () : java.lang.Boolean {
      return helper.LivingExpensesIncident != null and perm.Incident.view(helper.LivingExpensesIncident)
    }
    
    // 'printable' attribute on PrintOption (id=HomeownerIncidentOption) at ClaimPrintout.pcf: line 1171, column 50
    function printable_343 () : java.lang.Boolean {
      return helper.isHomeownersClaim()
    }
    
    // PrintSection (id=HomeownerPropertyIncident3Section) at ClaimPrintout.pcf: line 1167, column 48
    function value_345 () : java.lang.Object {
      return null
    }
    
    // 'childrenVisible' attribute on PrintSection (id=HomeownerPropertyIncident3Section) at ClaimPrintout.pcf: line 1167, column 48
    function visible_346 () : java.lang.Boolean {
      return __selectedValue
    }
    
    // PrintSection (id=HomeownerPropertyIncident3Section) at ClaimPrintout.pcf: line 1167, column 48
    function visible_350 () : java.lang.Boolean {
      return Choice == "CustomChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InjuryIncident2SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 489, column 44
    function locationRef_113 (InjuryIncident :  InjuryIncident) : pcf.api.Destination {
      return pcf.InjuryIncidentDetailPrint.createDestination(InjuryIncident)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 485, column 57
    function locationRef_115 () : pcf.api.Destination {
      return pcf.InjuryIncidentsPrint.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 485, column 57
    function printable_114 () : java.lang.Boolean {
      return !helper.InjuryIncidents.IsEmpty
    }
    
    // PrintSection (id=InjuryIncident2Section) at ClaimPrintout.pcf: line 479, column 106
    function visible_116 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InjuryIncident3SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on PrintSection (id=InjuryIncident3Section) at ClaimPrintout.pcf: line 1148, column 106
    function defaultSetter_333 (__VALUE_TO_SET :  java.lang.Object) : void {
      __selectedValue = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 1158, column 44
    function locationRef_327 (InjuryIncident :  InjuryIncident) : pcf.api.Destination {
      return pcf.InjuryIncidentDetailPrint.createDestination(InjuryIncident)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1154, column 57
    function locationRef_329 () : pcf.api.Destination {
      return pcf.InjuryIncidentsPrint.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1154, column 57
    function printable_328 () : java.lang.Boolean {
      return !helper.InjuryIncidents.IsEmpty
    }
    
    // PrintSection (id=InjuryIncident3Section) at ClaimPrintout.pcf: line 1148, column 106
    function value_330 () : java.lang.Object {
      return null
    }
    
    // 'childrenVisible' attribute on PrintSection (id=InjuryIncident3Section) at ClaimPrintout.pcf: line 1148, column 106
    function visible_331 () : java.lang.Boolean {
      return __selectedValue
    }
    
    // PrintSection (id=InjuryIncident3Section) at ClaimPrintout.pcf: line 1148, column 106
    function visible_334 () : java.lang.Boolean {
      return Choice == "CustomChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Litigation1SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 369, column 48
    function locationRef_80 () : pcf.api.Destination {
      return pcf.ClaimMatters.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintSection (id=Litigation1Section) at ClaimPrintout.pcf: line 364, column 45
    function printable_82 () : java.lang.Boolean {
      return perm.System.viewmatters
    }
    
    // PrintSection (id=Litigation1Section) at ClaimPrintout.pcf: line 364, column 45
    function visible_81 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithoutDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Litigation2SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 858, column 36
    function locationRef_217 (Matter :  Matter) : pcf.api.Destination {
      return pcf.MatterDetailPage.createDestination(Claim, Matter)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 854, column 47
    function locationRef_218 () : pcf.api.Destination {
      return pcf.ClaimMatters.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintSection (id=Litigation2Section) at ClaimPrintout.pcf: line 849, column 45
    function printable_220 () : java.lang.Boolean {
      return perm.System.viewmatters
    }
    
    // PrintSection (id=Litigation2Section) at ClaimPrintout.pcf: line 849, column 45
    function visible_219 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Litigation3SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on PrintSection (id=Litigation3Section) at ClaimPrintout.pcf: line 1815, column 45
    function defaultSetter_621 (__VALUE_TO_SET :  java.lang.Object) : void {
      __selectedValue = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1820, column 48
    function locationRef_614 () : pcf.api.Destination {
      return pcf.ClaimMatters.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 1830, column 36
    function locationRef_615 (Matter :  Matter) : pcf.api.Destination {
      return pcf.MatterDetailPage.createDestination(Claim, Matter)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1826, column 47
    function locationRef_616 () : pcf.api.Destination {
      return pcf.ClaimMatters.createDestination(Claim)
    }
    
    // PrintSection (id=Litigation3Section) at ClaimPrintout.pcf: line 1815, column 45
    function value_618 () : java.lang.Object {
      return null
    }
    
    // 'printable' attribute on PrintSection (id=Litigation3Section) at ClaimPrintout.pcf: line 1815, column 45
    function visible_617 () : java.lang.Boolean {
      return perm.System.viewmatters
    }
    
    // 'childrenVisible' attribute on PrintSection (id=Litigation3Section) at ClaimPrintout.pcf: line 1815, column 45
    function visible_619 () : java.lang.Boolean {
      return __selectedValue
    }
    
    // PrintSection (id=Litigation3Section) at ClaimPrintout.pcf: line 1815, column 45
    function visible_623 () : java.lang.Boolean {
      return Choice == "CustomChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossDetails1SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 147, column 52
    function locationRef_19 () : pcf.api.Destination {
      return pcf.ClaimLossDetails.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintSection (id=LossDetails1Section) at ClaimPrintout.pcf: line 142, column 49
    function printable_21 () : java.lang.Boolean {
      return perm.System.viewclaimbasics
    }
    
    // PrintSection (id=LossDetails1Section) at ClaimPrintout.pcf: line 142, column 49
    function visible_20 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithoutDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossDetails2SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 436, column 52
    function locationRef_101 () : pcf.api.Destination {
      return pcf.ClaimLossDetails.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintSection (id=LossDetails2Section) at ClaimPrintout.pcf: line 431, column 49
    function printable_103 () : java.lang.Boolean {
      return perm.System.viewclaimbasics
    }
    
    // PrintSection (id=LossDetails2Section) at ClaimPrintout.pcf: line 431, column 49
    function visible_102 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossDetails3SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on PrintSection (id=LossDetails3Section) at ClaimPrintout.pcf: line 1099, column 49
    function defaultSetter_302 (__VALUE_TO_SET :  java.lang.Object) : void {
      __selectedValue = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1104, column 52
    function locationRef_297 () : pcf.api.Destination {
      return pcf.ClaimLossDetails.createDestination(Claim)
    }
    
    // PrintSection (id=LossDetails3Section) at ClaimPrintout.pcf: line 1099, column 49
    function value_299 () : java.lang.Object {
      return null
    }
    
    // 'printable' attribute on PrintSection (id=LossDetails3Section) at ClaimPrintout.pcf: line 1099, column 49
    function visible_298 () : java.lang.Boolean {
      return perm.System.viewclaimbasics
    }
    
    // 'childrenVisible' attribute on PrintSection (id=LossDetails3Section) at ClaimPrintout.pcf: line 1099, column 49
    function visible_300 () : java.lang.Boolean {
      return __selectedValue
    }
    
    // PrintSection (id=LossDetails3Section) at ClaimPrintout.pcf: line 1099, column 49
    function visible_304 () : java.lang.Boolean {
      return Choice == "CustomChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Negotiations1SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 345, column 53
    function locationRef_74 () : pcf.api.Destination {
      return pcf.ClaimNegotiations.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintSection (id=Negotiations1Section) at ClaimPrintout.pcf: line 339, column 48
    function printable_76 () : java.lang.Boolean {
      return perm.System.viewclaimngtns
    }
    
    // PrintSection (id=Negotiations1Section) at ClaimPrintout.pcf: line 339, column 48
    function visible_75 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithoutDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Negotiations2SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 829, column 41
    function locationRef_210 (Negotiation :  Negotiation) : pcf.api.Destination {
      return pcf.ClaimNegotiationPrintDetail.createDestination(Negotiation)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 825, column 52
    function locationRef_211 () : pcf.api.Destination {
      return pcf.ClaimNegotiations.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintSection (id=Negotiations2Section) at ClaimPrintout.pcf: line 819, column 48
    function printable_213 () : java.lang.Boolean {
      return perm.System.viewclaimngtns
    }
    
    // PrintSection (id=Negotiations2Section) at ClaimPrintout.pcf: line 819, column 48
    function visible_212 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Negotiations3SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on PrintSection (id=Negotiations3Section) at ClaimPrintout.pcf: line 1778, column 48
    function defaultSetter_601 (__VALUE_TO_SET :  java.lang.Object) : void {
      __selectedValue = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1784, column 53
    function locationRef_594 () : pcf.api.Destination {
      return pcf.ClaimNegotiations.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 1795, column 41
    function locationRef_595 (Negotiation :  Negotiation) : pcf.api.Destination {
      return pcf.ClaimNegotiationPrintDetail.createDestination(Negotiation)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1791, column 52
    function locationRef_596 () : pcf.api.Destination {
      return pcf.ClaimNegotiations.createDestination(Claim)
    }
    
    // PrintSection (id=Negotiations3Section) at ClaimPrintout.pcf: line 1778, column 48
    function value_598 () : java.lang.Object {
      return null
    }
    
    // 'printable' attribute on PrintSection (id=Negotiations3Section) at ClaimPrintout.pcf: line 1778, column 48
    function visible_597 () : java.lang.Boolean {
      return perm.System.viewclaimngtns
    }
    
    // 'childrenVisible' attribute on PrintSection (id=Negotiations3Section) at ClaimPrintout.pcf: line 1778, column 48
    function visible_599 () : java.lang.Boolean {
      return __selectedValue
    }
    
    // PrintSection (id=Negotiations3Section) at ClaimPrintout.pcf: line 1778, column 48
    function visible_603 () : java.lang.Boolean {
      return Choice == "CustomChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Notes1SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 308, column 54
    function locationRef_65 () : pcf.api.Destination {
      return pcf.ClaimAllNotesPrint.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintSection (id=Notes1Section) at ClaimPrintout.pcf: line 303, column 48
    function printable_67 () : java.lang.Boolean {
      return perm.System.viewclaimnotes
    }
    
    // PrintSection (id=Notes1Section) at ClaimPrintout.pcf: line 303, column 48
    function visible_66 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithoutDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Notes2SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 782, column 54
    function locationRef_200 () : pcf.api.Destination {
      return pcf.ClaimAllNotesPrint.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintSection (id=Notes2Section) at ClaimPrintout.pcf: line 777, column 48
    function printable_202 () : java.lang.Boolean {
      return perm.System.viewclaimnotes
    }
    
    // PrintSection (id=Notes2Section) at ClaimPrintout.pcf: line 777, column 48
    function visible_201 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Notes3SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on PrintSection (id=Notes3Section) at ClaimPrintout.pcf: line 1718, column 48
    function defaultSetter_569 (__VALUE_TO_SET :  java.lang.Object) : void {
      __selectedValue = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1723, column 65
    function locationRef_563 () : pcf.api.Destination {
      return pcf.ClaimNoConfidentialNotesPrint.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1729, column 54
    function locationRef_564 () : pcf.api.Destination {
      return pcf.ClaimAllNotesPrint.createDestination(Claim)
    }
    
    // PrintSection (id=Notes3Section) at ClaimPrintout.pcf: line 1718, column 48
    function value_566 () : java.lang.Object {
      return null
    }
    
    // 'printable' attribute on PrintSection (id=Notes3Section) at ClaimPrintout.pcf: line 1718, column 48
    function visible_565 () : java.lang.Boolean {
      return perm.System.viewclaimnotes
    }
    
    // 'childrenVisible' attribute on PrintSection (id=Notes3Section) at ClaimPrintout.pcf: line 1718, column 48
    function visible_567 () : java.lang.Boolean {
      return __selectedValue
    }
    
    // PrintSection (id=Notes3Section) at ClaimPrintout.pcf: line 1718, column 48
    function visible_571 () : java.lang.Boolean {
      return Choice == "CustomChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PartiesInvolved1SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 232, column 49
    function locationRef_43 () : pcf.api.Destination {
      return pcf.ClaimContacts.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintSection (id=PartiesInvolved1Section) at ClaimPrintout.pcf: line 227, column 50
    function printable_45 () : java.lang.Boolean {
      return perm.System.viewclaimparties
    }
    
    // PrintSection (id=PartiesInvolved1Section) at ClaimPrintout.pcf: line 227, column 50
    function visible_44 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithoutDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PartiesInvolved2SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 644, column 49
    function locationRef_159 (selectedClaimContact :  entity.ClaimContact) : pcf.api.Destination {
      return pcf.ClaimContactPrintDetails.createDestination(Claim, selectedClaimContact) 
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 640, column 48
    function locationRef_160 () : pcf.api.Destination {
      return pcf.ClaimContacts.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintSection (id=PartiesInvolved2Section) at ClaimPrintout.pcf: line 634, column 50
    function printable_162 () : java.lang.Boolean {
      return perm.System.viewclaimparties
    }
    
    // PrintSection (id=PartiesInvolved2Section) at ClaimPrintout.pcf: line 634, column 50
    function visible_161 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PartiesInvolved3SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on PrintSection (id=PartiesInvolved3Section) at ClaimPrintout.pcf: line 1315, column 50
    function defaultSetter_440 (__VALUE_TO_SET :  java.lang.Object) : void {
      __selectedValue = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1320, column 49
    function locationRef_433 () : pcf.api.Destination {
      return pcf.ClaimContacts.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 1331, column 42
    function locationRef_434 (selectedClaimContact :  ClaimContact) : pcf.api.Destination {
      return pcf.ClaimContactPrintDetails.createDestination(Claim, selectedClaimContact)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1327, column 48
    function locationRef_435 () : pcf.api.Destination {
      return pcf.ClaimContacts.createDestination(Claim)
    }
    
    // PrintSection (id=PartiesInvolved3Section) at ClaimPrintout.pcf: line 1315, column 50
    function value_437 () : java.lang.Object {
      return null
    }
    
    // 'printable' attribute on PrintSection (id=PartiesInvolved3Section) at ClaimPrintout.pcf: line 1315, column 50
    function visible_436 () : java.lang.Boolean {
      return perm.System.viewclaimparties
    }
    
    // 'childrenVisible' attribute on PrintSection (id=PartiesInvolved3Section) at ClaimPrintout.pcf: line 1315, column 50
    function visible_438 () : java.lang.Boolean {
      return __selectedValue
    }
    
    // PrintSection (id=PartiesInvolved3Section) at ClaimPrintout.pcf: line 1315, column 50
    function visible_442 () : java.lang.Boolean {
      return Choice == "CustomChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Policy1SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 245, column 54
    function locationRef_46 () : pcf.api.Destination {
      return pcf.ClaimPolicyGeneral.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintSection (id=Policy1Section) at ClaimPrintout.pcf: line 239, column 44
    function printable_48 () : java.lang.Boolean {
      return perm.System.viewpolicy
    }
    
    // PrintSection (id=Policy1Section) at ClaimPrintout.pcf: line 239, column 44
    function visible_47 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithoutDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Policy2SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 658, column 54
    function locationRef_163 () : pcf.api.Destination {
      return pcf.ClaimPolicyGeneral.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 666, column 39
    function locationRef_164 (VehicleRU :  VehicleRU) : pcf.api.Destination {
      return pcf.ClaimPolicyVehicleDetail.createDestination(Claim, VehicleRU)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 662, column 46
    function locationRef_166 () : pcf.api.Destination {
      return pcf.ClaimPolicyVehicles.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 675, column 44
    function locationRef_167 (PolicyLocation :  PolicyLocation) : pcf.api.Destination {
      return pcf.PolicyLocationPrint.createDestination(PolicyLocation, Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 671, column 53
    function locationRef_169 () : pcf.api.Destination {
      return pcf.ClaimPolicyLocations.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 684, column 36
    function locationRef_170 (aTripRU :  TripRU) : pcf.api.Destination {
      return pcf.TripRUPrint.createDestination(Claim, aTripRU)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 680, column 49
    function locationRef_172 () : pcf.api.Destination {
      return pcf.ClaimPolicyTrips.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 692, column 41
    function locationRef_173 (Endorsement :  Endorsement) : pcf.api.Destination {
      return pcf.ClaimPolicyEndorsementDetail.createDestination(Claim, Endorsement)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 688, column 58
    function locationRef_174 () : pcf.api.Destination {
      return pcf.ClaimPolicyEndorsements.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 701, column 38
    function locationRef_175 (StatCode :  StatCode) : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodeDetail.createDestination(Claim, StatCode)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 697, column 48
    function locationRef_177 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodes.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 709, column 44
    function locationRef_178 (AggregateLimit :  AggregateLimit) : pcf.api.Destination {
      return pcf.ClaimPolicyAggregateLimitDetail.createDestination(Claim, AggregateLimit)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 705, column 61
    function locationRef_179 () : pcf.api.Destination {
      return pcf.ClaimPolicyAggregateLimits.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 662, column 46
    function printable_165 () : java.lang.Boolean {
      return helper.isAutoClaim()
    }
    
    // 'printable' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 671, column 53
    function printable_168 () : java.lang.Boolean {
      return canShowClaimPolicyLocations
    }
    
    // 'printable' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 680, column 49
    function printable_171 () : java.lang.Boolean {
      return canShowClaimPolicyTrips
    }
    
    // 'printable' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 697, column 48
    function printable_176 () : java.lang.Boolean {
      return canShowPolicyStatCodes
    }
    
    // 'printable' attribute on PrintSection (id=Policy2Section) at ClaimPrintout.pcf: line 652, column 44
    function printable_181 () : java.lang.Boolean {
      return perm.System.viewpolicy
    }
    
    // PrintSection (id=Policy2Section) at ClaimPrintout.pcf: line 652, column 44
    function visible_180 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Policy3SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on PrintSection (id=Policy3Section) at ClaimPrintout.pcf: line 1339, column 44
    function defaultSetter_487 (__VALUE_TO_SET :  java.lang.Object) : void {
      __selectedValue = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1345, column 54
    function locationRef_444 () : pcf.api.Destination {
      return pcf.ClaimPolicyGeneral.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 1359, column 39
    function locationRef_445 (VehicleRU :  VehicleRU) : pcf.api.Destination {
      return pcf.ClaimPolicyVehicleDetail.createDestination(Claim, VehicleRU)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1355, column 54
    function locationRef_446 () : pcf.api.Destination {
      return pcf.ClaimPolicyVehicles.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 1374, column 44
    function locationRef_448 (PolicyLocation :  PolicyLocation) : pcf.api.Destination {
      return pcf.PolicyLocationPrint.createDestination(PolicyLocation, Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1370, column 53
    function locationRef_450 () : pcf.api.Destination {
      return pcf.ClaimPolicyLocations.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 1388, column 36
    function locationRef_452 (aTripRU :  TripRU) : pcf.api.Destination {
      return pcf.TripRUPrint.createDestination(Claim, aTripRU)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1384, column 51
    function locationRef_453 () : pcf.api.Destination {
      return pcf.ClaimPolicyTrips.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 1401, column 41
    function locationRef_455 (Endorsement :  Endorsement) : pcf.api.Destination {
      return pcf.ClaimPolicyEndorsementDetail.createDestination(Claim, Endorsement)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1397, column 58
    function locationRef_456 () : pcf.api.Destination {
      return pcf.ClaimPolicyEndorsements.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 1414, column 38
    function locationRef_457 (StatCode :  StatCode) : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodeDetail.createDestination(Claim, StatCode)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1410, column 60
    function locationRef_458 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodesPrint.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 1426, column 44
    function locationRef_460 (AggregateLimit :  AggregateLimit) : pcf.api.Destination {
      return pcf.ClaimPolicyAggregateLimitDetail.createDestination(Claim, AggregateLimit)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1422, column 61
    function locationRef_461 () : pcf.api.Destination {
      return pcf.ClaimPolicyAggregateLimits.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1435, column 54
    function locationRef_462 () : pcf.api.Destination {
      return pcf.ClaimPolicyGeneral.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 1442, column 39
    function locationRef_463 (VehicleRU :  VehicleRU) : pcf.api.Destination {
      return pcf.ClaimPolicyVehicleDetail.createDestination(Claim, VehicleRU)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1438, column 54
    function locationRef_464 () : pcf.api.Destination {
      return pcf.ClaimPolicyVehicles.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1450, column 54
    function locationRef_466 () : pcf.api.Destination {
      return pcf.ClaimPolicyGeneral.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 1458, column 39
    function locationRef_467 (VehicleRU :  VehicleRU) : pcf.api.Destination {
      return pcf.ClaimPolicyVehicleDetail.createDestination(Claim, VehicleRU)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1454, column 46
    function locationRef_469 () : pcf.api.Destination {
      return pcf.ClaimPolicyVehicles.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 1467, column 44
    function locationRef_470 (PolicyLocation :  PolicyLocation) : pcf.api.Destination {
      return pcf.PolicyLocationPrint.createDestination(PolicyLocation, Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1463, column 53
    function locationRef_472 () : pcf.api.Destination {
      return pcf.ClaimPolicyLocations.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 1476, column 36
    function locationRef_473 (aTripRU :  TripRU) : pcf.api.Destination {
      return pcf.TripRUPrint.createDestination(Claim, aTripRU)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1472, column 49
    function locationRef_475 () : pcf.api.Destination {
      return pcf.ClaimPolicyTrips.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 1484, column 41
    function locationRef_476 (Endorsement :  Endorsement) : pcf.api.Destination {
      return pcf.ClaimPolicyEndorsementDetail.createDestination(Claim, Endorsement)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1480, column 58
    function locationRef_477 () : pcf.api.Destination {
      return pcf.ClaimPolicyEndorsements.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 1493, column 38
    function locationRef_478 (StatCode :  StatCode) : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodeDetail.createDestination(Claim, StatCode)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1489, column 48
    function locationRef_480 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodes.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 1501, column 44
    function locationRef_481 (AggregateLimit :  AggregateLimit) : pcf.api.Destination {
      return pcf.ClaimPolicyAggregateLimitDetail.createDestination(Claim, AggregateLimit)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1497, column 61
    function locationRef_482 () : pcf.api.Destination {
      return pcf.ClaimPolicyAggregateLimits.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintOption (id=PolicyVehiclesLocationsOption) at ClaimPrintout.pcf: line 1352, column 44
    function printable_447 () : java.lang.Boolean {
      return helper.isAutoClaim()
    }
    
    // 'printable' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1370, column 53
    function printable_449 () : java.lang.Boolean {
      return canShowClaimPolicyLocations
    }
    
    // 'printable' attribute on PrintOption (id=PolicyTrips) at ClaimPrintout.pcf: line 1381, column 47
    function printable_454 () : java.lang.Boolean {
      return canShowClaimPolicyTrips
    }
    
    // 'printable' attribute on PrintOption (id=PolicyStatCodesOption) at ClaimPrintout.pcf: line 1408, column 46
    function printable_459 () : java.lang.Boolean {
      return canShowPolicyStatCodes
    }
    
    // PrintSection (id=Policy3Section) at ClaimPrintout.pcf: line 1339, column 44
    function value_484 () : java.lang.Object {
      return null
    }
    
    // 'printable' attribute on PrintSection (id=Policy3Section) at ClaimPrintout.pcf: line 1339, column 44
    function visible_483 () : java.lang.Boolean {
      return perm.System.viewpolicy
    }
    
    // 'childrenVisible' attribute on PrintSection (id=Policy3Section) at ClaimPrintout.pcf: line 1339, column 44
    function visible_485 () : java.lang.Boolean {
      return __selectedValue
    }
    
    // PrintSection (id=Policy3Section) at ClaimPrintout.pcf: line 1339, column 44
    function visible_489 () : java.lang.Boolean {
      return Choice == "CustomChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyIncident2SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 471, column 51
    function locationRef_108 (fixedPropertyIncident :  FixedPropertyIncident) : pcf.api.Destination {
      return pcf.FixedPropertyIncidentDetailPrint.createDestination(fixedPropertyIncident)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 467, column 64
    function locationRef_110 () : pcf.api.Destination {
      return pcf.FixedPropertyIncidentPrint.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 467, column 64
    function printable_109 () : java.lang.Boolean {
      return !helper.FixedPropertyIncidents.IsEmpty
    }
    
    // 'printable' attribute on PrintSection (id=PropertyIncident2Section) at ClaimPrintout.pcf: line 461, column 49
    function printable_112 () : java.lang.Boolean {
      return perm.System.viewclaimbasics
    }
    
    // PrintSection (id=PropertyIncident2Section) at ClaimPrintout.pcf: line 461, column 49
    function visible_111 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyIncident3SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on PrintSection (id=PropertyIncident3Section) at ClaimPrintout.pcf: line 1130, column 49
    function defaultSetter_323 (__VALUE_TO_SET :  java.lang.Object) : void {
      __selectedValue = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 1140, column 51
    function locationRef_316 (fixedPropertyIncident :  FixedPropertyIncident) : pcf.api.Destination {
      return pcf.FixedPropertyIncidentDetailPrint.createDestination(fixedPropertyIncident)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1136, column 64
    function locationRef_318 () : pcf.api.Destination {
      return pcf.FixedPropertyIncidentPrint.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1136, column 64
    function printable_317 () : java.lang.Boolean {
      return !helper.FixedPropertyIncidents.IsEmpty
    }
    
    // PrintSection (id=PropertyIncident3Section) at ClaimPrintout.pcf: line 1130, column 49
    function value_320 () : java.lang.Object {
      return null
    }
    
    // 'printable' attribute on PrintSection (id=PropertyIncident3Section) at ClaimPrintout.pcf: line 1130, column 49
    function visible_319 () : java.lang.Boolean {
      return perm.System.viewclaimbasics
    }
    
    // 'childrenVisible' attribute on PrintSection (id=PropertyIncident3Section) at ClaimPrintout.pcf: line 1130, column 49
    function visible_321 () : java.lang.Boolean {
      return __selectedValue
    }
    
    // PrintSection (id=PropertyIncident3Section) at ClaimPrintout.pcf: line 1130, column 49
    function visible_325 () : java.lang.Boolean {
      return Choice == "CustomChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SpecialInvestigations1SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 171, column 45
    function locationRef_25 () : pcf.api.Destination {
      return pcf.SIDetails.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintSection (id=SpecialInvestigations1Section) at ClaimPrintout.pcf: line 166, column 49
    function printable_27 () : java.lang.Boolean {
      return perm.System.viewclaimbasics
    }
    
    // PrintSection (id=SpecialInvestigations1Section) at ClaimPrintout.pcf: line 166, column 49
    function visible_26 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithoutDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SpecialInvestigations2SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 573, column 45
    function locationRef_140 () : pcf.api.Destination {
      return pcf.SIDetails.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintSection (id=SpecialInvestigations2Section) at ClaimPrintout.pcf: line 568, column 49
    function printable_142 () : java.lang.Boolean {
      return perm.System.viewclaimbasics
    }
    
    // PrintSection (id=SpecialInvestigations2Section) at ClaimPrintout.pcf: line 568, column 49
    function visible_141 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SpecialInvestigations3SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on PrintSection (id=SpecialInvestigations3Section) at ClaimPrintout.pcf: line 1243, column 49
    function defaultSetter_382 (__VALUE_TO_SET :  java.lang.Object) : void {
      __selectedValue = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1248, column 45
    function locationRef_377 () : pcf.api.Destination {
      return pcf.SIDetails.createDestination(Claim)
    }
    
    // PrintSection (id=SpecialInvestigations3Section) at ClaimPrintout.pcf: line 1243, column 49
    function value_379 () : java.lang.Object {
      return null
    }
    
    // 'printable' attribute on PrintSection (id=SpecialInvestigations3Section) at ClaimPrintout.pcf: line 1243, column 49
    function visible_378 () : java.lang.Boolean {
      return perm.System.viewclaimbasics
    }
    
    // 'childrenVisible' attribute on PrintSection (id=SpecialInvestigations3Section) at ClaimPrintout.pcf: line 1243, column 49
    function visible_380 () : java.lang.Boolean {
      return __selectedValue
    }
    
    // PrintSection (id=SpecialInvestigations3Section) at ClaimPrintout.pcf: line 1243, column 49
    function visible_384 () : java.lang.Boolean {
      return Choice == "CustomChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Subrogation1SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 357, column 54
    function locationRef_77 () : pcf.api.Destination {
      return pcf.SubrogationGeneral.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintSection (id=Subrogation1Section) at ClaimPrintout.pcf: line 352, column 87
    function printable_79 () : java.lang.Boolean {
      return perm.System.viewsubrodetails and Claim.SubrogationSummary != null
    }
    
    // PrintSection (id=Subrogation1Section) at ClaimPrintout.pcf: line 352, column 87
    function visible_78 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithoutDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Subrogation2SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 842, column 54
    function locationRef_214 () : pcf.api.Destination {
      return pcf.SubrogationGeneral.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintSection (id=Subrogation2Section) at ClaimPrintout.pcf: line 837, column 87
    function printable_216 () : java.lang.Boolean {
      return perm.System.viewsubrodetails and Claim.SubrogationSummary != null
    }
    
    // PrintSection (id=Subrogation2Section) at ClaimPrintout.pcf: line 837, column 87
    function visible_215 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Subrogation3SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on PrintSection (id=Subrogation3Section) at ClaimPrintout.pcf: line 1803, column 87
    function defaultSetter_610 (__VALUE_TO_SET :  java.lang.Object) : void {
      __selectedValue = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1808, column 54
    function locationRef_605 () : pcf.api.Destination {
      return pcf.SubrogationGeneral.createDestination(Claim)
    }
    
    // PrintSection (id=Subrogation3Section) at ClaimPrintout.pcf: line 1803, column 87
    function value_607 () : java.lang.Object {
      return null
    }
    
    // 'printable' attribute on PrintSection (id=Subrogation3Section) at ClaimPrintout.pcf: line 1803, column 87
    function visible_606 () : java.lang.Boolean {
      return perm.System.viewsubrodetails and Claim.SubrogationSummary != null
    }
    
    // 'childrenVisible' attribute on PrintSection (id=Subrogation3Section) at ClaimPrintout.pcf: line 1803, column 87
    function visible_608 () : java.lang.Boolean {
      return __selectedValue
    }
    
    // PrintSection (id=Subrogation3Section) at ClaimPrintout.pcf: line 1803, column 87
    function visible_612 () : java.lang.Boolean {
      return Choice == "CustomChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Summary1SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 119, column 48
    function locationRef_11 () : pcf.api.Destination {
      return pcf.ClaimSummary.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 121, column 47
    function locationRef_12 () : pcf.api.Destination {
      return pcf.ClaimStatus.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 123, column 51
    function locationRef_13 () : pcf.api.Destination {
      return pcf.ClaimKeyMetrics.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintSection (id=Summary1Section) at ClaimPrintout.pcf: line 114, column 50
    function printable_15 () : java.lang.Boolean {
      return perm.System.viewclaimsummary
    }
    
    // PrintSection (id=Summary1Section) at ClaimPrintout.pcf: line 114, column 50
    function visible_14 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithoutDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Summary2SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 403, column 48
    function locationRef_92 () : pcf.api.Destination {
      return pcf.ClaimSummary.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 405, column 47
    function locationRef_93 () : pcf.api.Destination {
      return pcf.ClaimStatus.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 407, column 51
    function locationRef_94 () : pcf.api.Destination {
      return pcf.ClaimKeyMetrics.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintSection (id=Summary2Section) at ClaimPrintout.pcf: line 398, column 50
    function printable_96 () : java.lang.Boolean {
      return perm.System.viewclaimsummary
    }
    
    // PrintSection (id=Summary2Section) at ClaimPrintout.pcf: line 398, column 50
    function visible_95 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Summary3SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on PrintSection (id=Summary3Section) at ClaimPrintout.pcf: line 1036, column 50
    function defaultSetter_282 (__VALUE_TO_SET :  java.lang.Object) : void {
      __selectedValue = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1041, column 48
    function locationRef_271 () : pcf.api.Destination {
      return pcf.ClaimSummary.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1043, column 47
    function locationRef_272 () : pcf.api.Destination {
      return pcf.ClaimStatus.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1045, column 51
    function locationRef_273 () : pcf.api.Destination {
      return pcf.ClaimKeyMetrics.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1051, column 48
    function locationRef_274 () : pcf.api.Destination {
      return pcf.ClaimSummary.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1057, column 54
    function locationRef_275 () : pcf.api.Destination {
      return pcf.ClaimSummary.createDestination(Claim, true)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1063, column 47
    function locationRef_276 () : pcf.api.Destination {
      return pcf.ClaimStatus.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1069, column 51
    function locationRef_277 () : pcf.api.Destination {
      return pcf.ClaimKeyMetrics.createDestination(Claim)
    }
    
    // PrintSection (id=Summary3Section) at ClaimPrintout.pcf: line 1036, column 50
    function value_279 () : java.lang.Object {
      return null
    }
    
    // 'printable' attribute on PrintSection (id=Summary3Section) at ClaimPrintout.pcf: line 1036, column 50
    function visible_278 () : java.lang.Boolean {
      return perm.System.viewclaimsummary
    }
    
    // 'childrenVisible' attribute on PrintSection (id=Summary3Section) at ClaimPrintout.pcf: line 1036, column 50
    function visible_280 () : java.lang.Boolean {
      return __selectedValue
    }
    
    // PrintSection (id=Summary3Section) at ClaimPrintout.pcf: line 1036, column 50
    function visible_284 () : java.lang.Boolean {
      return Choice == "CustomChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TravelIncident2SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 535, column 42
    function locationRef_128 (TripIncident :  TripIncident) : pcf.api.Destination {
      return pcf.TripIncidentDetailPrint.createDestination(Claim, TripIncident)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 531, column 55
    function locationRef_130 () : pcf.api.Destination {
      return pcf.TripIncidentsPrint.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 543, column 45
    function locationRef_131 (BaggageIncident :  BaggageIncident) : pcf.api.Destination {
      return pcf.BaggageIncidentDetailPrint.createDestination(Claim, BaggageIncident)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 539, column 58
    function locationRef_133 () : pcf.api.Destination {
      return pcf.BaggageIncidentsPrint.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 531, column 55
    function printable_129 () : java.lang.Boolean {
      return !helper.TripIncidents.IsEmpty
    }
    
    // 'printable' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 539, column 58
    function printable_132 () : java.lang.Boolean {
      return !helper.BaggageIncidents.IsEmpty
    }
    
    // 'printable' attribute on PrintSection (id=TravelIncident2Section) at ClaimPrintout.pcf: line 525, column 44
    function printable_135 () : java.lang.Boolean {
      return helper.isTravelClaim()
    }
    
    // PrintSection (id=TravelIncident2Section) at ClaimPrintout.pcf: line 525, column 44
    function visible_134 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TravelIncident3SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on PrintSection (id=TravelIncident3Section) at ClaimPrintout.pcf: line 1194, column 44
    function defaultSetter_362 (__VALUE_TO_SET :  java.lang.Object) : void {
      __selectedValue = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 1204, column 42
    function locationRef_352 (TripIncident :  TripIncident) : pcf.api.Destination {
      return pcf.TripIncidentDetailPrint.createDestination(Claim, TripIncident)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1200, column 55
    function locationRef_354 () : pcf.api.Destination {
      return pcf.TripIncidentsPrint.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 1212, column 45
    function locationRef_355 (BaggageIncident :  BaggageIncident) : pcf.api.Destination {
      return pcf.BaggageIncidentDetailPrint.createDestination(Claim, BaggageIncident)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1208, column 58
    function locationRef_357 () : pcf.api.Destination {
      return pcf.BaggageIncidentsPrint.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1200, column 55
    function printable_353 () : java.lang.Boolean {
      return !helper.TripIncidents.IsEmpty
    }
    
    // 'printable' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1208, column 58
    function printable_356 () : java.lang.Boolean {
      return !helper.BaggageIncidents.IsEmpty
    }
    
    // PrintSection (id=TravelIncident3Section) at ClaimPrintout.pcf: line 1194, column 44
    function value_359 () : java.lang.Object {
      return null
    }
    
    // 'printable' attribute on PrintSection (id=TravelIncident3Section) at ClaimPrintout.pcf: line 1194, column 44
    function visible_358 () : java.lang.Boolean {
      return helper.isTravelClaim()
    }
    
    // 'childrenVisible' attribute on PrintSection (id=TravelIncident3Section) at ClaimPrintout.pcf: line 1194, column 44
    function visible_360 () : java.lang.Boolean {
      return __selectedValue
    }
    
    // PrintSection (id=TravelIncident3Section) at ClaimPrintout.pcf: line 1194, column 44
    function visible_364 () : java.lang.Boolean {
      return Choice == "CustomChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehicleIncident2SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 452, column 45
    function locationRef_104 (vehicleIncident :  VehicleIncident) : pcf.api.Destination {
      return pcf.VehicleIncidentDetailPrint.createDestination(vehicleIncident)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 448, column 55
    function locationRef_105 () : pcf.api.Destination {
      return pcf.VehicleIncidentPrint.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintSection (id=VehicleIncident2Section) at ClaimPrintout.pcf: line 443, column 74
    function printable_107 () : java.lang.Boolean {
      return helper.isAutoClaim() and perm.System.viewclaimbasics
    }
    
    // PrintSection (id=VehicleIncident2Section) at ClaimPrintout.pcf: line 443, column 74
    function visible_106 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehicleIncident3SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on PrintSection (id=VehicleIncident3Section) at ClaimPrintout.pcf: line 1112, column 74
    function defaultSetter_312 (__VALUE_TO_SET :  java.lang.Object) : void {
      __selectedValue = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 1121, column 45
    function locationRef_306 (vehicleIncident :  VehicleIncident) : pcf.api.Destination {
      return pcf.VehicleIncidentDetailPrint.createDestination(vehicleIncident)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1117, column 55
    function locationRef_307 () : pcf.api.Destination {
      return pcf.VehicleIncidentPrint.createDestination(Claim)
    }
    
    // PrintSection (id=VehicleIncident3Section) at ClaimPrintout.pcf: line 1112, column 74
    function value_309 () : java.lang.Object {
      return null
    }
    
    // 'printable' attribute on PrintSection (id=VehicleIncident3Section) at ClaimPrintout.pcf: line 1112, column 74
    function visible_308 () : java.lang.Boolean {
      return helper.isAutoClaim() and perm.System.viewclaimbasics
    }
    
    // 'childrenVisible' attribute on PrintSection (id=VehicleIncident3Section) at ClaimPrintout.pcf: line 1112, column 74
    function visible_310 () : java.lang.Boolean {
      return __selectedValue
    }
    
    // PrintSection (id=VehicleIncident3Section) at ClaimPrintout.pcf: line 1112, column 74
    function visible_314 () : java.lang.Boolean {
      return Choice == "CustomChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Workplan1SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 135, column 49
    function locationRef_16 () : pcf.api.Destination {
      return pcf.ClaimWorkplan.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintSection (id=Workplan1Section) at ClaimPrintout.pcf: line 130, column 46
    function printable_18 () : java.lang.Boolean {
      return perm.System.viewworkplan
    }
    
    // PrintSection (id=Workplan1Section) at ClaimPrintout.pcf: line 130, column 46
    function visible_17 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithoutDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Workplan2SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 423, column 38
    function locationRef_97 (Activity :  Activity) : pcf.api.Destination {
      return pcf.ActivityDetailPrint.createDestination(Activity)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 419, column 48
    function locationRef_98 () : pcf.api.Destination {
      return pcf.ClaimWorkplan.createDestination(Claim)
    }
    
    // 'printable' attribute on PrintSection (id=Workplan2Section) at ClaimPrintout.pcf: line 414, column 46
    function printable_100 () : java.lang.Boolean {
      return perm.System.viewworkplan
    }
    
    // PrintSection (id=Workplan2Section) at ClaimPrintout.pcf: line 414, column 46
    function visible_99 () : java.lang.Boolean {
      return Choice == "AllClaimPagesWithDetailsChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPrintout.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Workplan3SectionExpressionsImpl extends ClaimPrintoutExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on PrintSection (id=Workplan3Section) at ClaimPrintout.pcf: line 1076, column 46
    function defaultSetter_293 (__VALUE_TO_SET :  java.lang.Object) : void {
      __selectedValue = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1081, column 49
    function locationRef_286 () : pcf.api.Destination {
      return pcf.ClaimWorkplan.createDestination(Claim)
    }
    
    // 'locationRef' attribute on PrintDetail at ClaimPrintout.pcf: line 1091, column 38
    function locationRef_287 (Activity :  Activity) : pcf.api.Destination {
      return pcf.ActivityDetailPrint.createDestination(Activity)
    }
    
    // 'locationRef' attribute on PrintOptionLocation at ClaimPrintout.pcf: line 1087, column 48
    function locationRef_288 () : pcf.api.Destination {
      return pcf.ClaimWorkplan.createDestination(Claim)
    }
    
    // PrintSection (id=Workplan3Section) at ClaimPrintout.pcf: line 1076, column 46
    function value_290 () : java.lang.Object {
      return null
    }
    
    // 'printable' attribute on PrintSection (id=Workplan3Section) at ClaimPrintout.pcf: line 1076, column 46
    function visible_289 () : java.lang.Boolean {
      return perm.System.viewworkplan
    }
    
    // 'childrenVisible' attribute on PrintSection (id=Workplan3Section) at ClaimPrintout.pcf: line 1076, column 46
    function visible_291 () : java.lang.Boolean {
      return __selectedValue
    }
    
    // PrintSection (id=Workplan3Section) at ClaimPrintout.pcf: line 1076, column 46
    function visible_295 () : java.lang.Boolean {
      return Choice == "CustomChoice"
    }
    
    property get __selectedValue () : boolean {
      return getPrintSectionSelectedValue(1) as java.lang.Boolean
    }
    
    property set __selectedValue ($arg :  boolean) {
      setPrintSectionSelectedValue(1, $arg)
    }
    
    
  }
  
  
}