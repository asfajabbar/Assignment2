package com.example.ass_q1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.*;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {


    TextView m1;
    TextView m2;
    TextView m3;
    TextView m4;
    TextView m5;
    TextView m6;
   private Button button;
    ListView list;
    String mnam[]={"Senior Software Engineer Data","Staff Sofware Engineer"};
    String [] mtyp={"HouseCanary","One Medical"};
    String []maddres={"San Francisco,CA","San Francisco,CA"};
    String [] mprice={"$147K-$166K(Glassdoor Est)","$177K-$170K(Glassdoor Est)"};
    String mnew[]={ "","NEW"};
    String butto[]={"EASY APPLY","EASY APPLY"};
    int [] imageid={R.drawable.housecanary,R.drawable.one};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.job);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivity();
            }
        });

        m1=(TextView)findViewById(R.id.textView1);
        m2=(TextView)findViewById(R.id.textView2);
        m3=(TextView)findViewById(R.id.job);
        m4=(TextView)findViewById(R.id.sal);
        m5=(TextView)findViewById(R.id.comp);
        m6=(TextView)findViewById(R.id.tt1);
        list=findViewById(R.id.list);
        MyAdapter adapter=new MyAdapter(this,mnam,mtyp,imageid,maddres,mprice,mnew,butto);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0){
                    Toast.makeText(MainActivity.this, "HouseCanary", Toast.LENGTH_SHORT).show();
                }
                if(position==0){
                    Toast.makeText(MainActivity.this, "One Medical", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    public void openActivity()
    {
        Intent i = new Intent(this,Screen2.class);
        startActivity(i);
    }

    class MyAdapter extends ArrayAdapter<String>{

        Context context;
        String fanam[];
        String fatyp[];
        String faaddres[];
        String faprice[];
        String fanew[];
        String fabutto[];
        int fImgs[];

        MyAdapter(Context c, String nam[], String typ[], int imgs[],String addres[],String price[],String neew[],String buttoo[]) {
            super(c, R.layout.row, R.id.textView1, nam);
            this.context=c;
            this.fanam=nam;
            this.fatyp=typ;
            this.fImgs=imgs;
            this.faaddres=addres;
            this.faprice=price;
            this.fanew=neew;
            this.fabutto=buttoo;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View roww=layoutInflater.inflate(R.layout.row, parent, false);

            ImageView images=roww.findViewById(R.id.image);
            TextView mynam=roww.findViewById(R.id.textView1);
            TextView mytyp=roww.findViewById(R.id.textView2);
            TextView myadddres=roww.findViewById(R.id.textView3);
            TextView myprice=roww.findViewById(R.id.textView4);
            TextView mynew=roww.findViewById(R.id.textView5);
            TextView mybuttoo=roww.findViewById(R.id.button);


            images.setImageResource(fImgs[position]);
            mynam.setText(fanam[position]);
            mytyp.setText(fatyp[position]);
            myadddres.setText(faaddres[position]);
            myprice.setText(faprice[position]);
            mynew.setText(fanew[position]);
            mybuttoo.setText(fabutto[position]);


            return roww;
        }
    }

}
