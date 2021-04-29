package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class RecipeListAdapter extends
        RecyclerView.Adapter<RecipeListAdapter.RecipeViewHolder>  {

    private final LinkedList<Recipe> mRecipeList;
    private LayoutInflater mInflater;

    private Context context;

    public RecipeListAdapter(Context context,
                             LinkedList<Recipe> recipeList) {
        mInflater = LayoutInflater.from(context);
        this.mRecipeList = recipeList;
        this.context = context;
    }

    class RecipeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public final TextView titleItemView;
        public final TextView descriptionItemView;
        final RecipeListAdapter mAdapter;

        public RecipeViewHolder(View itemView, RecipeListAdapter adapter) {
            super(itemView);
            titleItemView = itemView.findViewById(R.id.title);
            descriptionItemView = itemView.findViewById(R.id.description);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            // Get the position of the item that was clicked.
            int mPosition = getLayoutPosition();
            Recipe myRecipe = mRecipeList.get(mPosition);
            Intent intent = new Intent(context, RecipeActivity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("recipe", myRecipe);
            intent.putExtras(bundle);
            context.startActivity(intent);
        }
    }

    @NonNull
    @Override
    public RecipeListAdapter.RecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.recipelist_item,
                parent, false);
        return new RecipeViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeListAdapter.RecipeViewHolder holder, int position) {
        String mCurrentTitle = mRecipeList.get(position).getTitle();
        String mCurrentDescription = mRecipeList.get(position).getDescription();
        holder.titleItemView.setText(mCurrentTitle);
        holder.descriptionItemView.setText(mCurrentDescription);
    }

    @Override
    public int getItemCount() {
        return mRecipeList.size();
    }
}
