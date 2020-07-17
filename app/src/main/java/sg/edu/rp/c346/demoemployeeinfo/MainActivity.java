package sg.edu.rp.c346.demoemployeeinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView lvEmployeeInfo;
    ArrayList<EmployeeInfo> alEmployeeInfo;
    //ArrayList<Info> aaEmployeeInfo;
    CustomAdapter adapter;
    TextView tv1 , tv2 , tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.textViewName);
        tv2 = findViewById(R.id.textViewTitle);
        tv3 = findViewById(R.id.textViewSalary);
        lvEmployeeInfo=findViewById(R.id.listViewEmployee);

        alEmployeeInfo=new ArrayList<>();

        EmployeeInfo item1= new EmployeeInfo("John","Software Technical Leader", 3400.0);
        EmployeeInfo item2= new EmployeeInfo("May", "Programmer",2200.0);

        alEmployeeInfo.add(item1);
        alEmployeeInfo.add(item2);

        adapter = new CustomAdapter(this, R.layout.row, alEmployeeInfo);
        lvEmployeeInfo.setAdapter(adapter);

    }
}
