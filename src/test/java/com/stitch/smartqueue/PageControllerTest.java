package com.stitch.smartqueue;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class PageControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void rootRedirectsToDashboard() throws Exception {
        mockMvc.perform(get("/")).andExpect(status().is3xxRedirection()).andExpect(redirectedUrl("/dashboard"));
    }

    @Test
    void dashboardForwardsToTemplate() throws Exception {
        mockMvc.perform(get("/dashboard")).andExpect(forwardedUrl("/templates/dashboard.html"));
    }

    @Test
    void liveQueueForwardsToTemplate() throws Exception {
        mockMvc.perform(get("/live-queue")).andExpect(forwardedUrl("/templates/live-queue.html"));
    }

    @Test
    void addRequestForwardsToTemplate() throws Exception {
        mockMvc.perform(get("/add-request")).andExpect(forwardedUrl("/templates/add-request.html"));
    }

    @Test
    void requestDetailsForwardsToTemplate() throws Exception {
        mockMvc.perform(get("/request-details")).andExpect(forwardedUrl("/templates/request-details.html"));
        mockMvc.perform(get("/request-details/REQ-1")).andExpect(forwardedUrl("/templates/request-details.html"));
    }

    @Test
    void analyticsForwardsToTemplate() throws Exception {
        mockMvc.perform(get("/analytics")).andExpect(forwardedUrl("/templates/analytics.html"));
    }

    @Test
    void queueHistoryForwardsToTemplate() throws Exception {
        mockMvc.perform(get("/queue-history")).andExpect(forwardedUrl("/templates/queue-history.html"));
    }
}
