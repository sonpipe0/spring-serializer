package events;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class StatusPublishEvent {
    @NotBlank(message = "User id cannot be null")
    private String userId;
    @NotBlank(message = "Snippet id cannot be null")
    private String snippetId;
    @NotNull(message = "Status cannot be null")
    private StatusType status;
    @NotNull(message = "Type cannot be empty")
    private ConfigPublishEvent.ConfigType type;

    public StatusPublishEvent() {
    }

    public @NotBlank(message = "User id cannot be null") String getUserId() {
        return this.userId;
    }

    public @NotBlank(message = "Snippet id cannot be null") String getSnippetId() {
        return this.snippetId;
    }

    public @NotNull(message = "Status cannot be null") StatusType getStatus() {
        return this.status;
    }

    public ConfigPublishEvent.@NotNull(message = "Type cannot be empty") ConfigType getType() {
        return this.type;
    }

    public void setUserId(@NotBlank(message = "User id cannot be null") String userId) {
        this.userId = userId;
    }

    public void setSnippetId(@NotBlank(message = "Snippet id cannot be null") String snippetId) {
        this.snippetId = snippetId;
    }

    public void setStatus(@NotNull(message = "Status cannot be null") StatusType status) {
        this.status = status;
    }

    public void setType(@NotNull(message = "Type cannot be empty") ConfigPublishEvent.ConfigType type) {
        this.type = type;
    }

    public enum StatusType {
        COMPLIANT, NON_COMPLIANT
    }

    @Override
    public String toString() {
        return "StatusPublishEvent{" +
                "userId='" + userId + '\'' +
                ", snippetId='" + snippetId + '\'' +
                ", status=" + status +
                ", type=" + type +
                '}';
    }
}
