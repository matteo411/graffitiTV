package com.example.graffititv;

import java.io.IOException;
import java.io.InputStream;

import android.app.Presentation;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Display;
import android.widget.ImageView;

public class WallPresentation extends Presentation {

	public WallPresentation(Context outerContext, Display display) {
		super(outerContext, display);
		// TODO Auto-generated constructor stub
		
		setContentView(R.layout.wall_layout);
		
		ImageView iv = (ImageView) findViewById(R.id.imageView1);
		InputStream is;
		try {
			is = outerContext.getAssets().open("bricks_irregular.jpg");
			Drawable d = Drawable.createFromStream(is, null);
		    iv.setImageDrawable(d);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
