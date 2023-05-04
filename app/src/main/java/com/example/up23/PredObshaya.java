package com.example.up23;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

public class PredObshaya extends AppCompatActivity {

    ViewPager onBoardListElement;
    TextView next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pred_ob);

        onBoardListElement = findViewById(R.id.viewPager);
        next = findViewById(R.id.btnSkip);
        ScrollingPagerIndicator indicator = findViewById(R.id.indicator);

        Pred1 fragment1 = new Pred1().newInstance(R.drawable.illustration);
        Pred2 fragment2 = new Pred2().newInstance(R.drawable.pred2);
        Pred3 fragment3 = new Pred3().newInstance(R.drawable.pred3);

        List<Fragment> onBoardList = new ArrayList<>();
        onBoardList.add(fragment1);
        onBoardList.add(fragment2);
        onBoardList.add(fragment3);

        PredAdapter adapter = new PredAdapter(getSupportFragmentManager(), onBoardList);
        onBoardListElement.setAdapter(adapter);
        indicator.attachToPager(onBoardListElement);
        onBoardListElement.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(onBoardListElement.getCurrentItem() == 2) {
                    next.setText("Завершить");
                } else {
                    next.setText("Пропустить");
                }
            }

            @Override
            public void onPageSelected(int position) {
                if(position == 2) {
                    next.setText("Завершить");
                } else {
                    next.setText("Пропустить");
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                if(onBoardListElement.getCurrentItem() == 2) {
                    next.setText("Завершить");
                } else {
                    next.setText("Пропустить");
                }
            }
        });
        next.setOnClickListener(v -> {
            nextBtn(onBoardListElement.getCurrentItem());
        });

    }

    public void nextBtn(int position) {
        if(position == 2) {
            Intent auth = new Intent(this, Vhod_Reg.class);
            startActivity(auth);
            finish();
        }
        onBoardListElement.beginFakeDrag();
        onBoardListElement.fakeDragBy(-800f);
        onBoardListElement.endFakeDrag();
    }

}