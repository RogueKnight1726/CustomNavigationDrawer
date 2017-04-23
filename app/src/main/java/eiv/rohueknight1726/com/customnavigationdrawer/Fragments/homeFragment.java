package eiv.rohueknight1726.com.customnavigationdrawer.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import eiv.rohueknight1726.com.customnavigationdrawer.Helpers.ImageDecoder;
import eiv.rohueknight1726.com.customnavigationdrawer.R;

/**
 * Created by swathysudarsanan on 23/04/17.
 */

public class homeFragment extends Fragment {


    public homeFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.home_content, null);
        ImageView coverImage = (ImageView)v.findViewById(R.id.coverImage);
        coverImage.setImageBitmap(ImageDecoder.decodeSampledBitmapFromResource(getResources(),R.drawable.my_image,200,200));
        return v;
    }



}
