package gw.webservice.cc.cc900.financials.bulkpay

uses gw.api.contact.ContactSystemUtil
uses gw.api.database.Query
uses gw.api.locale.DisplayKey
uses gw.api.server.AvailabilityLevel
uses gw.api.util.CurrencyUtil
uses gw.api.webservice.exception.BadIdentifierException
uses gw.api.webservice.exception.EntityStateException
uses gw.pl.persistence.core.Bundle
uses gw.pl.util.ArgCheck
uses gw.transaction.Transaction
uses gw.webservice.cc.cc900.CCWsiEntityApiBase
uses gw.webservice.cc.cc900.dto.BIValidationAlertDTO
uses gw.webservice.cc.cc900.dto.BulkInvoiceDTO
uses gw.webservice.cc.cc900.dto.BulkInvoiceItemDTO
uses gw.webservice.cc.cc900.dto.BulkInvoiceItemInfoDTO
uses gw.xml.ws.annotation.WsiAvailability
uses gw.xml.ws.annotation.WsiCheckDuplicateExternalTransaction
uses gw.xml.ws.annotation.WsiWebService
uses org.apache.commons.lang3.StringUtils

uses java.lang.IllegalArgumentException
uses java.lang.RuntimeException
uses java.math.BigDecimal
uses java.util.Date
uses gw.api.upgrade.Coercions

@WsiWebService("http://guidewire.com/cc/ws/gw/webservice/cc/cc900/financials/bulkpay/BulkInvoiceAPI")
@WsiAvailability(AvailabilityLevel.MAINTENANCE)
@Export
class BulkInvoiceAPI extends CCWsiEntityApiBase {

  /**
   *<br/>
   * Gets a specific <code>BulkInvoice</code>, identified by <code>invoiceID</code>. The result is translated into
   * corresponding <code>BulkInvoiceDTO</code> and returned.
   * </p>
   * @param invoiceID the ID of the invoice to search for.
   * @return A <code>BulkInvoiceDTO</code> representing the <code>BulkInvoice</code> with the given PublicID. If none
    * was found, a <code>BadIdentifierException</code> is thrown.
   */
  @Throws(BadIdentifierException, "If the invoiceID doesn't correspond to an existing BulkInvoice.")
  @WsiCheckDuplicateExternalTransaction
  public function getBulkInvoice(invoiceID : String) : BulkInvoiceDTO {
    return assembleBulkInvoiceDTO(fetchByPublicID(invoiceID))
  }

  /**
   * Gets all <code>BulkInvoiceItem</code>s belonging to the <code>BulkInvoice</code> identified by
   * <code>invoiceID</code>. The results are translated into corresponding <code>BulkInvoiceItemDTO</code>s and returned.
   *
   * @param invoiceID ID of the <code>BulkInvoice</code> to which all the matching <code>BulkInvoiceItem</code>s should
   * belong to.
   * @return Array of <code>BulkInvoiceItemDTO</code>s representing the <code>BulkInvoiceItem</code> objects belonging
   * to the given <code>BulkInvoice</code>. Or an empty array, if no results were found.
   */
  @Throws(BadIdentifierException, "If the invoiceID doesn't correspond to an existing BulkInvoice.")
  @WsiCheckDuplicateExternalTransaction
  public function getItemsForInvoice(invoiceID : String) : BulkInvoiceItemDTO[] {
    var bulkInvoice = fetchByPublicID<BulkInvoice>(invoiceID)

    return bulkInvoice.InvoiceItems.map( \ item -> assembleBulkInvoiceItemDTO(item))
  }

  /**
   * <br/>
   * Gets all <code>BulkInvoiceItem</code>s with the specified Claim ID, and belonging to the <code>BulkInvoice</code>
   * identified by <code>invoiceID</code>. The results are translated into corresponding
   * <code>BulkInvoiceItemDTO</code>s and returned.
   *
   * @param invoiceID ID of the <code>BulkInvoice</code> to which all the matching <code>BulkInvoiceItem</code>s should
   * belong to.
   * @param claimId ID of the <code>Claim</code> that all the matching <code>BulkInvoiceItem</code>s should reference.
   * @return Array of <code>BulkInvoiceItemDTO</code>s representing the <code>BulkInvoiceItem</code> objects with the
   * given <code>Claim</code> and belonging to the given <code>BulkInvoice</code>. Or an empty array, if no results were
   * found.
   */
  @WsiCheckDuplicateExternalTransaction
  public function getItemsForInvoiceAndClaim(invoiceID : String, claimID : String) : BulkInvoiceItemDTO[] {
    ArgCheck.nonNull(invoiceID, "invoiceID")
    ArgCheck.nonNull(claimID, "claimID")

    var invoiceItemQuery = Query.make(BulkInvoiceItem)

    var invoiceTable = invoiceItemQuery.join(BulkInvoiceItem#BulkInvoice)
    invoiceTable.compare(BulkInvoice#PublicID, Equals, invoiceID)

    var claimInfoTable = invoiceItemQuery.join(BulkInvoiceItem#ClaimInfo)
    claimInfoTable.compare(ClaimInfo#RootPublicID, Equals, claimID)

    return invoiceItemQuery.select().toTypedArray().map( \ item -> assembleBulkInvoiceItemDTO(item))
  }

  /**
   * <br/>
   * Gets all <code>BulkInvoiceItem</code>s with the specified Claim ID and Amount, and belonging to the
   * <code>BulkInvoice</code> identified by <code>invoiceID</code>. The results are translated into corresponding
   * <code>BulkInvoiceItemDTO</code>s and returned.
   *
   * @param invoiceID ID of the <code>BulkInvoice</code> to which all the matching <code>BulkInvoiceItem</code>s should
   * belong to.
   * @param claimId ID of the <code>Claim</code> that all the matching <code>BulkInvoiceItem</code>s should reference.
   * @param amount payment amount that all the matching <code>BulkInvoiceItem</code>s should have.
   * @return Array of <code>BulkInvoiceItemDTO</code>s representing the <code>BulkInvoiceItem</code> objects with the
   * given <code>Claim</code> and amount and belonging to the given <code>BulkInvoice</code>. Or an empty array, if no
   * results were found.
   */
  @WsiCheckDuplicateExternalTransaction
  public function getItemsForInvoiceAndClaimAndAmount(invoiceID : String, claimID : String,
                                                      amount : BigDecimal) : BulkInvoiceItemDTO[] {
    ArgCheck.nonNull(invoiceID, "invoiceID")
    ArgCheck.nonNull(claimID, "claimID")
    ArgCheck.nonNull(amount, "amount")

    var invoiceItemQuery = Query.make(BulkInvoiceItem)
    invoiceItemQuery.compare(BulkInvoiceItem#Amount, Equals, Coercions.makeCurrencyAmountFrom(amount))

    var invoiceTable = invoiceItemQuery.join(BulkInvoiceItem#BulkInvoice)
    invoiceTable.compare(BulkInvoice#PublicID, Equals, invoiceID)

    var claimInfoTable = invoiceItemQuery.join(BulkInvoiceItem#ClaimInfo)
    claimInfoTable.compare(ClaimInfo#RootPublicID, Equals, claimID)

    return invoiceItemQuery.select().toTypedArray().map( \ item -> assembleBulkInvoiceItemDTO(item))
  }

  /**
   * <br/>
   * Creates a new unapproved <code>BulkInvoice</code> with a <code>BulkInvoiceStatus</code> of <code>TC_DRAFT</code>.
   * The <code>BulkInvoiceDTO</code> must have the following mandatory fields set, at the minimum :
   * <ul>
   *  <li><code>Payee</code></li>
   * </ul>
   *
   * Adding <code>BulkInvoiceItems</code> to the <code>BulkInvoice</code> is optional. For doing so, create
   * corresponding <code>BulkInvoiceItemDTO</code>s and add them to the <code>NewInvoiceItems</code> array field on the
   * <code>BulkInvoiceDTO</code>. All the <code>BulkInvoiceItemDTO</code>s should have the following mandatory fields
   * set, at the minimum :
   * <ul>
   *  <li><code>Amount</code> (if the field <code>BulkInvoiceDTO</code>.<code>SplitEqually </code> is set to false)</li>
   *  <li><code>ClaimID</code></li>
   *  <li><code>CostCategory</code></li>
   *  <li><code>CostType</code></li>
   *  <li><code>PaymentType</code></li>
   * </ul>
   * <p/>
   * If the server is configured in multicurrency mode, a market rate will by default be selected for
   * <code>TransToReportingExchangeRate</code>. If you wish to provide your own custom rates, provide appropriate values
   * for the fields <code>NewExchangeRate</code> and <code>NewExchangeRateDescription</code> on the
   * <code>BulkInvoiceDTO</code>.
   *
   * @param bulkInvoiceDTO the <code>BulkInvoiceDTO</code> representing the <code>BulkInvoice</code> to create.
   * @return The PublicID of the committed <code>BulkInvoice</code>.
   */
  @WsiCheckDuplicateExternalTransaction
  public function createBulkInvoice(bulkInvoiceDTO : BulkInvoiceDTO) : String {
    ArgCheck.nonNull(bulkInvoiceDTO, "bulkInvoiceDTO")
    verifyInvoiceCanBeSaved(bulkInvoiceDTO)

    var bulkInvoice : BulkInvoice

    Transaction.runWithNewBundle(\ bundle -> {
      bulkInvoice = assembleBulkInvoice(bulkInvoiceDTO, bundle)

      // Auto-fill some invoice fields
      bulkInvoice.ApprovalStatus = TC_UNAPPROVED
      bulkInvoice.Status = TC_DRAFT
      var payee = bulkInvoice.Payee;
      if (payee != null) {
        var payeeDisplayName = payee.DisplayName

        if (bulkInvoice.PayTo == null) {
          bulkInvoice.PayTo = payeeDisplayName
        }

        if (bulkInvoice.MailTo == null) {
          bulkInvoice.MailTo = payeeDisplayName
        }

        if (bulkInvoice.MailingAddress == null) {
          bulkInvoice.MailingAddress = payee.PrimaryAddress.cloneAddress(bundle)
        }
      }

      if (CurrencyUtil.SingleCurrencyMode and bulkInvoice.Currency != CurrencyUtil.ReportingCurrency) {
        throw new RuntimeException(DisplayKey.get("Java.Financials.API.BulkPay.CreateBI.NonDefaultCurrency", bulkInvoice.Currency))
      }

      var customExchangeRate = bulkInvoiceDTO.CustomExchangeRate
      var customExchangeRateDescription = bulkInvoiceDTO.CustomExchangeRateDescription

      if (customExchangeRate != null) {
        if (CurrencyUtil.SingleCurrencyMode) {
          throw new IllegalArgumentException("Field BulkInvoiceDTO.CustomExchangeRate can only be set when the " +
              "system is configured in multicurrency mode");
        }

        if (customExchangeRateDescription == null ) {
          customExchangeRateDescription = DisplayKey.get("Java.ExchangeRate.CustomRateSet.BulkInvoice.Description", Date.now())
        }

        bulkInvoice.TransToReportingExchangeRate = CurrencyUtil.createCustomExchangeRateWithSet(customExchangeRate,
            customExchangeRateDescription, bulkInvoice.Currency, CurrencyUtil.ReportingCurrency, bundle)
      } else if (StringUtils.isNotEmpty(customExchangeRateDescription)) {
        throw new IllegalArgumentException("Field BulkInvoiceDTO.CustomExchangeRateDescription can only be set if " +
            "field BulkInvoiceDTO.CustomExchangeRate is also set!");
      }

      if (bulkInvoice.SplitEqually) {
        bulkInvoice.recalculateSplitAmounts()
      }
    })

    return bulkInvoice.PublicID
  }

  /**
   *<br/>
   * Adds <code>BulkInvoiceItem</code>s to an existing <code>BulkInvoice</code>. All the <code>BulkInvoiceItemDTO</code>s
   * must have the following mandatory fields set, at the minimum :
   * <ul>
   *  <li><code>Amount</code> (if the field <code>BulkInvoice</code>.<code>SplitEqually </code> is set to false)</li>
   *  <li><code>ClaimID</code></li>
   *  <li><code>CostCategory</code></li>
   *  <li><code>CostType</code></li>
   *  <li><code>PaymentType</code></li>
   * </ul>
   * If even one of the <code>BulkInvoiceItemDTO</code>s has invalid data set on it, this method will fail with an
   * exception and will not add <em>ANY</em> of the items.
   * </p>
   * @param invoiceID ID of the <code>BulkInvoice</code> to which the items need to be added.
   * @param itemDTOsToAdd array of <code>BulkInvoiceItemDTO</code>s to add to the <code>BulkInvoice</code>
   * @return Array of PublicIDs of added <code>BulkInvoiceItem</code>s.
   */
  @Throws(BadIdentifierException, "If the invoiceID doesn't correspond to an existing BulkInvoice.")
  @Throws(IllegalArgumentException, "If the BulkInvoiceItemDTOs array is null or empty.")
  @Throws(RuntimeException, "If the BulkInvoice is not editable.")
  @WsiCheckDuplicateExternalTransaction
  public function addItemsToInvoice(invoiceID: String, itemDTOsToAdd: BulkInvoiceItemDTO[]) : String[] {
    ArgCheck.longerThan(itemDTOsToAdd, 0, "itemDTOsToAdd")

    var addedItems: BulkInvoiceItem[]

    Transaction.runWithNewBundle(\ bundle -> {
      var invoice = fetchByPublicID<BulkInvoice>(invoiceID, bundle)

      if (not invoice.Editable) {
        throw new RuntimeException("Cannot add InvoiceItems to BulkInvoice(" + invoiceID + "), as it is not editable!")
      }

      addedItems = assembleNewBulkInvoiceItems(itemDTOsToAdd, invoice)
    })

    return addedItems*.PublicID
  }

  /**
   * <br/>
   * Updates <code>BulkInvoiceItem</code>s belonging to a <code>BulkInvoice</code>. All <code>BulkInvoiceItem</code>s
   * must belong to the same <code>BulkInvoice</code>, as identified by the <code>invoiceID</code>. If even one of the
   * <code>BulkInvoiceItemDTO</code>s has invalid data set on it, this method will fail with an exception and will not
   * update <em>ANY</em> of the items. All the <code>DTO</code>s must have their mandatory field "<code>PublicID</code>"
   * set, at the minimum.
   *
   * <p>
   * After the update, the status of each element of updatedItems will be set to Draft, and the BulkInvoice will be
   * invalidated.
   * <p>
   * <b>NOTE</b>: It is <em>not</em> required to fully populate the ItemDTO. Any fields that are uninitialized (i.e. set
    * to null) will be ignored by the API and hence will not be updated on to the actual Item. So, for e.g., this is a
    * perfectly valid usage of the API:
   * <pre>
   *   // Assume that there already exists a BulkInvoiceItem with id ITEM_ID, belonging to a BulkInvoice with id
   *   // INVOICE_ID
   *
   *   var updatedItemDTO = new BulkInvoiceItemDTO() {
         :PublicID = ITEM_ID,
         :Amount = newAmount
       }

       bulkInvoiceAPIClient.updateItemsOnInvoice(INVOICE_ID, updatedItemDTO)
   * </pre>
   * The above code will run successfully and will update <em>only</em> the amount field on the existing Item.
   *<p>
   * If you wish to disable this behavior of ignoring null valued fields (and thereby have the ability to update Item
   * fields to null using this API), please refer to the relevant comment mentioned within this method's code. Of
   * course, once you change the behavior, it will be your responsibility thereafter to ensure that the DTOs are fully
   * populated before passing on to this API.
   *
   *
   * @param invoiceID ID of the <code>BulkInvoice</code> to which all the items belong.
   * @param itemDTOsToUpdate array of <code>BulkInvoiceItemDTO</code>s representing the <code>BulkInvoiceItem</code>s to update.
   */
  @Throws(BadIdentifierException, "If the invoiceID doesn't correspond to an existing BulkInvoice.")
  @Throws(RuntimeException, "If the BulkInvoice is not editable.")
  @Throws(RuntimeException, "If any of the BulkInvoiceItemDTOs does not have its PublicID field set.")
  @Throws(BadIdentifierException, "If any of the BulkInvoiceItemDTOs are referring to a non-existent BulkInvoiceItem.")
  @WsiCheckDuplicateExternalTransaction
  public function updateItemsOnInvoice(invoiceID: String, itemDTOsToUpdate: BulkInvoiceItemDTO[]) {
    ArgCheck.longerThan(itemDTOsToUpdate, 0, "itemDTOsToUpdate")

    Transaction.runWithNewBundle(\ bundle -> {
      var invoice = fetchByPublicID<BulkInvoice>(invoiceID, bundle)
      if (not invoice.Editable) {
        throw new RuntimeException("Cannot update InvoiceItems on BulkInvoice(" + invoiceID +
            "), as it is not editable!")
      }

      itemDTOsToUpdate.each( \ itemDTO -> {
        verifyInvoiceItemCanBeUpdated(itemDTO, invoice)

        var itemFromDB = fetchByPublicID<BulkInvoiceItem>(itemDTO.PublicID, bundle)

        if (not itemFromDB.Editable) {
          throw new RuntimeException("Cannot update InvoiceItem (" + invoiceID + "), as it is not editable!")
        }

        if (invoice.SplitEqually and (itemDTO.Amount != null) and (itemDTO.Amount != itemFromDB.Amount)) {
          throw new RuntimeException("Illegal attempt to change the amount of BulkInvoiceItem(" + itemFromDB.PublicID +
              ") from " + itemFromDB.Amount + " to " + itemDTO.Amount + ". This is not allowed, since it's " +
              "associated BulkInvoice is set to distribute amounts evenly."
          )
        }

        // Merge the changes from the DTO, onto the existing InvoiceItem. In the default configuration, this code skips
        // any fields that are set to null on the DTO. If you wish to change this behavior, pass 'false' as the second
        // argument.
        itemDTO.writeTo(itemFromDB)
      })
    })
  }

  /**
  * <p/>
   * Deletes <code>BulkInvoiceItems</code> from their associated <code>BulkInvoice</code>. All of the items should
   * belong to the same <code>BulkInvoice</code>, as identified by the <code>invoiceID</code>. If even one of the
   * <code>BulkInvoiceItem</code> IDs is invalid, this method will fail with an exception and will not delete
   * <em>ANY</em> of the items.
   *
   * @param invoiceID ID of the <code>BulkInvoice</code> from which the items need to be removed.
   * @param invoiceItemIDsToDelete array of IDs of <code>BulkInvoiceItem</code>s to remove.
   */
  @Throws(BadIdentifierException, "If the invoiceID doesn't correspond to an existing BulkInvoice.")
  @Throws(RuntimeException, "If any of the invoice items does not belong to the BulkInvoice having ID invoiceID.")
  @WsiCheckDuplicateExternalTransaction
  public function deleteItemsFromInvoice(invoiceID: String, invoiceItemIDsToDelete: String[]) {
    ArgCheck.longerThan(invoiceItemIDsToDelete, 0, "invoiceItemIDsToDelete")

    Transaction.runWithNewBundle(\ bundle -> {
      var invoice = fetchByPublicID<BulkInvoice>(invoiceID, bundle)

      invoiceItemIDsToDelete.each( \ itemID -> {
        var item  = fetchByPublicID<BulkInvoiceItem>(itemID, bundle)
        if (item.BulkInvoice != invoice) {
          throw new RuntimeException("Cannot remove BulkInvoiceItem \"" + item.PublicID + "\" from BulkInvoice \"" +
              invoiceID + "\", since it belongs to a different BulkInvoice \"" + item.BulkInvoice.PublicID + "\"")
        }

        invoice.removeFromInvoiceItems(item)
      })
    })
  }

  /**
  * <br/>
   * Validates the specified <code>BulkInvoice</code>. If validation was unsuccessful, the validation failure messages
   * (and any other details) are captured into <code>BIValidationAlertDTOs</code> and returned. Else, an empty array
   * is returned.
   * <p/>
   * Note : The validation alerts are also persisted to database, and are always accessible via the
   * <code>ValidationAlerts</code> field on the <code>BulkInvoice</BulkInvoice> and <code>BulkInvoiceDTO</code> objects.
   * They will be cleared only after a successful validation.
   *
   * @param invoiceID ID of the <code>BulkInvoice</code> to validate
   */
  @Throws(BadIdentifierException, "If the invoiceID doesn't correspond to an existing BulkInvoice.")
  @WsiCheckDuplicateExternalTransaction
  public function validateBulkInvoice(invoiceID: String): BIValidationAlertDTO[] {
    var bulkInvoice : BulkInvoice

    Transaction.runWithNewBundle(\ bundle -> {
      bulkInvoice = fetchByPublicID<BulkInvoice>(invoiceID, bundle)
      bulkInvoice.validate()
    })

    return assembleBIValidationAlertDTOs(bulkInvoice)
  }

  /**
   * <br/>
   * Submits the specified <code>BulkInvoice</code> for approval. When the invoice is approved (or if it doesn't need
   * approval, the items that were approved for the invoice are set to a status of <code>TC_APPROVED</code>, and then
   * the approved items are submitted for processing. At this point, the status of the invoice becomes
   * <code>TC_PENDINGITEMVALIDATION</code>. As each item is processed, its check is created or updated and submitted for
   * approval. When the <code>BulkInvoiceWF</code> batch process eventually runs, if all of the checks have been
   * approved, then it moves the invoice to <code>Awaiting submission</code> status, which makes the invoice eligible
   * for escalation.
   * <p/><br/>
   * Note : This API can be used only on <code>BulkInvoices</code> that are currently having a status of :
   * <ul>
   *   <li><code>TC_DRAFT</code></li>
   *   <li><code>TC_REJECTED</code></code></li>
   *   <li><code>TC_ONHOLD</code></code></li>
   *   <li><code>TC_PENDINGITEMVALIDATION</code></code></li>
   * </ul>
   * ,and also need to have at least one <code>BulkInvoiceItem</code> present on them.
   *
   * @param invoiceID ID of the <code>BulkInvoice</code> to submit.
   */
  @Throws(BadIdentifierException, "If the invoiceID doesn't correspond to an existing BulkInvoice.")
  @WsiCheckDuplicateExternalTransaction
  public function submitBulkInvoice(invoiceID : String) {
    Transaction.runWithNewBundle(\ bundle -> {
      fetchByPublicID<BulkInvoice>(invoiceID, bundle).submitForApproval()
    })
  }

  /**
   * <br/>
   * Requests that the specified <code>BulkInvoice</code> be escalated for submission to the downstream system. This is
   * allowed only for <code>BulkInvoices</code> that are currently having a status of <code>TC_AWAITINGSUBMISSION</code>.
   * <p>
   * This API is not expected to be used in normal scenarios, since the system handles escalation automatically using
   * the scheduled <em>bulkinvoicesescalation</em> batch process. You would need to use it only if you want to manually
   * escalate a <code>BulkInvoice</code>, without waiting for the batch process to be run.
   * <p/>
   * If the <code>BulkInvoice</code> has its scheduled send date set to today or earlier, calling
   * <code>requestBulkInvoice()</code> causes the <code>BulkInvoice</code> and its associated checks to move to the
   * <code>BulkInvoiceStatus</code> of <code>TC_REQUESTING</code> and then to <code>TC_REQUESTED</code>. If the
   * scheduled send date is set to a future date, then the invoice is unaffected.
   * </p>
   *
   * @param invoiceID ID of the <code>BulkInvoice</code> to request for submission to the downstream system
   */
  @Throws(BadIdentifierException, "If the invoiceID doesn't correspond to an existing BulkInvoice.")
  @Throws(RuntimeException, "If the invoice is currently not having a status of TC_AWAITINGSUBMISSION.")
  @WsiCheckDuplicateExternalTransaction
  public function requestBulkInvoice(invoiceID : String) {
    Transaction.runWithNewBundle(\ bundle -> {
      var bulkInvoice = fetchByPublicID<BulkInvoice>(invoiceID, bundle)
      // Remove this check once CLM-27508 is implemented.
      if (BulkInvoiceStatus.TC_AWAITINGSUBMISSION != bulkInvoice.Status) {
        throw new RuntimeException(DisplayKey.get("Java.Financials.API.BulkPay.RequestBI.IllegalBIStatus", 
            bulkInvoice.Status.Description))
      }

      bulkInvoice.requestInvoice()
    })
  }

  /**
   * <br/>
   * Sets the status of the <code>BulkInvoice</code> and all its items to <code>TC_PENDINGVOID</code>. Also voids any
   * bulk checks associated with the items.
   * <p/><br/>
   * Note : This API can be used only on <code>BulkInvoices</code> that are currently having a status of :
   * <ul>
   *   <li><code>TC_REQUESTING</code></li>
   *   <li><code>TC_REQUESTED</code></code></li>
   *   <li><code>TC_ISSUED</code></code></li>
   *   <li><code>TC_CLEARED</code></code></li>
   *   <li><code>TC_ONHOLD</code></code></li>
   * </ul>
   *
   * @param invoiceID ID of the <code>BulkInvoice</code> to void.
   */
  @Throws(BadIdentifierException, "If the invoiceID doesn't correspond to an existing BulkInvoice.")
  @Throws(EntityStateException, "If the status of the BulkInvoice does not allow for it to be voided.")
  @WsiCheckDuplicateExternalTransaction
  public function voidBulkInvoice(invoiceID : String) {
    Transaction.runWithNewBundle(\ bundle -> {
      fetchByPublicID<BulkInvoice>(invoiceID, bundle).voidBulkInvoice()
    })
  }

  /**
   * <br/>
   * Sets the status of the <code>BulkInvoice</code> and all its items to <code>TC_PENDINGSTOP</code>. Also stops any
   * bulk checks associated with the items.
   * <p/><br/>
   * Note : This API can be used only on <code>BulkInvoices</code> that are currently having a status of :
   * <ul>
   *   <li><code>TC_REQUESTING</code></li>
   *   <li><code>TC_REQUESTED</code></code></li>
   *   <li><code>TC_ISSUED</code></code></li>
   *   <li><code>TC_ONHOLD</code></code></li>
   * </ul>
   *
   * @param invoiceID ID of the <code>BulkInvoice</code> to stop.
   */
  @Throws(BadIdentifierException, "If the invoiceID doesn't correspond to an existing BulkInvoice.")
  @Throws(EntityStateException, "If the status of the BulkInvoice does not allow for it to be stopped")
  @WsiCheckDuplicateExternalTransaction
  public function stopBulkInvoice(invoiceID : String) {
    Transaction.runWithNewBundle(\ bundle -> {
      fetchByPublicID<BulkInvoice>(invoiceID, bundle).stopBulkInvoice()
    })
  }

  /**
  *  <br/>
   * Sets the status of the <code>BulkInvoice</code> to be <code>TC_ONHOLD</code>.
   * <p/><br/>
   * Note : This API can be used only on <code>BulkInvoices</code> that are currently having a status of :
   * <ul>
   *   <li><code>TC_REQUESTING</code></li>
   *   <li><code>TC_REQUESTED</code></code></li>
   * </ul>
   *
   * @param invoiceID ID of the <code>BulkInvoice</code> to put on hold.
   */
  @Throws(BadIdentifierException, "If the invoiceID doesn't correspond to an existing BulkInvoice.")
  @Throws(EntityStateException, "If the invoice status was not requesting or requested")
  @WsiCheckDuplicateExternalTransaction
  public function placeDownstreamHoldOnInvoice(invoiceID : String) {
    Transaction.runWithNewBundle(\ bundle -> {
      var bulkInvoice = fetchByPublicID<BulkInvoice>(invoiceID, bundle)
      bulkInvoice.placeDownstreamHold()
    })
  }

  /**
   * <br/>
   * Updates the status of the <code>BulkInvoice</code> and/or sets the check number or issue date of the associated
   * bulk check. This method can set the <code>BulkInvoiceStatus</code> to one of the following:
   * <ul>
   *  <li>
   *    TC_ISSUED (Old status should be one of TC_REQUESTING, TC_REQUESTED, TC_PENDINGVOID, TC_PENDINGSTOP, TC_VOIDED
   *    or TC_STOPPED)
   *  </li>
   *  <li>
   *    TC_CLEARED (Old status should be one of TC_REQUESTING, TC_REQUESTED, TC_ISSUED, TC_PENDINGVOID, TC_PENDINGSTOP,
   *    TC_VOIDED or TC_STOPPED)
   *  </li>
   *  <li>
   *    TC_VOIDED (Old status should be one of TC_PENDINGVOID or TC_PENDINGSTOP)
   *  </li>
   *  <li>
   *    TC_STOPPED (Old status should be one of TC_PENDINGVOID or TC_PENDINGSTOP)
   *  </li>
   * </ul>
   *
   * @param invoiceID ID of the <code>BulkInvoice</code> to update.
   * @param checkNumber Check number to update, optional.
   * @param issueDate Date the check was issued, optional.
   * @param status Status to update.
   */
  @Throws(BadIdentifierException, "If the invoiceID doesn't correspond to an existing BulkInvoice.")
  @Throws(EntityStateException, "If the new status is invalid")
  @WsiCheckDuplicateExternalTransaction
  public function updateBulkInvoiceStatus(invoiceID : String, checkNumber : String, issueDate : Date,
                                            status : BulkInvoiceStatus) {
    ArgCheck.nonNull(status, "status")

    Transaction.runWithNewBundle(\ bundle -> {
      var invoice = fetchByPublicID<BulkInvoice>(invoiceID, bundle)
      invoice.updateBulkInvoiceStatus(checkNumber, issueDate, status)
    })
  }

  /**
   * <br/>
   * Creates a <code>Contact</code> in ClaimCenter by importing from and linking it to ContactManager.
   * <p/>
   * <b>Note:</b> Use the <code>PublicID</code> of the new contact as a <code>Payee</code> ID when creating a new
   * <code>BulkInvoice</code> using the API.
   * <pre>
   *      String newPayeeID = bulkInvoiceAPIClient.createContactByLinkID(contactCenterLinkID);
   *      BulkInvoiceDTO biDTO = new BulkInvoiceDTO();
   *      biDTO.setPayeeID(newPayeeID);
   *      [...]
   *      String biID = bulkInvoiceApiClient.createBulkInvoice(biDTO);
   * </pre>
   * @param contactLinkID the linkID of the <code>Contact</code> in ContactManager to link to in ClaimCenter.
   * @return The PublicID of the newly created <code>Contact</code> in ClaimCenter.
   */
  @WsiCheckDuplicateExternalTransaction
  public function createContactByLinkID(contactLinkID : String) : String {
    ArgCheck.nonNull(contactLinkID, "contactLinkID")

    var payee : Contact
    Transaction.runWithNewBundle(\ bundle -> {
      // We pass false as the second arg, to prevent this call from also importing the contacts related to the payee. We
      // don't need these related contacts, since currently we have no mechanism to view/use them for a BI payee.
      payee = ContactSystemUtil.importContactFromContactSystem(bundle, contactLinkID, false)
    })

    return payee.PublicID
  }

  /******************* Internal Methods **********************************/

  //--------------------
  // Assembly methods...
  //--------------------

  internal function assembleBulkInvoice(bulkInvoiceDTO: BulkInvoiceDTO, bundle: Bundle) : BulkInvoice {
    var bulkInvoice = bulkInvoiceDTO.writeToNewEntityIn(bundle)

    assembleNewBulkInvoiceItems(bulkInvoiceDTO.NewInvoiceItems, bulkInvoice)

    return bulkInvoice
  }

  internal function assembleNewBulkInvoiceItems(bulkInvoiceItemDTOs : BulkInvoiceItemDTO[], bulkInvoice : BulkInvoice)
      : BulkInvoiceItem[] {
    return bulkInvoiceItemDTOs.map( \ invoiceItemDTO -> {
      verifyInvoiceItemDTOIsNotNull(invoiceItemDTO)
      verifyInvoiceItemCanBeSaved(invoiceItemDTO, bulkInvoice)

      var invoiceItem = bulkInvoice.addNewInvoiceItem()
      invoiceItemDTO.writeTo(invoiceItem)

      return invoiceItem
    })
  }

  internal function assembleBulkInvoiceDTO(bulkInvoice : BulkInvoice) : BulkInvoiceDTO {
    var bulkInvoiceDTO = BulkInvoiceDTO.valueOf(bulkInvoice)
    bulkInvoiceDTO.ValidationAlerts = assembleBIValidationAlertDTOs(bulkInvoice)

    return bulkInvoiceDTO
  }

  internal function assembleBIValidationAlertDTOs(bulkInvoice: BulkInvoice) : BIValidationAlertDTO[] {
    return bulkInvoice.ValidationAlerts?.map( \ validationAlert -> {
      return BIValidationAlertDTO.valueOf(validationAlert)
    })
  }

  internal function assembleBulkInvoiceItemDTO(bulkInvoiceItem : BulkInvoiceItem) : BulkInvoiceItemDTO {
    var bulkInvoiceItemDTO = BulkInvoiceItemDTO.valueOf(bulkInvoiceItem)

    if (bulkInvoiceItem.BulkInvoiceItemInfo != null) {
      bulkInvoiceItemDTO.BulkInvoiceItemInfo = assembleBulkInvoiceItemInfoDTO(bulkInvoiceItem.BulkInvoiceItemInfo)
    }

    return bulkInvoiceItemDTO
  }

  internal function assembleBulkInvoiceItemInfoDTO(bulkInvoiceItemInfo : BulkInvoiceItemInfo) : BulkInvoiceItemInfoDTO {
    var bulkInvoiceItemInfoDTO = BulkInvoiceItemInfoDTO.valueOf(bulkInvoiceItemInfo)
    bulkInvoiceItemInfoDTO.ReserveLineID = bulkInvoiceItemInfo?.ReserveLineWrapper?.ReserveLine?.PublicID

    return bulkInvoiceItemInfoDTO
  }

  //----------------------
  // Validation methods...
  //----------------------

  internal function verifyInvoiceCanBeSaved(invoiceDTO : BulkInvoiceDTO) {
    var fieldsNotSet = {}

    if (invoiceDTO.Payee == null) {
      fieldsNotSet.add("Payee")
    }

    if (invoiceDTO.SplitEqually != null and invoiceDTO.BulkInvoiceTotal == null) {
      fieldsNotSet.add("BulkInvoiceTotal (since BulkInvoiceDTO.SplitEqually is set to true)")
    }

    if (fieldsNotSet.Count > 0) {
      throw new RuntimeException("BulkInvoice is missing values for the following required fields : " + fieldsNotSet)
    }

    var invoiceStatus = invoiceDTO.Status
    if (invoiceStatus != null and invoiceStatus != TC_DRAFT) {
      throw new RuntimeException("Invalid Status \"" + invoiceStatus + "\" set explicitly on BulkInvoiceDTO." +
          " Status should either be set to \"draft\" or not set at all."
      )
    }
  }

  internal function verifyInvoiceItemCanBeSaved(invoiceItemDTO : BulkInvoiceItemDTO, invoice : BulkInvoice) {
    verifyInvoiceItemDTOIsNotNull(invoiceItemDTO)

    var fieldsNotSet = {}

    if ((not invoice.SplitEqually) and invoiceItemDTO.Amount == null) {
      fieldsNotSet.add("Amount (since BulkInvoiceDTO.SplitEqually is set to false)")
    }

    if (invoiceItemDTO.ClaimPublicID == null) {
      fieldsNotSet.add("ClaimID")
    }

    if (invoiceItemDTO.CostCategory == null) {
      fieldsNotSet.add("CostCategory")
    }

    if (invoiceItemDTO.CostType == null) {
      fieldsNotSet.add("CostType")
    }

    if (invoiceItemDTO.PaymentType == null) {
      fieldsNotSet.add("PaymentType")
    }

    if (fieldsNotSet.Count > 0) {
      throw new RuntimeException("BulkInvoiceItem is missing values for the following required fields : " +
          fieldsNotSet)
    }

    var invoiceItemStatus = invoiceItemDTO.Status
    if (invoiceItemStatus != null and invoiceItemStatus != TC_DRAFT) {
      throw new RuntimeException("Invalid Status \"" + invoiceItemStatus + "\" set explicitly on BulkInvoiceItemDTO." +
          " Status should either be set to \"draft\" or not set at all."
      )
    }

    if (invoice.SplitEqually and invoiceItemDTO.Amount != null) {
      throw new RuntimeException("You cannot set an explicit amount (" + invoiceItemDTO.Amount + ") on the " +
          "BulkInvoiceItemDTO, since it's associated BulkInvoice is set to distribute amounts evenly."
      )
    }
  }

  internal function verifyInvoiceItemCanBeUpdated(invoiceItemDTO : BulkInvoiceItemDTO, invoice : BulkInvoice) {
    verifyInvoiceItemDTOIsNotNull(invoiceItemDTO)

    var fieldsNotSet = {}

    if (invoiceItemDTO.PublicID == null) {
      fieldsNotSet.add("PublicID")
    }

    if (fieldsNotSet.Count > 0) {
      throw new RuntimeException("BulkInvoiceItem is missing values for the following required fields : " +
          fieldsNotSet)
    }

  }

  internal function verifyInvoiceItemDTOIsNotNull(itemDTO : BulkInvoiceItemDTO) {
    if (itemDTO == null) {
      throw new RuntimeException("Null BulkInvoiceItemDTO encountered!")
    }
  }

}