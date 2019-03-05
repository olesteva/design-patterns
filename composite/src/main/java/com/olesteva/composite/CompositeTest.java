package com.olesteva.composite;

public class CompositeTest {

  public static void main(String[] args) {

    HtmlTag paragraph = new HtmlElement();
    paragraph.setStartTag("<p>");
    paragraph.setEndTag("</p>");
    paragraph.setTagBody("This is test paragraph ... ");

    HtmlTag paragraph2 = new HtmlElement();
    paragraph2.setStartTag("<p>");
    paragraph2.setEndTag("</p>");
    paragraph2.setTagBody("This is second test paragraph ... ");


    HtmlTag html = new HtmlParentTag();
    html.setStartTag("<html>");
    html.setEndTag("</html>");
    html.addChildTag(paragraph);
    html.addChildTag(paragraph2);

    html.generateHtml();

  }
}
