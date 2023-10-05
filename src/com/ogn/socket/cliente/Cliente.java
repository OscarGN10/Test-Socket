package com.ogn.socket.cliente;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import com.ogn.socket.persona.Persona;

public class Cliente {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		int port = 1234; // debe ser el mismo
		String host = "localhost";
		// establecer conexion
		Socket cliente = new Socket(host,port);
		
		
		
		// entorno de ejecucion datos enviados por el cliente
		ObjectOutputStream salidaDatos = new ObjectOutputStream(cliente.getOutputStream());
		
		// crear un arreglo de objetos a enviar
		Persona listPersonas[] = new Persona[5];
		
		// llebar el arreglo
		listPersonas[0] = new Persona("Oscar", "27", "emailOskar");
		listPersonas[1] = new Persona("Abys", "22", "emailAbys");
		listPersonas[2] = new Persona("Fercho", "27", "emailFercho");
		listPersonas[3] = new Persona("Telesforo", "27", "emailTelesforo");
		listPersonas[4] = new Persona("Anandro", "27", "emailAnandro");
		
		// enviar la lista de personas
		for(Persona objPersonas : listPersonas) {
			salidaDatos.writeObject(objPersonas);
		}
		
		// cerrar conexion de socket
		cliente.close();
		
		
		
		
		
		
		
		
/*		
		try {
			Socket socket = new Socket("192.168.0.6", 9999);
			DataOutputStream datos_enviar = new DataOutputStream(socket.getOutputStream());
			
			// implementar el Scanner o JOptionPane
			datos_enviar.writeUTF("Hola PUTO");
			
			socket.close();
			
	
		}catch(Exception e) {
			System.out.println(e);
		}
*/		
		
		
		
		
	}
}
