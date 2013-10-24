package com.cafedead.networking;


import org.apache.commons.net.whois.WhoisClient;

import java.io.IOException;

public class Whois {

    private static final String query = "www.google.com";

    public static void main(String[] args) throws IOException {
        WhoisClient whois = new WhoisClient();

        whois.connect(WhoisClient.DEFAULT_HOST);
        System.out.println(whois.query(query));
        whois.disconnect();
    }
}
