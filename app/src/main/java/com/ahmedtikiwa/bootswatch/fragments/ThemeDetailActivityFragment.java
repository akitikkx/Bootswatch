package com.ahmedtikiwa.bootswatch.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ahmedtikiwa.bootswatch.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class ThemeDetailActivityFragment extends Fragment {

    public ThemeDetailActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_theme_detail, container, false);
    }
}
