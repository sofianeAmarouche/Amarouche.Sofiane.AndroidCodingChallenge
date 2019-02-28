package com.example.sofiane.amarouchesofianeandroidcodingchallenge.Network;

import java.util.List;

import com.example.sofiane.amarouchesofianeandroidcodingchallenge.Model.Book;
import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {
    @GET
    Call<List<Book>> getAllBooks();
}
