package demo;

import converters.Converter;
import converters.JsonFormat;
import converters.XmlFormat;
import persons.PersonFisic;
import persons.PersonJuridic;

public class Main {
	
	public static void main(String[] args) {
		Converter jsonFormat = new JsonFormat();
		Converter xmlFormat = new XmlFormat();

		PersonFisic pf = new PersonFisic("Elias", 19, "245677-9");
		PersonJuridic pj = new PersonJuridic("Carla", 20, "5483-2");
		
		System.out.println(jsonFormat.getFormated(pf) );
		System.out.println(jsonFormat.getFormated(pj) );
		System.out.println(xmlFormat.getFormated(pf) );
		System.out.println(xmlFormat.getFormated(pj) );
	}

}
