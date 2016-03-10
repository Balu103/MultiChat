package com.example.balu6.messages;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.balu6.chats.R;

import java.util.List;

/**
 * Created by balu6 on 08.03.2016.
 */
public class MessageAdapter extends ArrayAdapter<MessageItem> {


    private List<MessageItem> data;
    private Context context;

    public MessageAdapter(Context context, List<MessageItem> data) {
        super(context, R.layout.ap_msg_layout);
        this.context = context;
        addAll(data);
    }

  /*  @Override
    public int getCount() {
        // возвращаем количество элементов списка
        return data.size();
    }

    @Override
    public MessageItem getItem(int position) {
        // получение одного элемента по индексу
        return data.get(position);
    }

    @Override
    public void add(MessageItem object) {
        super.add(object);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }*/

    // заполнение элементов списка
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        MessageItem messageItem = getItem(position);

        View view = null;
        if (messageItem.isMyMsg()) {
            view = inflater.inflate(R.layout.my_msg_layout, parent, false);
        } else {
            view = inflater.inflate(R.layout.ap_msg_layout, parent, false);
        }

        TextView title = (TextView)view.findViewById(R.id.message);
        title.setText(messageItem.getText());
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();

        title.setMaxWidth((int) (displayMetrics.widthPixels * 0.7));
        return view;
    }
}
