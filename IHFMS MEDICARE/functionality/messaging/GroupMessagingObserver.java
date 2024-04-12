package functionality.messaging;

// Interface for observing group messages and notifying group members
public interface GroupMessagingObserver {
    public void onMessageReceived(String message);
    public void onMessageUpdated(String message);

}
