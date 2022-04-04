package com.example.calculadora2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txtvDisplay;
    float numero1=0.0f;
    float numero2=0.0f;
    float resultado=0;
    private String display;
    String operacion="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtvDisplay = findViewById(R.id.txtvDisplay);
        display="";

    }


    //region Numeros
    public void onClickCero(View view) {

        float numero=Float.parseFloat(txtvDisplay.getText().toString());
        if(numero==0.0f){
            txtvDisplay.setText("0");
        }else{
            txtvDisplay.setText(txtvDisplay.getText()+"0");
        }
    }
    public void onClickUno(View view) {

        float numero=Float.parseFloat(txtvDisplay.getText().toString());

        if(numero==0.0f){
            txtvDisplay.setText("1");
        }else{
            txtvDisplay.setText(txtvDisplay.getText()+"1");
        }
    }
    public void onClickDos(View view) {
        float numero=Float.parseFloat(txtvDisplay.getText().toString());
        if(numero==0.0f){
            txtvDisplay.setText("2");
        }else{
            txtvDisplay.setText(txtvDisplay.getText()+"2");
        }
    }
    public void onClickTres(View view) {
        float numero=Float.parseFloat(txtvDisplay.getText().toString());
        if(numero==0.0f){
            txtvDisplay.setText("3");
        }else{
            txtvDisplay.setText(txtvDisplay.getText()+"3");
        }
    }
    public void onClickCuatro(View view) {
        float numero=Float.parseFloat(txtvDisplay.getText().toString());
        if(numero==0.0f){
            txtvDisplay.setText("4");
        }else{
            txtvDisplay.setText(txtvDisplay.getText()+"4");
        }
    }
    public void onClickCinco(View view) {
        float numero=Float.parseFloat(txtvDisplay.getText().toString());
        if(numero==0.0f){
            txtvDisplay.setText("5");
        }else{
            txtvDisplay.setText(txtvDisplay.getText()+"5");
        }
    }
    public void onClickSeis(View view) {
        float  numero=Float.parseFloat(txtvDisplay.getText().toString());
        if(numero==0.0f){
            txtvDisplay.setText("6");
        }else{
            txtvDisplay.setText(txtvDisplay.getText()+"6");
        }
    }
    public void onClickSiete(View view) {
        float numero=Float.parseFloat(txtvDisplay.getText().toString());
        if(numero==0.0f){
            txtvDisplay.setText("7");
        }else{
            txtvDisplay.setText(txtvDisplay.getText()+"7");
        }
    }
    public void onClickOcho(View view) {
        float numero=Float.parseFloat(txtvDisplay.getText().toString());
        if(numero==0.0f){
            txtvDisplay.setText("8");
        }else{
            txtvDisplay.setText(txtvDisplay.getText()+"8");
        }
    }
    public void onClickNueve(View view) {
        float numero=Float.parseFloat(txtvDisplay.getText().toString());
        if(numero==0.0f){
            txtvDisplay.setText("9");
        }else{
            txtvDisplay.setText(txtvDisplay.getText()+"9");
        }
    }
    public void onClickPunto(View view) {
        float  numero=Float.parseFloat(txtvDisplay.getText().toString());
        if(numero==0.0f){
            txtvDisplay.setText(".");
        }else{
            txtvDisplay.setText(txtvDisplay.getText()+".");
        }
    }
    //endregion


    //region Operaciones
    public void onClickSumar(View view){
        numero1=Float.parseFloat(txtvDisplay.getText().toString());
        operacion="+";
        txtvDisplay.setText("0");
    }
    public void onClickRestar(View view){
        numero1=Float.parseFloat(txtvDisplay.getText().toString());
        operacion="-";
        txtvDisplay.setText("0");
    }
    public void onClickMultiplicar(View view){
        numero1=Float.parseFloat(txtvDisplay.getText().toString());
        operacion="*";
        txtvDisplay.setText("0");
    }

    public void onClickDividir(View view){
        numero1=Float.parseFloat(txtvDisplay.getText().toString());
        operacion="/";
        txtvDisplay.setText("0");
    }
    public void onClickSeno(View view) {
        double numero=Double.parseDouble(txtvDisplay.getText().toString());
        double resultado=Math.sin(numero);
        //display=String.valueOf(resultado);
        txtvDisplay.setText(resultado+"");
    }
    public void onClickCoseno(View view) {
        double numero=Double.parseDouble(txtvDisplay.getText().toString());
        double resultado=Math.cos(numero);
        //display=String.valueOf(resultado);
        txtvDisplay.setText(resultado+"");
    }
//endregion


    public void onClickIgual(View view){
        numero2=Float.parseFloat(txtvDisplay.getText().toString());
        if(operacion.equals("+")){
            resultado=numero1+numero2;

        }else if(operacion.equals("-")){
         resultado=numero1-numero2;

        }else if(operacion.equals("*")){
            resultado=numero1*numero2;

        }else if(operacion.equals("/")){
            if(numero2==0.0f)
            {
                txtvDisplay.setText( "");
                Toast.makeText(this,"No se puede dividir entre cero", Toast.LENGTH_LONG).show();
            }else
            resultado=numero1/numero2;

        }


        txtvDisplay.setText(resultado +"");
        numero1=0.0f;
        numero2=0.0f;
        resultado=0.0f;
        operacion="";
    }

    public void onClickLimpia(View view) {
        txtvDisplay.setText("0");
        numero1=0.0f;
        numero2=0.0f;
        resultado=0.0f;
        operacion="";
    }


}
