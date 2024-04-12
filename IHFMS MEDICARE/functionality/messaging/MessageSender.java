package functionality.messaging;
import java.util.List;
import user.SystemUser;

public interface MessageSender {
    public void sendGroupMessage(String message);
    public void notifyGroupMembers(List <SystemUser> groupMessageObservers);
    public void sendMessageToMember(SystemUser messageObserver);
}
