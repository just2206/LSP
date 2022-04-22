package org.howard.edu.lsp.finalExam;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.HashMap;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class MapUtilitiesTest {
	
	@Test
	@DisplayName("MapUtilies.commonKeyValuePairs() test cases")
	public void commonKeyValuePairs() throws NullMapException {
	HashMap<String, String> map1 = new HashMap<String, String>();
	HashMap<String, String> map2 = new HashMap<String, String>();
	HashMap<String, String> map3 = null;
	HashMap<String, String> map4 = new HashMap<String, String>();
	HashMap<String, String> map5 = new HashMap<String, String>();
	HashMap<String, String> map6 = new HashMap<String, String>();

	
	map1.put("Alice", "Fine");
    map1.put("Justin", "Happy");
    map1.put("Mary", "Sick");
    map1.put("Jordan", "Sad");
    
    map2.put("Alice", "Fine");
    map2.put("Justin", "Happy");
    map2.put("Mary", "Sick");
    map2.put("Jordan", "Sad");
    
    map5.put("Alice", "Fine");
    map5.put("Taylor", "Happy");
    map5.put("Mary", "Sick");
    
    map6.put("Alice", "Fine");
    map6.put("Justin", "Happy");
    map6.put("Mary", "Sick");
    map6.put("Jordan", "Sad");
    map6.put("Alex", "Angry");
    
    assertEquals(4, MapUtilities.commonKeyValuePairs(map1, map2));
    assertEquals(0, MapUtilities.commonKeyValuePairs(map1, map4));
    assertEquals(2, MapUtilities.commonKeyValuePairs(map1, map5));
    assertEquals(4, MapUtilities.commonKeyValuePairs(map6, map2));
	}

    
    
}
