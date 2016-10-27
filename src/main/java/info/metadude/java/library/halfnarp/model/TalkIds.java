package info.metadude.java.library.halfnarp.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import info.metadude.java.library.halfnarp.TalkIdsSerializer;

import java.util.*;

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

    public void add(Collection<Integer> talkIds) {
        mTalkIds.addAll(talkIds);
    }

    public void clear() {
        mTalkIds.clear();
    }

    public int size() {
        return mTalkIds.size();
    }

    public Collection<Integer> getSortedTalkIds() {
        List<Integer> list = new ArrayList<>(mTalkIds);
        Collections.sort(list);
        return list;
    }

}
