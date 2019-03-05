package com.olesteva.composite;

/**
 * Leaf implementation of component. Doesn't have children, but has body.
 */
public class HtmlElement implements HtmlTag {

  private String startTag;
  private String endTag;
  private String tagBody;

  @Override
  public void setTagBody(String tagBody) {
    this.tagBody = tagBody;
  }

  @Override
  public void generateHtml() {
    System.out.println(startTag);
    System.out.println(tagBody);
    System.out.println(endTag);
  }

  @Override
  public void setStartTag(String startTag) {
    this.startTag = startTag;
  }

  @Override
  public void setEndTag(String endTag) {
    this.endTag = endTag;
  }
}
