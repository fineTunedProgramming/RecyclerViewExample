package com.demo.frame.recyclerviewexample;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;



public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    List<Model> list;

    public Adapter(List<Model> list) {     // adapter sets the list value
        this.list = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())        //creating the view using layout_android_list
                .inflate(R.layout.layout_android_list,null);

        return new MyViewHolder(view);         //passing the created view to the MyViewHolder
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        //setting all list value using position

        final Model model = list.get(position);  // Suppose position = 0 , initially it will get the first list ie
                                            // Model = Android 1.0 Android pie
                                            // Likewise every list is updated here using the position

        final Context itemContext = holder.itemView.getContext();  // getting a single item's context , we need it

        holder.image.setImageDrawable(itemContext.getResources().getDrawable(model.getImage())); // setting image
        holder.name.setText(model.getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //start new Activity here

                Intent intent = new Intent(itemContext,SingleListViewActivity.class);
                intent.putExtra("name",model.getName());  //passing item name and image
                intent.putExtra("image",model.getImage());

                itemContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        //declare components of layout_android_list  here

        public ImageView image;
        public TextView name;
        public MyViewHolder(View itemView) {
            super(itemView);

            //initialise image and name using the itemView
            image = (ImageView) itemView.findViewById(R.id.image);  //use ctrl+click on R.id.image ,make sure image id is correct
            name = (TextView) itemView.findViewById(R.id.name);
        }
    }
}
