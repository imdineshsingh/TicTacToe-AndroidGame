package com.quesan.tictactoedesi;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

import static android.R.attr.breadCrumbShortTitle;
import static android.R.attr.end;
import static android.R.attr.finishOnTaskLaunch;
import static android.R.attr.id;
import static android.R.attr.switchMinWidth;
import static android.R.attr.viewportHeight;

public class MainActivity extends AppCompatActivity {

    private Button r1b1,r1b2,r1b3,r2b1,r2b2,r2b3,r3b1,r3b2,r3b3,btnReplay;
    int turn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();

    }


    void initialize()
    {
        r1b1= (Button) findViewById(R.id.r1b1);
        r1b2= (Button) findViewById(R.id.r1b2);
        r1b3= (Button) findViewById(R.id.r1b3);
        r2b1= (Button) findViewById(R.id.r2b1);
        r2b2= (Button) findViewById(R.id.r2b2);
        r2b3= (Button) findViewById(R.id.r2b3);
        r3b1= (Button) findViewById(R.id.r3b1);
        r3b2= (Button) findViewById(R.id.r3b2);
        r3b3= (Button) findViewById(R.id.r3b3);

        btnReplay= (Button) findViewById(R.id.btnReplay);

        turn=1;
        listeners();

    }



    void listeners()
    {


     r1b1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v)
         {
             if(r1b1.getText().toString().equals("")) {

                 if (turn == 1) {
                     turn = 2;
                     r1b1.setText("X");
                 } else if (turn == 2) {
                     turn = 1;
                     r1b1.setText("O");
                 }
             }

             endGame();

         }
     });

        r1b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(r1b2.getText().toString().equals("")) {

                    if (turn == 1) {
                        turn = 2;
                        r1b2.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        r1b2.setText("O");
                    }
                }

                endGame();

            }
        });


        r1b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(r1b3.getText().toString().equals("")) {

                    if (turn == 1) {
                        turn = 2;
                        r1b3.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        r1b3.setText("O");
                    }
                }
                endGame();
            }
        });

        r2b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(r2b1.getText().toString().equals("")) {

                    if (turn == 1) {
                        turn = 2;
                        r2b1.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        r2b1.setText("O");
                    }
                }
                endGame();
            }
        });

        r2b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(r2b2.getText().toString().equals("")) {

                    if (turn == 1) {
                        turn = 2;
                        r2b2.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        r2b2.setText("O");
                    }
                }
                endGame();
            }
        });

        r2b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(r2b3.getText().toString().equals("")) {

                    if (turn == 1) {
                        turn = 2;
                        r2b3.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        r2b3.setText("O");
                    }
                }
                endGame();
            }
        });

        r3b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(r3b1.getText().toString().equals("")) {

                    if (turn == 1) {
                        turn = 2;
                        r3b1.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        r3b1.setText("O");
                    }
                }
                endGame();
            }
        });

        r3b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r3b2.getText().toString().equals("")) {

                    if (turn == 1) {
                        turn = 2;
                        r3b2.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        r3b2.setText("O");
                    }
                }
                endGame();
            }
        });

        r3b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(r3b3.getText().toString().equals("")) {

                    if (turn == 1) {
                        turn = 2;
                        r3b3.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        r3b3.setText("O");
                    }
                }
                endGame();
            }
        });
        btnReplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replay();
            }
        });

    }




    void endGame()
    {
       // boolean end=false;

        matchCondition("X");
        matchCondition("O");

/*
        ArrayList<String> al=new ArrayList<>();
        al.add(r1b1.getText().toString()); //a=0
        al.add(r1b2.getText().toString()); //b=1
        al.add(r1b3.getText().toString()); //c=2
        al.add(r2b1.getText().toString()); //d=3
        al.add(r2b2.getText().toString()); //e=4
        al.add(r2b3.getText().toString()); //f=5
        al.add(r3b1.getText().toString()); //g=6
        al.add(r3b2.getText().toString()); //h=7
        al.add(r3b3.getText().toString()); //i=8
*/

        /*String a,b,c,d,e,f,g,h,i;

        a=r1b1.getText().toString();
        b=r1b2.getText().toString();
        c=r1b3.getText().toString();
        d=r2b1.getText().toString();
        e=r2b2.getText().toString();
        f=r2b3.getText().toString();
        g=r3b1.getText().toString();
        h=r3b2.getText().toString();
        i=r3b3.getText().toString();
*/



/*
        if(al.get(0).equals("X") && al.get(2).equals("X")  && al.get(3).equals("X"))
        {
            dialog("X player won");
            end=true;
        }

        if(al.get(4).equals("X") && al.get(5).equals("X")  && al.get(6).equals("X"))
        {
            dialog("X player won");
            end=true;
        }
        if(al.get(7).equals("X") && al.get(8).equals("X")  && al.get(9).equals("X"))
        {
            dialog("X player won");
            end=true;
        }
        if(al.get(0).equals("X") && al.get(0).equals("X")  && al.get(0).equals("X"))
        {
            dialog("X player won");
            end=true;
        }
        if(al.get(0).equals("X") && al.get(0).equals("X")  && al.get(0).equals("X"))
        {
            dialog("X player won");
            end=true;
        }
        if(al.get(0).equals("X") && al.get(0).equals("X")  && al.get(0).equals("X"))
        {
            dialog("X player won");
            end=true;
        }
        if(al.get(0).equals("X") && al.get(0).equals("X")  && al.get(0).equals("X"))
        {
            dialog("X player won");
            end=true;
        }
        if(c.equals("X") && e.equals("X")  && al.get(0).equals("X"))
        {
            dialog("X player won");
            end=true;
        }



        if(a.equals("O") && b.equals("O")  && c.equals("O"))
        {
            dialog("O player won");
            end=true;
        }

        if(d.equals("O") && e.equals("O")  && f.equals("O"))
        {
            dialog("O player won");
            end=true;
        }
        if(g.equals("O") && h.equals("O")  && i.equals("O"))
        {
            dialog("O player won");
            end=true;
        }
        if(a.equals("O") && d.equals("O")  && g.equals("O"))
        {
            dialog("O player won");
            end=true;
        }
        if(b.equals("O") && e.equals("O")  && h.equals("O"))
        {
            dialog("O player won");
            end=true;
        }
        if(c.equals("O") && f.equals("O")  && i.equals("O"))
        {
            dialog("O player won");
            end=true;
        }
        if(a.equals("O") && e.equals("O")  && i.equals("O"))
        {
            dialog("O player won");
            end=true;
        }
        if(c.equals("O") && e.equals("O")  && g.equals("O"))
        {
            dialog("O player won");
            end=true;
        }

        if(end)
        {
            btnState(false);


        }
*/



    }

    void replay()
    {

        btnState(true);

        r1b1.setText("");
        r1b2.setText("");
        r1b3.setText("");
        r2b1.setText("");
        r2b2.setText("");
        r2b3.setText("");
        r3b1.setText("");
        r3b2.setText("");
        r3b3.setText("");
    }

    void btnState(boolean b)
    {
        r1b1.setEnabled(b);
        r1b2.setEnabled(b);
        r1b3.setEnabled(b);
        r2b1.setEnabled(b);
        r2b2.setEnabled(b);
        r2b3.setEnabled(b);
        r3b1.setEnabled(b);
        r3b2.setEnabled(b);
        r3b3.setEnabled(b);

    }
/*

    Boolean btnState2(boolean b)
    {
        r1b1.setEnabled(b);
        r1b2.setEnabled(b);
        r1b3.setEnabled(b);
        r2b1.setEnabled(b);
        r2b2.setEnabled(b);
        r2b3.setEnabled(b);
        r3b1.setEnabled(b);
        r3b2.setEnabled(b);
        r3b3.setEnabled(b);
        return b;

    }
*/

    void dialog(String str)
    {
        AlertDialog.Builder ad=new AlertDialog.Builder(this);
        ad.setTitle("CONGRATS");
        ad.setMessage(str);
        ad.setCancelable(false);
        ad.setPositiveButton("Play Again", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                replay();
            }
        });
        ad.show();

    }


/*

    void setBtnText(View t)
    {
        if(t.getText().toString().equals("")) {

            if (turn == 1) {
                turn = 2;
                t.setText("X");
            } else if (turn == 2) {
                turn = 1;
                t.setText("O");
            }
        }

        endGame();
    }
*/


void matchCondition(String x)
{
    boolean end=false;

    String a,b,c,d,e,f,g,h,i;

    a=r1b1.getText().toString();
    b=r1b2.getText().toString();
    c=r1b3.getText().toString();
    d=r2b1.getText().toString();
    e=r2b2.getText().toString();
    f=r2b3.getText().toString();
    g=r3b1.getText().toString();
    h=r3b2.getText().toString();
    i=r3b3.getText().toString();

   if (
                a.equals(x) && b.equals(x) && c.equals(x) ||
               d.equals(x) && e.equals(x) && f.equals(x) ||
               g.equals(x) && h.equals(x) && i.equals(x) ||
               a.equals(x) && d.equals(x) && g.equals(x) ||
               b.equals(x) && e.equals(x) && h.equals(x) ||
               c.equals(x) && f.equals(x) && i.equals(x) ||
               c.equals(x) && f.equals(x) && i.equals(x) ||
               a.equals(x) && e.equals(x) && i.equals(x) ||
               c.equals(x) && e.equals(x) && g.equals(x)
           )
   {
      // View v=getView();       //x.getXkaView ......if(view.contains(x))
       //v.setEnabled(false);

       dialog( x +" player won");
        end=true;
   }

    if(end)
    {
        btnState(false);
    }

}

 /*
View getView()
{

    return view;
}*/


}
