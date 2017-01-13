package com.example.yangxiao.fragmenttest;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @Author yangxiao on 12/19/2016.
 */

public class FragementA extends Fragment {

    private FragmentClick fragmentClick;
    private View view;

    public interface FragmentClick{
        public void onClick(String str);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.fragment_a, container, false);
            view.findViewById(R.id.a_btn).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onAClick();
                }
            });
        }
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            fragmentClick = ((MainActivity) context);
        } catch (ClassCastException e) {
        }
    }

    public void onAClick() {
        fragmentClick.onClick("it's a test!");
    }
}
