package si.silogwatch.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import si.silogwatch.model.LogWatch;
import si.silogwatch.persistence.LogMemory;

import java.net.URI;
import java.util.List;

@Controller
@RequestMapping("/api/logs")
public class LogWatchesRESTController {


    @CrossOrigin(origins = "*")
    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    List<LogWatch> getAllStations() {
        return LogMemory.getInstance().getAllLogs();
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> add(@RequestBody LogWatch logWatchInput) {
        System.out.println(logWatchInput);
        LogMemory.getInstance().put(logWatchInput);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(logWatchInput.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

}
