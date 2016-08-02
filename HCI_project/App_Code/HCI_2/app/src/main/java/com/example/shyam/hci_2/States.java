package com.example.shyam.hci_2;

/**
 * Created by ohil17yo36 on 26/3/16.
 */
import android.widget.Button;
import android.widget.TextView;

import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by ohil17yo36 on 16/3/16.
 */
public class States {
    public Button rmbButton;

    public Button lmbButton;
    public TextView mousePad;

    public boolean isConnected=false;
    public boolean mouseMoved=false;
    public Socket socket;
    public PrintWriter out;

    public float initX =0;
    public float initY =0;
    public float disX =0;
    public float disY =0;

}

