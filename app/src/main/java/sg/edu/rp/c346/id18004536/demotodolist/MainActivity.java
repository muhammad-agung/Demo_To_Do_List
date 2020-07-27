package sg.edu.rp.c346.id18004536.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView listViewTodo;

    ArrayList<ToDo> arrayList;

    CustomAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewTodo = findViewById(R.id.listViewTodo);

        arrayList = new ArrayList<>();

        Calendar c = Calendar.getInstance();

        c.set(2020,7,2);
        ToDo emp = new ToDo("Watch Movie", c);


        arrayList.add(emp);

        adapter = new CustomAdapter(this, R.layout.row, arrayList);

        listViewTodo.setAdapter(adapter);

    }
}
