package com.stitch.smartqueue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Serves the six SmartQueue UI screens.
 *
 * Each route forwards to a static HTML file under
 * src/main/resources/static/templates/, so no template engine is required.
 * (To switch to Thymeleaf later, add spring-boot-starter-thymeleaf, move the
 * files to src/main/resources/templates/, and return plain view names.)
 */
@Controller
public class PageController {

    private static final String TEMPLATE_DIR = "forward:/templates/";

    /** Root goes to the dashboard. */
    @GetMapping("/")
    public String root() {
        return "redirect:/dashboard";
    }

    /** Screen 1: Dashboard overview. */
    @GetMapping("/dashboard")
    public String dashboard() {
        return TEMPLATE_DIR + "dashboard.html";
    }

    /** Screen 2: Live queue. */
    @GetMapping("/live-queue")
    public String liveQueue() {
        return TEMPLATE_DIR + "live-queue.html";
    }

    /** Screen 3: Add a new request to the queue. */
    @GetMapping("/add-request")
    public String addRequest() {
        return TEMPLATE_DIR + "add-request.html";
    }

    /** Screen 4: Request details. The optional id is reserved for future data binding. */
    @GetMapping({"/request-details", "/request-details/{id}"})
    public String requestDetails(@PathVariable(value = "id", required = false) String id) {
        return TEMPLATE_DIR + "request-details.html";
    }

    /** Screen 5: Queue analytics. */
    @GetMapping("/analytics")
    public String analytics() {
        return TEMPLATE_DIR + "analytics.html";
    }

    /** Screen 6: Queue history. */
    @GetMapping("/queue-history")
    public String queueHistory() {
        return TEMPLATE_DIR + "queue-history.html";
    }
}
