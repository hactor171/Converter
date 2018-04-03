package com.example.roman.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    String[] data = {"2 - dwójkowy","3 - trójkowy","4 - czwórkowy","5 - piątkowy","6 - szóstkowy","7 - siódemkowy","8 - ósemkowy","9 - dziewiątkowy","10 - dziesiętny","11 - jedenastkowy","12 - dwunastkowy","13 - trzynastkowy","14 - czternastkowy","15 - piętnastkowy","16 - szesnastkowy"};
    String[] data2 = {"2 - dwójkowy","3 - trójkowy","4 - czwórkowy","5 - piątkowy","6 - szóstkowy","7 - siódemkowy","8 - ósemkowy","9 - dziewiątkowy","10 - dziesiętny","11 - jedenastkowy","12 - dwunastkowy","13 - trzynastkowy","14 - czternastkowy","15 - piętnastkowy","16 - szesnastkowy"};

    public long AllToDec(long liczba, int format) {
        long decimal = 0;
        int p = 0;
            while (liczba != 0) {
                decimal += ((liczba % 10) * Math.pow(format, p));
                liczba = liczba / 10;
                p++;
            }
        return decimal;
    }
    public String DecToAll(long liczba, int format) {

        long rs;
        String czyslo="";

        char bin[]={'0','1'};
        char f_3[]={'0','1','2'};
        char f_4[]={'0','1','2','3'};
        char f_5[]={'0','1','2','3','4'};
        char f_6[]={'0','1','2','3','4','5'};
        char f_7[]={'0','1','2','3','4','5','6'};
        char oct[]={'0','1','2','3','4','5','6','7'};
        char f_9[]={'0','1','2','3','4','5','6','7','8'};
        char f_11[]={'0','1','2','3','4','5','6','7','8','9','A'};
        char f_12[]={'0','1','2','3','4','5','6','7','8','9','A','B'};
        char f_13[]={'0','1','2','3','4','5','6','7','8','9','A','B','C'};
        char f_14[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D'};
        char f_15[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E'};
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        if(format == 2) {
            while (liczba > 0) {
                rs = liczba % 2;
                czyslo = bin[(int) rs] + czyslo;
                liczba = liczba / 2;
            }
        } else if(format == 3) {
            while (liczba > 0) {
                rs = liczba % 3;
                czyslo = f_3[(int) rs] + czyslo;
                liczba = liczba / 3;
            }
        } else if(format == 4) {
            while (liczba > 0) {
                rs = liczba % 4;
                czyslo = f_4[(int) rs] + czyslo;
                liczba = liczba / 4;
            }
        } else if(format == 5) {
            while (liczba > 0) {
                rs = liczba % 5;
                czyslo = f_5[(int) rs] + czyslo;
                liczba = liczba / 5;
            }
        } else if(format == 6) {
            while (liczba > 0) {
                rs = liczba % 6;
                czyslo = f_6[(int) rs] + czyslo;
                liczba = liczba / 6;
            }
        } else if(format == 7) {
            while (liczba > 0) {
                rs = liczba % 7;
                czyslo = f_7[(int) rs] + czyslo;
                liczba = liczba / 7;
            }
        } else if(format == 8) {
            while (liczba > 0) {
                rs = liczba % 8;
                czyslo = oct[(int) rs] + czyslo;
                liczba = liczba / 8;
            }
        } else if(format == 9) {
            while (liczba > 0) {
                rs = liczba % 9;
                czyslo = f_9[(int) rs] + czyslo;
                liczba = liczba / 9;
            }
        } else if(format == 11) {
            while (liczba > 0) {
                rs = liczba % 11;
                czyslo = f_11[(int) rs] + czyslo;
                liczba = liczba / 11;
            }
        } else if(format == 12) {
            while (liczba > 0) {
                rs = liczba % 12;
                czyslo = f_12[(int) rs] + czyslo;
                liczba = liczba / 12;
            }
        } else if(format == 13) {
            while (liczba > 0) {
                rs = liczba % 13;
                czyslo = f_13[(int) rs] + czyslo;
                liczba = liczba / 13;
            }
        } else if(format == 14) {
            while (liczba > 0) {
                rs = liczba % 14;
                czyslo = f_14[(int) rs] + czyslo;
                liczba = liczba / 14;
            }
        } else if(format == 15) {
            while (liczba > 0) {
                rs = liczba % 15;
                czyslo = f_15[(int) rs] + czyslo;
                liczba = liczba / 15;
            }
        } else if(format == 16) {
            while (liczba > 0) {
                rs = liczba % 16;
                czyslo = hex[(int) rs] + czyslo;
                liczba = liczba / 16;
            }
        }

        return czyslo;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final Spinner spinner = (Spinner) findViewById(R.id.data);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, data);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        final Spinner spinner2 = (Spinner) findViewById(R.id.data2);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, data2);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

        final EditText Dec = (EditText) findViewById(R.id.Dec);
        final EditText Bin = (EditText) findViewById(R.id.Bin);

        Dec.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {}

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {

                       String tekst = spinner.getSelectedItem().toString();
                       String tekst2 = spinner2.getSelectedItem().toString();

                       String n_tekst = "";
                       String n_tekst2 = "";

                       if(tekst.equals("10 - dziesiętny") || tekst.equals("11 - jedenastkowy") || tekst.equals("12 - dwunastkowy") || tekst.equals("13 - trzynastkowy")
                               || tekst.equals("14 - czternastkowy") || tekst.equals("15 - piętnastkowy") || tekst.equals("16 - szesnastkowy")) {
                           n_tekst = tekst.substring(0, 2);
                       } else {
                           n_tekst = tekst.substring(0, 1);
                       }
                       if( tekst2.equals("10 - dziesiętny") || tekst2.equals("11 - jedenastkowy") || tekst2.equals("12 - dwunastkowy") || tekst2.equals("13 - trzynastkowy")
                               || tekst2.equals("14 - czternastkowy") || tekst2.equals("15 - piętnastkowy") || tekst2.equals("16 - szesnastkowy")) {
                           n_tekst2 = tekst2.substring(0, 2);
                       } else {
                           n_tekst2 = tekst2.substring(0, 1);
                       }
                       int format = Integer.parseInt(n_tekst);
                       int convert = Integer.parseInt(n_tekst2);

                       if(format == convert) {
                           long i = Long.parseLong(s.toString());
                           Bin.setText(String.valueOf(i));
                       }
                       if (format == 10 && convert != 10) {
                           long i = Long.parseLong(s.toString());
                           String b = DecToAll(i, convert);
                           Bin.setText(b);
                       } else if(convert == 10 && format != 10) {
                           long i = Long.parseLong(s.toString());
                           long b = AllToDec(i, format);
                           Bin.setText(String.valueOf(b));
                       }
            }
        });

    }
}