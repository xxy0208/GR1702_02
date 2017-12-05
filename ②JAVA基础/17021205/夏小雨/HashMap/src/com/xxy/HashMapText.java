package com.xxy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapText {

	public static  void main(String[] args) {
		HashMap<Country, String> hashMap = new HashMap<Country, String>();

		Country china = new Country("china", 15);
		Country india = new Country("india", 14);
		Country japan = new Country("japan", 2);
		
		hashMap.put(china, "Biejing");
		hashMap.put(india, "Delhi");
		hashMap.put(japan, "Tokyo");
		/*
		String string = hashMap.get(china);
		System.out.println(string);
		String string2 = hashMap.remove(japan);
		System.out.println(string2);
		String string3 = hashMap.remove(india);
		System.out.println(string3);
		*/
		Iterator<Entry<Country, String>> iterator = hashMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Country, String> entry = iterator.next();
			Country key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+""+value);
		}
	}

}
