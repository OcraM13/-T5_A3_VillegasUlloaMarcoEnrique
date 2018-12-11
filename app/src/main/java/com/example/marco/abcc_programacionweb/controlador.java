package com.example.marco.abcc_programacionweb;

import android.util.Log;

import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

public class controlador {

    InputStream is = null;
    JSONObject jsonObject = null;
    String json = null;
    OutputStream os;


    //metodo para Altas, Bajas y Cambios
    public JSONObject peticionHTTP(String url, Map datos) throws IOException {

        HttpURLConnection conexion = null;
        URL mUrl = null;

        //magia
        String cadenaJSON = "";

        try {
            mUrl = new URL(url);
            conexion = (HttpURLConnection) mUrl.openConnection();

            conexion.setDoOutput(true);
            conexion.setRequestMethod(null);

            conexion.setFixedLengthStreamingMode(cadenaJSON.getBytes().length);

            conexion.setRequestProperty("Content-Type", "application/x-www-fore-urlencode");

            os = new BufferedOutputStream(conexion.getOutputStream());

            os.write(cadenaJSON.getBytes());
            os.flush();
            os.close();


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            is = new BufferedInputStream(conexion.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

        StringBuffer cadena = new StringBuffer();

        String linea;

       /* while (linea = br.readLine() != null){
            cadena.append(linea+"\n");
        }*/

        try {
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        json = cadena.toString();

        Log.i("Mensaje 1 >>>>>" , "RESPUESTA JSON:" + json);

        return  null;
    }
}
