package com.anhvu.hacarusmock.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.anhvu.hacarusmock.R;
import com.anhvu.hacarusmock.adapter.MessageListAdapter;
import com.anhvu.hacarusmock.model.Message;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class CoachingActivity extends AppCompatActivity {

    @Bind(R.id.chat_list)
    RecyclerView mListViewChat;

    private MessageListAdapter mAdapter;
    private List<Message> mMessageList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coaching);
        ButterKnife.bind(this);

        mMessageList = new ArrayList<Message>();
        mAdapter = new MessageListAdapter(mMessageList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mListViewChat.setLayoutManager(mLayoutManager);
        mListViewChat.setItemAnimator(new DefaultItemAnimator());
        mListViewChat.setAdapter(mAdapter);

        mListViewChat.postDelayed(new Runnable() {
            @Override
            public void run() {
                sendNewMessage("Hello, Hacarus. This is Leo", false);
                mListViewChat.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        sendNewMessage("Hi, Leo. This is Hacarus", true);
                    }
                }, 1000);
            }
        }, 1000);

    }

    private void sendNewMessage(String message, boolean isSelf) {
        mMessageList.add(new Message(message, isSelf));
        mAdapter.notifyDataSetChanged();
        mListViewChat.invalidate();
    }
}
