package com.example.up23;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
public class Pred2 extends Fragment {

    private ImageView mImageView;
    private int mImageId;

    public Pred2() {
    }

    public static Pred2 newInstance(int imageId) {
        Pred2 fragment = new Pred2();
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
        View view = inflater.inflate(R.layout.pred2, container, false);
        mImageView = view.findViewById(R.id.imageFrag2);
        mImageView.setImageResource(mImageId);
        return view;
    }
}