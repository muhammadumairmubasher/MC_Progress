package com.example.recyclerview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.FriendsViewHolder>{
    private List<Friends> friendsList;
    Activity mAct;
    public RecyclerViewAdapter(List<Friends> friendsList, Activity mAct) {
        this.friendsList = friendsList;
        this.mAct = mAct;
    }

    @NonNull
    @Override
    public FriendsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.friends,parent,false);
        return new FriendsViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull FriendsViewHolder holder, int position) {

        holder.data=friendsList.get(position);
        holder.friendName.setText(holder.data.name);
        holder.friendAge.setText(holder.data.age);
    }

    @Override
    public int getItemCount() {
        return friendsList.size();
    }




    public class FriendsViewHolder extends RecyclerView.ViewHolder {
        Friends data;
        ImageView friendIcon;
        TextView friendName;
        TextView friendAge;
        public FriendsViewHolder(@NonNull View itemView) {
            super(itemView);
            friendIcon = itemView.findViewById(R.id.friendIcon);
            friendName = itemView.findViewById(R.id.friendName);
            friendAge = itemView.findViewById(R.id.friendAge);
        }
    }
}
