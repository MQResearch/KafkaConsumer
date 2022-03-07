package research.ncsu.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleConsumerListener {
	
	@KafkaListener(topics = "testing", groupId = "temp")
	public void listen(String message) {
	   System.out.println("Received Messasge in group - group-id: " + message);
	}
	
	

}
