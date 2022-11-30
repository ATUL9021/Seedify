package com.example.mydemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.Toast;
import java.util.ArrayList;


public class AllSeeds extends AppCompatActivity {
RecyclerView recyclerAllSeeds;
ArrayList<AllSeedsModel> list;
AllSeedsAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_seeds);
        list=new ArrayList<>();
        recyclerAllSeeds=findViewById(R.id.recyclerallseeds);
        list.add(new AllSeedsModel(R.drawable.tomatoseeds,"Tomato Seed","21 °C to 27 °C ","5 to 10 Days","Maharashtra, Bihar, Karnataka, Uttar Pradesh, Orissa, Andhra Pradesh, Madhya Pradesh and Assam"));
        list.add(new AllSeedsModel(R.drawable.carrotseed,"Carrot Seed","7 °C to 30 °C ","14 to 21 Days","Karnataka, Punjab, Uttar Pradesh, Tamil Nadu and Andhra Pradesh"));
        list.add(new AllSeedsModel(R.drawable.editpumpkinseed,"Pumpkin Seed","20 °C to 30 °C","100 to 130 Days","Orissa, Assam, Rajasthan and Punjab"));
        list.add(new AllSeedsModel(R.drawable.cabbageseed,"Cabbage Seed","10 °C to 30 °C ","7 to 15 Days","Uttar Pradesh, Odisha, Bihar, Assam, West Bengal, Maharashtra and Karnataka"));
        list.add(new AllSeedsModel(R.drawable.fenugreekseed,"Fenugreek Seed","10 °C to 35 °C ","8 to 15 Days","Gujarat, Madhya Pradesh, Chattisgarh and Uttar Pradesh"));
        list.add(new AllSeedsModel(R.drawable.spongegourdseed,"Sponge Gourd Seed","25 °C to 30 °C ","7 to 10 Days","Punjab, Uttarakhand, Jharkhand, Bihar, and Tarai"));
        list.add(new AllSeedsModel(R.drawable.bittergourdseed,"Bitter Gourd Seed","24 °C to 35 °C ","8 to 10 Days","Maharashtra, Gujarat, Rajasthan, Punjab, Tamil Nadu, Kerala, Karnataka, Andhra Pradesh, West Bengal, Odisha, Assam Uttar Pradesh and Bihar."));
        list.add(new AllSeedsModel(R.drawable.cauliflowerseed,"Cauliflower Seed","17 °C to 20 °C ","7 to 10 Days","Uttarakhand, Uttar Pradesh, Himachal Pradesh, Haryana, Rajasthan, Bihar, Gujarat, Maharashtra, Odisha and Karnataka"));
        list.add(new AllSeedsModel(R.drawable.whiteradishseed,"white Radish Seed","10 °C to 18 °C ","40 to 70 Days","West Bengal, Bihar, Uttar Pradesh, Karnataka, Punjab and Assa"));
        list.add(new AllSeedsModel(R.drawable.spinachseed,"Spinach Seed","12.7 °C to 23.8 °C ","7 to 15 Days","Andhra Pradesh, Telangana, Tamil Nadu, Kerala, Karnataka, Uttar Pradesh, West Bengal, Maharashtra and Gujarat"));
        list.add(new AllSeedsModel(R.drawable.onionseed,"Onion Seed","13 °C to 25 °C ","7 to 10 Days","Maharashtra, Gujarat, Uttar Pradesh, Karnataka, Orissa,Tamil Nadu, Madhya Pradesh, Andhra Pradesh and Bihar"));
        list.add(new AllSeedsModel(R.drawable.cucumberseed,"Cucumber Seed","15 °C to 30 °C ","7 to 15 Days","Karnataka, Tamil Nadu, and Andhra Pradesh"));
        list.add(new AllSeedsModel(R.drawable.broccoliseed,"Broccoli Seed","10 °C to 30 °C ","7 to 10 Days","Mumbai and Pune"));
        list.add(new AllSeedsModel(R.drawable.corianderseed,"Coriander Seed","20 °C to 25 °C ","7 to 21 Days","Madhya Pradesh, Rajasthan, Gujarat and Assam"));
        list.add(new AllSeedsModel(R.drawable.capsicumseed,"Capsicum Seed","18 °C to 25 °C ","14 to 21 Days","West Bengal, Karnataka, Haryana and Jharkhand"));
        list.add(new AllSeedsModel(R.drawable.asparagusseed,"Asparagus Seed","21 °C to 30 °C ","21 to 42 Days","Himachal Pradesh, Karnataka and Tamil Nadu"));
        list.add(new AllSeedsModel(R.drawable.bottlegourdseed,"Bottle Gourd Seed","20 °C to 27 °C ","10 to 14 Days","Bihar, Uttar Pradesh, Madhya Pradesh and Haryana"));
        list.add(new AllSeedsModel(R.drawable.frenchbeanseed,"French Bean Seed","10 °C to 27 °C ","7 to 10 Days","Maharashtra, Jammu  Kashmir, Himachal Pradesh and Uttar Pradesh"));
        list.add(new AllSeedsModel(R.drawable.cluserbeenseed,"Cluster Bean Seed","25 °C to 30 °C ","20 to 30 Days","Rajasthan, Gujarat, Uttar Pradesh and Haryana"));
        list.add(new AllSeedsModel(R.drawable.lemonseed,"Lemon Seed","21 °C to 38 °C ","7 to 14 Days","Andhra Pradesh, Maharashtra, Odisha amd Tamil Nadu"));
        list.add(new AllSeedsModel(R.drawable.watermelonseed,"Watermelon Seed","20 °C to 40 °C ","4 to 12 Days","Puducherry, Tamil Nadu, Andhra Pradesh and Karnataka"));
        list.add(new AllSeedsModel(R.drawable.papayaseed,"Papaya Seed","20 °C to 32 °C ","7 to 30 Days","Andhra Pradesh, Assam, Gujarat, Karnataka, Kerala, Maharashtra, Orissa and West Bengal"));













        AllSeedsAdapter adapter=new AllSeedsAdapter(this,list);
        recyclerAllSeeds.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerAllSeeds.setLayoutManager(linearLayoutManager);
    }







}