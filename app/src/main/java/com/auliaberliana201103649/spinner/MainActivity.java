package com.auliaberliana201103649.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;
import android.widget.ArrayAdapter;
public class MainActivity extends AppCompatActivity {
    private Spinner _spinner1, _spinner2, _spinner3, prime_spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _spinner1 = (Spinner) findViewById(R.id.spinner1);
        _spinner2 = (Spinner) findViewById(R.id.spinner2);
        _spinner3 = (Spinner) findViewById(R.id.spinner3);
        prime_spinner = (Spinner) findViewById(R.id.prime_spinner);

        initSpinner1();
        initSpinner2();
        initSpinner3();
        prime_spinner();


    }

    private void initSpinner1() {
        List<String> buahList = new ArrayList<>();
        buahList.add("Rambutan");
        buahList.add("Langsat");
        buahList.add("Durian");
        buahList.add("Nangka");
        buahList.add("Mangga");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, buahList);
        _spinner1.setAdapter(arrayAdapter);
    }

    private void initSpinner2() {
        List<String> mahasiswaList = new ArrayList<>();

        for (int i = 1; i <= 1000; i++) {
            mahasiswaList.add("Mahasiswa ke-" + i);
        }

        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mahasiswaList);
        _spinner2.setAdapter(arrayAdapter2);
    }

    private void initSpinner3() {
        List<String> ganjilList = new ArrayList<>();

        for (int i = 1; i <= 999; i += 2) {
            ganjilList.add("Bilangan ke-" + i);
        }

        ArrayAdapter<String> arrayAdapter3 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ganjilList);
        _spinner3.setAdapter(arrayAdapter3);
    }

    private void prime_spinner() {
        Spinner primeSpinner = findViewById(R.id.prime_spinner);

        ArrayList<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i <= 100; i++) {

            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbers.add(i);
            }


            ArrayAdapter<Integer> adapter = new ArrayAdapter<>(this,
                    android.R.layout.simple_spinner_item, primeNumbers);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            primeSpinner.setAdapter(adapter);
        }
    }
}