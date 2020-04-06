package gw.api.databuilder
uses java.lang.Integer

@Export
enhancement EFTDataBuilderEnhancement : gw.api.databuilder.EFTDataBuilder {

  /**
   * Sets the name on the account
   * @param accountName the desired value
   * @return the modified builder
   */
  function withAccountName(accountName : String) : EFTDataBuilder {
    this.set(EFTData#AccountName, accountName);
    return this;
  }

  /**
   * Sets the bank account number
   * @param bankAccountNumber the desired value
   * @return the modified builder
   */
  function withBankAccountNumber(bankAccountNumber : String) : EFTDataBuilder {
    this.set(EFTData#BankAccountNumber, bankAccountNumber)
    return this;
  }

  /**
   * Sets the type of bank accout e.g. checking, savings etc
   * @param bankAccountType the desired value
   * @return the modified builder
   */
  function withBankAccountType(bankAccountType : BankAccountType) : EFTDataBuilder {
    this.set(EFTData#BankAccountType, bankAccountType)
    return this;
  }

  /**
   * Sets the name of the bank
   * @param bankName the desired value
   * @return the modified builder
   */
  function withBankName(bankName : String) : EFTDataBuilder {
    this.set(EFTData#BankName, bankName)
    return this;
  }

  /**
   * Sets the routing number is a nine digit bank code used in the United States
   * @param bankRoutingNumber the desired value
   * @return the modified builder
   */
  function withBankRoutingNumber(bankRoutingNumber : String) : EFTDataBuilder {
    this.set(EFTData#BankRoutingNumber, bankRoutingNumber)
    return this;
  }

  /**
   * Sets the indicates if this is the primary EFT record for the contact
   * @param isPrimary the desired value
   * @return the modified builder
   */
  function withIsPrimary(isPrimary : Boolean) : EFTDataBuilder {
    this.set(EFTData#IsPrimary, isPrimary)
    return this;
  }
 
 /**
  * Sets the AddressBookUID for the EFTData
  * @param abuid the AddressBookUID to set
  * @return the modified builder
  */
  function withAddressBookUID(abuid : String) : EFTDataBuilder {
    this.set(EFTData#AddressBookUID, abuid)
    return this
  }

  function withUniqueDataNoAddressBookUIDAndBankAccountTypeAndPrimary(bankAccountType : BankAccountType ,isPrimary:Boolean) : EFTDataBuilder {
    this.set(EFTData#AccountName, UniqueKeyGenerator.get().nextID());
    this.set(EFTData#BankAccountNumber, UniqueKeyGenerator.get().nextID())
    this.set(EFTData#BankAccountType, bankAccountType)
    this.set(EFTData#BankName, UniqueKeyGenerator.get().nextID())
    this.set(EFTData#BankRoutingNumber, UniqueKeyGenerator.get().nextID())
    this.set(EFTData#IsPrimary, isPrimary)
    return this
  }


  function withUniqueDataAndBankAccountTypeAndPrimary(bankAccountType : BankAccountType ,isPrimary:Boolean) : EFTDataBuilder {
    this.set(EFTData#AccountName, UniqueKeyGenerator.get().nextID());
    this.set(EFTData#BankAccountNumber, UniqueKeyGenerator.get().nextID())
    this.set(EFTData#BankAccountType, bankAccountType)
    this.set(EFTData#BankName, UniqueKeyGenerator.get().nextID())
    this.set(EFTData#BankRoutingNumber, UniqueKeyGenerator.get().nextID())
    this.set(EFTData#IsPrimary, isPrimary)
    this.set(EFTData#AddressBookUID, UniqueKeyGenerator.get().nextID())
    return this
  }

}
