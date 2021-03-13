package com.cniao5.cniao5play.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cniao5.cniao5play.R;
import com.cniao5.cniao5play.bean.AppInfo;

import java.util.List;

public class RecomendAppAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private List<AppInfo.DataBean> mDatas;
    private LayoutInflater mLayoutInflater;
    public RecomendAppAdapter(Context context,List<AppInfo.DataBean> appInfos){
        mContext = context;
        this.mDatas = appInfos;
        mLayoutInflater = LayoutInflater.from(context);
    }    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.recomend_recyclerview_item,parent,false);
        return new ReconmendViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ReconmendViewHolder reconmendViewHolder = (ReconmendViewHolder) holder;
        AppInfo.DataBean appInfo = mDatas.get(position);
        reconmendViewHolder.name.setText(appInfo.getName());
        reconmendViewHolder.content.setText(appInfo.getContent());
//        String url = appInfo.getImages().get(0);
//        if (url != null && !url.equals("")){
////            Picasso.with(mContext).load(url).into(reconmendViewHolder.imageView);
//        }
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }


    class ReconmendViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        TextView content;
//        ImageView imageView;
        public ReconmendViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            content = itemView.findViewById(R.id.content);
//            imageView = itemView.findViewById(R.id.image);
        }
    }
}
