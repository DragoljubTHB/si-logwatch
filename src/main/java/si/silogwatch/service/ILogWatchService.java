package si.silogwatch.service;

import si.silogwatch.model.LogWatch;

import java.util.List;

public interface ILogWatchService {
    List<LogWatch> findAll();

    void/*Maybe<LogWatch>*/ create(LogWatch logWatch);

}
