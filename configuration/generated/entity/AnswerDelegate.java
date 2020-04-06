package entity;

/**
 * AnswerDelegate
 * 
 *       Text, Logical and Numeric Answers supplied in a specific Question Set.
 *       Question Sets are groupings of questions utilized in the risk qualification process
 *       or to develop supplemental underwriting information. Specific to PolicyCenter
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AnswerDelegate.eti;AnswerDelegate.eix;AnswerDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface AnswerDelegate extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.AnswerDelegate> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.AnswerDelegate>("entity.AnswerDelegate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BOOLEANANSWER_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("BooleanAnswer", "BooleanAnswer");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CHOICEANSWER_DYNPROP = new com.guidewire.commons.metadata.types.LinkDynPropertyInfo("ChoiceAnswer", "ChoiceAnswerID");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DATEANSWER_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("DateAnswer", "DateAnswer");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INTEGERANSWER_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("IntegerAnswer", "IntegerAnswer");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> QUESTION_DYNPROP = new com.guidewire.commons.metadata.types.LinkDynPropertyInfo("Question", "QuestionID");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TEXTANSWER_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("TextAnswer", "TextAnswer");
  
  /**
   * Gets the value of the ChoiceAnswer field.
   * Choice of the answer.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.QuestionChoice getChoiceAnswer();
  
  
  /**
   * Gets the value of the DateAnswer field.
   * The answer in date form.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateAnswer();
  
  
  /**
   * Gets the value of the IntegerAnswer field.
   * Numeric component of answer.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getIntegerAnswer();
  
  
  /**
   * Gets the value of the Question field.
   * Question that this answer answers
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Question getQuestion();
  
  
  /**
   * Gets the value of the TextAnswer field.
   * Either the answer's text.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTextAnswer();
  
  
  /**
   * Gets the generic answer value.  Which field gets retrieved depends
   * on the question type.
   */
  public java.lang.Object getValue();
  
  
  /**
   * Gets the value of the BooleanAnswer field.
   * Yes / no component of answer.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isBooleanAnswer();
  
  
  /**
   * Sets the value of the BooleanAnswer field.
   */
  public void setBooleanAnswer(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ChoiceAnswer field.
   */
  public void setChoiceAnswer(entity.QuestionChoice value);
  
  
  /**
   * Sets the value of the DateAnswer field.
   */
  public void setDateAnswer(java.util.Date value);
  
  
  /**
   * Sets the value of the IntegerAnswer field.
   */
  public void setIntegerAnswer(java.lang.Integer value);
  
  
  /**
   * Sets the value of the Question field.
   */
  public void setQuestion(entity.Question value);
  
  
  /**
   * Sets the value of the TextAnswer field.
   */
  public void setTextAnswer(java.lang.String value);
  
  
  /**
   * Sets the generic answer value.  Which field gets set depends
   * on the question type.
   * @param value 
   */
  public void setValue(java.lang.Object value);
  
  
  
}