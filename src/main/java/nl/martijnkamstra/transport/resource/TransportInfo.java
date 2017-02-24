package nl.martijnkamstra.transport.resource;

/**
 * A container for the data related to a single transport, i.e. for a single line at a single stop
 */
public class TransportInfo {
    private String line;
    private String destination;
    private String scheduled_departure_time;
    private String expected_departure_time;

    public TransportInfo(String line, String destination, String scheduled_departure_time, String expected_departure_time) {
        this.line = line;
        this.destination = destination;
        this.scheduled_departure_time = scheduled_departure_time;
        this.expected_departure_time = expected_departure_time;
    }

    public String getLine() {
        return line;
    }

    public String getDestination() {
        return destination;
    }

    public String getScheduled_departure_time() {
        return scheduled_departure_time;
    }

    public String getExpected_departure_time() {
        return expected_departure_time;
    }
}