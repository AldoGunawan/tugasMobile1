package id.ac.uin.suska.recyclermobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerv);

        List<recyclerItem> items = new ArrayList<recyclerItem>();
        items.add(new recyclerItem("aldo", "Ehe@gmail.com", R.drawable.brother));
        items.add(new recyclerItem("farhan", "farhan@gmail.com", R.drawable.adul));
        items.add(new recyclerItem("sussy", "sussy@gmail.com", R.drawable.coooleah));
        items.add(new recyclerItem("alyss", "alyss@gmail.com", R.drawable.aldick));
        items.add(new recyclerItem("ayang", "ayang@gmail.com", R.drawable.buronan));
        items.add(new recyclerItem("waduh", "Ehe@gmail.com", R.drawable.coooleah));
        items.add(new recyclerItem("i i i iniparahni", "iiiniparahni@gmail.com", R.drawable.adul));
        items.add(new recyclerItem("tenang", "tenangtenang@gmail.com", R.drawable.coooleah));
        items.add(new recyclerItem("waoow", "waduh@gmail.com", R.drawable.aldick));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new adapterRecycler(getApplicationContext(), items));
    }
}