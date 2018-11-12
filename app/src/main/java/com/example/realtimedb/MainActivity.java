package com.example.realtimedb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);

        List<Post> posts = new ArrayList<Post>();

        Post post1 = new Post("First Post", "2018-11-11");
        Post post2 = new Post("Second Post", "2018-11-12");

        posts.add(post1);
        posts.add(post2);

        PostAdapter adapter = new PostAdapter(posts);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        mRecyclerView.setAdapter(adapter);
    }
}
