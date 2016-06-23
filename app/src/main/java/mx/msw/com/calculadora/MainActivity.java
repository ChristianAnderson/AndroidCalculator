package mx.msw.com.calculadora;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txt_result;
    private Button btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9;
    private Button btn_11, btn_15, btn_13, btn_14;
    // 11 sma
    // 12 resta
    // 13 multiplica
    // 14 divide
    // 15 Resultado

    private int resultado = 0, flag = 0, temp1 = 0;
    private String espacio = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface dekar = Typeface.createFromAsset(getAssets(), "fonts/Dekar.otf");

        // Pantalla de resultado general
        txt_result = (TextView) findViewById(R.id.txt_result);

        btn_0=(Button)findViewById(R.id.btn_0);
        btn_1=(Button)findViewById(R.id.btn_1);
        btn_2=(Button)findViewById(R.id.btn_2);
        btn_3=(Button)findViewById(R.id.btn_3);
        btn_4=(Button)findViewById(R.id.btn_4);
        btn_5=(Button)findViewById(R.id.btn_5);
        btn_6=(Button)findViewById(R.id.btn_6);
        btn_7=(Button)findViewById(R.id.btn_7);
        btn_8=(Button)findViewById(R.id.btn_8);
        btn_9=(Button)findViewById(R.id.btn_9);
        btn_11=(Button)findViewById(R.id.btn_11);
        btn_15=(Button)findViewById(R.id.btn_15);


    }

    public String spaceScreen()
    {
        String contentResult = txt_result.getText().toString();
        int contentR = contentResult.length();
        if(contentR < 8 )
        {
            return "1";
        }
        return "0";
    }
    public void insertToScreen(View v) {
        int btn = v.getId();
        String content = txt_result.getText().toString();


        switch (btn) {
            case R.id.btn_0:
                espacio = spaceScreen();
                if(espacio == "1")
                {
                    txt_result.setText(content + btn_0.getText().toString());

                }
                else if(espacio =="0")
                {
                    break;
                }
                break;
            case R.id.btn_1:
                espacio = spaceScreen();
                if(espacio == "1")
                {
                    txt_result.setText(content + btn_1.getText().toString());

                }
                else if(espacio =="0")
                {
                    break;
                }
                break;
            case R.id.btn_2:
                espacio = spaceScreen();
                if(espacio == "1")
                {
                    txt_result.setText(content + btn_2.getText().toString());

                }
                else if(espacio =="0")
                {
                    break;
                }
                break;
            case R.id.btn_3:
                espacio = spaceScreen();
                if(espacio == "1")
                {
                    txt_result.setText(content + btn_3.getText().toString());

                }
                else if(espacio =="0")
                {
                    break;
                }
                break;
            case R.id.btn_4:
                espacio = spaceScreen();
                if(espacio == "1")
                {
                    txt_result.setText(content + btn_4.getText().toString());

                }
                else if(espacio =="0")
                {
                    break;
                }
                break;
            case R.id.btn_5:
                espacio = spaceScreen();
                if(espacio == "1")
                {
                    txt_result.setText(content + btn_5.getText().toString());

                }
                else if(espacio =="0")
                {
                    break;
                }
                break;
            case R.id.btn_6:
                espacio = spaceScreen();
                if(espacio == "1")
                {
                    txt_result.setText(content + btn_6.getText().toString());

                }
                else if(espacio =="0")
                {
                    break;
                }
                break;
            case R.id.btn_7:
                espacio = spaceScreen();
                if(espacio == "1")
                {
                    txt_result.setText(content + btn_7.getText().toString());

                }
                else if(espacio =="0")
                {
                    break;
                }
                break;
            case R.id.btn_8:
                espacio = spaceScreen();
                if(espacio == "1")
                {
                    txt_result.setText(content + btn_8.getText().toString());

                }
                else if(espacio =="0")
                {
                    break;
                }
                break;
            case R.id.btn_9:
                espacio = spaceScreen();
                if(espacio == "1")
                {
                    txt_result.setText(content + btn_9.getText().toString());

                }
                else if(espacio =="0")
                {
                    break;
                }
                break;
            //limpiar Clear
            case R.id.btn_10:
                txt_result.setText("");
                flag = 0;
                content = "";
                temp1 = 0;
                break;
            //suma
            case R.id.btn_11:
                try {
                    if (flag == 1)
                    {
                        temp1 = temp1 + Integer.parseInt(txt_result.getText().toString());
                    }
                    else if(flag > 0 && flag != 1)
                    {
                        txt_result.setText("");
                        flag = 1;
                        break;
                    }
                    else
                    {
                        temp1 = Integer.parseInt(txt_result.getText().toString());
                    }
                }
                catch (Exception e)
                {
                    break;
                }
                txt_result.setText("");
                flag = 1;
                break;
            //resta
            case R.id.btn_12:
                try {
                    if (flag == 2)
                    {
                        temp1 = temp1 - Integer.parseInt(txt_result.getText().toString());
                    }
                    else if(flag > 0 && flag != 2)
                    {
                        txt_result.setText("");
                        flag = 2;
                        break;
                    }
                    else
                    {
                        temp1 = Integer.parseInt(txt_result.getText().toString());
                    }
                }
                catch (Exception e)
                {
                    break;
                }
                txt_result.setText("");
                flag = 2;
                break;
            //Multiplicacion
            case R.id.btn_13:
                try
                {
                    if( flag == 3 )
                    {
                        temp1 = temp1 * Integer.parseInt(txt_result.getText().toString());
                    }
                    else if ( flag > 0 && flag != 3 )
                    {
                        txt_result.setText("");
                        flag = 3;
                        break;
                    }
                    else
                    {
                        temp1 = Integer.parseInt(txt_result.getText().toString());
                    }
                }
                catch(Exception e)
                {
                    break;
                }
                txt_result.setText("");
                flag = 3;
                break;
            //Resultado
            case R.id.btn_15:
                try
                {
                    if (flag == 1)
                    {//suma
                        content = txt_result.getText().toString();
                        resultado = Integer.parseInt(content);
                        txt_result.setText(String.valueOf(resultado + temp1));
                    }
                    else if (flag == 2)
                    {//resta
                        content = txt_result.getText().toString();
                        resultado = Integer.parseInt(content);
                        txt_result.setText(String.valueOf(temp1 - resultado));
                    }
                    else if ( flag == 3)
                    {
                        content = txt_result.getText().toString();
                        resultado = Integer.parseInt(content);
                        txt_result.setText(String.valueOf(temp1 * resultado));
                    }

                    //Result of the final action
                    temp1 = Integer.parseInt(txt_result.getText().toString());
                    flag = 0;
                }
                catch (Exception e  )
                {
                    break;
                }
                break;
        }
    }
}

