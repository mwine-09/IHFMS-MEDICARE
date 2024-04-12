package functionality.messaging;

import debug.DebugLogger;
import java.util.ArrayList;
import java.util.List;
import user.SystemUser;


// Class for handling messaging functionality and notifying group members
public class MessageProcessor implements GroupMessagingObserver, MessageSender {
    public static MessageProcessor messageProcessorSingleton = null;

    public static MessageProcessor getMessageProcessor() {
        if (messageProcessorSingleton == null) {
            return new MessageProcessor();
        }
        else {
            return messageProcessorSingleton;
    }
   }


    DebugLogger logger = DebugLogger.getLogger();

    // Message to be sent
    private String message;

    // List of message observers (group members)
    private List<SystemUser> messageObservers = new ArrayList<>();


    // Get the current message
    public String getMessage() {
        return message;
    }

    @Override
    public void notifyGroupMembers(List <SystemUser> groupMessageObservers){

        for (var groupMember : groupMessageObservers) {

            sendMessageToMember(groupMember);

            System.out.println("Group member has been been notified" + groupMember.toString());
            
        }

    }
    // method to set message
    public void setMessage(String message) {
        this.message = message;
    }
    
    @Override
    public void sendGroupMessage(String message) {
        // set message
        setMessage(message);

        System.out.println("Messaged Received (SystemAdministrator): " + getMessage());
    }
@Override
    
    public void sendMessageToMember(SystemUser messageObserver){

        System.out.println("Message has been sent to " + messageObserver.toString());
        
    }

    @Override
    public void onMessageReceived(String message){
        System.out.print("You have receeived a message" + message);
    }
    
    @Override
    public void onMessageUpdated(String message){
        System.out.print("This message " + message + "has been updated");
    
    }

    // Add an observer (group member) to the group
    public void addObserverToGroup(SystemUser groupMember) {
        messageObservers.add(groupMember);
        logger.logSuccess(groupMember + " has been added to the group.");
    }

    // Remove an observer (group member) from the group
    public void removeObserverFromGroup(SystemUser observer) {
        messageObservers.remove(observer);
        logger.logSuccess(observer + " has been removed from the group.");
    }


  

}
