package com.example.balu6.messages;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import com.example.balu6.chats.R;

import java.util.ArrayList;
import java.util.List;

public class MessageActivity extends AppCompatActivity {
    ListView listView = null;
    MessageAdapter adapter = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.messages_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        /*setSupportActionBar(toolbar);*/
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = (ListView) findViewById(R.id.listView);

        List<MessageItem> strings = new ArrayList<>();
        fiilArray(strings);
        adapter = new MessageAdapter(this, strings);

        listView.setAdapter(adapter);
        listView.setDivider(null);
        listView.setDividerHeight(0);

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
        if (id == R.id.action_settings) {
            return true;
        }

        if (id == android.R.id.home) {
            NavUtils.navigateUpFromSameTask(this);
        }

        return super.onOptionsItemSelected(item);
    }

    public void sendMsg(View view) {
        EditText text = (EditText)findViewById(R.id.editText);
        adapter.add(new MessageItem(text.getText().toString(), true));
        adapter.notifyDataSetChanged();
        text.getText().clear();
        scrollMyListViewToBottom();
    }

    private void scrollMyListViewToBottom() {
        listView.post(new Runnable() {
            @Override
            public void run() {
                // Select the last row so it will scroll into view...
                listView.setSelection(listView.getAdapter().getCount() - 1);
            }
        });
    }

    private void fiilArray(List<MessageItem> strings){
        strings.add(new MessageItem("h bh bjh bjh bhbhbjhbjb hbh bh bjh b hb1", true));
        strings.add(new MessageItem("2 kjb kjn jkn kj nkj njnjnjn njjjjjn  nn n n n n nn jnkjn ", false));
        strings.add(new MessageItem("3jnjnjnkjnjn jnjnkjn jnkjnkjn knsda asd asd1", true));
        strings.add(new MessageItem("ddasd  sa1", true)); strings.add(new MessageItem("h bh bjh bjh bhbhbjhbjb hbh bh bjh b hb1", true));
        strings.add(new MessageItem("2 kjb kjn jkn kj nkj njnjnjn njjjjjn  nn n n n n nn jnkjn ", false));
        strings.add(new MessageItem("3jnjnjnkjnjn jnjnkjn jnkjnkjn knsda asd asd1", true));
        strings.add(new MessageItem("ddasd  sa1", true)); strings.add(new MessageItem("h bh bjh bjh bhbhbjhbjb hbh bh bjh b hb1", true));
        strings.add(new MessageItem("2 kjb kjn jkn kj nkj njnjnjn njjjjjn  nn n n n n nn jnkjn ", false));
        strings.add(new MessageItem("3jnjnjnkjnjn jnjnkjn jnkjnkjn knsda asd asd1", true));
        strings.add(new MessageItem("ddasd  sa1", true)); strings.add(new MessageItem("h bh bjh bjh bhbhbjhbjb hbh bh bjh b hb1", true));
        strings.add(new MessageItem("2 kjb kjn jkn kj nkj njnjnjn njjjjjn  nn n n n n nn jnkjn ", false));
        strings.add(new MessageItem("3jnjnjnkjnjn jnjnkjn jnkjnkjn knsda asd asd1", true));
        strings.add(new MessageItem("ddasd  sa1", true)); strings.add(new MessageItem("h bh bjh bjh bhbhbjhbjb hbh bh bjh b hb1", true));
        strings.add(new MessageItem("2 kjb kjn jkn kj nkj njnjnjn njjjjjn  nn n n n n nn jnkjn ", false));
        strings.add(new MessageItem("3jnjnjnkjnjn jnjnkjn jnkjnkjn knsda asd asd1", true));
        strings.add(new MessageItem("ddasd  sa1", true)); strings.add(new MessageItem("h bh bjh bjh bhbhbjhbjb hbh bh bjh b hb1", true));
        strings.add(new MessageItem("2 kjb kjn jkn kj nkj njnjnjn njjjjjn  nn n n n n nn jnkjn ", false));
        strings.add(new MessageItem("3jnjnjnkjnjn jnjnkjn jnkjnkjn knsda asd asd1", true));
        strings.add(new MessageItem("ddasd  sa1", true)); strings.add(new MessageItem("h bh bjh bjh bhbhbjhbjb hbh bh bjh b hb1", true));
        strings.add(new MessageItem("2 kjb kjn jkn kj nkj njnjnjn njjjjjn  nn n n n n nn jnkjn ", false));
        strings.add(new MessageItem("3jnjnjnkjnjn jnjnkjn jnkjnkjn knsda asd asd1", true));
        strings.add(new MessageItem("ddasd  sa1", true)); strings.add(new MessageItem("h bh bjh bjh bhbhbjhbjb hbh bh bjh b hb1", true));
        strings.add(new MessageItem("2 kjb kjn jkn kj nkj njnjnjn njjjjjn  nn n n n n nn jnkjn ", false));
        strings.add(new MessageItem("3jnjnjnkjnjn jnjnkjn jnkjnkjn knsda asd asd1", true));
        strings.add(new MessageItem("ddasd  sa1", true)); strings.add(new MessageItem("h bh bjh bjh bhbhbjhbjb hbh bh bjh b hb1", true));
        strings.add(new MessageItem("2 kjb kjn jkn kj nkj njnjnjn njjjjjn  nn n n n n nn jnkjn ", false));
        strings.add(new MessageItem("3jnjnjnkjnjn jnjnkjn jnkjnkjn knsda asd asd1", true));
        strings.add(new MessageItem("ddasd  sa1", true));
    }
}
