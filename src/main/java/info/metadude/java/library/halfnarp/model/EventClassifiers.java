package info.metadude.java.library.halfnarp.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.HashMap;
import java.util.Map;

/**
 * Model for a key-value map of classifiers and their integer values.
 *
 * Example:
 *
 * "event_classifiers": {
 *     "Theory - Practice": 100,
 *     "Foundations": 100,
 *     "Resilience": 95,
 *     "Ethics, Politics + Society": 95
 * }
 *
 */
@SuppressWarnings("unused")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EventClassifiers {

    @JsonIgnore
    private final Map<String, Integer> additionalProperties = new HashMap<>();

    @JsonAnyGetter
    public Map<String, Integer> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Integer value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return additionalProperties.toString();
    }

}
