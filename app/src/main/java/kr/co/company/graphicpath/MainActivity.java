package kr.co.company.graphicpath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;

class Myview extends View {
    public Myview(Context context){
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Path path = new Path();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        path.moveTo(20, 400);
        path.lineTo(300,800);
        path.cubicTo(450,120,600,1200,900,800);
        paint.setColor(Color.BLUE);
        canvas.drawPath(path, paint);

        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(200);
        canvas.drawTextOnPath("This is a test Seoyoon", path, 0, 0, paint);
    }
}

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        Myview w = new Myview(this);
        setContentView(w);
    }
}