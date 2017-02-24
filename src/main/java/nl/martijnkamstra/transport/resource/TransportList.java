package nl.martijnkamstra.transport.resource;

public class TransportList {
    private String station;
    private TransportInfo transportInfo;

    public TransportList(String station, TransportInfo transportInfo) {
        this.station = station;
        this.transportInfo = transportInfo;
    }

    public String getStation() {
        return station;
    }

    public TransportInfo getTransportInfo() {
        return transportInfo;
    }
}
