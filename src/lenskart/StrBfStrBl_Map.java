package lenskart;

import java.util.HashMap;
import java.util.Map;

public class StrBfStrBl_Map {
	public static void main(String[] args) {
		Map<String, String> strMap = new HashMap<String, String>();
		Map<StringBuilder, String> strBlrMap = new HashMap<StringBuilder, String>();
		Map<StringBuffer, String> strBfrMap = new HashMap<StringBuffer, String>();
		
		String str = "abc";
		strMap.put(str, "ABC");
		
		str += "DEF";
		
		StringBuilder strBlr = new StringBuilder("STRING");
		strBlrMap.put(strBlr, "STRING");
		
		strBlr.append("BUILDER");
		
		StringBuffer strBfr = new StringBuffer("STRING");
		strBfrMap.put(strBfr, "STRING");
		
		strBfr.append("BUFFER");
		
		System.out.println(strMap.get(str));
		System.out.println(strBlrMap.get(strBlr));
		System.out.println(strBfrMap.get(strBfr));
		
	}
}
