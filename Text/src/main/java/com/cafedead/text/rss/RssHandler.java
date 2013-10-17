package com.cafedead.text.rss;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class RssHandler extends DefaultHandler {
    private boolean isLink = false;
    private static final String LINK = "link";
    private List<String> links = new ArrayList<String>();

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (isLink) {
            links.add(new String(ch, start, length));
            isLink = false;
        }
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        if (qName == LINK) {
            isLink = true;
        }
    }

    public List<String> getLinks() {
        return links;
    }
}
