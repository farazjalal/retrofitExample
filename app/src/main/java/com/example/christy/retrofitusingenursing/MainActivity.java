package com.example.christy.retrofitusingenursing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.List;

import Adapter.DueListAdapter;
import Api.DueModel;
import Api.MsgModel;
import Api.ResidentDetailsModel;
import Api.ResidentdetailsApi;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ProgressBar progressBar;
    RecyclerView recyclerView;
    LinearLayoutManager mLayoutManager;
    List<MsgModel> list;
    List<DueModel> listDueModel;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.rvDue);
        progressBar=(ProgressBar) findViewById(R.id.progressBar);
        mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        Quotes();
    }
    public void Quotes()
    {
        ResidentdetailsApi residentdetailsApi= RetrofitUtils.getRetrofitAdapter().create(ResidentdetailsApi.class);
        Call<ResidentDetailsModel> call = residentdetailsApi.getValues("residentdetails");
        call.enqueue(new Callback<ResidentDetailsModel>()
        {
            @Override
            public void onResponse(Call<ResidentDetailsModel> call, Response<ResidentDetailsModel> response)
            {
                if (response.isSuccessful())
                {

                    progressBar.setVisibility(View.INVISIBLE);
                    list = response.body().getMsg();
                    for(int i=0;i<list.size();i++)
                    {
                        listDueModel=list.get(i).getDues();


                    if (listDueModel.size() > 0)
                    {


                        DueListAdapter adapter = new DueListAdapter(listDueModel, MainActivity.this);
                        recyclerView.setAdapter(adapter);
                    }
                }
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Failed to getting response", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ResidentDetailsModel> call, Throwable t) {
                progressBar.setVisibility(View.INVISIBLE);
                Log.d("QuotesError", "" + t);
            }
        });
    }
}
