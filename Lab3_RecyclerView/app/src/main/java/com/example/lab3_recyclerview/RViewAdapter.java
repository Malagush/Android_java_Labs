package com.example.lab3_recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

import androidx.recyclerview.widget.RecyclerView;


public class RViewAdapter extends RecyclerView.Adapter<RViewAdapter.ViewHolder> {
    private final List<DummyItem> items;

    RViewAdapter(List<DummyItem> items) {
        this.items = items;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_view_item, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.idView.setText(items.get(position).id);
        holder.contentView.setText(items.get(position).content);
        holder.itemView.setTag(items.get(position));
       holder.itemView.setOnClickListener(onClickListener);
    }
    @Override
    public int getItemCount() { return items.size(); }

    class ViewHolder extends RecyclerView.ViewHolder {
        final TextView idView;
        final TextView contentView;

        ViewHolder(View view) {
            super(view);
            idView = view.findViewById(R.id.idView);
            contentView = view.findViewById(R.id.content);
        }

    }

    final private View.OnClickListener onClickListener = new View.OnClickListener() {
       @Override
        public void onClick(View view) {
           TextView ARG_ITEM_ID = view.findViewById(R.id.ARG_ITEM_ID);
           DummyItem item = (DummyItem) view.getTag();
            Context context = view.getContext();
           Intent intent = new Intent(context, DetailActivity.class);
           intent.putExtra(String.valueOf(ARG_ITEM_ID), item.id);
         context.startActivity(intent);
       }
    };
}
