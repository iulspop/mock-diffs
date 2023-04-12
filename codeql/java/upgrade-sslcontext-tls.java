package com.example;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;

public class SecureSocketManager {

    public SSLSocket createSSLSocket(String host, int port) throws IOException {
        SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
        SSLSocket sslSocket = (SSLSocket) factory.createSocket(host, port);
        sslSocket.setEnabledProtocols(new String[] { "TLSv1.1" });

        return sslSocket;
    }

    // Other methods related to the SSL socket management
}
