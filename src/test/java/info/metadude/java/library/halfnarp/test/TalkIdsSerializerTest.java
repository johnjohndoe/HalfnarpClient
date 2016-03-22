package info.metadude.java.library.halfnarp.test;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import info.metadude.java.library.halfnarp.TalkIdsSerializer;
import info.metadude.java.library.halfnarp.model.TalkIds;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TalkIdsSerializerTest {

    protected final ArrayList<Integer> TALK_IDS = new ArrayList<>(Arrays.asList(5931, 5930));

    protected final static String EXPECTED_TALK_IDS_JSON = "{\"talk_ids\":[5931,5930]}";

    protected TalkIdsSerializer talkIdsSerializer;

    @Before
    public void setup() throws IOException {
        talkIdsSerializer = new TalkIdsSerializer();
    }

    @Test
    public void testSerialize() throws IOException {
        String jsonizedTalkIds = getSerializedTalkIds(talkIdsSerializer, TALK_IDS);
        // Expect talk IDs as JSON
        assertThat(jsonizedTalkIds)
                .isNotNull()
                .isNotEmpty()
                .isEqualTo(EXPECTED_TALK_IDS_JSON);
    }

    private static String getSerializedTalkIds(TalkIdsSerializer talkIdsSerializer, List<Integer> talkIdList)
            throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonGenerator jsonGenerator = new JsonFactory().createGenerator(stringWriter);
        TalkIds talkIds = new TalkIds();
        talkIds.add(talkIdList);
        talkIdsSerializer.serialize(talkIds, jsonGenerator, null);
        jsonGenerator.flush();
        jsonGenerator.close();
        stringWriter.close();
        return stringWriter.toString();
    }

}

