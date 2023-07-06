package maps;

/*public class CharacterSerializer extends JsonSerializer<Character> {

    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public void serialize(Character character, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        StringWriter writer = new StringWriter();
        mapper.writerWithDefaultPrettyPrinter()
                .writeValue(writer, character);
        jsonGenerator.writeFieldName(writer.toString());
    }
}*/
