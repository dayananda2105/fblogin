package mylearning.fblogin;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Openpage extends AppCompatActivity {
    EditText text1;
    TextView dp1,dp2;
    private static final int CAMERA_PIC_REQUEST=1;
    Button cal,back;
    FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.openpage);
        firebaseAuth=FirebaseAuth.getInstance();
        text1=(EditText)findViewById(R.id.text1);
        cal=(Button)findViewById(R.id.cal);
        back=(Button)findViewById(R.id.back);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
               try {
                   Toast.makeText(getApplicationContext(), "this is logined page",Toast.LENGTH_SHORT).show();
               }
            catch(RuntimeException e){
                Toast.makeText(getApplicationContext(), "get permission of camera ",Toast.LENGTH_SHORT).show();
            }
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mov = new Intent(Openpage.this, Loginapp.class);
                        startActivity(mov);
            }
        });
    }
}

