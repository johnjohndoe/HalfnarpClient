package info.metadude.java.library.halfnarp.model;

import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostErrorResponse extends PostResponse {

    @JsonProperty("status")
    private String status;
    @JsonProperty("errors")
    private List<PostError> errors = new ArrayList<PostError>();
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
    public List<PostError> getErrors() {
        return errors;
    }

    /**
     * @param errors The errors
     */
    @JsonProperty("errors")
    public void setErrors(List<PostError> errors) {
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
