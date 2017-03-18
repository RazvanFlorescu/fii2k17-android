package com.fiipractic.android.widgets;

import com.fiipractic.android.widgets.recyclerview.ContactsAdapter;
import com.fiipractic.android.widgets.recyclerview.SampleData;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by dorunechifor.
 */
public class RecyclerViewActivity extends AppCompatActivity {
    
    private RecyclerView rvContactList;
    private ContactsAdapter mAdapter;
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        
        initViews();
        setUpRecyclerView();
    }
    
    private void initViews() {
        rvContactList = (RecyclerView) findViewById(R.id.rv_contact_list);
    }
    
    private void setUpRecyclerView() {
        mAdapter = new ContactsAdapter(SampleData.generateSampleContactsList());
        rvContactList.setLayoutManager(new LinearLayoutManager(this));
        rvContactList.setAdapter(mAdapter);
    }
}
