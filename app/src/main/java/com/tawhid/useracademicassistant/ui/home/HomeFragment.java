package com.tawhid.useracademicassistant.ui.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderLayout;
import com.smarteist.autoimageslider.SliderView;
import com.tawhid.useracademicassistant.R;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    private ImageSlider imageSlider;
    private ImageView map;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

      View view = inflater.inflate(R.layout.fragment_home, container, false);

        ArrayList<SlideModel> imageList = new ArrayList<>(); // Create image list

// imageList.add(new SlideModel("String Url" or R.drawable)
// imageList.add(new SlideModel("String Url" or R.drawable, "title")) You can add title

        imageList.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/academic-assistant-07.appspot.com/o/Sample%20picture%2FFB_IMG_1688139967748.jpg?alt=media&token=ab5e72c1-7806-4499-bbee-30602c75cafa", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/academic-assistant-07.appspot.com/o/Sample%20picture%2FFB_IMG_1688139953998.jpg?alt=media&token=6a39312e-a9f7-47ff-9ae0-388eaed24c3f",  ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/academic-assistant-07.appspot.com/o/Sample%20picture%2FFB_IMG_1688140171228.jpg?alt=media&token=6f8956ea-aa36-452e-ba39-8116039234fa", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/academic-assistant-07.appspot.com/o/Sample%20picture%2FFB_IMG_1688140213120.jpg?alt=media&token=22a32daf-a776-4d8e-8d85-a4e1d41162c6", ScaleTypes.CENTER_CROP));

        imageSlider = view.findViewById(R.id.image_slider);
        imageSlider.setImageList(imageList);

        map= view.findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMap();
            }
        });
        return view;

    }

    private void openMap() {
        Uri uri= Uri.parse("geo: 0, 0?q=Rajshahi University of Engineering & Technology");
        Intent intent= new Intent(Intent.ACTION_VIEW,uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }


}
