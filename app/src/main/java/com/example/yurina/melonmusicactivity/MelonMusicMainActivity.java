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

        datas = new Datas();

        datas.setAlbumimg("http://cdnimg.melon.co.kr/cm/album/images/101/56/195/10156195_500.jpg/melon/resize/120/quality/80/optimize");
        datas.setSongname("What is Love?");
        datas.setSinger("TWICE (트와이스)");
        datas.setAlbumname("What is Love?");
        datas.setGood(R.mipmap.a);
        arrayList.add(datas);

        datas = new Datas();

        datas.setAlbumimg("http://cdnimg.melon.co.kr/cm/album/images/101/53/531/10153531_500.jpg/melon/resize/120/quality/80/optimize");
        datas.setSongname("바코드 (Prod. GroovyRoom)");
        datas.setSinger("김하온 (HAON), 이병재 (Vinxen)");
        datas.setAlbumname("고등래퍼2 팀대항전 Part 3");
        datas.setGood(R.mipmap.b);

        arrayList.add(datas);

        datas = new Datas();

        datas.setAlbumimg("http://cdnimg.melon.co.kr/cm/album/images/101/54/916/10154916_500.jpg/melon/resize/120/quality/80/optimize");
        datas.setSongname("EVERYDAY");
        datas.setSinger("WINNER");
        datas.setAlbumname("EVERYD4Y");
        datas.setGood(R.mipmap.c);

        arrayList.add(datas);

        datas = new Datas();

        datas.setAlbumimg("http://cdnimg.melon.co.kr/cm/album/images/101/47/314/10147314_500.jpg/melon/resize/120/quality/80/optimize");
        datas.setSongname("꽃 길");
        datas.setSinger("BIGBANG");
        datas.setAlbumname("꽃 길");
        datas.setGood(R.mipmap.d);

        arrayList.add(datas);

        datas = new Datas();

        datas.setAlbumimg("http://cdnimg.melon.co.kr/cm/album/images/101/45/303/10145303_500.jpg/melon/resize/120/quality/80/optimize");
        datas.setSongname("별이 빛나는 밤");
        datas.setSinger("마마무");
        datas.setAlbumname("Yellow Flower");
        datas.setGood(R.mipmap.e);

        arrayList.add(datas);

        datas = new Datas();

        datas.setAlbumimg("http://cdnimg.melon.co.kr/cm/album/images/101/32/945/10132945_500.jpg/melon/resize/120/quality/80/optimize");
        datas.setSongname("사랑을 했다 (LOVE SCENARIO)");
        datas.setSinger("IKON");
        datas.setAlbumname("Return");
        datas.setGood(R.mipmap.f);

        arrayList.add(datas);

        datas = new Datas();

        datas.setAlbumimg("http://cdnimg.melon.co.kr/cm/album/images/101/31/018/10131018_500.jpg/melon/resize/120/quality/80/optimize");
        datas.setSongname("You");
        datas.setSinger("멜로망스");
        datas.setAlbumname("투유 프로젝트 - 슈가맨2 Part.2");
        datas.setGood(R.mipmap.g);

        arrayList.add(datas);

        datas = new Datas();

        datas.setAlbumimg("http://cdnimg.melon.co.kr/cm/album/images/101/06/853/10106853_500.jpg/melon/resize/120/quality/80/optimize");
        datas.setSongname("지나오다");
        datas.setSinger("닐로 (Nilo)");
        datas.setAlbumname("About You");
        datas.setGood(R.mipmap.h);

        arrayList.add(datas);

        datas = new Datas();

        datas.setAlbumimg("http://cdnimg.melon.co.kr/cm/album/images/101/24/822/10124822_500.jpg/melon/resize/120/quality/80/optimize");
        datas.setSongname("뿜뿜");
        datas.setSinger("모모랜드 (MOMOLAND)");
        datas.setAlbumname("GREAT!");
        datas.setGood(R.mipmap.i);

        arrayList.add(datas);

        datas = new Datas();

        datas.setAlbumimg("http://cdnimg.melon.co.kr/cm/album/images/101/48/752/10148752_500.jpg/melon/resize/120/quality/80/optimize");
        datas.setSongname("북 (Prod. SLO)");
        datas.setSinger("배연서 (WEBSTER B), 오담률 (CHIN CHILLA)");
        datas.setAlbumname("고등래퍼2 팀대항전 Part.1");
        datas.setGood(R.mipmap.j);

        arrayList.add(datas);

        datas = new Datas();

        datas.setAlbumimg("http://cdnimg.melon.co.kr/cm/album/images/101/10/396/10110396_500.jpg/melon/resize/120/quality/80/optimize");
        datas.setSongname("My Way");
        datas.setSinger("이수 (엠씨 더 맥스)");
        datas.setAlbumname("돈꽃 OST Part.1");
        datas.setGood(R.mipmap.k);

        arrayList.add(datas);

        datas = new Datas();

        datas.setAlbumimg("http://cdnimg.melon.co.kr/cm/album/images/101/15/186/10115186_500.jpg/melon/resize/120/quality/80/optimize");
        datas.setSongname("그날처럼");
        datas.setSinger("장덕철");
        datas.setAlbumname("그날처럼");
        datas.setGood(R.mipmap.l);

        arrayList.add(datas);

        datas = new Datas();

        datas.setAlbumimg("http://cdnimg.melon.co.kr/cm/album/images/101/56/597/10156597_500.jpg/melon/resize/120/quality/80/optimize");
        datas.setSongname("花요일 (Blooming Day)");
        datas.setSinger("EXO-CBX (첸백시)");
        datas.setAlbumname("Blooming Days - The 2nd Mini Album");
        datas.setGood(R.mipmap.m);

        arrayList.add(datas);

        datas = new Datas();

        datas.setAlbumimg("http://cdnimg.melon.co.kr/cm/album/images/101/51/113/10151113_500.jpg/melon/resize/120/quality/80/optimize");
        datas.setSongname("어린 왕자 (Prod. Godic)");
        datas.setSinger("김하온 (HAON), 박준호 (PULLIK)");
        datas.setAlbumname("등래퍼2 팀대항전 Part.2");
        datas.setGood(R.mipmap.n);

        arrayList.add(datas);

        datas = new Datas();

        datas.setAlbumimg("http://cdnimg.melon.co.kr/cm/album/images/026/75/179/2675179_500.jpg/melon/resize/120/quality/80/optimize");
        datas.setSongname("HandClap");
        datas.setSinger("Fitz & The Tantrums");
        datas.setAlbumname("Fitz and The Tantrums (Deluxe)");
        datas.setGood(R.mipmap.o);

        arrayList.add(datas);

        datas = new Datas();

        datas.setAlbumimg("http://cdnimg.melon.co.kr/cm/album/images/101/44/723/10144723_2_500.jpg/melon/resize/120/quality/80/optimize");
        datas.setSongname("BOOMERANG (부메랑)");
        datas.setSinger("Wanna One (워너원)");
        datas.setAlbumname("0+1=1 (I PROMISE YOU)");
        datas.setGood(R.mipmap.p);

        arrayList.add(datas);

        datas = new Datas();

        datas.setAlbumimg("http://cdnimg.melon.co.kr/cm/album/images/101/45/963/10145963_500.jpg/melon/resize/120/quality/80/optimize");
        datas.setSongname("Jenga (Feat. Gaeko)");
        datas.setSinger("헤이즈 (Heize)");
        datas.setAlbumname("바람");
        datas.setGood(R.mipmap.q);

        arrayList.add(datas);

        datas = new Datas();

        datas.setAlbumimg("http://cdnimg.melon.co.kr/cm/album/images/101/29/940/10129940_500.jpg/melon/resize/120/quality/80/optimize");
        datas.setSongname("Roller Coaster");
        datas.setSinger("청하");
        datas.setAlbumname("Offset");
        datas.setGood(R.mipmap.r);

        arrayList.add(datas);

        datas = new Datas();

        datas.setAlbumimg("http://cdnimg.melon.co.kr/cm/album/images/101/55/857/10155857_500.jpg/melon/resize/120/quality/80/optimize");
        datas.setSongname("탓 (Prod. BOYCOLD)");
        datas.setSinger("이병재 (Vinxen)");
        datas.setAlbumname("고등래퍼2 Semi Final");
        datas.setGood(R.mipmap.s);

        arrayList.add(datas);

        datas = new Datas();

        datas.setAlbumimg("http://cdnimg.melon.co.kr/cm/album/images/101/37/574/10137574_500.jpg/melon/resize/120/quality/80/optimize");
        datas.setSongname("그때 헤어지면 돼");
        datas.setSinger("로이킴");
        datas.setAlbumname("그때 헤어지면 돼");
        datas.setGood(R.mipmap.t);

        arrayList.add(datas);

        datas = new Datas();

        datas.setAlbumimg("http://cdnimg.melon.co.kr/cm/album/images/100/78/176/10078176_500.jpg/melon/resize/120/quality/80/optimize");
        datas.setSongname("선물");
        datas.setSinger("멜로망스");
        datas.setAlbumname("Moonlight");
        datas.setGood(R.mipmap.u);

        arrayList.add(datas);

        datas = new Datas();

        datas.setAlbumimg("http://cdnimg.melon.co.kr/cm/album/images/101/50/572/10150572_500.jpg/melon/resize/120/quality/80/optimize");
        datas.setSongname("소나기 (Feat. 10cm)");
        datas.setSinger("용준형");
        datas.setAlbumname("소나기 (Feat. 10cm)");
        datas.setGood(R.mipmap.v);

        arrayList.add(datas);

        datas = new Datas();

        datas.setAlbumimg("http://cdnimg.melon.co.kr/cm/album/images/100/85/877/10085877_500.jpg/melon/resize/120/quality/80/optimize");
        datas.setSongname("Havana (Feat. Young Thug)");
        datas.setSinger("Camila Cabello");
        datas.setAlbumname("Camila");
        datas.setGood(R.mipmap.w);

        arrayList.add(datas);

        datas = new Datas();

        datas.setAlbumimg("http://cdnimg.melon.co.kr/cm/album/images/101/34/032/10134032_500.jpg/melon/resize/120/quality/80/optimize");
        datas.setSongname("Bad Boy");
        datas.setSinger("Red Velvet (레드벨벳)");
        datas.setAlbumname("The Perfect Red Velvet - The 2nd Album Repackage");
        datas.setGood(R.mipmap.x);

        arrayList.add(datas);

        datas = new Datas();

        datas.setAlbumimg("http://cdnimg.melon.co.kr/cm/album/images/101/44/723/10144723_2_500.jpg/melon/resize/120/quality/80/optimize");
        datas.setSongname("약속해요 (I.P.U.)");
        datas.setSinger("Wanna One (워너원)");
        datas.setAlbumname("0+1=1 (I PROMISE YOU)");
        datas.setGood(R.mipmap.y);

        arrayList.add(datas);

        datas = new Datas();

        datas.setAlbumimg("http://cdnimg.melon.co.kr/cm/album/images/100/13/929/10013929_500.jpg/melon/resize/120/quality/80/optimize");
        datas.setSongname("비행운");
        datas.setSinger("문문 (MoonMoon)");
        datas.setAlbumname("LIFE IS BEAUTY FULL");
        datas.setGood(R.mipmap.z);

        arrayList.add(datas);
        datas = new Datas();

        datas.setAlbumimg("http://cdnimg.melon.co.kr/cm/album/images/101/55/857/10155857_500.jpg/melon/resize/120/quality/80/optimize");
        datas.setSongname("Adios (Prod. BOYCOLD)");
        datas.setSinger("김하온 (HAON)");
        datas.setAlbumname("고등래퍼2 Semi Final");
        datas.setGood(R.mipmap.a1);

        arrayList.add(datas);
        datas = new Datas();

        datas.setAlbumimg("http://cdnimg.melon.co.kr/cm/album/images/101/51/113/10151113_500.jpg/melon/resize/120/quality/80/optimize");
        datas.setSongname("Like It (Feat. 행주, 보이비)");
        datas.setSinger("배연서 (WEBSTER B), 윤진영 (Clloud)");
        datas.setAlbumname("고등래퍼2 팀대항전 Part.2");
        datas.setGood(R.mipmap.b1);

        arrayList.add(datas);

        datas = new Datas();

        datas.setAlbumimg("http://cdnimg.melon.co.kr/cm/album/images/100/97/064/10097064_500.jpg/melon/resize/120/quality/80/optimize");
        datas.setSongname("이 별");
        datas.setSinger("길구봉구");
        datas.setAlbumname("Star");
        datas.setGood(R.mipmap.c1);

        arrayList.add(datas);
        datas = new Datas();

        datas.setAlbumimg("http://cdnimg.melon.co.kr/cm/album/images/101/02/177/10102177_500.jpg/melon/resize/120/quality/80/optimize");
        datas.setSongname("가을 안부");
        datas.setSinger("먼데이 키즈");
        datas.setAlbumname("가을 안부");
        datas.setGood(R.mipmap.u);

        arrayList.add(datas);


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

            View view = inflater.from(parent.getContext()).inflate(R.layout.activity_item, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {

            Glide.with(context).load(Uri.parse(arrayList.get(position).getAlbumimg())).centerCrop().into(holder.albumimg);
            Glide.with(context).load(arrayList.get(position).getGood()).into(holder.good);
            
            holder.songname.setText(arrayList.get(position).getSongname());
            holder.albumname.setText(arrayList.get(position).getAlbumname());
            holder.singer.setText(arrayList.get(position).getSinger());

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
            private TextView singer;

            public ViewHolder(View View) {

                super(View);
                albumimg = View.findViewById(R.id.img1);
                songname = View.findViewById(R.id.songname);
                albumname = View.findViewById(R.id.albumname);
                good = View.findViewById(R.id.good);
                singer = View.findViewById(R.id.singername);

            }
        }
    }
}
