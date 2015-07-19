package com.popfun.sgsg.sgsg_project;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by LIM_YUNGYOO on 2015-07-18.
 */
public class IndividualActivity extends Fragment {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        LinearLayout layout = (LinearLayout)inflater.inflate(R.layout.individual, container, false);
        return  layout;

    }

}
