package com.example.shyam.hci_2;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.PaintDrawable;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.content.ClipData;
import android.content.ClipDescription;
import android.media.Image;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.*;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.view.View.*;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class TwoFragment extends Fragment{
    static Context twoFragmentContext;
    static int buttonStyleState;
    static boolean keyBoardState;
    static View fragmentTwo;
    static int INITIAL_BGCOLOR_1=Color.argb(93,115,109,232);
    static int INITIAL_BGCOLOR_2=Color.WHITE;
    static int RED_BGROUND=Color.argb(99,250,25,8);
    static int GREEN_BGROUND=Color.argb(168,117,233,101);
    static int BUTTON_CHANGE_RATE=4;
    public static boolean ButtonSizeFlag=true;
    public static boolean KeyboardState=true;
    public static TextView printText;
    private android.widget.RelativeLayout.LayoutParams layoutParams;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    private OnFragmentInteractionListener mListener;

    public TwoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TwoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TwoFragment newInstance(String param1, String param2) {
        TwoFragment fragment = new TwoFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        TwoFragment.fragmentTwo=inflater.inflate(R.layout.fragment_two, container, false);

        //((LinearLayout)TwoFragment.fragmentTwo.findViewById(R.id.buttonStyleLayout)).setBackgroundColor(TwoFragment.INITIAL_BGCOLOR);

        RadioButton tempRadioButton=(RadioButton)TwoFragment.fragmentTwo.findViewById(R.id.radioButtonBigVertical);
        tempRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton t=(RadioButton)v;
                if (t.isChecked()== true) {
                    ((RadioButton) TwoFragment.fragmentTwo.findViewById(R.id.radioButtonBigHorizontal)).setChecked(false);
                    ((RadioButton) TwoFragment.fragmentTwo.findViewById(R.id.radioButtonSmallVertical)).setChecked(false);
                    ((RadioButton) TwoFragment.fragmentTwo.findViewById(R.id.radioButtonSmallHorizontal)).setChecked(false);

                    TwoFragment.buttonStyleState = 1;
                } else {
                    t.setChecked(true);
                }
            }
        });
        tempRadioButton=(RadioButton)TwoFragment.fragmentTwo.findViewById(R.id.radioButtonBigHorizontal);
        tempRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton t = (RadioButton) v;
                if (t.isChecked() == true) {
                    ((RadioButton) TwoFragment.fragmentTwo.findViewById(R.id.radioButtonBigVertical)).setChecked(false);
                    ((RadioButton) TwoFragment.fragmentTwo.findViewById(R.id.radioButtonSmallVertical)).setChecked(false);
                    ((RadioButton) TwoFragment.fragmentTwo.findViewById(R.id.radioButtonSmallHorizontal)).setChecked(false);

                    TwoFragment.buttonStyleState = 2;
                } else {
                    t.setChecked(true);
                }
            }
        });
        tempRadioButton=(RadioButton)TwoFragment.fragmentTwo.findViewById(R.id.radioButtonSmallVertical);
        tempRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton t = (RadioButton) v;
                if (t.isChecked() == true) {
                    ((RadioButton) TwoFragment.fragmentTwo.findViewById(R.id.radioButtonBigHorizontal)).setChecked(false);
                    ((RadioButton) TwoFragment.fragmentTwo.findViewById(R.id.radioButtonBigVertical)).setChecked(false);
                    ((RadioButton) TwoFragment.fragmentTwo.findViewById(R.id.radioButtonSmallHorizontal)).setChecked(false);

                    TwoFragment.buttonStyleState = 3;
                } else {
                    t.setChecked(true);
                }
            }
        });
        tempRadioButton=(RadioButton)TwoFragment.fragmentTwo.findViewById(R.id.radioButtonSmallHorizontal);
        tempRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton t = (RadioButton) v;
                if (t.isChecked() == true) {
                    ((RadioButton) TwoFragment.fragmentTwo.findViewById(R.id.radioButtonBigHorizontal)).setChecked(false);
                    ((RadioButton) TwoFragment.fragmentTwo.findViewById(R.id.radioButtonBigVertical)).setChecked(false);
                    ((RadioButton) TwoFragment.fragmentTwo.findViewById(R.id.radioButtonSmallVertical)).setChecked(false);

                    TwoFragment.buttonStyleState = 4;
                } else {
                    t.setChecked(true);
                }
            }
        });

        Switch tempSwitch=(Switch)TwoFragment.fragmentTwo.findViewById(R.id.keyboardSwitch);
        tempSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true) {
                    TwoFragment.keyBoardState = true;
                    ((LinearLayout) TwoFragment.fragmentTwo.findViewById(R.id.buttonStyleLayout)).setVisibility(View.GONE);
                    ((LinearLayout) TwoFragment.fragmentTwo.findViewById(R.id.newButtonSpace)).setVisibility(View.GONE);
                } else {
                    ((LinearLayout) TwoFragment.fragmentTwo.findViewById(R.id.buttonStyleLayout)).setVisibility(View.VISIBLE);
                    ((LinearLayout) TwoFragment.fragmentTwo.findViewById(R.id.newButtonSpace)).setVisibility(View.VISIBLE);
                    TwoFragment.keyBoardState = false;
                }
            }
        });

        LinearLayout tempLayout=(LinearLayout)TwoFragment.fragmentTwo.findViewById(R.id.buttonStyleLayout);
        tempLayout.setOnDragListener(new View.OnDragListener(){
            public boolean onDrag(View v, DragEvent event) {
                LinearLayout t=(LinearLayout)TwoFragment.fragmentTwo.findViewById(R.id.buttonStyleLayout);
                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_STARTED:
                        return true;
                    case DragEvent.ACTION_DRAG_ENTERED:
                    case DragEvent.ACTION_DRAG_LOCATION:
                        t.setBackgroundColor(TwoFragment.RED_BGROUND);
                        return true;
                    case DragEvent.ACTION_DRAG_EXITED:
                        t.setBackgroundColor(TwoFragment.INITIAL_BGCOLOR_1);
                    case DragEvent.ACTION_DROP:
                        Toast.makeText(TwoFragment.twoFragmentContext,"Drop only on the  green area..!",Toast.LENGTH_SHORT).show();
                        return true;
                    case DragEvent.ACTION_DRAG_ENDED:
                        t.setBackgroundColor(TwoFragment.INITIAL_BGCOLOR_1);
                        return true;
                    default:
                        return false;
                }
            }
        });
        tempLayout=(LinearLayout)TwoFragment.fragmentTwo.findViewById(R.id.keyboardSwitchLayout);
        tempLayout.setOnDragListener(new View.OnDragListener() {
            public boolean onDrag(View v, DragEvent event) {
                LinearLayout t=(LinearLayout)TwoFragment.fragmentTwo.findViewById(R.id.keyboardSwitchLayout);
                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_STARTED:
                        return true;
                    case DragEvent.ACTION_DRAG_ENTERED:
                    case DragEvent.ACTION_DRAG_LOCATION:
                        t.setBackgroundColor(TwoFragment.RED_BGROUND);
                        return true;
                    case DragEvent.ACTION_DRAG_EXITED:
                        t.setBackgroundColor(TwoFragment.INITIAL_BGCOLOR_1);
                    case DragEvent.ACTION_DROP:
                        Toast.makeText(TwoFragment.twoFragmentContext,"Drop only on the  green area..!",Toast.LENGTH_SHORT).show();
                        return true;
                    case DragEvent.ACTION_DRAG_ENDED:
                        t.setBackgroundColor(TwoFragment.INITIAL_BGCOLOR_1);
                        return true;
                    default:
                        return false;
                }
            }
        });
        RelativeLayout tempLayout2=(RelativeLayout)TwoFragment.fragmentTwo.findViewById(R.id.keyboardSpace);
        tempLayout2.setOnDragListener(new View.OnDragListener() {
            public boolean onDrag(View v, DragEvent event) {
                RelativeLayout t=(RelativeLayout)TwoFragment.fragmentTwo.findViewById(R.id.keyboardSpace);
                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_STARTED:
                        return true;
                    case DragEvent.ACTION_DRAG_ENTERED:
                    case DragEvent.ACTION_DRAG_LOCATION:
                        t.setBackgroundColor(TwoFragment.GREEN_BGROUND);
                        return true;
                    case DragEvent.ACTION_DRAG_EXITED:
                        t.setBackgroundColor(TwoFragment.INITIAL_BGCOLOR_2);
                        return true;
                    case DragEvent.ACTION_DROP:
                        ClipData.Item item=event.getClipData().getItemAt(0);
                        //Toast.makeText(twoFragmentContext, item.getText().toString(),Toast.LENGTH_SHORT).show();

                        Button tempButton=(Button)TwoFragment.fragmentTwo.findViewById(Integer.parseInt(item.getText().toString()));

                        RelativeLayout.LayoutParams params=new RelativeLayout.LayoutParams(tempButton.getLayoutParams().width,tempButton.getLayoutParams().height);
                        params.leftMargin=(int)((event.getX())-((tempButton.getLayoutParams().width)/2.0f));
                        params.topMargin=(int)((event.getY())-((tempButton.getLayoutParams().height)/2.0f));

                        ((ViewGroup)tempButton.getParent()).removeView(tempButton);
                        tempButton.setLayoutParams(params);
                        t.addView(tempButton);
                        tempButton.setVisibility(View.VISIBLE);

                        return true;
                    case DragEvent.ACTION_DRAG_ENDED:
                        t.setBackgroundColor(TwoFragment.INITIAL_BGCOLOR_2);
                        return true;
                    default:
                        return false;
                }
            }
        });

        Button comBtn=(Button)TwoFragment.fragmentTwo.findViewById(R.id.comButton);
        comBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectPhoneTask connectPhoneTask = new ConnectPhoneTask(MainActivity.currentState,MainActivity.context);
                connectPhoneTask.execute(Constants.SERVER_IP); //try to connect to server in another thread
            }
        });

        // Spinner to set the button size change
        Spinner spinner=(Spinner)TwoFragment.fragmentTwo.findViewById(R.id.buttonSizeSpinner);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(TwoFragment.twoFragmentContext,R.array.buttonChangeSizes,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String t=(String)parent.getItemAtPosition(position);
                //Toast.makeText(twoFragmentContext, t,Toast.LENGTH_SHORT).show();
                TwoFragment.BUTTON_CHANGE_RATE=Integer.parseInt(t.trim());
                return ;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                return;
            }
        });
        return TwoFragment.fragmentTwo;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_main, menu);
    }
    public boolean onOptionsItemSelected(MenuItem item) {
//         Handle action bar item clicks here. The action bar will
//         automatically handle clicks on the Home/Up button, so long
//         as you specify a parent activity in AndroidManifest.xml.

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteractionTwo(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        TwoFragment.twoFragmentContext=context;
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteractionTwo(Uri uri);
    }
    public static void sendKeyStrokes(String str)
    {
        if(MainActivity.currentState.isConnected && MainActivity.currentState.out!=null){
            MainActivity.currentState.out.println(str);
        }
        return ;
    }
    public void createNewButton(Button b){
        LinearLayout layout=(LinearLayout)TwoFragment.fragmentTwo.findViewById(R.id.newButtonSpace);
        Button tempButton=new Button(TwoFragment.twoFragmentContext);

        //setting the button properties to received button properties
        tempButton.setTag(b.getTag());
        tempButton.setText(b.getText());
        tempButton.setTextColor(b.getTextColors());
        tempButton.setTextSize(TypedValue.COMPLEX_UNIT_PX, b.getTextSize());
        tempButton.setLayoutParams(new LinearLayout.LayoutParams(b.getLayoutParams().width, b.getLayoutParams().height));
        tempButton.setId(tempButton.generateViewId());
        layout.addView(tempButton);

        tempButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TwoFragment.keyBoardState == true) {
                    TwoFragment.sendKeyStrokes(((Button) v).getTag().toString());
                } else {
                    int vert = 0, horiz = 0;
                    switch (TwoFragment.buttonStyleState) {
                        case 1:
                            vert = TwoFragment.BUTTON_CHANGE_RATE;
                            break;
                        case 2:
                            horiz = TwoFragment.BUTTON_CHANGE_RATE;
                            break;
                        case 3:
                            vert = (-1)*(TwoFragment.BUTTON_CHANGE_RATE);
                            break;
                        case 4:
                            horiz = (-1)*(TwoFragment.BUTTON_CHANGE_RATE);
                            break;
                    }
                    if ((v.getParent()) instanceof LinearLayout)
                        ((Button) v).setLayoutParams(new LinearLayout.LayoutParams(Math.max(v.getLayoutParams().width + horiz, 20), Math.max(v.getLayoutParams().height + vert, 20)));
                    else if ((v.getParent()) instanceof RelativeLayout) {
                        RelativeLayout.LayoutParams params=new RelativeLayout.LayoutParams(new ViewGroup.LayoutParams(Math.max(v.getLayoutParams().width + horiz, 20),Math.max(v.getLayoutParams().height + vert, 20)));
                        params.leftMargin=((RelativeLayout.LayoutParams)(v.getLayoutParams())).leftMargin;
                        params.topMargin=((RelativeLayout.LayoutParams)(v.getLayoutParams())).topMargin;
                        ((Button) v).setLayoutParams(params);
                    }
                    ((Button) v).setTextSize((Math.min(v.getLayoutParams().height, v.getLayoutParams().width)) / 2.5f);
                }
            }
        });
        tempButton.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                String[] mimeTypes = {ClipDescription.MIMETYPE_TEXT_PLAIN};

                ClipData.Item item = new ClipData.Item(Integer.toString(v.getId()));
                ClipData dragData = new ClipData(Integer.toString(v.getId()), mimeTypes, item);
                v.setVisibility(View.GONE);
                v.startDrag(dragData, new View.DragShadowBuilder(v), null, 0);
                return true;
            }
        });


    }
}






