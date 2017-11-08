package net.bluehack.k.bl_camera;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

public class ObjectDetectionActivity extends Activity {

    private static final int SELECT_FILE = 1;
    private ImageView ivImage;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(null);
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        setContentView(R.layout.activity_object_detection);

        ivImage = (ImageView) findViewById(R.id.ivImage);

//        byte[] bytes = getIntent().getByteArrayExtra("bm");
//        Bitmap bm = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
//        ivImage.setImageBitmap(bm);

        Bitmap bm = (Bitmap)getIntent().getExtras().get("bm");
        ivImage.setImageBitmap(bm);




    }



}
