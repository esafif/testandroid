package com.example.safif.test1.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.safif.test1.Model.ContentModel;
import com.example.safif.test1.R;
import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ContentAdapter extends RecyclerView.Adapter<ContentAdapter.ContentViewHolder>{

    private List<ContentModel> contentList;
    private Context context;

    public ContentAdapter(Context context,List<ContentModel> contentList){
        this.context = context;
        this.contentList = contentList;
    }

    public class ContentViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        TextView nama_user;
        TextView content;
        TextView date;
        RatingBar rtbarsmall;
        ImageView contentimage;
        ImageView image_prof;

        ContentViewHolder(View itemView) {
            super(itemView);
            mView = itemView;

            nama_user = mView.findViewById(R.id.nama_user);
            content = mView.findViewById(R.id.content_fill);
            date = mView.findViewById(R.id.tanggal_content);
            rtbarsmall = mView.findViewById(R.id.ratingBarsmall);
            contentimage = mView.findViewById(R.id.image_content);
            image_prof = mView.findViewById(R.id.profile_image);
        }
    }

    @NonNull
    @Override
    public ContentAdapter.ContentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.list_content, viewGroup, false);
        return new ContentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContentAdapter.ContentViewHolder contentViewHolder, int i) {
        float value_rt = contentList.get(i).getReview();

        contentViewHolder.nama_user.setText(contentList.get(i).getName_user());
        contentViewHolder.content.setText(contentList.get(i).getContent());
        contentViewHolder.date.setText(contentList.get(i).getDate_content());
        contentViewHolder.rtbarsmall.setRating(value_rt);


        Picasso.Builder builder = new Picasso.Builder(context);
        builder.downloader(new OkHttp3Downloader(context));
        builder.build().load(contentList.get(i).getImage_prof())
                .placeholder((R.drawable.ic_launcher_background))
                .error(R.drawable.ic_launcher_background)
                .into(contentViewHolder.image_prof);
    }

    @Override
    public int getItemCount() {
        return contentList.size();
    }
}
