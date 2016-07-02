package com.levo.h.mutable_map_keys;

import java.util.HashMap;
import java.util.Map;

public class MutableHashMapKeys {
	
	public static void main(String[] args) {
		final Map<MutableString, String> brokenMap = new HashMap<>();
		
		final String value = "abc";
		
		final MutableString key = new MutableString(value);
		brokenMap.put(key, "deger");
		
		System.out.println(brokenMap.get(key));
		System.out.println(brokenMap);
		
		key.set("def");
		
		System.out.println(brokenMap.get(key));
		System.out.println(brokenMap);
	}
	
}
