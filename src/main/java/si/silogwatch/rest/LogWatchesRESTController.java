package si.silogwatch.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import si.silogwatch.model.LogWatch;
import si.silogwatch.persistence.LogMemory;

import java.util.List;

@Controller
@RequestMapping("/logs")
public class LogWatchesRESTController {


    @CrossOrigin(origins = "*")
    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    List<LogWatch> getAllStations() {
        return LogMemory.getInstance().getAllLogs();
    }

}
