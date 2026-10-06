# stitch_smart_e_system – SmartQueue Campus Intelligence System (Spring Boot)

## Run
Requires JDK 17+ and Maven 3.9+.

    mvn spring-boot:run

Open http://localhost:8080

## Routes
| Path | Screen | File |
|------|--------|------|
| `/` | redirects to `/dashboard` | – |
| `/dashboard` | Dashboard | `static/templates/dashboard.html` |
| `/live-queue` | Live Queue | `static/templates/live-queue.html` |
| `/add-request` | Add Request | `static/templates/add-request.html` |
| `/request-details`, `/request-details/{id}` | Request Details | `static/templates/request-details.html` |
| `/analytics` | Queue Analytics | `static/templates/analytics.html` |
| `/queue-history` | Queue History | `static/templates/queue-history.html` |

The sidebar links in each screen already point at these routes. The "Settings" link has no
screen in the design and is left as `#`.

## Layout
    src/main/java/com/stitch/smartqueue/   SmartQueueApplication, controller/PageController
    src/main/resources/static/templates/   the 6 HTML screens
    src/main/resources/static/{css,js,images}   placeholders (images/ holds the design previews)
    src/main/resources/application.properties
    DESIGN.md                              design-system notes from the UI export

## Notes
- Screens load Tailwind and fonts from CDNs, so the browser needs internet access.
- DevTools gives auto-restart and LiveReload while developing.
- Next step for the project rubric: add model/service/repository packages (queue with
  PriorityQueue/LinkedList, HashMap lookups, file persistence) behind REST endpoints.
