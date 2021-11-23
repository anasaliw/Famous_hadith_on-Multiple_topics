package com.it18.hadith_on_multiple_topis.ui.slideshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.it18.hadith_on_multiple_topis.R;
import com.it18.hadith_on_multiple_topis.databinding.FragmentSlideshowBinding;

public class SlideshowFragment extends Fragment {

    private SlideshowViewModel slideshowViewModel;
    private FragmentSlideshowBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);

        binding = FragmentSlideshowBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        //hadith 1
        TextView txt1;
        Button btn1;
        btn1=root.findViewById(R.id.btn1);
        txt1=root.findViewById(R.id.txt1);
        btn1.setOnClickListener(v->{
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
        btn2=root.findViewById(R.id.btn2);
        txt2=root.findViewById(R.id.txt2);
        btn2.setOnClickListener(v->{
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
        btn3=root.findViewById(R.id.btn3);
        txt3=root.findViewById(R.id.txt3);
        btn3.setOnClickListener(v->{
            String share=txt3.getText().toString();
            Intent action=new Intent();
            action.setAction(Intent.ACTION_SEND);
            action.setType("text/plain");
            action.putExtra(Intent.EXTRA_TEXT,share);
            startActivity(action);
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}