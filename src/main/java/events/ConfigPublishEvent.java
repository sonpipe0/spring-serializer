package events;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

public class ConfigPublishEvent implements Serializable {

    @NotBlank(message = "User id cannot be null")
    private String userId;

    @NotBlank(message = "Snippet id cannot be null")
    private String snippetId;

    @NotNull(message = "Config type cannot be null")
    private ConfigType type;

    public ConfigPublishEvent() {
    }

    public @NotBlank(message = "User id cannot be null") String getUserId() {
        return this.userId;
    }

    public @NotBlank(message = "Snippet id cannot be null") String getSnippetId() {
        return this.snippetId;
    }

    public @NotNull(message = "Config type cannot be null") ConfigType getType() {
        return this.type;
    }

    public void setUserId(@NotBlank(message = "User id cannot be null") String userId) {
        this.userId = userId;
    }

    public void setSnippetId(@NotBlank(message = "Snippet id cannot be null") String snippetId) {
        this.snippetId = snippetId;
    }

    public void setType(@NotNull(message = "Config type cannot be null") ConfigType type) {
        this.type = type;
    }

    public enum ConfigType {
        LINT, FORMAT
    }

    @Override
    public String toString() {
        return "ConfigPublishEvent{" +
                "userId='" + userId + '\'' +
                ", snippetId='" + snippetId + '\'' +
                ", type=" + type +
                '}';
    }
}
