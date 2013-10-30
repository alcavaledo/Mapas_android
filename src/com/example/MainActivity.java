package com.example;

import com.google.android.gms.maps.*;
import com.google.android.gms.maps.model.*;
import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get a handle to the Map Fragment
        GoogleMap map = ((MapFragment) getFragmentManager()
                .findFragmentById(R.id.map)).getMap();

        LatLng upb = new LatLng(6.242553, -75.589092);

        map.setMyLocationEnabled(true);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(upb, 16));
        map.setMapType(GoogleMap.MAP_TYPE_NONE);
        map.addMarker(new MarkerOptions()
                .title("UPB")
                .snippet("Universidad Pontificia Bolivariana")
                .position(upb));
    }
}