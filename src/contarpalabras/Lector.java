package contarpalabras;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Lector {

	
String linea;
TreeMap<String, Integer> palabrasMapa = new TreeMap<>();
List<String> palabras = new ArrayList<>();
char[] caracteres;
int counter = 0;
String palabraComparable = "";

	
	public void leer(String nombre) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(nombre));
	

			Scanner sc = new Scanner(new FileInputStream(nombre));
			while(sc.hasNext()) {
				linea = sc.next();
				palabras.add(linea);
			}
			
		
				for(String s : palabras) {
				for(String t : palabras) {
				palabraComparable = s;
				if(palabraComparable.equals(t)){
					counter++;
				}
			}
			if(!palabrasMapa.containsKey(s)) {
				palabrasMapa.put(s, counter);}
			counter = 0;
			
				
	
			
			

}	System.out.println("Palabra......Ocurrencias");
			for(Entry e : palabrasMapa.entrySet()) {
				System.out.println(e);
			
			}
			int min = 999999999;
			int max = 0;
			String palabraMin = "";
			String palabraMax = "";
			for(int i : palabrasMapa.values()) {
				
				if(max < i) {
					max = i;
				}
			}
			for(Entry e : palabrasMapa.entrySet()) {
				if(e.getValue() == (Integer)max) {
					palabraMax = (String) e.getKey();
				}
			}
			
			System.out.println("Palabra con más ocurrencias: " + palabraMax + "......" + "Ocurrencias: " + max);
			
			
			for(int i : palabrasMapa.values()) {
				if(min > i) {
					min = i;
				}
			}
			for(Entry e : palabrasMapa.entrySet()) {
				if(e.getValue() ==(Integer)min) {
					palabraMin = (String) e.getKey();
				}
			}
			
			System.out.println("Palabra con menos ocurrencias: " + palabraMin + "......" + "Ocurrencias: " + min);
	}

}
