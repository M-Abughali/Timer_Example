package com.example.mahmoud.timer_example;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.zip.Inflater;

/**
 * Created by mahmoud on 16/08/2015.
 */
public class Red_Fragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View V= inflater.inflate(R.layout.fragment_red_fragment,container,false);

        ImageView imageView=(ImageView)V.findViewById(R.id.myImage);
         Animation hyperspaceJumpAnimation = AnimationUtils.loadAnimation(V.getContext(), R.anim.fade_in);
        imageView.startAnimation(hyperspaceJumpAnimation);
        return V;
    }
}
