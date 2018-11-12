package com.example.realtimedb;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.UserHolder> {

    private List<Post> mPostList;

    public PostAdapter(List<Post> posts) {
        mPostList = posts;
    }

    @NonNull
    @Override
    public UserHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View itemView = inflater.inflate(R.layout.item_view, viewGroup, false);

        UserHolder holder = new UserHolder(itemView);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull UserHolder userHolder, int i) {
        Post post = mPostList.get(i);
        TextView firstNameTextView = userHolder.titleTextView;
        TextView lastNameTextView = userHolder.dateTextView;

        firstNameTextView.setText(post.title);
        lastNameTextView.setText(post.date);
    }

    @Override
    public int getItemCount() {
        return mPostList.size();
    }

    public class UserHolder extends RecyclerView.ViewHolder {
        public TextView titleTextView;
        public TextView dateTextView;

        public UserHolder(@NonNull View itemView) {
            super(itemView);

            titleTextView = (TextView)itemView.findViewById(R.id.postTitle);
            dateTextView = (TextView) itemView.findViewById(R.id.postDate);
        }
    }
}
