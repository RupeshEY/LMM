package gw.acc.iplm.xmlmapper.repositoryoperation.imrupload

uses com.guidewire.pl.system.dependency.PLDependencies

class RepositoryUploadFileId {

  /**
   * Repository Upload Requests require the file name to include the extension.
   * Pass this function a Document entity and it will return the file name including an appropriate extension
   */
  public static function generate(document: Document): String {
    return document.Name + getExtensionFromMimeType(document.MimeType)
  }

  /**
   * Get's the file extension from the MimeType string,
   * including the initial ".".
   * <p>
   * For example: ".mp3", ".jpeg", ".pdf"
   *
   * @param mimeType
   * @return String Extension for a file.
   */
  private static function getExtensionFromMimeType(mimeType: String): String {
    return PLDependencies.MimeTypeManager.getFileExtension(mimeType)
  }

}