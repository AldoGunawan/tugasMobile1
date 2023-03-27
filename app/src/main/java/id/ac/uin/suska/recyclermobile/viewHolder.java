package id.ac.uin.suska.recyclermobile;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class viewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView name, email;

    public viewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.img_layout);
        name = itemView.findViewById(R.id.namerec);
        email = itemView.findViewById(R.id.emailv);
    }
}
