package com.udacity.sandwichclub;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.udacity.sandwichclub.model.Sandwich;
import java.util.List;

public class SandwichAdapter extends RecyclerView.Adapter<SandwichAdapter.ViewHolder> {

    private final List<Sandwich> SandwichList2;

    public SandwichAdapter(List<Sandwich> sandwichList) {
        SandwichList2 = sandwichList;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_view_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder( ViewHolder viewHolder, int i) {
        Sandwich sandwich = SandwichList2.get(i);
        viewHolder.sandwichName.setText(sandwich.getMainName());

    }

    @Override
    public int getItemCount() {
        return SandwichList2.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView sandwichName;

        ViewHolder( View itemView) {
            super(itemView);
            sandwichName = itemView.findViewById(R.id.sandwichName);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View activ) {
                    launchDetailActivity(activ, getAdapterPosition());
                }
            });
        }

        private void launchDetailActivity(View activ, int position) {
            Intent intent = new Intent(activ.getContext(), DetailActivity.class);
            intent.putExtra(DetailActivity.EXTRA_POSITION, position);
            activ.getContext().startActivity(intent);
        }
    }
}
