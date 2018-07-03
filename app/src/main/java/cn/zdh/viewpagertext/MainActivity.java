package cn.zdh.viewpagertext;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextSwitcher;

import java.util.ArrayList;
import java.util.List;

import cn.zdh.viewpagertextlibrary.ViewPagerTextUtils;

public class MainActivity extends AppCompatActivity {
    private TextSwitcher textSwitcher;
    private List<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textSwitcher = (TextSwitcher) findViewById(R.id.ts_text);

        list.add("首次海试项目完成 国产航母预计年底交付海军");
        list.add("索彩礼过多或以贩卖人口论处？兰考回应：将修改");
        list.add("国际锐评：蓬佩奥，一个想当总统的国务卿？");
        list.add("北方多地高温将持续 南方强降雨已影响10余省份");
        list.add("多省份启动公务员招录面试 公务员面试怎么考？");
        list.add("首次海试项目完成 国产航母预计年底交付海军首次海试项目完成 国产航母预计年底交付海军首次海试项目完成 国产航母预计年底交付海军");
        list.add("首次海试项目完成 国产航母预计年底交付海军");


        ViewPagerTextUtils instance = ViewPagerTextUtils.getInstance();
        instance.setText(this, textSwitcher, list);

        instance.setOnClickListener(new ViewPagerTextUtils.OnClickListener() {
            @Override
            public void onClick(int position) {
                list.get(position);

                startActivity(new Intent(MainActivity.this,TextActivity.class).putExtra("tag",list.get(position)));
            }
        });


    }


    @Override
    protected void onDestroy() {
        ViewPagerTextUtils.getInstance().onDestroy();
        super.onDestroy();



    }
}
