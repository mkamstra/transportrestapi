package nl.martijnkamstra.transport.controller;

import nl.martijnkamstra.transport.resource.TransportInfo;
import nl.martijnkamstra.transport.resource.TransportList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class TransportListController {
    private static final String template = "Location (lat, lon) = %.3f, %3f nr. of requests: %d";

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/list", params = {"latitude", "longitude"}, method = RequestMethod.GET)
    public TransportList transportList(@RequestParam(value="latitude", defaultValue = "50.0") double latitude, @RequestParam(value="longitude", defaultValue = "5.0") double longitude) {
        System.out.println(String.format(template, latitude, longitude, counter.incrementAndGet()));
        TransportInfo transportInfo = new TransportInfo("45A", "Oxford", "2017-02-23 10:02:45", "2017-02-23 10:05:20");
        return new TransportList("Liverpool Street", transportInfo);
    }
}
