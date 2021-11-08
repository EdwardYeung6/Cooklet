package com.example.cooklet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.view.LayoutInflater;

public class preparation_adapter extends BaseAdapter {
    private Context context;
    private final String [] name;
    private final double[] value;
    private final String[] measurement;

    public preparation_adapter(Context c, String[] name, double[] value, String[] measurement)
    {
        this.context = c;
        this.name = name;
        this.value = value;
        this.measurement = measurement;
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {

            viewHolder = new preparation_adapter.ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.layout_prepare_data_present, parent, false);
            viewHolder.name_txt = (TextView) convertView.findViewById(R.id.prepare_name_txt);
            viewHolder.value_txt = (TextView) convertView.findViewById(R.id.prepare_value_txt);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (preparation_adapter.ViewHolder) convertView.getTag();
        }

        viewHolder.name_txt.setText(name[position]);
        viewHolder.value_txt.setText(value[position]+measurement[position]);
        return convertView;

    }

    private static class ViewHolder {

        TextView name_txt;
        TextView value_txt;

    }
}
