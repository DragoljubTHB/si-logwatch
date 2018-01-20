package si.silogwatch.persistence;

import si.silogwatch.model.LogWatch;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.concurrent.ConcurrentHashMap;

public class LogMemory extends Observable {
    private ConcurrentHashMap<String, LogWatch> logsMap;

    private static LogMemory ourInstance = new LogMemory();

    public static LogMemory getInstance() {
        return ourInstance;
    }

    private LogMemory() {
        logsMap = new ConcurrentHashMap<>();
        for (int i = 0; i < 5; i++) {
            LogWatch logWatch = new LogWatch();
            logWatch.setId("id_"+i);
            logWatch.setMessage("message"+i);
            logsMap.put(logWatch.getId(), logWatch);
        }
    }

    public LogWatch put(LogWatch logWatch) {
        logsMap.putIfAbsent(logWatch.getId(), logWatch);
        this.setChanged();
        this.notifyObservers();
        return logWatch;

    }
    public List<LogWatch> getAllLogs() {
        return new ArrayList<>(logsMap.values());
    }
}