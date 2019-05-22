package com.example.hocspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.model.NhanVien;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText txtNgay,txtTen;
    Button btnXacNhan;

    Spinner spThu;
    ArrayList<String>dsThu;
    ArrayAdapter<String>adapterThu;
    int lastSlected=-1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addCpontrols();
        addEvents();
    }

    private void addCpontrols() {
        txtTen = findViewById(R.id.txtTen);
        txtNgay = findViewById(R.id.txtNgay);
        btnXacNhan = findViewById(R.id.btnXacNhan);

        spThu = findViewById(R.id.spThu);
        dsThu = new ArrayList<>();
        dsThu.add("Thứ 2");
        dsThu.add("Thứ 3");
        dsThu.add("Thứ 4");
        dsThu.add("Thứ 5");
        dsThu.add("Thứ 6");
        dsThu.add("Thứ 7");
        dsThu.add("Chủ Nhật");
        adapterThu = new ArrayAdapter<String>(
                MainActivity.this,
                android.R.layout.simple_spinner_item,
                dsThu
        );
        adapterThu.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spThu.setAdapter(adapterThu);
    }

    private void addEvents() {
     btnXacNhan.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             xulyXacNhan();
         }
     });
     spThu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
         @Override
         public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
             Toast.makeText(MainActivity.this,"Bạn chọn: "+dsThu.get(position),Toast.LENGTH_LONG).show();
             lastSlected=position;
         }

         @Override
         public void onNothingSelected(AdapterView<?> parent) {

         }
     });
    }

    private void xulyXacNhan() {
    if (lastSlected==-1)
    {
        Toast.makeText(MainActivity.this,"Bạn chưa chọn thứ đi công tác: ",Toast.LENGTH_LONG).show();
        return;
    }
        NhanVien nv=new NhanVien();
    nv.setTenNhanVien(txtTen.getText().toString());
    nv.getThuBatDauCongTac(dsThu.get(lastSlected));
    nv.setSoNgayCongTac(Integer.parseInt(txtNgay.getText().toString()));

    Toast.makeText(MainActivity.this,nv.toString(),Toast.LENGTH_LONG).show();
    }
}
