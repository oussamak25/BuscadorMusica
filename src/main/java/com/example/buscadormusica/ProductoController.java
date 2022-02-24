package com.example.buscadormusica;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

public class ProductoController implements Callback<List<com.example.buscadormusica.CancionesModelo>> {

    String palabra;


    com.example.buscadormusica.CancionesModelo p ;
    public ObservableList<com.example.buscadormusica.CancionesModelo> getDatos() {
        return datos;
    }

    ObservableList<com.example.buscadormusica.CancionesModelo> datos= FXCollections.observableArrayList();;

    public ProductoController(String palabra) {
        this.palabra=palabra;
    }

    static final String BASE_URL = "http://www.songsterr.com/";


    public void start() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        com.example.buscadormusica.AutoresInterfaces productosAPI = retrofit.create(com.example.buscadormusica.AutoresInterfaces.class);

        Call<List<com.example.buscadormusica.CancionesModelo>> call = productosAPI.listarCanciones(palabra);
        call.enqueue(this);


    }

    @Override
    public void onResponse(Call<List<com.example.buscadormusica.CancionesModelo>> call, Response<List<com.example.buscadormusica.CancionesModelo>> response) {
        if(response.isSuccessful()) {
            List<com.example.buscadormusica.CancionesModelo> changesList = response.body();

            for (int i = 0; i<changesList.size();i++){
                p=new com.example.buscadormusica.CancionesModelo(changesList.get(i).getId(), changesList.get(i).getType(), changesList.get(i).getTitle());

                datos.add(p);
            }

        } else {
            System.out.println(response.errorBody());
        }
    }

    @Override
    public void onFailure(Call<List<com.example.buscadormusica.CancionesModelo>> call, Throwable throwable) {
        throwable.printStackTrace();
    }
}
