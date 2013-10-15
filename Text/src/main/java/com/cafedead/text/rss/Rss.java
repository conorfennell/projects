package com.cafedead.text.rss;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class Rss {

    public static final String RSS_LINK = "http://www.feedforall.com/sample.xml" ;

    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        HttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(RSS_LINK);

        HttpResponse x  = httpClient.execute(httpGet);

        EntityUtils.toString(x.getEntity());

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();

    }

}
