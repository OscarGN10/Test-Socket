package com.ogn.socket.servidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.ogn.socket.persona.Persona;

public class Servidor{


	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		int port = 1234;
		
		// establecer conexion
		ServerSocket servidor = new ServerSocket(port);
		Socket cliente = servidor.accept();
		
		// entorno de ejecuccion
		ObjectInputStream entradaDatos = new ObjectInputStream(cliente.getInputStream());
		
		
		// recibir el array de personas
		Persona listaPesonasServer[] = new Persona[5];
		for(int i = 0; i< listaPesonasServer.length; i++) {
			
			Persona datoPersona = (Persona) entradaDatos.readObject();
			
			listaPesonasServer[i] = datoPersona;
		}
		
		// imprimir en pantalla datos recibidos
		for(Persona listPersonas : listaPesonasServer) {
			System.out.println(" "+listPersonas.getNombre()+"\t "+listPersonas.getEdad()
			+"\t"+listPersonas.getEmail());
			
		}
		servidor.close();
		
	}

	
	
	


}
