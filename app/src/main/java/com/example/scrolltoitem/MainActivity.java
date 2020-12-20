package com.example.scrolltoitem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
   private RecyclerView rcvFood;
   private Button btCafe, btTrasua,btSuachua;
    GridLayoutManager gridLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btCafe=findViewById(R.id.bt_1);
        btTrasua=findViewById(R.id.bt_2);
        btSuachua=findViewById(R.id.bt_3);

        rcvFood=findViewById(R.id.rcv_food);
        gridLayoutManager = new GridLayoutManager(this, 2);
        rcvFood.setLayoutManager(gridLayoutManager);
        FoodAdapter adapter = new FoodAdapter(getListFood());
        rcvFood.setAdapter(adapter);

        btCafe.setOnClickListener(this);
        btTrasua.setOnClickListener(this);
        btSuachua.setOnClickListener(this);



    }

    private List<Food> getListFood() {
      List<Food> list= new ArrayList<>();
        list.add(new Food(R.drawable.caphe,"cafe",Food.TYPE_CAFE));
        list.add(new Food(R.drawable.caphe,"cafe",Food.TYPE_CAFE));
        list.add(new Food(R.drawable.caphe,"cafe",Food.TYPE_CAFE));
        list.add(new Food(R.drawable.caphe,"cafe",Food.TYPE_CAFE));
        list.add(new Food(R.drawable.caphe,"cafe",Food.TYPE_CAFE));
        list.add(new Food(R.drawable.caphe,"cafe",Food.TYPE_CAFE));
        list.add(new Food(R.drawable.caphe,"cafe",Food.TYPE_CAFE));
        list.add(new Food(R.drawable.caphe,"cafe",Food.TYPE_CAFE));
        list.add(new Food(R.drawable.caphe,"cafe",Food.TYPE_CAFE));
        list.add(new Food(R.drawable.caphe,"cafe",Food.TYPE_CAFE));

        list.add(new Food(R.drawable.trasua,"trasua",Food.TYPE_TRASUA));
        list.add(new Food(R.drawable.trasua,"trasua",Food.TYPE_TRASUA));
        list.add(new Food(R.drawable.trasua,"trasua",Food.TYPE_TRASUA));
        list.add(new Food(R.drawable.trasua,"trasua",Food.TYPE_TRASUA));
        list.add(new Food(R.drawable.trasua,"trasua",Food.TYPE_TRASUA));
        list.add(new Food(R.drawable.trasua,"trasua",Food.TYPE_TRASUA));
        list.add(new Food(R.drawable.trasua,"trasua",Food.TYPE_TRASUA));
        list.add(new Food(R.drawable.trasua,"trasua",Food.TYPE_TRASUA));
        list.add(new Food(R.drawable.trasua,"trasua",Food.TYPE_TRASUA));
        list.add(new Food(R.drawable.trasua,"trasua",Food.TYPE_TRASUA));

        list.add(new Food(R.drawable.suachua,"suachua",Food.TYPE_SUACHUA));
        list.add(new Food(R.drawable.suachua,"suachua",Food.TYPE_SUACHUA));
        list.add(new Food(R.drawable.suachua,"suachua",Food.TYPE_SUACHUA));
        list.add(new Food(R.drawable.suachua,"suachua",Food.TYPE_SUACHUA));
        list.add(new Food(R.drawable.suachua,"suachua",Food.TYPE_SUACHUA));
        list.add(new Food(R.drawable.suachua,"suachua",Food.TYPE_SUACHUA));
        list.add(new Food(R.drawable.suachua,"suachua",Food.TYPE_SUACHUA));
        list.add(new Food(R.drawable.suachua,"suachua",Food.TYPE_SUACHUA));
        list.add(new Food(R.drawable.suachua,"suachua",Food.TYPE_SUACHUA));
        list.add(new Food(R.drawable.suachua,"suachua",Food.TYPE_SUACHUA));

        return list;



    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_1:
                scrolToItem(0);
            break;
            case R.id.bt_2:
                scrolToItem(10);
                break;
            case R.id.bt_3:
                scrolToItem(20);
                break;
        }

    }
    private void scrolToItem(int index) {
        if(gridLayoutManager==null){
            return;
        }
        gridLayoutManager.scrollToPositionWithOffset(index,0);

    }

}