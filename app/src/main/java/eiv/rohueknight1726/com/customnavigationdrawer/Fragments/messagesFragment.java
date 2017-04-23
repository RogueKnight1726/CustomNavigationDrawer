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

public class messagesFragment extends Fragment{
    public messagesFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.messages_fragment_layout, null);
        return v;
    }
}
