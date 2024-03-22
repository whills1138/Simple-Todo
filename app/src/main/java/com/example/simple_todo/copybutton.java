package com.example.simple_todo;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.TextView;
import android.widget.Toast;

import static android.content.Context.CLIPBOARD_SERVICE;

/**
 * Created by elha on 3/19/2018.
 */
public class copybutton {

    private ClipboardManager myClipboard;
    private ClipData myClip;
    private Context context;
    private TextView textView;

    public copybutton(Context context, TextView textView) {
        this.context = context;
        this.textView = textView;
    }

    public void init() {
        myClipboard = (ClipboardManager) context.getSystemService(CLIPBOARD_SERVICE);
        String text;
        text = textView.getText().toString();

        myClip = ClipData.newPlainText("text", text);
        myClipboard.setPrimaryClip(myClip);

        Toast.makeText(context, text + " Copied", Toast.LENGTH_SHORT).show();
    }

}
