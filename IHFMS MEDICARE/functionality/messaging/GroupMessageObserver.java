package functionality.messaging;

// this interface listens to group messages and updates them accordingly
public interface GroupMessageObserver {
    // send the group message
    public void sendGroupMessage(String message);

    // notify only one member of the group
    public void notifyAnotherMember(GroupMessageObserver member);
}