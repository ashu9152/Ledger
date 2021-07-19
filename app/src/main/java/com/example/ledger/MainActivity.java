package com.example.ledger;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.ledgerRV);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        MyData[] myData = new MyData[]{
                new MyData("Test1","Human Marketing Developer","Mumbai",R.drawable.sharingan),
                new MyData("Test2","Software Developer","Delhi",R.drawable.yoda),
                new MyData("Test3","Software Tester","Mumbai",R.drawable.sharingan),
                new MyData("Test4","Human Resource","Delhi",R.drawable.yoda),
                new MyData("Test5","Human Marketing Developer","Mumbai",R.drawable.sharingan),
                new MyData("Test6","Software Developer","Delhi",R.drawable.yoda),
                new MyData("Test7","Software Tester","Mumbai",R.drawable.sharingan),
                new MyData("Test8","Cyber Security","Delhi",R.drawable.yoda),
                new MyData("Test9","Human Marketing Developer","Mumbai",R.drawable.sharingan),
                new MyData("Test10","Software Developer","Delhi",R.drawable.yoda),

        };

        LedgerAdapter ledgerAdapter = new LedgerAdapter(myData,MainActivity.this);
        recyclerView.setAdapter(ledgerAdapter);
    }
}