package com.example.halimuzzaman.calculator;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText display;
    String text;
    double operand1;
    double operand2;
    double result;
    int operation = 0; //operation 1 = plus, operation 2 = minus, operation 3 = multiply, operation 4 = division
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = (EditText)findViewById(R.id.display);
        text = display.getText().toString();
    }

    @Override
    public boolean onMenuOpened(int featureId, Menu menu) {
        Toast.makeText(this, "Menu Pressed...!", Toast.LENGTH_SHORT).show();
        return super.onMenuOpened(featureId, menu);
    }

    public void oneButtonPress(View v)
    {
        //String text = display.getText().toString();

        if(text.length() < 14)
        {
            text += "1";
            display.setText(text);
        }
        else
        {
            display.setText(text);
        }

    }

    public void twoButtonPress(View v)
    {
        //EditText display = (EditText)findViewById(R.id.display);
       // String text = display.getText().toString();
        if(text.length() < 14)
        {
            text += "2";
            display.setText(text);
        }
        else
        {
            display.setText(text);
        }
    }

    public void threeButtonPress(View v)
    {
        //EditText display = (EditText)findViewById(R.id.display);
        //String text = display.getText().toString();
        if(text.length() < 14)
        {
            text += "3";
            display.setText(text);
        }
        else
        {
            display.setText(text);
        }
    }

    public void fourButtonPress(View v)
    {
       // EditText display = (EditText)findViewById(R.id.display);
      //  String text = display.getText().toString();
        if(text.length() < 14)
        {
            text += "4";
            display.setText(text);
        }
        else
        {
            display.setText(text);
        }
    }

    public void fiveButtonPress(View v)
    {
       // EditText display = (EditText)findViewById(R.id.display);
       // String text = display.getText().toString();
        if(text.length() < 14)
        {
            text += "5";
            display.setText(text);
        }
        else
        {
            display.setText(text);
        }
    }

    public void sixButtonPress(View v)
    {
       // EditText display = (EditText)findViewById(R.id.display);
       // String text = display.getText().toString();
        if(text.length() < 14)
        {
            text += "6";
            display.setText(text);
        }
        else
        {
            display.setText(text);
        }
    }

    public void savenButtonPress(View v)
    {
       // EditText display = (EditText)findViewById(R.id.display);
       // String text = display.getText().toString();
        if(text.length() < 14)
        {
            text += "7";
            display.setText(text);
        }
        else
        {
            display.setText(text);
        }
    }

    public void eightButtonPress(View v)
    {
      //  EditText display = (EditText)findViewById(R.id.display);
       // String text = display.getText().toString();
        if(text.length() < 14)
        {
            text += "8";
            display.setText(text);
        }
        else
        {
            display.setText(text);
        }
    }

    public void nineButtonPress(View v)
    {
      //  EditText display = (EditText)findViewById(R.id.display);
      //  String text = display.getText().toString();
        if(text.length() < 14)
        {
            text += "9";
            display.setText(text);
        }
        else
        {
            display.setText(text);
        }
    }

    public void zeroButtonPress(View v)
    {
       // EditText display = (EditText)findViewById(R.id.display);
     //   String text = display.getText().toString();
        if(text.length() < 14)
        {
            text += "0";
            display.setText(text);
        }
        else
        {
            display.setText(text);
        }
    }

    public void dotButtonPress(View v)
    {
        // EditText display = (EditText)findViewById(R.id.display);
        //  String text = display.getText().toString();
        if(text.length() < 14)
        {
            text += ".";
            display.setText(text);
        }
        else
        {
            display.setText(text);
        }
    }
    public void plusButtonPress(View v)
    {
        if(text.length() != 0)
        {
            operand1 = Double.parseDouble(text);
            operation = 1;
            text = "";
            display.setText("");
        }
        else
        {
            makeToast("Enter Operand First..!");
        }
    }

    public void minusButtonPress(View v)
    {
        if(text.length() != 0)
        {
            operand1 = Double.parseDouble(text);
            operation = 2;
            text = "";
            display.setText("");
        }
        else
        {
            makeToast("Enter Operand First..!");
        }
    }

    public void multiplyButtonPress(View v)
    {
        if(text.length() != 0)
        {
            operand1 = Double.parseDouble(text);
            operation = 3;
            text = "";
            display.setText("");
        }
        else
        {
            makeToast("Enter Operand First..!");
        }
    }

    public void divisionButtonPress(View v)
    {
        if(text.length() != 0)
        {
            operand1 = Double.parseDouble(text);
            operation = 4;
            text = "";
            display.setText("");
        }
        else
        {
            makeToast("Enter Operand First..!");
        }
    }

    public void delButtonPress(View v)
    {

        StringBuilder str = new StringBuilder(text);
        if(display.getSelectionStart() > 0)
        {
            str.deleteCharAt(display.getSelectionStart());
            display.setText(str);
        }
        else
        {
            if(text.length() >= 1)
            {
                text = text.substring(0,(text.length()-1));
                display.setText(text);
            }
            else
            {
                display.setText("");
            }
        }

    }


    public void equalButtonPress(View v)
    {
        if(text.length() != 0)
        {
            operand2 = Double.parseDouble(text);
            if(operation == 4 && (operand2 == 0 || operand2 == 0.0))    // divided by zero exception
            {
                operation = 0;
                text = "";
                display.setText("");
                makeAlert("Undefined Result..!");
            }
            else
            {
                if(String.valueOf(text)==null)
                {
                    makeToast("Enter Operand");
                }
                else
                {
                    calculate(operation);
                }
            }
        }
        else
        {
            makeToast("Enter Operand First..!");
        }
    }

    public void clearButtonPress(View v)
    {
        text = null;
        display.setText(text);
    }

    public void cancelButtonPress(View v)
    {
        text = "";
        operation = 0;
        display.setText(text);
    }

    public void calculate(int option)
    {
        switch(option)
        {
            case 1:
                result = operand1 + operand2;
                break;
            case 2:
                result = operand1 - operand2;
                break;
            case 3:
                result = operand1 * operand2;
                break;
            case 4:
                result = operand1 / operand2;
                break;
            default:
                break;
        }

        if(String.valueOf(result).length() > 14)
        {
            makeAlert("Result Limit Exceeded...!");
            text = "";
            display.setText(text);
        }
        else
        {
            display.setText(String.valueOf(result));
        }
        operation = 0;
        text = "";
    }

    public void makeToast(String message)
    {
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
    }

    public void makeAlert(String message)
    {
        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("Error");
        alertDialog.setMessage(message);
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();
    }

}
