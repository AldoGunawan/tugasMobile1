package id.ac.uin.suska.recyclermobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapterRecycler extends RecyclerView.Adapter<viewHolder> {


    public adapterRecycler(Context defin, List<recyclerItem> items) {
        this.defin = defin;
        this.items = items;
    }

    Context defin;
    List<recyclerItem> items;
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new viewHolder(LayoutInflater.from(defin).inflate(R.layout.layout_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.name.setText(items.get(position).getName());
        holder.email.setText(items.get(position).getEmail());
        holder.imageView.setImageResource(items.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
