package javamon.utils.communication;

import javamon.entities.Javamon;
import javamon.utils.communication.components.CommunicationComponent;
import javamon.utils.communication.components.CommunicationComponentFactory;
import javamon.utils.enums.Platform;
import javamon.utils.serialization.JavamonSerializator;
import javamon.utils.serialization.SerializerFatory;



public class CommunicationManager {
    
    public void SendJavamon(Javamon pJavamon, Platform targetPlatform){
    	JavamonSerializator serializer = SerializerFatory.GetSerialize(targetPlatform);
        String output = serializer.serialize(pJavamon);
        
        CommunicationComponent communicationComponent = CommunicationComponentFactory.GetCommunicationComponent(targetPlatform);
        communicationComponent.sendJavamon(output);
    }

}

