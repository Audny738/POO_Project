package com.example.final_interfaz_quizpeak;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class LoginTabFrament extends Fragment implements Response.Listener<JSONObject>, Response.ErrorListener {

    RequestQueue rq;
    JsonRequestb jrq;
    EditText email;
    EditText password;
    TextView forgetPass;
    Button login;
    float v=0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_tab_frament, container, false);

        email = root.findViewById(R.id.email);
        password = root.findViewById(R.id.pass);
        forgetPass = root.findViewById(R.id.forgetpass);
        login = root.findViewById(R.id.loginButton);
        rq = Volley.newRequestQueue(getContext());

        email.setTranslationX(800);
        password.setTranslationX(800);
        forgetPass.setTranslationX(800);
        login.setTranslationX(800);

        email.setAlpha(v);
        password.setAlpha(v);
        forgetPass.setAlpha(v);
        login.setAlpha(v);

        email.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        password.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        forgetPass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        login.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();

        login.setOnClickListener(new View.OnClickListener()){
            public void onClick(View v){
                iniciarSesion();

            }
        }

        return root;
    }

    @Override
    public void onErrorResponse(VolleyError error){
        Toast.makeText(getContext(), "No se encontró el usuario" +error.toString(), Toast.LENGTH_SHORT).show();

    }

    public void onResponse(JSONObject response){
        Toast.makeText(getContext(), "Se encontró el usuario" +email.getText().toString(), Toast.LENGTH_SHORT).show();
        Users usuario = new Users();
        JSONArray jsonArray = response.optJSONArray("datos");
        JSONObject jsonObject = null;

        try {
            JSONObject = jsonArray.getJSONObject(0);
            usuario.setUsername(jsonObject.optString("userName"));
            usuario.setNombre(jsonObject.optString("nombre"));
            usuario.setApellido(jsonObject.optString("apellido"));
            usuario.setCorreo(jsonObject.optString("correo"));
            usuario.setContra(jsonObject.optString("contra"));

        } catch (JSONException e){
            e.printStackTrace();
        }
        Intent intencion = new Intent(getContext(), LoginActivity.class);
        intencion.putExtra(LoginActivity.nombre, usuario.getCorreo());
        startActivity(intencion);

    }

    private void iniciarSesion(){
        String url ="http://192.168.1.79/login/log.php?correo="+email.getText().toString+"&contra="+password.getText().toString;
        jrq = new JsonObjectRequest(Request.Method.GET, url, null, this, this);
        rq.add(jrq);
    }
}
