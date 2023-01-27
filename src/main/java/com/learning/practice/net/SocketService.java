package com.learning.practice.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

import org.springframework.stereotype.Service;

@Service
public class SocketService {

	public void sendMessage(String msg) throws IOException {
		Socket socket = new Socket("localhost", 8001);

        // Send an HL7 message to the server
        OutputStream os = socket.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write(msg);
        bw.flush();

        // Receive acknowledgement from the server
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String ack = br.readLine();
        System.out.println("Server acknowledged: " + ack);

        // Close the socket
        socket.close();
	}
}
