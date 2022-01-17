package org.techtown.hanseosearchingapp.fragment;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import org.techtown.hanseosearchingapp.SliderAdapterExample;
import org.techtown.hanseosearchingapp.SliderItem;
import org.techtown.hanseosearchingapp.activity.FirstActivity;
import org.techtown.hanseosearchingapp.R;
import org.techtown.hanseosearchingapp.activity.SecondActivity;

import java.util.ArrayList;
import java.util.List;


public class FirstFragment extends Fragment {
    private ImageButton imagebutton1;
    private ImageButton imagebutton2;
    private ImageButton imagebutton3;

    private ImageButton imagebutton4;
    private ImageButton imagebutton5;

    SliderView sliderView;
    private SliderAdapterExample adapter;

    Context mContext;
    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first,container,false);

        //----- 이미지 슬라이더 -----//
        sliderView = view.findViewById(R.id.imageSlider);

        adapter = new SliderAdapterExample(mContext);
        sliderView.setSliderAdapter(adapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_RIGHT);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(3);
        sliderView.setAutoCycle(true);
        sliderView.startAutoCycle();
        renewItems(sliderView);
        //----- 이미지 슬라이더 -----//

        imagebutton1 = view.findViewById(R.id.imageButton);
        imagebutton1.setOnClickListener(imagebutton1Listener);
        imagebutton2 = view.findViewById(R.id.imageButton2);
        imagebutton2.setOnClickListener(imagebutton2Listener);
        imagebutton3 = view.findViewById(R.id.imageButton3);
        imagebutton3.setOnClickListener(imagebutton3Listener);

        imagebutton4 = view.findViewById(R.id.imageButton4);
        imagebutton4.setOnClickListener(imagebutton4Listener);
        imagebutton5 = view.findViewById(R.id.imageButton5);
        imagebutton5.setOnClickListener(imagebutton5Listener);

        return view;
    }

    View.OnClickListener imagebutton1Listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            getActivity().startActivity(new Intent(getActivity(), FirstActivity.class));
        }
    };
    View.OnClickListener imagebutton2Listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            getActivity().startActivity(new Intent(getActivity(), SecondActivity.class));
        }
    };
    View.OnClickListener imagebutton3Listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://hsu.busro.net/rsvp/")));
        }
    };
    View.OnClickListener imagebutton4Listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.kakao.com/o/gFeuSOmb")));
        }
    };
    View.OnClickListener imagebutton5Listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.kakao.com/o/gWWcPTvd")));
        }
    };

    @Override
    //프래그먼트 실행 시 생명주기
    //onAttach —> onCreate() —> onViewCreated() —> onActivicyCreated() —> onResume()
    // 프래그먼트에서 mContext를 안전하게 사용하기 위함(null 값에 대비하기 위함)
    public void onAttach(Context context) {

        super.onAttach(context);

        mContext = context;
    }


    public void renewItems(View view) {
        List<SliderItem> sliderItemList = new ArrayList<>();
        //dummy data
        for (int i = 0; i < 3; i++) {
            SliderItem sliderItem = new SliderItem();
            if (i == 0) {
                sliderItem.setDescription("  한서대학교 서산캠퍼스");
                sliderItem.setImageUrl("https://i.esdrop.com/d/z32zmieg92uv/VppIcdMnlx.png");
            }
            else if(i == 1){
                sliderItem.setDescription("  태안 비행장");
                sliderItem.setImageUrl("https://i.esdrop.com/d/z32zmieg92uv/JvFdliDdR2.png");
            }
            else if(i == 2){
                sliderItem.setDescription("  한서대학교 연암도서관");
                sliderItem.setImageUrl("https://i.esdrop.com/d/z32zmieg92uv/jsaN0JhApF.png");
            }
            sliderItemList.add(sliderItem);
        }
        adapter.renewItems(sliderItemList);
    }
    //----------- 사용안함 -----------------//
/*
    public void removeLastItem(View view) {
        if (adapter.getCount() - 1 >= 0)
            adapter.deleteItem(adapter.getCount() - 1);
    }

    public void addNewItem(View view) {
        SliderItem sliderItem = new SliderItem();
       // sliderItem.setDescription("Slider Item Added Manually");
        sliderItem.setImageUrl("https://i.esdrop.com/d/z32zmieg92uv/jsaN0JhApF.png");
        sliderItem.setImageUrl("https://i.esdrop.com/d/z32zmieg92uv/JvFdliDdR2.png");
        adapter.addItem(sliderItem);
    }

*/
}