package gw.acc.iplm.testutils

uses java.io.File
uses java.nio.charset.StandardCharsets
uses java.nio.file.Files
uses java.nio.file.Paths

class SampleFileReader {

  /**
   * A simple function for reading a file.
   * As this is to be used in a testing environment, exceptions
   * are thrown rather than handled.
   *
   * @param sampleFilePath The Path to the sample file.
   * @return {String} The contents of the file.
   * @throws {Exception} Any exception caught will be thrown.
   */
  public static function readFile(sampleFilePath: String): String {
    return readFile(new File(sampleFilePath))
  }

  /**
   * A simple function for reading a file.
   * As this is to be used in a testing environment, exceptions
   * are thrown rather than handled.
   *
   * @param sampleFile
   * @return {String} The contents of the file.
   * @throws {Exception} Any exception caught will be thrown.
   */
  public static function readFile(sampleFile: File): String {
    var path = Paths.get(sampleFile.Parent, {sampleFile.Name})
    var fileByteArray = Files.readAllBytes(path)
    var fileContents = new String(fileByteArray, StandardCharsets.UTF_8)
    return fileContents
  }
}