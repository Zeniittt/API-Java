package com.example.apijava;


import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.net.UriCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apijava.Data;
import com.example.apijava.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private Activity context;
    private List<Data> dataList;

    public MyAdapter(Activity context, List<Data> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.each_item, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Data currentData = dataList.get(position);
        MediaPlayer mediaPlayer = MediaPlayer.create(context, Uri.parse(currentData.getPreview()));

        holder.title.setText(currentData.getTitle());
        Picasso.get().load(currentData.getAlbum().getCover()).into(holder.image);

        holder.play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        holder.pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView title;
        ImageButton play;
        ImageButton pause;

        public MyViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.musicImage);
            title = itemView.findViewById(R.id.musicTitle);
            play = itemView.findViewById(R.id.btnPlay);
            pause = itemView.findViewById(R.id.btnPause);
        }
    }
}