package com.example.buscadormusica;
import retrofit2.*;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface AutoresInterfaces {



    @GET("a/ra/songs.json?pattern")
    Call<List<CancionesModelo>> listarCanciones(
            @Query("pattern") String titulo
    );








}
