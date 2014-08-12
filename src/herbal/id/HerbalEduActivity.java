package herbal.id;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class HerbalEduActivity extends Activity
{
    //---Daftar Gambar yang ingin Ditampilkan---
    Integer[] list_image = {
            R.drawable.adas,
            R.drawable.ademati,
            R.drawable.buah_alpokat,
            R.drawable.alangalang,
            R.drawable.akarwangi,
            R.drawable.bayam,
            
           R.drawable.cempaka_putih,
           R.drawable.ciplukan,
           R.drawable.dadapserep,
            R.drawable.gadung,
            R.drawable.kejibeling,
            R.drawable.kelor,
            R.drawable.kencur,
            R.drawable.mahkotadewa,
            R.drawable.nanas,
            R.drawable.sirih,
           
    };
    String[] str = {"nama: Adas \nManfaat Obat : Sakit perut , Sakit Kuning ","Nama:Adem Ati \nManfaat Obat:Kencing Manis , Radang Usus","Nama:Alpokat \nManfaat Obat:Sariawan,Melembabkan Kulit","Nama:Alang-alang \nManfaat:Penurun Panas","Nama:Akar Wangi \nManfaat Obat:Bau Mulut","Nama: Bayam \nManfaat Obat: Penambah Darah","Nama: Cempaka Putih \nManfaat Obat: Bronkhitis","Nama: Ciplukan \nManfaat Obat: Diabetes Melitus","Nama: Dadap Serep\nManfaat Obat: Anti Radang","Nama: Gadung \nManfaat Obat: Reumatik ","Nama: Keji Beling \nManfaat Obat: Batu Ginjal","Nama: Kelor \nManfaat Obat: Liver ","Nama: Kencur \nManfaat Obat: Radang Lambung","Nama: Mahkota Dewa \nManfaat Obat: Disentri","Nama: Nanas \nManfaat Obat: Sembelit","Nama: Sirih \nManfaat Obat: Sipilis"};

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.herbaledu_layout);

        Gallery gallery = (Gallery) findViewById(R.id.gallery1);

        gallery.setAdapter(new ImageAdapter(this));
        gallery.setOnItemClickListener(new OnItemClickListener()
        {
            public void onItemClick(AdapterView parent,View v, int position, long id)
            {
                Toast.makeText(getBaseContext(),
                       str[position],
                   Toast.LENGTH_LONG).show();

            }
        });
    }

    public class ImageAdapter extends BaseAdapter
    {
        private Context context;
        private int itemBackground;

        public ImageAdapter(Context c)
        {
            context = c;
            //---setting the style---
            TypedArray a = obtainStyledAttributes(R.styleable.Gallery1);
            itemBackground = a.getResourceId(R.styleable.Gallery1_android_galleryItemBackground, 0);
            a.recycle();
        }

        //---returns the number of images---
        public int getCount() {
            return list_image.length;
        }

        //---returns the ID of an item---
        public Object getItem(int position) {
            return position;
        }

        public long getItemId(int position) {
            return position;
        }

        //---returns an ImageView view---
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(list_image[position]);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setLayoutParams(new Gallery.LayoutParams(350, 350));
            imageView.setBackgroundResource(itemBackground);
            return imageView;
        }
    }
}