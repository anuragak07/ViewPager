package com.masai.viewpager;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragmentB extends Fragment {
    private TextView mTvData;
    private MainActivity activity;

    @Override
    public void onAttach(@NonNull  Context context) {
        super.onAttach(context);
        activity =(MainActivity)context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
         mTvData = view.findViewById(R.id.tvData);
    }

    @Override
    public void onResume() {
        super.onResume();
        mTvData.setText(activity.getData());

    }
}