package com.example.mazandaran.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.mazandaran.R;
import com.example.mazandaran.akhlaqi;
import com.example.mazandaran.eteqadat;
import com.example.mazandaran.makan_ziarati;
import com.example.mazandaran.marasem;
import com.example.mazandaran.model.Music;
import com.example.mazandaran.qaza;
import com.example.mazandaran.shirini;
import com.example.mazandaran.tabs;
import com.example.mazandaran.tarikhche;

import java.util.ArrayList;

public class AdapterSearch extends ArrayAdapter {
    public int resourceId;
    public Activity activity;
    public ArrayList<Music> data;
    Music model = new Music();

    /*create object for xml*/
    TextView txtName;

    public AdapterSearch(Activity activity, int resourceId, ArrayList<Music> object) {
        super(activity, resourceId, object);
        this.resourceId = resourceId;
        this.activity = activity;
        this.data = object;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view = convertView;
        view = this.activity.getLayoutInflater().inflate(this.resourceId, null);

        /* Get object from xml file*/
        txtName = view.findViewById(R.id.item_search);

        /*1.set value to model array*/
        model = data.get(position);
        txtName.setText(model.getMusicName());

        /*2.click item list*/
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*get value name from item */
                String title = data.get(position).getMusicName();
                /*if searched titr from main*/
                if (title.contains("گذري بر فرهنگ مازندران")) {
                    tabs.flag_tarikhche = true;
                    if (title.equals("گذري بر فرهنگ مازندران")) { tarikhche.ftarikh=true;}
                    activity.finish();
                } else if (title.contains("آداب و رسوم مازندران") || title.contains("نوروز خوانی") ||
                        title.contains("چهارشنبه سوری") || title.contains("عید نوروز")
                        || title.contains("آرش کمانگیر") || title.contains("آیین سنتی ۲۶ عید ماه")
                        || title.contains("شب یلدا")) {
                    tabs.flag_marasem = true;
                    if (title.equals("آداب و رسوم مازندران")) { marasem.fmarasem6=true;}
                    else if (title.equals("نوروز خوانی")) { marasem.fmarasem0=true;}
                    else if (title.equals("چهارشنبه سوری")) {marasem.fmarasem1=true; }
                    else if (title.equals("عید نوروز")) { marasem.fmarasem2=true;}
                    else if (title.equals("آرش کمانگیر")) { marasem.fmarasem3=true;}
                    else if (title.equals("آیین سنتی ۲۶ عید ماه")) {marasem.fmarasem4 = true;}
                    else if (title.equals("شب یلدا")) {marasem.fmarasem5=true;}
                    activity.finish();

                } else if (title.contains("خصوصیات اخلاقی مازندران") || title.contains("سخت کوشی زنان") ||
                        title.contains("همکاری و تعاون") || title.contains("سایر ویژگی های رفتاری")) {
                    tabs.flag_akhlaqi = true;
                    if (title.equals("خصوصیات اخلاقی مازندران")) { akhlaqi.fakhlagh1=true;}
                    else if (title.equals("سخت کوشی زنان")) { akhlaqi.fakhlagh2=true;}
                    else if (title.equals("همکاری و تعاون")) { akhlaqi.fakhlagh3=true;}
                    else if (title.equals("سایر ویژگی های رفتاری")) {akhlaqi.fakhlagh4=true; }
                    activity.finish();
                } else if (title.contains("اعتقاد و باورهای مردم مازندران") ||
                        title.contains("سنت سحرخوانی در ماه رمضان") || title.contains("اولین روز نوروز تبری")) {
                    tabs.flag_eteqadat = true;
                    if (title.equals("اعتقاد و باورهای مردم مازندران")) { eteqadat.feteghad1=true;}
                    else if (title.equals("سنت سحرخوانی در ماه رمضان")) { eteqadat.feteghad2=true;}
                    else if (title.equals("اولین روز نوروز تبری")) { eteqadat.feteghad3=true;}
                    activity.finish();
                } else if (title.contains("مکان های زیارتی  مازندران") || title.contains("پهنه کلا")
                        || title.contains("امامزاده عبدالله آمل") || title.contains("امامزاده سید صالح قائمشهر") ||
                        title.contains("امامزاده حسین شیرود") || title.contains("امامزاده ابوطالب سوادکوه") ||
                        title.contains("امامزاده عبدالحق")) {
                    tabs.flag_makan_ziarati = true;
                    if (title.equals("مکان های زیارتی  مازندران")) { makan_ziarati.fmakan0=true;}
                    else if (title.equals("پهنه کلا")) { makan_ziarati.fmakan1=true;}
                    else if (title.equals("امامزاده عبدالله آمل")) { makan_ziarati.fmakan2=true;}
                    else if (title.equals("امامزاده سید صالح قائمشهر")) { makan_ziarati.fmakan3=true;}
                    else if (title.equals("امامزاده حسین شیرود")) { makan_ziarati.fmakan4=true;}
                    else if (title.equals("امامزاده ابوطالب سوادکوه")) { makan_ziarati.fmakan5=true;}
                    else if (title.equals("امامزاده عبدالحق")) { makan_ziarati.fmakan6=true;}
                    activity.finish();
                } else if (title.contains("غذاهای محلی مازندران") || title.contains("کدو بره")
                        || title.contains("نازخاتون") || title.contains("خورشت سیر انار") ||
                        title.contains("آش گزنه") || title.contains("بادمجان شکم پُر") ||
                        title.contains("آش کدو")) {
                    tabs.flag_qaza = true;
                    if (title.equals("غذاهای محلی مازندران")) { qaza.fghaza0=true;}
                    else if (title.equals("کدو بره")) { qaza.fghaza1=true;}
                    else if (title.equals("نازخاتون")) {qaza.fghaza2=true; }
                    else if (title.equals("خورشت سیر انار")) { qaza.fghaza3=true;}
                    else if (title.equals("آش گزنه")) { qaza.fghaza4=true;}
                    else if (title.equals("بادمجان شکم پُر")) {qaza.fghaza5 = true;}
                    else if (title.equals("آش کدو")) {qaza.fghaza6=true;}
                    activity.finish();
                } else if (title.contains("شیرینی های محلی مازندران") || title.contains("شیرینی برنجک")
                        || title.contains("آب دندون") || title.contains("اغوزکنا") ||
                        title.contains("پشت زیک") || title.contains("قماق") ||
                        title.contains("نان کوهی")) {
                    tabs.flag_shirini = true;
                    if (title.equals("شیرینی های محلی مازندران")) { shirini.fshirini0=true;}
                    else if (title.equals("شیرینی برنجک")) { shirini.fshirini1=true;}
                    else if (title.equals("آب دندون")) {shirini.fshirini2=true; }
                    else if (title.equals("اغوزکنا")) { shirini.fshirini3=true;}
                    else if (title.equals("پشت زیک")) { shirini.fshirini4=true;}
                    else if (title.equals("قماق")) {shirini.fshirini5 = true;}
                    else if (title.equals("نان کوهی")) {shirini.fshirini6=true;}
                    activity.finish();
                } else if (title.contains("آهنگ های محلی مازندران")) {
                    tabs.flag_ahang = true;
                    activity.finish();
                }
            }
        });
        return view;
    }
}
