package org.suraj;

import java.util.LinkedList;
import java.util.List;

class Generics<K,V>{
	private K key;
	private V value;
	
	public Generics(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Generics [key=" + key + ", value=" + value + "]";
	}
	
	
}

public class Main {

	public static void main(String[] args) {
	
		List<Generics<Integer, String>> countries = new LinkedList<>();
		countries.add(new Generics(1, "Suraj"));
		countries.add(new Generics(2, "Raja"));
		countries.add(new Generics(3, "Sachin"));
		countries.add(new Generics(4, "Arjun"));
		countries.add(new Generics(5, "Heello"));
		countries.add(new Generics(6, "Heloo"));

		Main main = new Main();
		
		main.display(countries);
	}
	
	public void display (List<Generics<Integer, String>> list) {

		for(Generics<Integer, String> listGenerics : list) {
			System.out.println(listGenerics.getKey() + " " + listGenerics.getValue());
		}
		
	}

}
