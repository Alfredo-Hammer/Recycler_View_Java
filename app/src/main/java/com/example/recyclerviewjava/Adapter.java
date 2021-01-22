package com.example.recyclerviewjava;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.Viewholder> {

    private List<ModelClass> modelClasses;

    public Adapter(List<ModelClass> modelClasses) {
        this.modelClasses = modelClasses;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vIew = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new Viewholder(vIew);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        int resource = modelClasses.get(position).getImageResourse();
        String title = modelClasses.get(position).getTitle();
        String body = modelClasses.get(position).getBody();
        holder.setData(resource,title,body);
    }

    @Override
    public int getItemCount() {
        return modelClasses.size();
    }

    class  Viewholder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView title;
        private TextView body;

        public Viewholder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.image_view);
            title = itemView.findViewById(R.id.title);
            body = itemView.findViewById(R.id.body);
        }
        private  void setData(int resource, String titleText,String bodyText){
            imageView.setImageResource(resource);
            title.setText(titleText);
            body.setText(bodyText);
        }
    }
}
