package com.example.chung.primaryschoolattenhw;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.chung.primaryschoolattenhw.R;

/**
 * Created by Chung on 2/3/2017.
 */
public class newsFragment extends Fragment{
    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.news, container, false);
        return myView;

    }
}
