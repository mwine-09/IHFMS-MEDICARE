package functionality.messaging;

import java.util.*;
import java.util.logging.Logger;

import debug.DebugLogger;

// This is the messaging class that will be used to send messages to team members
// behavioral patterns such as Observer for event handling
public class MessagingFunctionality {

    Logger logger = Logger.getLogger(MessagingFunctionality.class.getName());

    // message to be sent
    private String message;

    // message listeners named as group members
    private List<GroupMessageObserver> messageObservers = new ArrayList<GroupMessageObserver>();

    // method to set message
    public void setMessage(String message) {
        this.message = message;
        // send message to team members
        notifyGroupMembers();
    }

    // method to get message
    public String getMessage() {
        return message;
    }

    // methods to add and remove group members
    public void addObserverToGroup(GroupMessageObserver groupMember) {
        messageObservers.add(groupMember);

        // log success message
        DebugLogger.logSuccess(groupMember + " has been added");
    }

    // removes a group member
    public void removeObserverFromGroup(GroupMessageObserver observer) {
        messageObservers.remove(observer);

        // send message to team members that a member has been removed
        this.message = observer + " has been removed";

        // log success message
        DebugLogger.logError(message);

    }

    // method to send message to group members
    public void notifyGroupMembers() {
        for (GroupMessageObserver groupMember : messageObservers) {
            groupMember.sendGroupMessage(getMessage());
        }

        // log success message
        DebugLogger.logSuccess("Message sent to all team members");
    }

}
