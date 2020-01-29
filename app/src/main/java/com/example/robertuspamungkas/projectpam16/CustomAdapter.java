package com.example.robertuspamungkas.projectpam16;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Robertus Pamungkas on 11/30/2016.
 */
public class CustomAdapter extends BaseAdapter {

   Context c;
    ArrayList<Chat> chat;
    public CustomAdapter(Context c, ArrayList<Chat> chat) {
        this.c = c;
        this.chat = chat;
    }
    @Override
    public int getCount() {
        return chat.size();
    }
    @Override
    public Object getItem(int position) {
        return chat.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null)
        {
            convertView= LayoutInflater.from(c).inflate(R.layout.model,parent,false);
        }
        TextView nameTxt= (TextView) convertView.findViewById(R.id.nameTxt);

        TextView descTxt= (TextView) convertView.findViewById(R.id.descTxt);
        final Chat s= (Chat) this.getItem(position);
        nameTxt.setText(s.getName());

        descTxt.setText(s.getText());
        //ONITECLICK
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(c,s.getName(),Toast.LENGTH_SHORT).show();
            }
        });
        return convertView;
    }



}
