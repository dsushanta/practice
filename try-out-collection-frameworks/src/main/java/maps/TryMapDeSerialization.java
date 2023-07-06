package maps;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TryMapDeSerialization {

    ObjectMapper mapper = new ObjectMapper();

    public void function1(){
        var inputString = "[{\"name\":\"Chandler Bing\",\"age\":31,\"gender\":\"MALE\"},{\"name\":\"Joey Tribbiani\",\"age\":30,\"gender\":\"MALE\"},{\"name\":\"Monika Geller\",\"age\":28,\"gender\":\"FEMALE\"},{\"name\":\"Phoebe Buffay\",\"age\":32,\"gender\":\"FEMALE\"},{\"name\":\"Ross Geller\",\"age\":32,\"gender\":\"MALE\"},{\"name\":\"Rachel Green\",\"age\":29,\"gender\":\"FEMALE\"}]";

        try {
            var deserializedMap = mapper.readValue(inputString, new TypeReference<List<HashMap<String, String>>>() {});
            deserializedMap.stream()
                    .forEach(System.out::println);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
