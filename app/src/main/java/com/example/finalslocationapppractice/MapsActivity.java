package com.example.finalslocationapppractice;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.finalslocationapppractice.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        /*
        * ************  Steps For Google Map  ***********
        * Step1: Create a google map activity.
        * Step 2: Create or Generate an api key by clicking a link in manifest and
        * Step 3: Add api key in your project
        * Step 4: Now find out the latitude and longitude of your area
        * Step 5: Add toh below LatLng method and also change marker title
        * Step 6: Launch an activity
        * */
        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(32.772542798644274, 74.18599707746178);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Bhouch"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}