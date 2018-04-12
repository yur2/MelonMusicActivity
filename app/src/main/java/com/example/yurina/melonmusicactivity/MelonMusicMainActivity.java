package com.example.yurina.melonmusicactivity;

import android.content.Context;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MelonMusicMainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Datas> arrayList;
    Datas datas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_melon_music_main);
        recyclerView = findViewById(R.id.recyclerview);
        arrayList = new ArrayList<Datas>();

        Datas2();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Myadapter(arrayList, this));


    }

    public void Datas2(){

    }
    public class Myadapter extends RecyclerView.Adapter<Myadapter.ViewHolder>{
        ArrayList<Datas> arrayList;
        Context context;
        LayoutInflater inflater;

        public Myadapter(ArrayList<Datas> arrayList, Context context){
           this.arrayList = arrayList;
           this.context = context;
           inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = inflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {

            Glide.with(context).load(Uri.parse(arrayList.get(position).getAlbumimg())).centerCrop().into(holder.albumimg);
            Glide.with(context).load(arrayList.get(position).getGood()).into(holder.good);
            
            holder.songname.setText(arrayList.get(position).getSongname());
            holder.albumname.setText(arrayList.get(position).getAlbumname());

        }

        @Override
        public int getItemCount() {
            return arrayList.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            private ImageView albumimg;
            private TextView songname;
            private TextView albumname;
            private ImageView good;

            public ViewHolder(View itemView) {
                super(itemView);
                albumimg = itemView.findViewById(R.id.albumimg);
                songname = itemView.findViewById(R.id.songname);
                albumname = itemView.findViewById(R.id.albumname);
                good = itemView.findViewById(R.id.good);

            }
        }
    }
}
