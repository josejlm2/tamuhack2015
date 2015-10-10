package com.example.tamuhack2015;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tamuhack2015.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class EventActivityFragment extends Fragment {

    public EventActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_event_create, container, false);
    }
}
