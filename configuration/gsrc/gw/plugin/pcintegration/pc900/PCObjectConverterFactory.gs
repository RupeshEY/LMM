package gw.plugin.pcintegration.pc900

uses gw.api.util.mapping.NameTranslator
uses gw.api.util.mapping.ObjectConverter
uses gw.api.util.mapping.ObjectConverterImpl
uses gw.cc.config.Resources

uses java.lang.RuntimeException
uses java.lang.Throwable

/**
 * Generates instances of ObjectConverter configured to translate from pc to cc and from cc to
 * pc.  The ObjectConverter reflectively walks an object map and translates each object and 
 * field using the NameTranslator, which can be configured with an xml file.
 */
@Export
class PCObjectConverterFactory {
  var _pcToCCTranslator : NameTranslator as readonly PCNameTranslator

  construct() {
    try {
      var pcToCcFile = Resources.PCTOCC_DATAMAPPING_PC900
      _pcToCCTranslator = new PolicyNameTranslatorImpl( pcToCcFile, "wsi.remote.gw.webservice.pc.pc900.entities.types.complex", "entity" )
    } catch( e : Throwable ) {
      throw new RuntimeException( "Can't create PCObjectConverterFactory", e )
    }
  }
 
  function getPCToCC() : ObjectConverter {
    return new ObjectConverterImpl( _pcToCCTranslator, "typekey." )
  }
}
