package com.it18.hadith_on_multiple_topis.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.it18.hadith_on_multiple_topis.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link hadith_mother#newInstance} factory method to
 * create an instance of this fragment.
 */
public class hadith_mother extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public hadith_mother() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment hadith_mother.
     */
    // TODO: Rename and change types and number of parameters
    public static hadith_mother newInstance(String param1, String param2) {
        hadith_mother fragment = new hadith_mother();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_hadith_mother, container, false);
        //hadith 1
        TextView txt1;
        Button btn1;
        btn1=v.findViewById(R.id.btn1);
        txt1=v.findViewById(R.id.txt1);
        btn1.setOnClickListener(view->{
            String share=txt1.getText().toString();
            Intent action=new Intent();
            action.setAction(Intent.ACTION_SEND);
            action.setType("text/plain");
            action.putExtra(Intent.EXTRA_TEXT,share);
            startActivity(action);
        });
        //hadith 2
        TextView txt2;
        Button btn2;
        btn2=v.findViewById(R.id.btn2);
        txt2=v.findViewById(R.id.txt2);
        btn2.setOnClickListener(view->{
            String share=txt2.getText().toString();
            Intent action=new Intent();
            action.setAction(Intent.ACTION_SEND);
            action.setType("text/plain");
            action.putExtra(Intent.EXTRA_TEXT,share);
            startActivity(action);
        });
        //hadith 3
        TextView txt3;
        Button btn3;
        btn3=v.findViewById(R.id.btn3);
        txt3=v.findViewById(R.id.txt3);
        btn3.setOnClickListener(view->{
            String share=txt3.getText().toString();
            Intent action=new Intent();
            action.setAction(Intent.ACTION_SEND);
            action.setType("text/plain");
            action.putExtra(Intent.EXTRA_TEXT,share);
            startActivity(action);
        });
        return v;
    }
}