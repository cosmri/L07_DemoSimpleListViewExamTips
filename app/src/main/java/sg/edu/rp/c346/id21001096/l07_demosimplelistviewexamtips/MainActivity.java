package sg.edu.rp.c346.id21001096.l07_demosimplelistviewexamtips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    String[] examTipsArray;
    ArrayAdapter <String> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Array");

        examTipsArray = new String[5]; //data
        examTipsArray[0] = "Don't just read the code, code it as much as possible during each practical session";
        examTipsArray[1] = "Seek help from the lecturer ASAP, don't wait till you lost in the jungle";
        examTipsArray[2] = "Prepare your template source code for each topic";
        examTipsArray[3] = "Create a few empty Android projects to speed up your coding during the exam";
        examTipsArray[4] = "5Ensure that your Android Studio is up and running before the exam" ;

        lv = findViewById(R.id.lv); //UI

        aa = new ArrayAdapter<>(MainActivity.this, //where
                android.R.layout. //how
                        simple_list_item_1, examTipsArray); //what

        lv.setAdapter(aa);


    }
}