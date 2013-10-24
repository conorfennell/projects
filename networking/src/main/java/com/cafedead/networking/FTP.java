package com.cafedead.networking;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPListParseEngine;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class FTP
{
    public static void main( String[] args )
    {
        FTPClient ftpClient = new FTPClient();
        FTPClientConfig ftpClientConfig = new FTPClientConfig();

        try {
            ftpClient.connect("127.0.0.1");

            FTPListParseEngine engine = ftpClient.initiateListParsing( "c:/");

            while (engine.hasNext()) {
                FTPFile[] files = engine.getNext(25);  // "page size" you want
                //do whatever you want with these files, display them, etc.
                //expensive FTPFile objects not created until needed.
                for (int i = 0; i < files.length;i++){
                    System.out.println(files[0].getName());
                }

            }


        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
