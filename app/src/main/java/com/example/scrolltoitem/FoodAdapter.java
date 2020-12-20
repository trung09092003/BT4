package com.example.scrolltoitem;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder>{
    private List<Food> mlistFood;

    public FoodAdapter(List<Food> mlistFood) {
        this.mlistFood = mlistFood;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_food,parent,false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        Food food=mlistFood.get(position);
        if(food==null){
            return;
        }
        holder.imageFood.setImageResource(food.getImg());
        holder.tvNameFood.setText(food.getName());



    }

    @Override
    public int getItemCount() {
        if(mlistFood!=null){
            return mlistFood.size();
        }
        return 0;
    }

    public class  FoodViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageFood;
        private TextView tvNameFood;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            imageFood = itemView.findViewById(R.id.img_food);
            tvNameFood= itemView.findViewById(R.id.tv_name_food);
        }
    }

}
