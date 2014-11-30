package info.metadude.java.library.halfnarp.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import info.metadude.java.library.halfnarp.TalkIdsSerializer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@JsonSerialize(using = TalkIdsSerializer.class)
public class TalkIds {

    public static final String API_DICTIONARY_KEY = "talk_ids";

    protected Set<Integer> mTalkIds;

    public TalkIds() {
        mTalkIds = new HashSet<>();
    }

    public void add(int talkId) {
        mTalkIds.add(talkId);
    }

    public void add(List<Integer> talkIds) {
        mTalkIds.addAll(talkIds);
    }

    public void clear() {
        mTalkIds.clear();
    }

    public int size() {
        return mTalkIds.size();
    }

    public List<Integer> getTalkIds() {
        return new ArrayList<>(mTalkIds);
    }

}
