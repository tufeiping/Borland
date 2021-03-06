//--------------------------------------------------------------------------------------------------
// $Header$
// Copyright (c) 1996-2002 Borland Software Corporation. All Rights Reserved.
//------------------------------------------------------------------------------

package com.borland.dx.text;

/**
 * <P>
*The <CODE>InvalidFormatException</CODE> class is the <CODE>Exception</CODE>
* class generated by format and parser code exceptions. The
* <CODE>InvalidFormatException</CODE> is thrown for low level parsing conflicts,
* for example, entering "A" in a numeric field,  and is generated when an edited
* data value is parsed. This is determined by the
*  {@link com.borland.dx.dataset.Column}
* <CODE>editMask</CODE></A> and  {@link com.borland.dx.dataset.Column}
* <CODE>displayMask</CODE></A> properties of a <CODE>Column</CODE> component.
*
*<P>The <CODE>InvalidFormatException</CODE>
* differs from the <CODE>ValidationException</CODE>
* in that the <CODE>InvalidFormatException</CODE> can only be triggered when editing
* is taking place. The <CODE>ValidationException</CODE> can be triggered whenever
*  an invalid value is set and doesn't depend on (keystroke) editing of data.
*
*
*<!-- JDS start - remove dbswing link and phrase -->
*<P>The <CODE>DataSet</CODE> class has special knowledge about
*  <CODE>ValidationException</CODE> ob
* jects and  automatically  sends them to registered status listeners such as the
*  {@link com.borland.dbswing.JdbStatusLabel} <CODE>JdbStatusLabel</CODE></A>.
*  Consequently, an <CODE>InvalidFormatException</CODE> caused by a parsing error is
*  often turned into a <CODE>ValidationException</CODE>, and the  <CODE>DataSet</CODE>
*  sends it to the status listeners.
*As a result, you typically only deal with the <CODE>ValidationException</CODE> class when editing a field
 */
public class InvalidFormatException extends Exception
{
  int errorOffset;
  /**
   * Constructs an InvalidFormatException object that contains the editing error.
   */
  public InvalidFormatException(String format) {
    super(format);
    //!errorPosition = 0;       // default Java construction zero-initializes
  }

  /**
   * Constructs an InvalidFormatException object that contains the
   * editing error and the offset of the error.
   * @param format String
   * @param errorOffset integer
   */
  public InvalidFormatException(String format, int errorOffset) {
    super(format);
    this.errorOffset = errorOffset;
  }


  /**
   * Returns the cursor position for this error.
   * @return integer
   */
  public int getErrorOffset() {
    return errorOffset;
  }

  /**
   * Throws an InvalidFormatException
   * @param string String
   * @throws InvalidFormatException
   */
  public static final void fire(String string) throws InvalidFormatException {
    throw new InvalidFormatException(string);
  }
}
