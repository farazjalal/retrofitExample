package Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.christy.retrofitusingenursing.MainActivity;
import com.example.christy.retrofitusingenursing.R;

import java.util.List;

import Api.DueModel;
import Api.DuetimeModel;

/**
 * Created by admin on 7/12/2018.
 */

public class DueListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context con;
    AtmHolder pvh1;
    List<DueModel> dueModelList;

    public DueListAdapter(List<DueModel> dueModelList, Context con) {
        this.dueModelList = dueModelList;
        this.con = con;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int position) {
        RecyclerView.ViewHolder viewHolder = null;
        if (position == 0) {
            View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_style, viewGroup, false);
            viewHolder = new AtmHolder(v);
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        if (holder instanceof AtmHolder) {
            pvh1 = (AtmHolder) holder;
            pvh1.tv_title.setText(dueModelList.get(position).getTime());
            Toast.makeText(con,dueModelList.get(position).getTime() , Toast.LENGTH_SHORT).show();



            // pvh1.im.setImageDrawable(Drawable.createFromPath(serviceslist.get(position).getImage()));

        }
    }


    public int getItemViewType(int position) {
        int a = 0;
        return a;
    }

    @Override
    public int getItemCount() {
        return dueModelList.size();
    }

    public static class AtmHolder extends RecyclerView.ViewHolder {

        TextView tv_title;


        AtmHolder(View itemView) {
            super(itemView);

            tv_title = itemView.findViewById(R.id.textView);


        }
    }
}


