/* Generated by Guidewire XML Code Generator */

package xsd.acord.enums;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
public enum RoleType implements gw.xml.IXmlSchemaEnumValue {
  A( "A" ),
  AC( "AC" ),
  AccountInformation( "AccountInformation" ),
  AD( "AD" ),
  AdditionalInsured( "AdditionalInsured" ),
  ADJ( "ADJ" ),
  AdjustingFirm( "AdjustingFirm" ),
  AFFIL( "AFFIL" ),
  AH( "AH" ),
  AIF( "AIF" ),
  AlarmInstall( "AlarmInstall" ),
  AlarmRepond( "AlarmRepond" ),
  AlarmService( "AlarmService" ),
  AO( "AO" ),
  ApplicantsCustomer( "ApplicantsCustomer" ),
  Appraiser( "Appraiser" ),
  AppraiserFirm( "AppraiserFirm" ),
  ApprovingParty( "ApprovingParty" ),
  AR( "AR" ),
  ARF( "ARF" ),
  AT( "AT" ),
  AUC( "AUC" ),
  Auditor( "Auditor" ),
  BC( "BC" ),
  BEN( "BEN" ),
  BK( "BK" ),
  BoardMember( "BoardMember" ),
  BranchOffice( "BranchOffice" ),
  C( "C" ),
  CA( "CA" ),
  CarrierInsurer( "CarrierInsurer" ),
  CarrierName( "CarrierName" ),
  CB( "CB" ),
  CC( "CC" ),
  CertifyingParty( "CertifyingParty" ),
  CharitableTrust( "CharitableTrust" ),
  CJ( "CJ" ),
  CL( "CL" ),
  CM( "CM" ),
  CNTRL( "CNTRL" ),
  Contractor( "Contractor" ),
  ContractWinner( "ContractWinner" ),
  CORPO( "CORPO" ),
  COWN( "COWN" ),
  CP( "CP" ),
  CreditBureau( "CreditBureau" ),
  CS( "CS" ),
  CT( "CT" ),
  CUST( "CUST" ),
  CV( "CV" ),
  DecisionMaker( "DecisionMaker" ),
  DecliningCarrier( "DecliningCarrier" ),
  DesignatedRepresentative( "DesignatedRepresentative" ),
  Director( "Director" ),
  EG( "EG" ),
  Employee( "Employee" ),
  Employer( "Employer" ),
  EstateController( "EstateController" ),
  ExcessWorkCompCarrier( "ExcessWorkCompCarrier" ),
  ExcludedPerson( "ExcludedPerson" ),
  FB( "FB" ),
  FC( "FC" ),
  FinancialFilingRecipient( "FinancialFilingRecipient" ),
  FireDepartment( "FireDepartment" ),
  FORMB( "FORMB" ),
  FRA( "FRA" ),
  FS( "FS" ),
  GC( "GC" ),
  IA( "IA" ),
  ID( "ID" ),
  IN( "IN" ),
  IncludedPerson( "IncludedPerson" ),
  IndContractor( "IndContractor" ),
  Insp( "Insp" ),
  InspectionCompany( "InspectionCompany" ),
  InspectionContact( "InspectionContact" ),
  INST( "INST" ),
  IT( "IT" ),
  JointControllers( "JointControllers" ),
  Lender( "Lender" ),
  Lessee( "Lessee" ),
  LF( "LF" ),
  Lienholder( "Lienholder" ),
  LoanServicer( "LoanServicer" ),
  LowBidder( "LowBidder" ),
  MajorOwner( "MajorOwner" ),
  MajorRevenueSource( "MajorRevenueSource" ),
  MC( "MC" ),
  MGA( "MGA" ),
  MGMT( "MGMT" ),
  MK( "MK" ),
  MM( "MM" ),
  MNGC( "MNGC" ),
  MNGR( "MNGR" ),
  MobileHomePark( "MobileHomePark" ),
  NA( "NA" ),
  NT( "NT" ),
  OB( "OB" ),
  Officer( "Officer" ),
  OPER( "OPER" ),
  OPMNGR( "OPMNGR" ),
  OT( "OT" ),
  OWN( "OWN" ),
  OwnedFoundation( "OwnedFoundation" ),
  ParentCompany( "ParentCompany" ),
  PART( "PART" ),
  PartytoaJointVenture( "PartytoaJointVenture" ),
  Payor( "Payor" ),
  PFC( "PFC" ),
  Physician( "Physician" ),
  PO( "PO" ),
  PremisesStorageLocation( "PremisesStorageLocation" ),
  PrevEmployer( "PrevEmployer" ),
  PrimaryContact( "PrimaryContact" ),
  PRINC( "PRINC" ),
  PrinShip( "PrinShip" ),
  PROD( "PROD" ),
  PY( "PY" ),
  REF( "REF" ),
  RegisteredOwner( "RegisteredOwner" ),
  RM( "RM" ),
  RP( "RP" ),
  RS( "RS" ),
  SC( "SC" ),
  School( "School" ),
  SecondLowBidder( "SecondLowBidder" ),
  ServiceBureau( "ServiceBureau" ),
  ServiceProvider( "ServiceProvider" ),
  SO( "SO" ),
  SourceofReceipt( "SourceofReceipt" ),
  Subsidiary( "Subsidiary" ),
  TerminalName( "TerminalName" ),
  ThirdLowBidder( "ThirdLowBidder" ),
  TowerErector( "TowerErector" ),
  TRAIN( "TRAIN" ),
  UN( "UN" ),
  US( "US" ),
  USC( "USC" ),
  USERIN( "USERIN" ),
  ValuationCompanyOrganization( "ValuationCompanyOrganization" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlEnumerationTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlEnumerationTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlEnumerationTypeDataImpl init() {
      return (gw.internal.xml.XmlEnumerationTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.enums.RoleType" );
    }
  };

  private final java.lang.String _stringValue;

  private RoleType( java.lang.String stringValue ) {
    _stringValue = stringValue;
  }

  public static final xsd.acord.enums.RoleType forValue( java.lang.String value ) {
    return (xsd.acord.enums.RoleType) TYPE.get().cg_forValue( value );
  } // xmlRefactorRemove

  public static final xsd.acord.enums.RoleType forGosuValue( java.lang.String value ) {
    return (xsd.acord.enums.RoleType) TYPE.get().cg_forValue( value );
  }

  @java.lang.Override
  public final gw.xml.XmlSimpleValue getSimpleValue() {
    return TYPE.get().getEnumSimpleValue( this );
  } // xmlRefactorRemove

  @java.lang.Override
  public final java.lang.String getStringValue() {
    return _stringValue; // xmlRefactorRemove
  } // xmlRefactorRemove

  @java.lang.Override
  public final java.lang.String getSerializedValue() {
    return _stringValue;
  }

  @java.lang.Override
  public final java.lang.String getValue() {
    return (java.lang.String) TYPE.get().getEnumSimpleValue( this ).getValue();
  } // xmlRefactorRemove

  @java.lang.Override
  public final java.lang.String getGosuValue() {
    return (java.lang.String) TYPE.get().getEnumSimpleValue( this ).getValue();
  }

  @java.lang.Override
  public final String getCode() {
    return name();
  }

  @java.lang.Override
  public final int getOrdinal() {
    return ordinal();
  }

  @java.lang.Override
  public final String toString() {
    return _stringValue;
  }

}
