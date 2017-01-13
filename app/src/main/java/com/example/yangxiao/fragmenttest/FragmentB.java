package com.example.yangxiao.fragmenttest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * @Author yangxiao on 12/19/2016.
 */

public class FragmentB extends Fragment {
    View view;
    TextView tv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.fragment_b, container, false);
            tv = (TextView) view.findViewById(R.id.b_text);
        }
        if (getArguments() != null) {
            String value = getArguments().getString("test");
            tv.setText(value);
        }
        return view;
    }

    public void setTv(String str) {
        tv.setText(str);
    }
}
