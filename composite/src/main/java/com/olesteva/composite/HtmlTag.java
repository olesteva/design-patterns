package com.olesteva.composite;

import java.util.List;

/**
 * Component interface that will uniformly represent composite and leaf classes to the client.
 * Some methods does not have default implementation, because either composite
 * or leaf doesn't have meaningful implementation.
 */
public interface HtmlTag {

  String OPERATION_NOT_SUPPORTED = "Operation not supported ... ";

  default void addChildTag(HtmlTag childTag) {
    throw new UnsupportedOperationException(OPERATION_NOT_SUPPORTED);
  }

  default List<HtmlTag> getChildren() {
    throw new UnsupportedOperationException(OPERATION_NOT_SUPPORTED);
  }

  default void setTagBody(String tagBody) {
    throw new UnsupportedOperationException(OPERATION_NOT_SUPPORTED);
  }

  /**
   * Both, composite and leaf must implement these methods
   */
  void generateHtml();

  void setStartTag(String startTag);

  void setEndTag(String endTag);
}
