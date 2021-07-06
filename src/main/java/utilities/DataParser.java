package utilities;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

public class DataParser {
	
	
/**
 * Returns a List of the given json.
 * */
	public static <T> List<T> parseJson(String json, Class<?> clazz){
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
		//mapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);

		try {
			CollectionType listType = mapper.getTypeFactory().constructCollectionType(List.class, clazz);
			
			List<T> returnList = mapper.readValue(json, listType);
			return returnList;
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public static <T> String parseObject(Object [] list) {
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			return mapper.writeValueAsString(list);
		} catch (Exception e) {
			return null;
		}
		
	}
	
}
