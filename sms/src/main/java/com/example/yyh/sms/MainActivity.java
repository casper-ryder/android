package com.example.yyh.sms;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends Activity {
    private ListView listView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.SmsChannelsListView);

        //数据源
        List<HashMap<String,Object>> mylist = new ArrayList<HashMap<String, Object>>();
        HashMap<String,Object> map1 = new HashMap<String,Object>();
        map1.put("title", "客服实时类");
        map1.put("image",R.mipmap.arrow);
        HashMap<String,Object> map2 = new HashMap<String,Object>();
        map2.put("title","电销实时类");
        map2.put("image",R.mipmap.arrow);
        HashMap<String,Object> map3 = new HashMap<String,Object>();
        map3.put("title","异业实时类");
        map3.put("image",R.mipmap.arrow);
        mylist.add(map1);
        mylist.add(map2);
        mylist.add(map3);

        //配置适配器
        SimpleAdapter adapter = new SimpleAdapter(
                this,
                mylist,
                R.layout.activity_smschannels,
                new String[]{"title","image"},
                new int[]{R.id.channelTitle,R.id.channel_arrow});

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                            @Override
                                            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                                Intent intent = new Intent();
                                                intent.setClass(MainActivity.this,SendSmsActivity.class);
                                                startActivity(intent);
                                            }
                                        }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_add) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,AddAccountActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
