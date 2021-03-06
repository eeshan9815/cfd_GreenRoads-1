package Modules;

import com.google.android.gms.maps.model.LatLng;

import java.util.List;

/**
 * Created by Mai Thanh Hiep on 4/3/2016.
 */
public class Route {
    public Distance distance;
    public Duration duration;
    public String endAddress;
    public LatLng endLocation;
    public String startAddress;
    public LatLng startLocation;
    public double rating;
    public String jsonRAW;
    public List<LatLng> points;
    public List<String> placeIds;
    public List<String> jsonRAWArray;
}

class TooMuchData extends Exception{
    TooMuchData(String s){
        super(s);
    }
}
