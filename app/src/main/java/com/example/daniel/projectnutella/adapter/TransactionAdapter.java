package com.example.daniel.projectnutella.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.daniel.projectnutella.R;
import com.example.daniel.projectnutella.data.Transaction;

import java.util.List;

/**
 * Created by Daniel on 12/7/2016.
 */
public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.TransactionViewHolder>{

    private List<Transaction> transactionList;

    public TransactionAdapter(List<Transaction> tl){
        transactionList = tl;
    }

    @Override
    public int getItemCount() {
        return transactionList.size();
    }

    @Override
    public void onBindViewHolder(TransactionViewHolder holder, int position) {
        Transaction t = transactionList.get(position);
        holder.amountTv.setText(t.getAmount());
        holder.dateTv.setText(t.getDate());
    }

    @Override
    public TransactionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.transaction_layout, parent, false);

        return new TransactionViewHolder(itemView);
    }

    public static class TransactionViewHolder extends RecyclerView.ViewHolder{
        protected ImageView iv;
        protected TextView amountTv;
        protected TextView dateTv;

        public TransactionViewHolder(View v){
            super(v);
            iv = (ImageView) v.findViewById(R.id.cat_image_view);
            amountTv = (TextView) v.findViewById(R.id.t_amount_text_view);
            dateTv = (TextView) v.findViewById(R.id.t_date_text_view);
        }
    }
}