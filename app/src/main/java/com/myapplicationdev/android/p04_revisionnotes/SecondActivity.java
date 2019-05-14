package com.myapplicationdev.android.p04_revisionnotes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

	ListView lv;
	ArrayAdapter aa;
	ArrayList<Note> note;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);

		lv = findViewById(R.id.lv);
		DBHelper db = new DBHelper(SecondActivity.this);

		note = new ArrayList<Note>();
		ArrayList<Note> data = db.getAllNotes();

		aa = new RevisionNotesArrayAdapter(this, R.layout.row, note);
		aa = new RevisionNotesArrayAdapter(this,R.layout.row,data);

		lv.setAdapter(aa);
	}
}
