package org.techtown.hanseosearchingapp.fragment;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import org.techtown.hanseosearchingapp.R;
import org.techtown.hanseosearchingapp.activity.FirstActivity;
import org.techtown.hanseosearchingapp.activity.LicenseActivity;


public class HomeFragment extends Fragment {

    private TextView license;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);

        license = view.findViewById(R.id.textView2);

        button1 = view.findViewById(R.id.button1);
        button2 = view.findViewById(R.id.button2);
        button3 = view.findViewById(R.id.button3);
        button4 = view.findViewById(R.id.button4);

        license.setOnClickListener(licenseListener);

        button1.setOnClickListener(button1Listener);
        button2.setOnClickListener(button2Listener);
        button3.setOnClickListener(button3Listener);
        button4.setOnClickListener(button4Listener);


        return view;
    }

    View.OnClickListener licenseListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            getActivity().startActivity(new Intent(getActivity(), LicenseActivity.class));
        }
    };

    View.OnClickListener button1Listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hanseo.ac.kr/main.do?s=hs")));
        }
    };

    View.OnClickListener button2Listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://nportal.hanseo.ac.kr/")));
        }
    };

    View.OnClickListener button3Listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hanseo.ac.kr/sub/info.do?page=040214&m=040214&s=hs")));
        }
    };

    View.OnClickListener button4Listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hanseo.ac.kr/sub/info.do?page=0406&m=0406&s=hs")));
        }
    };

}