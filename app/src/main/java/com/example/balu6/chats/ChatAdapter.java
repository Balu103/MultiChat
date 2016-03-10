package com.example.balu6.chats;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by balu6 on 09.03.2016.
 */
public class ChatAdapter extends ArrayAdapter<ChatItem> {

    private List<ChatItem> data;
    private Context context;

    public ChatAdapter(Context context, List<ChatItem> data) {
        super(context, R.layout.contact_layout);
        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount() {
        // возвращаем количество элементов списка
        return data.size();
    }

    @Override
    public ChatItem getItem(int position) {
        // получение одного элемента по индексу
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    // заполнение элементов списка
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        ChatItem chatItem = data.get(position);

        View view = inflater.inflate(R.layout.contact_layout, parent, false);;


        TextView tw = (TextView)view.findViewById(R.id.userName);
        tw.setText(chatItem.getName());
        tw = (TextView)view.findViewById(R.id.lastMsg);
        tw.setText(chatItem.getLastMsg());
        tw = (TextView)view.findViewById(R.id.lastMsgDate);
        tw.setText(chatItem.getLastMsgDate().toString());

        return view;
    }
}
