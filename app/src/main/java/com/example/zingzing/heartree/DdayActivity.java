package com.example.zingzing.heartree;



    import android.app.Activity;
    import android.app.AlertDialog;
    import android.app.DatePickerDialog;
    import android.content.DialogInterface;
    import android.os.Bundle;
    import android.view.KeyEvent;
    import android.view.View;
    import android.widget.Button;
    import android.widget.DatePicker;
    import android.widget.TextView;

    import java.util.Calendar;





    public class DdayActivity extends Activity {
        TextView textDday;
        TextView textResult,D100,D200,D300,Y1,Y2,Y3,Y5,Y10;
        Button btnDate,BD100,BD200,BD300,BY1,BY2,BY3,BY5,BY10;

        int tYear;
        int tMonth;
        int tDay;

        int dYear=0;
        int dMonth=0;
        int dDay=0;

        long dday;
        long today;
        long result;

        int resultValue=0;
        Calendar calendar;  //Today
        Calendar calendar2;//사귀기 시작한 날







        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_dday);
            setTitle("우리가 사랑한 시간들");


            textDday=(TextView) findViewById(R.id.textDday);//시작날
            textResult=(TextView) findViewById(R.id.textResult);//며칠사귄지
            D100=(TextView) findViewById(R.id.D100);
            D200=(TextView) findViewById(R.id.D200);
            D300=(TextView) findViewById(R.id.D300);
            Y2=(TextView) findViewById(R.id.Y2);
            Y1=(TextView) findViewById(R.id.Y1);
            Y10=(TextView) findViewById(R.id.Y10);
            Y3=(TextView) findViewById(R.id.Y3);
            Y5=(TextView) findViewById(R.id.Y5);
            btnDate=(Button) findViewById(R.id.btnDate);
            BD100=(Button) findViewById(R.id.BD100);
            BD200=(Button) findViewById(R.id.BD200);
            BD300=(Button) findViewById(R.id.BD300);
            BY1=(Button) findViewById(R.id.BY1);
            BY2=(Button) findViewById(R.id.BY2);
            BY3=(Button) findViewById(R.id.BY3);
            BY5=(Button) findViewById(R.id.BY5);
            BY10=(Button) findViewById(R.id.BY10);


        /* 오늘 날짜 구하기 */
            calendar=Calendar.getInstance();
            tYear=calendar.get(Calendar.YEAR);
            tMonth=calendar.get(Calendar.MONTH);
            tDay=calendar.get(Calendar.DAY_OF_MONTH);


        /* 선택 날짜 구하기 */
            calendar2=Calendar.getInstance();
            dYear=calendar2.get(Calendar.YEAR);
            dMonth=calendar2.get(Calendar.MONTH);
            dDay=calendar2.get(Calendar.DAY_OF_MONTH);



        /* 선택 날짜 구하기 */
            btnDate.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    new DatePickerDialog(DdayActivity.this, mDateSetListener, dYear, dMonth, dDay).show();
                }
            });
        /*대화상자 띄우기*/

            BD100.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    AlertDialog.Builder dlg= new AlertDialog.Builder(DdayActivity.this);
                    dlg.setTitle("D-Day");
                    dlg.setMessage("100일이 " + (-resultValue+100) + "일 남았습니다.");
                    dlg.setIcon(R.drawable.hearttree);
                    dlg.setPositiveButton("확인", null);
                    dlg.show();}
            });
            BD200.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    AlertDialog.Builder dlg= new AlertDialog.Builder(DdayActivity.this);
                    dlg.setTitle("D-Day");
                    dlg.setMessage("200일이 " + (-resultValue+200) + "일 남았습니다.");
                    dlg.setIcon(R.drawable.hearttree);
                    dlg.setPositiveButton("확인", null);
                    dlg.show();}

            });
            BD300.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    AlertDialog.Builder dlg= new AlertDialog.Builder(DdayActivity.this);
                    dlg.setTitle("D-Day");
                    dlg.setMessage("300일이 " + (-resultValue+300) + "일 남았습니다.");
                    dlg.setIcon(R.drawable.hearttree);
                    dlg.setPositiveButton("확인", null);
                    dlg.show();}

            });
            BY1.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    AlertDialog.Builder dlg= new AlertDialog.Builder(DdayActivity.this);
                    dlg.setTitle("D-Day");
                    dlg.setMessage("1주년이 " + (-resultValue+365) + "일 남았습니다.");
                    dlg.setIcon(R.drawable.hearttree);
                    dlg.setPositiveButton("확인", null);
                    dlg.show();}
            });
            BY2.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    AlertDialog.Builder dlg= new AlertDialog.Builder(DdayActivity.this);
                    dlg.setTitle("D-Day");
                    dlg.setMessage("2주년이 " + (-resultValue+365*2) + "일 남았습니다.");
                    dlg.setIcon(R.drawable.hearttree);
                    dlg.setPositiveButton("확인", null);
                    dlg.show();}
            });
            BY3.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    AlertDialog.Builder dlg= new AlertDialog.Builder(DdayActivity.this);
                    dlg.setTitle("D-Day");
                    dlg.setMessage("3주년이 " + (-resultValue+365*3) + "일 남았습니다.");
                    dlg.setIcon(R.drawable.hearttree);
                    dlg.setPositiveButton("확인", null);
                    dlg.show();}
            });
            BY5.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    AlertDialog.Builder dlg= new AlertDialog.Builder(DdayActivity.this);
                    dlg.setTitle("D-Day");
                    dlg.setMessage("5주년이 " + (-resultValue+365*5) + "일 남았습니다.");
                    dlg.setIcon(R.drawable.hearttree);
                    dlg.setPositiveButton("확인", null);
                    dlg.show();}
            });
            BY10.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    AlertDialog.Builder dlg= new AlertDialog.Builder(DdayActivity.this);
                    dlg.setTitle("D-Day");
                    dlg.setMessage("10주년이 " + (-resultValue+365*10) + "일 남았습니다.");
                    dlg.setIcon(R.drawable.hearttree);
                    dlg.setPositiveButton("확인", null);
                    dlg.show();}
            });
        }


        DatePickerDialog.OnDateSetListener mDateSetListener=new DatePickerDialog.OnDateSetListener() {
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                dYear=year;
                dMonth=monthOfYear;
                dDay=dayOfMonth;


                calendar2.set(Calendar.YEAR, dYear);
                calendar2.set(Calendar.MONTH, dMonth);
                calendar2.set(Calendar.DATE, dDay);

                today=calendar.getTimeInMillis()/(24*60*60*1000);
                dday=calendar2.getTimeInMillis()/(24*60*60*1000);

                result=today-dday+1;
                resultValue=(int)result;

                UpdateDday();


                calendar2.add(Calendar.DAY_OF_MONTH, 99);
                D100.setText(String.format("%d.%d.%d", calendar2.get(Calendar.YEAR), calendar2.get(Calendar.MONTH) + 1, calendar2.get(Calendar.DAY_OF_MONTH)));
                calendar2.add(Calendar.DAY_OF_MONTH, 100);
                D200.setText(String.format("%d.%d.%d", calendar2.get(Calendar.YEAR), calendar2.get(Calendar.MONTH) + 1, calendar2.get(Calendar.DAY_OF_MONTH)));
                calendar2.add(Calendar.DAY_OF_MONTH, 100);
                D300.setText(String.format("%d.%d.%d", calendar2.get(Calendar.YEAR), calendar2.get(Calendar.MONTH) + 1, calendar2.get(Calendar.DAY_OF_MONTH)));
                calendar2.set(Calendar.YEAR, dYear);
                calendar2.set(Calendar.MONTH, dMonth);
                calendar2.set(Calendar.DATE, dDay);

                calendar2.add(Calendar.YEAR, 1);
                Y1.setText(String.format("%d.%d.%d", calendar2.get(Calendar.YEAR), calendar2.get(Calendar.MONTH) + 1, calendar2.get(Calendar.DAY_OF_MONTH)));
                calendar2.add(Calendar.YEAR, 1);
                Y2.setText(String.format("%d.%d.%d", calendar2.get(Calendar.YEAR), calendar2.get(Calendar.MONTH) + 1, calendar2.get(Calendar.DAY_OF_MONTH)));
                calendar2.add(Calendar.YEAR, 1);
                Y3.setText(String.format("%d.%d.%d", calendar2.get(Calendar.YEAR), calendar2.get(Calendar.MONTH) + 1, calendar2.get(Calendar.DAY_OF_MONTH)));
                calendar2.add(Calendar.YEAR, 2);
                Y5.setText(String.format("%d.%d.%d", calendar2.get(Calendar.YEAR), calendar2.get(Calendar.MONTH) + 1, calendar2.get(Calendar.DAY_OF_MONTH)));
                calendar2.add(Calendar.YEAR, 5);
                Y10.setText(String.format("%d.%d.%d", calendar2.get(Calendar.YEAR), calendar2.get(Calendar.MONTH) + 1, calendar2.get(Calendar.DAY_OF_MONTH)));





            }
        };

        void UpdateDday(){
            textDday.setText(String.format("%d.%d.%d", dYear, dMonth+1, dDay));  //선택 날짜 출력


            if(resultValue >1){
                textResult.setText(String.format("D+%d", resultValue));
            }
            else if(resultValue==1){
                textResult.setText("First Date");
            }
            else
            {
                textResult.setText(String.format("D%d", resultValue));

            }

        }
        public void onClick_back(View v){
            finish();
        }


    }

