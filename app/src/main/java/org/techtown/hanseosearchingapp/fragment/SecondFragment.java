package org.techtown.hanseosearchingapp.fragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidviewhover.BlurLayout;

import org.techtown.hanseosearchingapp.activity.ChickenActivity;
import org.techtown.hanseosearchingapp.R;
import org.techtown.hanseosearchingapp.activity.ElephantActivity;
import org.techtown.hanseosearchingapp.activity.JochickenActivity;
import org.techtown.hanseosearchingapp.activity.PapasActivity;
import org.techtown.hanseosearchingapp.activity.PirateActivity;
import org.techtown.hanseosearchingapp.gps.Gps1Activity;
import org.techtown.hanseosearchingapp.gps.Gps2Activity;
import org.techtown.hanseosearchingapp.gps.Gps3Activity;
import org.techtown.hanseosearchingapp.gps.Gps4Activity;
import org.techtown.hanseosearchingapp.gps.Gps5Activity;


public class SecondFragment extends Fragment {

    Context mContext;
    private BlurLayout sampleLayout, sampleLayout2, sampleLayout3, sampleLayout4, sampleLayout5;

    public SecondFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        // 치킨, 술집은 홀수 & 중국집은 짝수//
        //____________________________________1번 태안 마슬랜_______________________________________________//
        sampleLayout = view.findViewById(R.id.blur_layout);
        View hover = LayoutInflater.from(mContext).inflate(R.layout.hover1, null);
        sampleLayout.setHoverView(hover);

        sampleLayout.setBlurDuration(550);
        sampleLayout.addChildAppearAnimator(hover, R.id.content, Techniques.FadeInUp);
        sampleLayout.addChildDisappearAnimator(hover, R.id.content, Techniques.FadeOutDown);

        sampleLayout.addChildAppearAnimator(hover, R.id.phone, Techniques.SlideInLeft);
        sampleLayout.addChildDisappearAnimator(hover, R.id.phone, Techniques.SlideOutLeft);
        sampleLayout.addChildAppearAnimator(hover, R.id.location, Techniques.SlideInLeft);
        sampleLayout.addChildDisappearAnimator(hover, R.id.location, Techniques.SlideOutLeft);
        sampleLayout.addChildAppearAnimator(hover, R.id.menu, Techniques.SlideInLeft);
        sampleLayout.addChildDisappearAnimator(hover, R.id.menu, Techniques.SlideOutLeft);

        hover.findViewById(R.id.phone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = "tel:041-674-5679";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(data));
                getActivity().startActivity(intent);

            }
        });

        hover.findViewById(R.id.location).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getActivity(), Gps1Activity.class));
            }
        });

        hover.findViewById(R.id.menu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getActivity(), ChickenActivity.class));
            }
        });

        //____________________________________3번 코끼리수산&솔치킨_______________________________________________//
        sampleLayout3 = view.findViewById(R.id.blur_layout3);
        View hover3 = LayoutInflater.from(mContext).inflate(R.layout.hover3, null);

        sampleLayout3.setHoverView(hover3);

        sampleLayout3.setBlurDuration(550);
        sampleLayout3.addChildAppearAnimator(hover3, R.id.content3, Techniques.FadeInUp);
        sampleLayout3.addChildDisappearAnimator(hover3, R.id.content3, Techniques.FadeOutDown);

        sampleLayout3.addChildAppearAnimator(hover3, R.id.phone3, Techniques.SlideInLeft);
        sampleLayout3.addChildDisappearAnimator(hover3, R.id.phone3, Techniques.SlideOutLeft);
        sampleLayout3.addChildAppearAnimator(hover3, R.id.location3, Techniques.SlideInLeft);
        sampleLayout3.addChildDisappearAnimator(hover3, R.id.location3, Techniques.SlideOutLeft);
        sampleLayout3.addChildAppearAnimator(hover3, R.id.menu3, Techniques.SlideInLeft);
        sampleLayout3.addChildDisappearAnimator(hover3, R.id.menu3, Techniques.SlideOutLeft);

        hover3.findViewById(R.id.phone3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = "tel:0507-1360-7359";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(data));
                getActivity().startActivity(intent);

            }
        });

        hover3.findViewById(R.id.location3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getActivity(), Gps3Activity.class));
            }
        });

        hover3.findViewById(R.id.menu3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getActivity(), ElephantActivity.class));
            }
        });
//____________________________________5번 조가네 치킨_______________________________________________//
        sampleLayout5 = view.findViewById(R.id.blur_layout5);
        View hover5 = LayoutInflater.from(mContext).inflate(R.layout.hover5, null);

        sampleLayout5.setHoverView(hover5);

        sampleLayout5.setBlurDuration(550);
        sampleLayout5.addChildAppearAnimator(hover5, R.id.content5, Techniques.FadeInUp);
        sampleLayout5.addChildDisappearAnimator(hover5, R.id.content5, Techniques.FadeOutDown);

        sampleLayout5.addChildAppearAnimator(hover5, R.id.phone5, Techniques.SlideInLeft);
        sampleLayout5.addChildDisappearAnimator(hover5, R.id.phone5, Techniques.SlideOutLeft);
        sampleLayout5.addChildAppearAnimator(hover5, R.id.location5, Techniques.SlideInLeft);
        sampleLayout5.addChildDisappearAnimator(hover5, R.id.location5, Techniques.SlideOutLeft);
        sampleLayout5.addChildAppearAnimator(hover5, R.id.menu5, Techniques.SlideInLeft);
        sampleLayout5.addChildDisappearAnimator(hover5, R.id.menu5, Techniques.SlideOutLeft);

        hover5.findViewById(R.id.phone5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = "tel:041-673-5405";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(data));
                getActivity().startActivity(intent);

            }
        });

        hover5.findViewById(R.id.location5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getActivity(), Gps5Activity.class));
            }
        });

        hover5.findViewById(R.id.menu5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getActivity(), JochickenActivity.class));
            }
        });
        //____________________________________2번 안면도 파파스_______________________________________________//
        sampleLayout2 = view.findViewById(R.id.blur_layout2);
        View hover2 = LayoutInflater.from(mContext).inflate(R.layout.hover2, null);

        sampleLayout2.setHoverView(hover2);

        sampleLayout2.setBlurDuration(550);
        sampleLayout2.addChildAppearAnimator(hover2, R.id.content2, Techniques.FadeInUp);
        sampleLayout2.addChildDisappearAnimator(hover2, R.id.content2, Techniques.FadeOutDown);

        sampleLayout2.addChildAppearAnimator(hover2, R.id.phone2, Techniques.SlideInLeft);
        sampleLayout2.addChildDisappearAnimator(hover2, R.id.phone2, Techniques.SlideOutLeft);
        sampleLayout2.addChildAppearAnimator(hover2, R.id.location2, Techniques.SlideInLeft);
        sampleLayout2.addChildDisappearAnimator(hover2, R.id.location2, Techniques.SlideOutLeft);
        sampleLayout2.addChildAppearAnimator(hover2, R.id.menu2, Techniques.SlideInLeft);
        sampleLayout2.addChildDisappearAnimator(hover2, R.id.menu2, Techniques.SlideOutLeft);

        hover2.findViewById(R.id.phone2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = "tel:041-675-5009";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(data));
                getActivity().startActivity(intent);

            }
        });
        hover2.findViewById(R.id.location2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getActivity(), Gps2Activity.class));
            }
        });

        hover2.findViewById(R.id.menu2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getActivity(), PapasActivity.class));
            }
        });
        //____________________________________4번 안면도 해적_______________________________________________//
        sampleLayout4 = view.findViewById(R.id.blur_layout4);
        View hover4 = LayoutInflater.from(mContext).inflate(R.layout.hover4, null);

        sampleLayout4.setHoverView(hover4);

        sampleLayout4.setBlurDuration(550);
        sampleLayout4.addChildAppearAnimator(hover4, R.id.content4, Techniques.FadeInUp);
        sampleLayout4.addChildDisappearAnimator(hover4, R.id.content4, Techniques.FadeOutDown);

        sampleLayout4.addChildAppearAnimator(hover4, R.id.phone4, Techniques.SlideInLeft);
        sampleLayout4.addChildDisappearAnimator(hover4, R.id.phone4, Techniques.SlideOutLeft);
        sampleLayout4.addChildAppearAnimator(hover4, R.id.location4, Techniques.SlideInLeft);
        sampleLayout4.addChildDisappearAnimator(hover4, R.id.location4, Techniques.SlideOutLeft);
        sampleLayout4.addChildAppearAnimator(hover4, R.id.menu4, Techniques.SlideInLeft);
        sampleLayout4.addChildDisappearAnimator(hover4, R.id.menu4, Techniques.SlideOutLeft);

        hover4.findViewById(R.id.phone4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = "tel:0507-1370-8211";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(data));
                getActivity().startActivity(intent);

            }
        });

        hover4.findViewById(R.id.location4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getActivity(), Gps4Activity.class));
            }
        });

        hover4.findViewById(R.id.menu4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getActivity(), PirateActivity.class));
            }
        });


        return view;
    }

    @Override
    //프래그먼트 실행 시 생명주기
    //onAttach —> onCreate() —> onViewCreated() —> onActivicyCreated() —> onResume()
    // 프래그먼트에서 mContext를 안전하게 사용하기 위함(null 값에 대비하기 위함)
    public void onAttach(Context context) {

        super.onAttach(context);

        mContext = context;
    }


}