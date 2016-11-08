package com.hbf;

import android.app.ListActivity;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.Contacts;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;

public class SimpleCursorAdapterActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Cursor cur = getContentResolver().query(Contacts.People.CONTENT_URI,null,null,null,null);
        startManagingCursor(cur);

        ListAdapter adapter = new SimpleCursorAdapter(this, android.R.layout.simple_list_item_1, cur, new String[] {Contacts.People.NAME}, new int[] {android.R.id.text1});
        setListAdapter(adapter);
    }
}
