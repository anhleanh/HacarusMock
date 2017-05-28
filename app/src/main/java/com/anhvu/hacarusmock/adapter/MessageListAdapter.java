package com.anhvu.hacarusmock.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.anhvu.hacarusmock.R;
import com.anhvu.hacarusmock.model.Message;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by leanh on 10/15/16.
 */

public class MessageListAdapter extends RecyclerView.Adapter<MessageListAdapter.MessageViewHolder> {

    private static final int VIEWTYPE_MESSAGE_LEFT = 1;
    private static final int VIEWTYPE_MESSAGE_RIGHT = 2;
    private List<Message> mMessageList;


    public MessageListAdapter(List<Message> mMessageList) {
        this.mMessageList = mMessageList;
    }

    @Override
    public MessageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        int layoutRes = 0;
        switch (viewType) {
            case VIEWTYPE_MESSAGE_LEFT:
                layoutRes = R.layout.message_item_left;
                break;
            case VIEWTYPE_MESSAGE_RIGHT:
                layoutRes = R.layout.message_item_right;
                break;
        }
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(layoutRes, parent, false);
        return new MessageViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MessageViewHolder holder, int position) {
        Message message = mMessageList.get(position);
        holder.txtMessage.setText(message.getMessage());
    }

    @Override
    public int getItemViewType(int position) {
        Message message = mMessageList.get(position);
        if (!message.isSelf()) {
            return VIEWTYPE_MESSAGE_LEFT;
        } else {
            return VIEWTYPE_MESSAGE_RIGHT;
        }
    }

    @Override
    public int getItemCount() {
        return mMessageList.size();
    }

    public class MessageViewHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.message_item_left_icon_img)
        ImageView imgIcon;
        @Bind(R.id.message_item_left_message_txt)
        TextView txtMessage;

        public MessageViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}
