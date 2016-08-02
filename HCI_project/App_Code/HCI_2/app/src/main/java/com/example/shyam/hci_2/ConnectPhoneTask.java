package com.example.shyam.hci_2;

/**
 * Created by ohil17yo36 on 26/3/16.
 */
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by ohil17yo36 on 16/3/16.
 */
public class ConnectPhoneTask extends AsyncTask<String,Void,Boolean> {

    Context context;
    private States currentState;
    public ConnectPhoneTask(States currentState,Context context){
        this.context=context;
        this.currentState=currentState;
    }
    @Override
    protected Boolean doInBackground(String... params) {
        boolean result = true;
        try {
            InetAddress serverAddr = InetAddress.getByName(params[0]);
            currentState.socket = new Socket(serverAddr, Constants.SERVER_PORT);//Open socket on server IP and port
        } catch (IOException e) {
            Log.e("remotedroid", "Error while connecting", e);
            result = false;
        }
        return result;
    }

    @Override
    protected void onPostExecute(Boolean result)
    {
        currentState.isConnected = result;
        Toast.makeText(context, currentState.isConnected ? "Connected to server!" : "Error while connecting", Toast.LENGTH_LONG).show();
        try {
            if(currentState.isConnected) {
                currentState.out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(currentState.socket
                        .getOutputStream())), true); //create output stream to send data to server
            }
        }catch (IOException e){
            Log.e("remotedroid", "Error while creating OutWriter", e);
            Toast.makeText(context,"Error while connecting",Toast.LENGTH_LONG).show();
        }
    }
}