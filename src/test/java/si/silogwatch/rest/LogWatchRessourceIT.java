package si.silogwatch.rest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import si.silogwatch.repository.ILogWatchRepository;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(LogWatchesRESTController.class)
public class LogWatchRessourceIT {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private ILogWatchRepository logWatchRepository;

    @Before
    public void setup() {
        System.out.println("logwatch setup @before");
    }

    @After
    public void cleanup() {
        System.out.println("logwatch clean up @after");
    }

    @Test
    public void givenLogsWatches_whenGetLogsWatches_thenReturnJsonArray() throws Exception {
        System.out.println("list_logs_watches");
        mvc.perform(get("/api/logs")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                // .andExpect(jsonPath("$", hasSize(1)))
                // .andExpect(jsonPath("$[0].name", is(alex.getName())))
        ;


    }
}
