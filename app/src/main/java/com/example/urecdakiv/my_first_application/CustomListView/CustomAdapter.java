package com.example.urecdakiv.my_first_application.CustomListView;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.urecdakiv.my_first_application.R;

import java.util.ArrayList;




public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.RecViewHolder> {

  private ArrayList<DataModel> alist;

  public CustomAdapter(ArrayList<DataModel> alist) {
    this.alist = alist;
  }

  @Override
  public RecViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

    return new RecViewHolder(LayoutInflater
        .from(parent.getContext())
        .inflate(R.layout.row_item, parent, false));
  }

  @Override
  public void onBindViewHolder(RecViewHolder holder, int position) {
    DataModel dataModel = alist.get(position);
    holder.tvName.setText(dataModel.getName());
    holder.tvSurname.setText(dataModel.getSurname());
    holder.tvEmail.setText(dataModel.getEmail());
    holder.tvPhone.setText(dataModel.getPhone());
  }

  @Override
  public int getItemCount() {
    return alist.size();
  }

  class RecViewHolder extends RecyclerView.ViewHolder {
    TextView tvName, tvSurname, tvEmail, tvPhone;

    public RecViewHolder(View itemView) {
      super(itemView);

      tvName = itemView.findViewById(R.id.tv_name);
      tvSurname = itemView.findViewById(R.id.tv_surname);
      tvEmail = itemView.findViewById(R.id.tv_email);
      tvPhone = itemView.findViewById(R.id.tv_phone);
    }
  }
}

