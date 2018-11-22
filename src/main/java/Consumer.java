import serialized.JSonWeather;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class Consumer {

    private Client client;
    private WebTarget target;

    protected JSonWeather consume(){
        client = ClientBuilder.newClient();
        try {
        target = client.target(
                "http://api.openweathermap.org/data/2.5/forecast").queryParam("cnt", "10")
                .queryParam("mode", "json")
                .queryParam("units", "metric")
                .queryParam("APPID", "")
                .queryParam("q", "Gothenburg,se")
        ;
            return target.request(MediaType.APPLICATION_JSON).get(JSonWeather.class);
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
