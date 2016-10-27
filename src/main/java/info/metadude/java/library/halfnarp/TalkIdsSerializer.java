package info.metadude.java.library.halfnarp;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import info.metadude.java.library.halfnarp.model.TalkIds;

import java.io.IOException;

public class TalkIdsSerializer extends JsonSerializer<TalkIds> {

    /**
     * Serializes a TalkIds object into the following JSON string:
     * Example: { "talk_ids" : [ 5931, 5930 ] }
     */
    @Override
    public void serialize(TalkIds talkIds, JsonGenerator jsonGenerator, SerializerProvider provider)
            throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeArrayFieldStart(TalkIds.API_DICTIONARY_KEY);
        for (Integer talkId : talkIds.getSortedTalkIds()) {
            jsonGenerator.writeNumber(talkId);
        }
        jsonGenerator.writeEndArray();
        jsonGenerator.writeEndObject();
    }

}
