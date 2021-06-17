package com.example.moody;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class HelperAdapterUserList extends RecyclerView.Adapter {

    Context context;
    ArrayList<String> arrayList, contactedUserId;

    public HelperAdapterUserList(Context context, ArrayList<String> arrayList, ArrayList<String> contacted_user_id) {
        this.context = context;
        this.arrayList = arrayList;
        this.contactedUserId = contacted_user_id;
    }

    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_lists_history, parent, false);
        ViewHolderClass viewHolderClass = new ViewHolderClass(view);
        return viewHolderClass;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull RecyclerView.ViewHolder viewHolder, int position) {
        ViewHolderClass viewHolderClass = (ViewHolderClass) viewHolder;
        viewHolderClass.textView.setText(arrayList.get(position));

        viewHolderClass.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(context, "test", Toast.LENGTH_LONG).show();
            }
        });

        viewHolderClass.checkBox_select.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // viewHolderClass.m1.setVisibility(View.VISIBLE);

                    //MainActivity.q3.put(contactedUserId.get(viewHolderClass.getAdapterPosition()), "");
                } else {
                    // MainActivity.q3.remove(contactedUserId.get(viewHolderClass.getAdapterPosition()));
                    // viewHolderClass.m1.setVisibility(View.INVISIBLE);

                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolderClass extends RecyclerView.ViewHolder {
        TextView textView;
        CheckBox checkBox_select;

        public ViewHolderClass(@NonNull @NotNull View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.user_name_history);
            checkBox_select = (CheckBox) itemView.findViewById(R.id.checkbox_select_history);

        }
    }
}
