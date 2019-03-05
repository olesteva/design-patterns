package com.olesteva.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite implementation of component. Doesn't have body, but has children.
 */
public class HtmlParentTag implements HtmlTag {

  private String startTag;
  private String endTag;
  private List<HtmlTag> children = new ArrayList<>();

  @Override
  public void addChildTag(HtmlTag childTag) {
    children.add(childTag);
  }

  @Override
  public List<HtmlTag> getChildren() {
    return children;
  }

  @Override
  public void generateHtml() {
    System.out.println(startTag);
    children.forEach(HtmlTag::generateHtml);
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
