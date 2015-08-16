package com.example.mahmoud.timer_example;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by mahmoud on 16/08/2015.
 */
public class Numbers_Layout_Fragment extends Fragment {

    int count = 10;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View V = inflater.inflate(R.layout.numbers_layout, container, false);
        final TextView textView = (TextView) V.findViewById(R.id.textView);
        final Timer T = new Timer(); ///1

        final Handler myhandler = new Handler();  ///3


        final Runnable MyRunnable = new Runnable() { ////4
            @Override
            public void run() {
                if(count==10){
                    textView.setTextColor(Color.BLACK);
                }
                if (count == 5) {
                    textView.setTextColor(Color.RED);
                }
                textView.setText("" + count);
                count--;
                if (count < 0) {

                    //      FragmentManager manager=getFragmentManager();
                    //      FragmentTransaction fragmentTransaction=manager.beginTransaction();
                    //     Red_Fragment RedFragmentObject=new Red_Fragment();
                    //     fragmentTransaction.add(R.id.my_fragment_Space,RedFragmentObject);
                    //     fragmentTransaction.commit();
                  //  count = 10;
                       T.cancel();
                }

            }
        };

        TimerTask Task = new TimerTask() {///2
            @Override
            public void run() {
                myhandler.post(MyRunnable);
                //   Log.d(""+count,""+count);

            }
        };


        T.schedule(Task, 0, 1000);

        return V;


    }
}
