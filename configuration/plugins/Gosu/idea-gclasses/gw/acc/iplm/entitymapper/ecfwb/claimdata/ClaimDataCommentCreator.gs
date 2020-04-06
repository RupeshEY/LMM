package gw.acc.iplm.entitymapper.ecfwb.claimdata

uses gw.acc.iplm.dto.ClaimMessageDTO
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry

class ClaimDataCommentCreator {

  private final var _messageClaimData: ECFMessageClaimData_Ext
  private final var _claimMessageDTO: ClaimMessageDTO

  public construct(final messageClaimData: ECFMessageClaimData_Ext,
                   final claimMessageDTO: ClaimMessageDTO) {
    _messageClaimData = messageClaimData
    _claimMessageDTO = claimMessageDTO
  }

  public function createComments() {
    var claimNotifyRq = _claimMessageDTO.ClaimNotifyEventRq
    var claimRetrieveRs = _claimMessageDTO.ClaimRetrieveRs

    if(claimNotifyRq!=null) {
      var cnClaimEntry = claimNotifyRq.ClaimMovement.Extension.ClaimEntry
      createCNComments(cnClaimEntry)
    }

    if(claimRetrieveRs!=null){
      var crClaimEntry = claimRetrieveRs.ClaimMovement.Extension.ClaimEntry
      createCRComments(crClaimEntry)
    }
  }

  private function createCRComments(crClaimEntry: RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry): void {
    final var xmlComments = crClaimEntry.Comments

    xmlComments.Broker?.each(\xmlComment -> {
      final var comment = new ECFMessageBrokerComment_Ext()
      comment.LineNumber = xmlComment.LineNumber?.intValue()
      comment.Detail = xmlComment.CommentDetails
      comment.ECFMessage = _messageClaimData
    })
    xmlComments.PublicComments.Comment?.each(\xmlComment -> {
      final var comment = new ECFMessagePublicComment_Ext()
      comment.LineNumber = xmlComment.LineNumber?.intValue()
      comment.Detail = xmlComment.CommentDetails
      comment.ECFMessage = _messageClaimData
    })
    xmlComments.PrivateComments.Comment?.each(\xmlComment -> {
      final var comment = new ECFMessagePrivateComment_Ext()
      comment.LineNumber = xmlComment.LineNumber?.intValue()
      comment.Detail = xmlComment.CommentDetails
      comment.ECFMessage = _messageClaimData
    })
    xmlComments.SlipLead?.each(\xmlComment -> {
      final var comment = new ECFMessageSlipLeadComment_Ext()
      comment.LineNumber = xmlComment.LineNumber?.intValue()
      comment.Detail = xmlComment.CommentDetails
      comment.ECFMessage = _messageClaimData
    })
    xmlComments.CrossMarketComments?.each(\xmlCrossMarketComment -> {
      xmlCrossMarketComment.Bureau?.each(\xmlBureau -> {
        xmlBureau.Claim?.each(\xmlClaim -> {
          xmlClaim.Syndicate?.each(\xmlSyndicate -> {
            xmlSyndicate.Comment?.each(\xmlComment -> {
              final var comment = xmlCrossMarketComment.PrivateCommentIndicator.Value?.toUpperCase() == "N" ?
                  new ECFMessageCrossMarketPublicComment_Ext() : new ECFMessageCrossMarketPrivateComment_Ext()
              comment.BureauAgency = ECFBureauType_Ext.get(xmlBureau.Agency)
              comment.SyndicateName = xmlSyndicate.Name
              comment.LineNumber = xmlComment.LineNumber?.intValue()
              comment.Detail = xmlComment.CommentDetails
              comment.ECFMessage = _messageClaimData
            })
          })
        })
      })
    })
    crClaimEntry.AggregateDetails?.each(\xmlComment -> {
      final var comment = new ECFMessageAggregateDetail_Ext()
      comment.LineNumber = xmlComment.DescriptionLineNo?.intValue()
      comment.Detail = xmlComment.Description
      comment.ECFMessage = _messageClaimData
    })
  }

  private function createCNComments(cnClaimEntry: ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry): void {
    final var xmlComments = cnClaimEntry.Comments
    xmlComments.Broker?.each(\xmlComment -> {
      final var comment = new ECFMessageBrokerComment_Ext()
      comment.LineNumber = xmlComment.LineNumber?.intValue()
      comment.Detail = xmlComment.CommentDetails
      comment.ECFMessage = _messageClaimData
    })
    xmlComments.PublicComments.Comment?.each(\xmlComment -> {
      final var comment = new ECFMessagePublicComment_Ext()
      comment.LineNumber = xmlComment.LineNumber?.intValue()
      comment.Detail = xmlComment.CommentDetails
      comment.ECFMessage = _messageClaimData
    })
    xmlComments.PrivateComments.Comment?.each(\xmlComment -> {
      final var comment = new ECFMessagePrivateComment_Ext()
      comment.LineNumber = xmlComment.LineNumber?.intValue()
      comment.Detail = xmlComment.CommentDetails
      comment.ECFMessage = _messageClaimData
    })
    xmlComments.SlipLead?.each(\xmlComment -> {
      final var comment = new ECFMessageSlipLeadComment_Ext()
      comment.LineNumber = xmlComment.LineNumber?.intValue()
      comment.Detail = xmlComment.CommentDetails
      comment.ECFMessage = _messageClaimData
    })
    xmlComments.CrossMarketComments?.each(\xmlCrossMarketComment -> {
      xmlCrossMarketComment.Bureau?.each(\xmlBureau -> {
        xmlBureau.Claim?.each(\xmlClaim -> {
          xmlClaim.Syndicate?.each(\xmlSyndicate -> {
            xmlSyndicate.Comment?.each(\xmlComment -> {
              final var comment = xmlCrossMarketComment.PrivateCommentIndicator.Value?.toUpperCase() == "N" ?
                  new ECFMessageCrossMarketPublicComment_Ext() : new ECFMessageCrossMarketPrivateComment_Ext()
              comment.BureauAgency = ECFBureauType_Ext.get(xmlBureau.Agency)
              comment.SyndicateName = xmlSyndicate.Name
              comment.LineNumber = xmlComment.LineNumber?.intValue()
              comment.Detail = xmlComment.CommentDetails
              comment.ECFMessage = _messageClaimData
            })
          })
        })
      })
    })
    cnClaimEntry.AggregateDetails?.each(\xmlComment -> {
      final var comment = new ECFMessageAggregateDetail_Ext()
      comment.LineNumber = xmlComment.DescriptionLineNo?.intValue()
      comment.Detail = xmlComment.Description
      comment.ECFMessage = _messageClaimData
    })
  }
}