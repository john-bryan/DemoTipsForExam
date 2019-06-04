package sg.edu.rp.c346.demotipsforexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] examTipsArray;
    ListView lvExamTips;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvExamTips = findViewById(R.id.listViewExamTips);

        examTipsArray = new String[5];
        examTipsArray[0] = "Prepare way before the exam";
        examTipsArray[1] = "Practice Coding";
        examTipsArray[2] = "Seek help from lecturer";
        examTipsArray[3] = "Prepare template code";
        examTipsArray[4] = "Create empty projects for MSA";

        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, examTipsArray);
        lvExamTips.setAdapter(adapter);

    }
}
