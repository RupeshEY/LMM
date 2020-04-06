package util.document

@Export
class DocumentInitWrapper {
  private var _init : block(doc : entity.Document) as Init

  public construct(b : block(doc : entity.Document)) {
    _init = b
  }
}