package com.example.up23;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class Pred3 extends Fragment {

    private ImageView mImageView;
    private int mImageId;

    public Pred3() {
    }

    public static Pred3 newInstance(int imageId) {
        Pred3 fragment = new Pred3();
        Bundle args = new Bundle();
        args.putInt("image_id", imageId);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mImageId = getArguments().getInt("image_id");
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.pred3, container, false);
        mImageView = view.findViewById(R.id.imageFrag3);
        mImageView.setImageResource(mImageId);
        return view;
    }
}