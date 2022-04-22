package org.howard.edu.lsp.finalExam;

import java.util.HashMap;


public class NullMapException extends Exception {

	 public static void exception(HashMap<String, String> map1, HashMap<String, String> map2) {
		if (map1.containsValue(null) || map2.containsValue(null))
		{
			throw new RuntimeException("One or both maps are null");
		}
	}
}
