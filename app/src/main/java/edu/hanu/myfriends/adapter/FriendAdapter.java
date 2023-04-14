package edu.hanu.myfriends.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import edu.hanu.myfriends.model.Friend;

public class FriendAdapter extends RecyclerView.Adapter<FriendAdapter.FriendHolder>{


    @NonNull
    @Override
    public FriendHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull FriendHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class FriendHolder extends RecyclerView.ViewHolder {

        public FriendHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
