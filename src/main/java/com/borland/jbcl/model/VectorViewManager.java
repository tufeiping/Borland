/**
 * Copyright (c) 1996-2004 Borland Software Corp. All Rights Reserved.
 *
 * This SOURCE CODE FILE, which has been provided by Borland as part
 * of a Borland product for use ONLY by licensed users of the product,
 * includes CONFIDENTIAL and PROPRIETARY information of Borland.
 *
 * USE OF THIS SOFTWARE IS GOVERNED BY THE TERMS AND CONDITIONS
 * OF THE LICENSE STATEMENT AND LIMITED WARRANTY FURNISHED WITH
 * THE PRODUCT.
 *
 * IN PARTICULAR, YOU WILL INDEMNIFY AND HOLD BORLAND, ITS RELATED
 * COMPANIES AND ITS SUPPLIERS, HARMLESS FROM AND AGAINST ANY
 * CLAIMS OR LIABILITIES ARISING OUT OF THE USE, REPRODUCTION, OR
 * DISTRIBUTION OF YOUR PROGRAMS, INCLUDING ANY CLAIMS OR LIABILITIES
 * ARISING OUT OF OR RESULTING FROM THE USE, MODIFICATION, OR
 * DISTRIBUTION OF PROGRAMS OR FILES CREATED FROM, BASED ON, AND/OR
 * DERIVED FROM THIS SOURCE CODE FILE.
 */
//--------------------------------------------------------------------------------------------------
// Copyright (c) 1996 - 2004 Borland Software Corporation. All Rights Reserved.
//--------------------------------------------------------------------------------------------------
package com.borland.jbcl.model;

/**
 * Broker of ItemPainters and ItemEditors to views of vector data structures.
 */
public interface VectorViewManager
{
  /**
   * Returns at ItemPainter object for the specified index and data value.
   * Implementing classes can optionally switch off of any (all/some/none) of the
   * passed values to select the appropriate ItemPainter.
   * @param index The item index to be painted.
   * @param data The data object to be painted.
   * @param state The current state information for the item.
   * @return The selected ItemPainter.
   */
  public ItemPainter getPainter(int index, Object data, int state);

  /**
   * Returns at ItemEditor object for the specified index and data value.
   * Implementing classes can optionally switch off of any (all/some/none) of the
   * passed values to select the appropriate ItemEditor.
   * @param index The item index to be edited.
   * @param data The data object to be edited.
   * @param state The current state information for the item.
   * @return The selected ItemEditor.
   */
  public ItemEditor getEditor(int index, Object data, int state);
}
