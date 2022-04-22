package org.howard.edu.lsp.finalExam;

import java.util.HashMap;
import java.util.Map;

public class MapUtilities {
	public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) throws NullMapException
	{
		int common = 0;
		
		if (map1.size() > map2.size()) {
			for (Map.Entry<String,String> entry : map1.entrySet()) {
				for (Map.Entry<String,String> entry2 : map2.entrySet()) {
					if (entry.getKey() == entry2.getKey()) {
						if (entry.getValue() == entry2.getValue()) {
							common += 1;
						}
					}
				}
			}
		}
		else if (map1.size() < map2.size())
		{
			for (Map.Entry<String,String> entry : map2.entrySet()) {
				for (Map.Entry<String,String> entry2 : map1.entrySet()) {
					if (entry.getKey() == entry2.getKey()) {
						if (entry.getValue() == entry2.getValue()) {
							common += 1;
						}
					}
				}
			}
		}
		else if (map1.size() == map2.size())
		{
			for (Map.Entry<String,String> entry : map1.entrySet()) {
				for (Map.Entry<String,String> entry2 : map2.entrySet()) {
					if (entry.getKey() == entry2.getKey()) {
						if (entry.getValue() == entry2.getValue()) {
							common += 1;
						}
					}
				}
			}
		}
		else if (map1.size() == 0 || map2.size() == 0)
		{
			common = 0;
		}
		else if (map1.containsValue(null) || map2.containsValue(null))
		{
			throw new NullMapException();
		}
		
		return common;
	}
}
