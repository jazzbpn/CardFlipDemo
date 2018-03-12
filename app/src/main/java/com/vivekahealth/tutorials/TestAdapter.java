package com.vivekahealth.tutorials;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wajahatkarim3.easyflipview.EasyFlipView;

import java.util.ArrayList;

public class TestAdapter extends RecyclerView.Adapter<TestAdapter.NoticeViewHolder> {

    private ArrayList<TestModel> list;

    public TestAdapter(ArrayList<TestModel> arrayList) {
        this.list = arrayList;
    }

    @Override
    public NoticeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.single_row, parent, false);
        return new NoticeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final NoticeViewHolder holder, final int position) {

        if (holder.flipView.getCurrentFlipState() == EasyFlipView.FlipState.FRONT_SIDE && list.get(
                position).isFlipped) {
            holder.flipView.setFlipDuration(0);
            holder.flipView.flipTheView();
        } else if (holder.flipView.getCurrentFlipState() == EasyFlipView.FlipState.BACK_SIDE
                && !list.get(position).isFlipped) {
            holder.flipView.setFlipDuration(0);
            holder.flipView.flipTheView();
        }
        holder.flipView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (list.get(position).isFlipped) {
                    list.get(position).isFlipped = false;
                } else {
                    list.get(position).isFlipped = true;
                }
                holder.flipView.setFlipDuration(700);
                holder.flipView.flipTheView();
            }
        });
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class NoticeViewHolder extends RecyclerView.ViewHolder {

        EasyFlipView flipView;

        NoticeViewHolder(View itemView) {
            super(itemView);
            flipView = (EasyFlipView) itemView.findViewById(R.id.flipView);
        }
    }
}