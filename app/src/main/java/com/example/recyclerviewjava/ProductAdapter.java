package com.example.recyclerviewjava;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewoHOlder> {

    private Context mCtx;
    private List<Product> productList;

    public ProductAdapter(Context mCtx, List<Product> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    @NonNull
    @Override
    public ProductViewoHOlder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_layout, null);
        return new ProductViewoHOlder(view);


    }

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    public void onBindViewHolder(@NonNull ProductViewoHOlder holder, int position) {
        Product product = productList.get(position);

        holder.textViewTitle.setText(product.getTitle());
        holder.textViewDeso.setText(product.getShortdeso());
        holder.textViewRating.setText(String.valueOf(product.getRating()));
        holder.textViewPrice.setText(String.valueOf(product.getPrice()));
        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }


    class ProductViewoHOlder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textViewTitle, textViewDeso, textViewRating, textViewPrice;

        public ProductViewoHOlder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.image_view);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewDeso = itemView.findViewById(R.id.textViewShortDesc);
            textViewRating = itemView.findViewById(R.id.textViewRating);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
        }
    }
}
