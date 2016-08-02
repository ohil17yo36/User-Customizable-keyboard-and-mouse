package com.example.shyam.hci_2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link OneFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link OneFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OneFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public static OnFragmentInteractionListener mListener;

    public OneFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment OneFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static OneFragment newInstance(String param1, String param2) {
        OneFragment fragment = new OneFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmentOne=inflater.inflate(R.layout.fragment_one2,container,false);

        ((Button)fragmentOne.findViewById(R.id.button_A)).setOnClickListener(new buttonClickListener());
        ((Button)fragmentOne.findViewById(R.id.button_B)).setOnClickListener(new buttonClickListener());
        ((Button)fragmentOne.findViewById(R.id.button_C)).setOnClickListener(new buttonClickListener());
        ((Button)fragmentOne.findViewById(R.id.button_D)).setOnClickListener(new buttonClickListener());
        ((Button)fragmentOne.findViewById(R.id.button_E)).setOnClickListener(new buttonClickListener());
        ((Button)fragmentOne.findViewById(R.id.button_F)).setOnClickListener(new buttonClickListener());
        ((Button)fragmentOne.findViewById(R.id.button_G)).setOnClickListener(new buttonClickListener());
        ((Button)fragmentOne.findViewById(R.id.button_H)).setOnClickListener(new buttonClickListener());
        ((Button)fragmentOne.findViewById(R.id.button_I)).setOnClickListener(new buttonClickListener());
        ((Button)fragmentOne.findViewById(R.id.button_J)).setOnClickListener(new buttonClickListener());
        ((Button)fragmentOne.findViewById(R.id.button_K)).setOnClickListener(new buttonClickListener());
        ((Button)fragmentOne.findViewById(R.id.button_L)).setOnClickListener(new buttonClickListener());
        ((Button)fragmentOne.findViewById(R.id.button_M)).setOnClickListener(new buttonClickListener());
        ((Button)fragmentOne.findViewById(R.id.button_N)).setOnClickListener(new buttonClickListener());
        ((Button)fragmentOne.findViewById(R.id.button_O)).setOnClickListener(new buttonClickListener());
        ((Button)fragmentOne.findViewById(R.id.button_P)).setOnClickListener(new buttonClickListener());
        ((Button)fragmentOne.findViewById(R.id.button_Q)).setOnClickListener(new buttonClickListener());
        ((Button)fragmentOne.findViewById(R.id.button_R)).setOnClickListener(new buttonClickListener());
        ((Button)fragmentOne.findViewById(R.id.button_S)).setOnClickListener(new buttonClickListener());
        ((Button)fragmentOne.findViewById(R.id.button_T)).setOnClickListener(new buttonClickListener());
        ((Button)fragmentOne.findViewById(R.id.button_U)).setOnClickListener(new buttonClickListener());
        ((Button)fragmentOne.findViewById(R.id.button_V)).setOnClickListener(new buttonClickListener());
        ((Button)fragmentOne.findViewById(R.id.button_X)).setOnClickListener(new buttonClickListener());
        ((Button)fragmentOne.findViewById(R.id.button_Y)).setOnClickListener(new buttonClickListener());
        ((Button)fragmentOne.findViewById(R.id.button_Z)).setOnClickListener(new buttonClickListener());
        ((Button)fragmentOne.findViewById(R.id.button_ALT)).setOnClickListener(new buttonClickListener());
        ((Button)fragmentOne.findViewById(R.id.button_SHIFT)).setOnClickListener(new buttonClickListener());
        ((Button)fragmentOne.findViewById(R.id.button_SPACEBAR)).setOnClickListener(new buttonClickListener());
        ((Button)fragmentOne.findViewById(R.id.button_CTRL)).setOnClickListener(new buttonClickListener());
        ((Button)fragmentOne.findViewById(R.id.button_LEFT)).setOnClickListener(new buttonClickListener());
        ((Button)fragmentOne.findViewById(R.id.button_RIGHT)).setOnClickListener(new buttonClickListener());
        ((Button)fragmentOne.findViewById(R.id.button_UP)).setOnClickListener(new buttonClickListener());
        ((Button)fragmentOne.findViewById(R.id.button_DOWN)).setOnClickListener(new buttonClickListener());
        ((Button)fragmentOne.findViewById(R.id.button_DEL)).setOnClickListener(new buttonClickListener());
        ((Button)fragmentOne.findViewById(R.id.button_ESC)).setOnClickListener(new buttonClickListener());
        ((Button)fragmentOne.findViewById(R.id.button_BACKSPACE)).setOnClickListener(new buttonClickListener());
        ((Button)fragmentOne.findViewById(R.id.button_ENTER)).setOnClickListener(new buttonClickListener());


        return fragmentOne;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            OneFragment.mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        OneFragment.mListener = null;
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
        void sendButtonSelected(Button b);
    }
}

class buttonClickListener implements View.OnClickListener
{
    public void onClick(View v){
        OneFragment.mListener.sendButtonSelected((Button)v);
    }
}
