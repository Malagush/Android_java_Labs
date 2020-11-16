package com.udacity.sandwichclub;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.udacity.sandwichclub.model.Sandwich;
import com.udacity.sandwichclub.utils.JsonUtils;
import org.json.JSONException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Sandwich> SandwichList;
    private RecyclerView RecyclerViews;
    private SandwichAdapter Sandwich_Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         run_progs();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        RecyclerViews.setLayoutManager(linearLayoutManager);
    }

    public void run_progs(){
        RecyclerViews = findViewById(R.id.sandwich_RecyclerView);
        RecyclerViews.setHasFixedSize(true);

        String[] sandwiches = getResources().getStringArray(R.array.sandwich_names);
        String[] sandwichList = getResources().getStringArray(R.array.sandwich_details);

        SandwichList = new ArrayList<>();
        for (int i = 0; i < sandwiches.length; i++) {
            String json = sandwichList[i];
            Sandwich sandwich = null;
            try {
                sandwich = JsonUtils.parseSandwichJson(json);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            SandwichList.add(sandwich);
        }

        Sandwich_Adapter = new SandwichAdapter(SandwichList);
        RecyclerViews.setAdapter(Sandwich_Adapter);
    }








}
