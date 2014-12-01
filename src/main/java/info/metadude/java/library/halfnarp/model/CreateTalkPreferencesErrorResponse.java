package info.metadude.java.library.halfnarp.model;

import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateTalkPreferencesErrorResponse extends CreateResponse {

    @JsonProperty("status")
    private String status;
    @JsonProperty("errors")
    private List<CreateTalkPreferencesError> errors = new ArrayList<CreateTalkPreferencesError>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * @param status The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return The errors
     */
    @JsonProperty("errors")
    public List<CreateTalkPreferencesError> getErrors() {
        return errors;
    }

    /**
     * @param errors The errors
     */
    @JsonProperty("errors")
    public void setErrors(List<CreateTalkPreferencesError> errors) {
        this.errors = errors;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "status = " + status + ", " +
                "errors = " + errors;
    }

}
