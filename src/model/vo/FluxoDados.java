package model.vo;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.Dom4JDriver;
import com.thoughtworks.xstream.io.xml.DomDriver;



public class FluxoDados {
	
	public static void SalvarPassageiro() {
		
		try {
			XStream xStream = new XStream(new DomDriver());
			xStream.alias("Viagens", Viagem.class);
			xStream.aliasField("Viagens", Viagem.class, "Viagem");
			File file = new File("src/passageiro.xml");
			if(!file.exists()) {
				file.createNewFile();
			}else {
				file.delete();
				file.createNewFile();
			}
			PrintWriter write = new PrintWriter(file);
			write.println("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>");
			String dados = xStream.toXML(BaseDadosPassageiro.getPassageiros());
			write.println(dados);
			write.flush();
			write.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void SalvarViagem() {
		
		try {
			XStream xStream = new XStream(new DomDriver());
			File file = new File("src/viagem.xml");
			if(!file.exists()) {
				file.createNewFile();
			}else {
				file.delete();
				file.createNewFile();
			}
			PrintWriter write = new PrintWriter(file);
			write.println("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>");
			String dados = xStream.toXML(BaseDadosPassageiro.getPassageiros());
			write.println(dados);
			write.flush();
			write.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void SalvarMotorista() {
		
		try {
			XStream xStream = new XStream(new DomDriver());
			File file = new File("src/motorista.xml");
			if(!file.exists()) {
				file.createNewFile();
			}else {
				file.delete();
				file.createNewFile();
			}
			PrintWriter write = new PrintWriter(file);
			write.println("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>");
			String dados = xStream.toXML(BaseDadosPassageiro.getPassageiros());
			write.println(dados);
			write.flush();
			write.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void LerDadosPassageiro() {
		XStream xStream = new XStream(new DomDriver());
		File file = new File("src/passageiro.xml");
		
		if(file.exists()) {
			BaseDadosPassageiro.setPassageiros((ArrayList<Passageiro>) xStream.fromXML(file));
			
		}else {
			BaseDadosPassageiro.setPassageiros(new ArrayList<>());
			
		}
		
	}
	public static void LerDadosViagem() {
		XStream xStream = new XStream(new DomDriver());
		File file = new File("src/viagem.xml");
		
		if(file.exists()) {
			BaseDadosViagem.setViagens(((ArrayList<Viagem>) xStream.fromXML(file)));
			
		}else {
			BaseDadosViagem.setViagens(new ArrayList<>());
			
		}
		
	}
	public static void LerDadosMotorista() {
		XStream xStream = new XStream(new DomDriver());
		File file = new File("src/viagem.xml");
		
		if(file.exists()) {
			BaseDadosMotorista.setMotoristas((((ArrayList<Motorista>) xStream.fromXML(file))));
			
		}else {
			BaseDadosMotorista.setMotoristas(new ArrayList<>());
			
		}
		
	}
}
