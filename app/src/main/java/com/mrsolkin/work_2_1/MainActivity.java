package com.mrsolkin.work_2_1;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.TextView;




public class MainActivity extends AppCompatActivity {

    int quantity = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment (View view) {


        switch (view.getId()){
            case R.id.button1:
                quantity = quantity + 1;
                break;
            case R.id.button2:
                quantity = quantity + 3;
                break;
            case  R.id.button3:
                quantity = quantity + 5;
                break;
        }

        display(quantity);

    }

    public void cleaner (View view) {
        quantity = 0;
        display(quantity);
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
}