package no.hvl.dat110.messaging;

import java.util.Arrays;

import no.hvl.dat110.TODO;

public class Message {

	private byte[] payload;

	public Message(byte[] payload) {
		 // TODO: check for length within boundary
		if (payload.length < 128) {
			this.payload = payload;
		}
	}

	public Message() {
		super();
	}

	public byte[] getData() {
		return this.payload; 
	}

	public byte[] encapsulate() {
		
		byte[] encoded = new byte[128];
		encoded[0] = (byte) payload.length; 
		for(int i = 0; i<payload.length; i++) {
			encoded[i+1] = payload[i]; 
		}
		
		
		// TODO
		// encapulate/encode the payload of this message in the
		// encoded byte array according to message format
		

		return encoded;
		
	}

	public void decapsulate(byte[] received) {

		// TODO
		// decapsulate the data contained in the received byte array and store it 
		// in the payload of this message
		 
		int lengde = (int) received[0]; 
		byte[] decoded = new byte[lengde]; 
		for(int i = 0; i<lengde; i++) {
			decoded[i] = received[i+1]; 
		}
		payload = decoded; 
		
	}
}
