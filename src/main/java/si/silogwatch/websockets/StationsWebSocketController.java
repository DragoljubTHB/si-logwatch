package si.silogwatch.websockets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
//import si.silogwatch.service.ILogWatchService;
import si.silogwatch.transfer.LogWatchDTO;

import java.util.List;

@Controller
public class StationsWebSocketController {

    //@Autowired
    //private ILogWatchService logWatchService;

    @MessageMapping("/basestations")
    @SendTo("/topic/basestations")
    public List<LogWatchDTO> getAll() throws Exception {
        return null;
    }

    @MessageMapping("/station")
    @SendTo("/topic/basestations")
    public List<LogWatchDTO> create(LogWatchDTO stationDTO) throws Exception {
        // logWatchService.createStation(stationDTO);
        return null; //logWatchService.getAllStationsDTO();
    }

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting2(HelloMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new Greeting("Hello, " + message.getName() + "!");
    }


}
